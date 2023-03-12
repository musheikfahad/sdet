package com.veni2;

import java.util.Scanner;

public class Prime {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the limit??");
	int k = sc.nextInt();
	
	for (int i = 2; i <= k; i++) {
		int count =0;
		
		
		for (int j = 2; j <i; j++) {
			
			if (i%j==0) {
				count++;
				
				
			}
	}
		if (count==0) {
			System.out.println(i+ " Is number is prime");
			
		}
//		else {
//			System.out.println(i +" Is not a prime number");
//		}
	
		
	}
	

}
}
