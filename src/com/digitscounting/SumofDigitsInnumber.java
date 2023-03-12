package com.digitscounting;

import java.util.Scanner;

public class SumofDigitsInnumber {

	public static void main(String[] args) {
		System.out.println("Enter the number you want to count the digit??");
		long sum = 0;
		Scanner sc = new Scanner(System.in);

		long num = sc.nextLong();
		 
		while (num > 0) {
			
			sum=sum +num%10;
			num=num/10;
			

		}
		System.out.println(sum);
		
	}

}
