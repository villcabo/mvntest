package io.github.villcab.mvntest.cypher;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MyCypher {
	
	private static MyCypher cypher;
	
	public static MyCypher getInstance() {
        if (cypher == null) {
        	cypher = new MyCypher();
            return cypher;
        } else {
            return cypher;
        }
    }

	public String encript(String value) throws NoSuchAlgorithmException, UnsupportedEncodingException {
		return sha256(value);
	}

	public String sha256(String base) throws NoSuchAlgorithmException, UnsupportedEncodingException {
		MessageDigest digest = MessageDigest.getInstance("SHA-256");
		byte[] hash = digest.digest(base.getBytes("UTF-8"));
		StringBuilder hexString = new StringBuilder();

		for (int i = 0; i < hash.length; i++) {
			String hex = Integer.toHexString(0xff & hash[i]);
			if (hex.length() == 1) {
				hexString.append('0');
			}
			hexString.append(hex);
		}

		return hexString.toString();
	}

	public static void main(String[] args) throws UnsupportedEncodingException, NoSuchAlgorithmException {
		MyCypher myCypher = new MyCypher();
		String password = myCypher.encript("Eltel2023.-*");
		System.out.println(password);
	}

}
