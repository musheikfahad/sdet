package com.largestof3numbers;

import java.util.Scanner;

public class Secondway {

	public static void main(String[] args) {
		//USING TERNERY OPERATOR
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number A?");
		int a = sc.nextInt();
		System.out.println("Enter first number B?");
		
		int b = sc.nextInt();
		
		System.out.println("Enter first number C?");
		int c = sc.nextInt();
		
		
		int largest  = c>(a>b?a:b)?c:(a>b?a:b);
		
		System.out.println(largest+"  ==> is Largest number");
	}
	}


