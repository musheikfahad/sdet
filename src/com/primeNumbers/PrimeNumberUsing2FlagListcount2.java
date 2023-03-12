package com.primeNumbers;

import java.util.Scanner;

public class PrimeNumberUsing2FlagListcount2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the limit???");
		int limit = scan.nextInt();
		int counter = 0;
		
		for (int i = 2; i <= limit; i++) {
			boolean flag = true;

			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					flag = false;
					break;
				}

			}
			if (flag == true) {
				System.out.println(i + "  is prime number");
				counter++;

			}

		}
		System.out.println("total prime numbers from 1 to " + limit + " is ==" + counter);

	}
}
