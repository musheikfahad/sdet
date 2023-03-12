package com.primeNumbers;

import java.util.Scanner;

public class PrimeNumberwithoutflag {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number??");
		int num = scan.nextInt();

		int temp = 0;
		if (num > 1) {

			for (int i = 2; i < num; i++) {

				if (num % i == 0) {
					temp++;

				}

			}
			if (temp == 0) {
//				System.out.println(temp);
				System.out.println("prime number");

			} else {
				System.out.println(temp);
				System.out.println("non prime");
			}

		} else {
			System.out.println("1 is neither prime nor non prime");
		}

	}
}
