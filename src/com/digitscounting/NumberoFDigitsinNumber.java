package com.digitscounting;

import java.util.Scanner;

public class NumberoFDigitsinNumber {
	
	public static void countdigit() {
		for (int i = 0; i <= 100; i++) {
			long counter=0;
			
		int	num = i;
			
		
			while (num>0) {
				num=num/10;
				
				counter++;
			}
	System.out.println("number of digits?? =" +counter);
		}
	}

	public static void numberyuwanttocount() {
		System.out.println("Enter the number you want to count the digit??");
		long counter=0;
		Scanner sc = new Scanner(System.in);
		
		long num = sc.nextLong();
		System.out.println(num);
		while (num>0) {
			num=num/10;
			
			counter++;
		}
System.out.println("number of digits?? =" +counter);
		
	}
	public static void main(String[] args) {

		
		countdigit();
		numberyuwanttocount();
	}

}
