package com.Palindrome;

import java.util.Scanner;

public class StringPolindrome {
	public static void main(String[] args) {
		System.out.println("Enter the string you want to revberse??");

		Scanner sc = new Scanner(System.in);

		String str = sc.nextLine();
		System.out.println(str);

		// 1) using +(string concatenation ) operator

		String rev = "";
		String ogstring = str;

		char[] muss = ogstring.toCharArray();

		int length = muss.length;

		for (int i = length - 1; i >= 0; i--) {

			rev = rev + muss[i];

		}

		System.out.println("reversed string is :" + rev);

		if (ogstring.equals(rev)) {
			System.out.println("given word is a polyndrome");
		} else
			System.out.println("not  a polyndrome");

	}
}
