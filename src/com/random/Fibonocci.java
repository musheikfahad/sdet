package com.random;

public class Fibonocci {

	public static void main(String[] args) {
		int sum = 0;

		int a = 0;
		int b = 1;
		System.out.print(a + " " + b);
		for (int i = 2; i <= 6; i++) {
			sum = a + b;
			System.out.print(" " + sum);
			a = b;
			b = sum;
		}
	}

}
