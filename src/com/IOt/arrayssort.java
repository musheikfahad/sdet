package com.IOt;

public class arrayssort {

	public static void main(String[] args) {
		String poem = "love my country I";
		String[] str = poem.split(" ");
		int n = str.length;

		for (int i = 1; i < n; i++) {

			String words = str[i]; // 1 my

			int k = i - 1; // k =0 love
			// true && 2 < 4 love so false
			while (k >= 0 && words.length() < str[k].length()) {

				str[k + 1] = str[k];
				k--;

			}
			str[k + 1] = words;

		}
		for (int i = 0; i < str.length; i++) {
			System.out.println(str[i] + " ");
		}

	}

}
