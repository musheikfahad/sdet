package com.largestof3numbers;

import java.util.Scanner;

public class Firstway {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number A?");
		int a = sc.nextInt();
		System.out.println("Enter first number B?");
		
		int b = sc.nextInt();
		
		System.out.println("Enter first number C?");
		int c = sc.nextInt();
		
		
		
		if (a>b && b>c) {
			System.out.println(a+"  ==>A is Largest number");
		}
		else if (b>a && b>c) {
			System.out.println(b+"==>B is Largest number");
		}
		else
			System.out.println(c+ "-==>C is Largest number");
		

	}

}
