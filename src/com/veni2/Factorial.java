package com.veni2;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number??");
		int number = sc.nextInt();
		long fact =1;
		
		for (int i = number; i >=1; i--) {
			fact= fact*i;
			System.out.println(fact);
		}
		
		System.out.println(fact);
	}

}
