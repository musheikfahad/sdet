package com.StringManipulation;

import java.io.ObjectInputStream.GetField;

public class ExtractTheNumberFromStringAndAddThem {

	public static void main(String[] args) {
		String str = "hello mic testing 123";
		String split = str.replace(" ", "");
		
		char[] charArray = split.toCharArray();
		int sum = 0;
		String empty = "";
		for (char c : charArray) {

			if ('0' <= c && c <= '9') {

				empty = empty + c;

			}

		}
		System.out.println(empty);

		int numbersinString = Integer.parseInt(empty);
		System.out.println(numbersinString);

		int n, m = 0;
		while (numbersinString > 0) {
			n = numbersinString % 10;
			m = m + n;
			numbersinString = numbersinString / 10;

		}
		System.out.println(m);
	}

}
