package com.veni2;

public class countdigits {
	public static void main(String[] args) {

		int n = 123456;
		int count = 0;
		while (n > 0) {
			int m = n % 10;
			count++;
			n= n/10;
			

		}

		System.out.println(count);
	}

}
