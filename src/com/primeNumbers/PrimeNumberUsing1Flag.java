package com.primeNumbers;

import java.util.Scanner;

public class PrimeNumberUsing1Flag {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number????");
		int num = scan.nextInt();
		boolean flag=true;
		
		if (num>1) {
			
		
		for (int i = 2; i < num; i++) {
			if (num%i==0) {
				flag=false;
			}
		}
		
		
		if (flag==true) {
			System.out.println(num+ " is a prime numeber");
		}
		else {
			System.out.println(num+" non prime number");
		}
		
		}
		else
			System.out.println("1 neither prime nor non prime");
	}

}
