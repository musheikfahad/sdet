package com.random;

import java.util.Scanner;

public class FactorialOfNumber {

	public static void main(String[] args) {
		System.out.println("Entr the number yoy want to check??");

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();

		long fact = 1;

		for (int i = a; i >= 1; i--) {

			fact = fact * i;

		}
		System.out.println(fact);

	}

}
