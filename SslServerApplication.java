package com.snhu.sslserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

@SpringBootApplication
public class SslServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SslServerApplication.class, args);
	}
}

@RestController
class ServerController{
	private static final char[] HEX_ARRAY = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ!@#$%^&*".toCharArray();
	
	private String getHash(String input) {
		try {
			//hash function
			MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
			byte[] digest = messageDigest.digest();
			return bytesToHex(digest);
		}
		//exception handling
		catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		return input;
	}
	
	public static String bytesToHex(byte[] bytes) {
		char[] hexChars = new char[bytes.length * 2];
		for (int i = 0; i < bytes.length; i++) {
			int j = bytes[i] & 0xFF;
			hexChars[i * 2] = HEX_ARRAY[j >>> 4];
			hexChars[i * 2 + 1] = HEX_ARRAY[j & 0x0F];
		}
		return new String(hexChars);
	}
	
	@RequestMapping("/hash")
	public String myHash() {
		String data = "Jordan Jenkins Checksum.";
		String hash = getHash(data);
		return "<p>data: " + data + "</p><p>Name of Cipher Algorithm Used: SHA-256" 
				+ "</p><p>Value: " + hash;
	}
}