package com.StringManipulation;

public class CountCapSmallletters {

	public static void main(String[] args) {
		String words = "love of my life N1l@b@2u";

		int smallNumbers = 0;
		int capitalLetters = 0;

		int numbes = 0;
		int specialChars = 0;

		for (int i = 0; i < words.length(); i++) {
			if ('a' <= words.charAt(i) && words.charAt(i) <= 'z') {
				smallNumbers++;

			} else if ('A' <= words.charAt(i) && words.charAt(i) <= 'Z') {
				capitalLetters++;
			}

			else if ('0' <= words.charAt(i) && words.charAt(i) <= '9') {

				numbes++;

			} else {
				specialChars++;
			}

		}
		
		System.out.println("Total small Letters =" +smallNumbers);
		System.out.println("Total capital Letters =" +capitalLetters);
		System.out.println("Total Numbers =" +numbes);
		System.out.println("Total special char =" +specialChars);
	}
}
