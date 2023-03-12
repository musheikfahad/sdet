package com.Armstrong;

public class Armstrong2 {

	public static void armstrongNumberrArray() {
		int count = 0;

		for (int i = 0; i < 1000; i++) {

			int a = i;
			int m, n = 0;

			while (a > 0) {
				m = a % 10;
				n = n + (m * m * m);
				a = a / 10;

			}

			if (i == n) {
				System.out.println("Armstrong Number is" + n);
				count++;

			}
		}

		System.out.println("total numbers" + count);

	}

	public static void main(String[] args) {
		armstrongNumberrArray();

	}

}
