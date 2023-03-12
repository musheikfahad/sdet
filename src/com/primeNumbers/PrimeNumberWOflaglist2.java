package com.primeNumbers;

import java.util.Scanner;

public class PrimeNumberWOflaglist2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the limit?????");
		int num = sc.nextInt();
		
		int counter=0;
		
		for (int i = 2; i <=num; i++) {
			int temp=0;
			for (int j = 2; j <i; j++) {
				
				if (i%j==0) {
					
					temp++;
					
					
				}
				
			
			
			}
			if (temp==0) {
				System.out.println(i+ " is a prime number");
				counter++;
			
		}
			
			
		}
System.out.println("total prime numbers upto "+num+"is"+counter);
	}

}
