package io.github.villcab.mvntest.pgp3;

import org.bouncycastle.bcpg.ArmoredOutputStream;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.openpgp.*;
import org.bouncycastle.openpgp.jcajce.JcaPGPObjectFactory;
import org.bouncycastle.openpgp.jcajce.JcaPGPSecretKeyRingCollection;
import org.bouncycastle.openpgp.operator.PGPKeyEncryptionMethodGenerator;
import org.bouncycastle.openpgp.operator.PublicKeyDataDecryptorFactory;
import org.bouncycastle.openpgp.operator.bc.BcPGPDataEncryptorBuilder;
import org.bouncycastle.openpgp.operator.bc.BcPublicKeyDataDecryptorFactory;
import org.bouncycastle.openpgp.operator.bc.BcPublicKeyKeyEncryptionMethodGenerator;
import org.bouncycastle.openpgp.operator.jcajce.JcaKeyFingerprintCalculator;
import org.bouncycastle.openpgp.operator.jcajce.JcePBESecretKeyDecryptorBuilder;

import java.io.*;
import java.security.SecureRandom;
import java.security.Security;
import java.util.Date;
import java.util.Iterator;

public class PGPEncryption {

    private static final boolean armor = true;
    private static final boolean withIntegrityCheck = true;

    static {
        Security.addProvider(new BouncyCastleProvider());
    }

    public static String encryptToString(String decryptedString, String publicKeyFile) throws Exception {
        Security.addProvider(new BouncyCastleProvider());
        byte[] original = decryptedString.getBytes();
        FileInputStream publicKey = new FileInputStream(publicKeyFile);
        byte[] encrypted = encryptBytes(original, readPublicKey(publicKey));
        return new String(encrypted);
    }

    public static String decryptToString(String encryptedString, String privateKeyFile, String passphrase) throws IOException, PGPException {
        Security.addProvider(new BouncyCastleProvider());
        FileInputStream privateKey = new FileInputStream(privateKeyFile);
        byte[] descrypted = decrypt(encryptedString.getBytes(), privateKey, passphrase.toCharArray());
        return new String(descrypted);
    }

    private static byte[] encryptBytes(byte[] clearData, PGPPublicKey encKey) throws IOException, PGPException {
        ByteArrayOutputStream encOut = new ByteArrayOutputStream();
        OutputStream out = encOut;
        if (armor) {
            out = new ArmoredOutputStream(out);
        }
        ByteArrayOutputStream bOut = new ByteArrayOutputStream();
        PGPCompressedDataGenerator comData = new PGPCompressedDataGenerator(PGPCompressedDataGenerator.ZIP);
        OutputStream cos = comData.open(bOut);
        PGPLiteralDataGenerator lData = new PGPLiteralDataGenerator();
        OutputStream pOut = lData.open(cos, // the compressed output stream
                PGPLiteralData.BINARY, "iway", // "filename" to store
                clearData.length, // length of clear data
                new Date() // current time
        );
        pOut.write(clearData);
        lData.close();
        comData.close();

        BcPGPDataEncryptorBuilder builder = new BcPGPDataEncryptorBuilder(PGPEncryptedData.CAST5);
        builder.setSecureRandom(new SecureRandom());
        builder.setWithIntegrityPacket(withIntegrityCheck);
        PGPEncryptedDataGenerator cPk = new PGPEncryptedDataGenerator(builder);

        PGPKeyEncryptionMethodGenerator bcPublicKeyKeyEncryptionMethodGenerator = new BcPublicKeyKeyEncryptionMethodGenerator(encKey);
        cPk.addMethod(bcPublicKeyKeyEncryptionMethodGenerator);
        byte[] bytes = bOut.toByteArray();
        OutputStream cOut = cPk.open(out, bytes.length);
        cOut.write(bytes);
        cOut.close();
        out.close();
        return encOut.toByteArray();
    }

    private static byte[] decrypt(byte[] encrypted, InputStream keyIn, char[] password) throws IOException, PGPException {
        InputStream in = new ByteArrayInputStream(encrypted);
        in = PGPUtil.getDecoderStream(in);
        PGPObjectFactory pgpF = new JcaPGPObjectFactory(in);
        PGPEncryptedDataList enc;
        Object o = pgpF.nextObject();
        if (o instanceof PGPEncryptedDataList) {
            enc = (PGPEncryptedDataList) o;
        } else {
            enc = (PGPEncryptedDataList) pgpF.nextObject();
        }
        Iterator it = enc.getEncryptedDataObjects();
        PGPPrivateKey sKey = null;
        PGPPublicKeyEncryptedData pbe = null;
        PGPSecretKeyRingCollection pgpSec = new JcaPGPSecretKeyRingCollection(PGPUtil.getDecoderStream(keyIn));

        while (sKey == null && it.hasNext()) {
            pbe = (PGPPublicKeyEncryptedData) it.next();
            sKey = readSecretKey(pgpSec, pbe.getKeyID(), password);
        }
        if (sKey == null) {
            throw new IllegalArgumentException("secret key for message not found.");
        }

        PublicKeyDataDecryptorFactory publicKeyDataDecryptorFactory = new BcPublicKeyDataDecryptorFactory(sKey);
        InputStream clear = pbe.getDataStream(publicKeyDataDecryptorFactory);
        PGPObjectFactory pgpFact = new JcaPGPObjectFactory(clear);
        PGPCompressedData cData = (PGPCompressedData) pgpFact.nextObject();
        pgpFact = new JcaPGPObjectFactory(cData.getDataStream());
        PGPLiteralData ld = (PGPLiteralData) pgpFact.nextObject();
        InputStream unc = ld.getInputStream();
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        int ch;
        while ((ch = unc.read()) >= 0) {
            out.write(ch);
        }

        byte[] returnBytes = out.toByteArray();
        out.close();
        return returnBytes;
    }

    private static PGPPrivateKey readSecretKey(PGPSecretKeyRingCollection pgpSec, long keyID, char[] pass) throws PGPException {
        PGPSecretKey pgpSecKey = pgpSec.getSecretKey(keyID);
        if (pgpSecKey == null) {
            return null;
        }
        return pgpSecKey.extractPrivateKey(new JcePBESecretKeyDecryptorBuilder().setProvider("BC").build(pass));
    }

    private static PGPPublicKey readPublicKey(InputStream in) throws IOException, PGPException {
        PGPPublicKeyRingCollection pgpPub = new PGPPublicKeyRingCollection(PGPUtil.getDecoderStream(in), new JcaKeyFingerprintCalculator());

        Iterator keyRingIter = pgpPub.getKeyRings();
        while (keyRingIter.hasNext()) {
            PGPPublicKeyRing keyRing = (PGPPublicKeyRing) keyRingIter.next();

            Iterator keyIter = keyRing.getPublicKeys();
            while (keyIter.hasNext()) {
                PGPPublicKey key = (PGPPublicKey) keyIter.next();

                if (key.isEncryptionKey()) {
                    return key;
                }
            }
        }

        throw new IllegalArgumentException("Can't find encryption key in key ring.");
    }

    public static void main(String[] args) {
        try {
            String encrypted = encryptToString("Hello Bismarck como vas", "/home/ubuntu/Dropbox/PGP/univida2/public-key.asc");
            System.out.println("Encrypted.............");
            System.out.println(encrypted);
            String decrypted = decryptToString(encrypted, "/home/ubuntu/Dropbox/PGP/univida2/private-key.asc", "oNcB2fUIyYk6qb6l");
            System.out.println("Decrypted.............");
            System.out.println(decrypted);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
