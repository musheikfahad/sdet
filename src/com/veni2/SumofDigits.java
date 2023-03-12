package com.veni2;

public class SumofDigits {

	public static void main(String[] args) {

		int n = 321;
		int temp = 0;
		while (n > 0) {
			int v = n % 10;
			temp = temp + v;
			n = n / 10;

		}
		System.out.println(temp);
	}

}
