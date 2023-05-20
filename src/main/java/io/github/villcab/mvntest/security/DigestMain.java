package io.github.villcab.mvntest.security;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class DigestMain {

    public static void main(String[] args) throws NoSuchAlgorithmException {
        String a = "my codigo de ejemplo";
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        System.out.println(new String(messageDigest.digest(a.getBytes())));
        System.out.println(toHex(messageDigest.digest(a.getBytes())));

        messageDigest.update(a.getBytes());
        System.out.println(toHex(messageDigest.digest()));


    }

    private static String toHex(byte[] hash) {
        StringBuilder hexString = new StringBuilder(2 * hash.length);
        for (int i = 0; i < hash.length; i++) {
            String hex = Integer.toHexString(0xff & hash[i]);
            if(hex.length() == 1) {
                hexString.append('0');
            }
            hexString.append(hex);
        }
        return hexString.toString();
    }

}
