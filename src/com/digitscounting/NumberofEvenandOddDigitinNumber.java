package com.digitscounting;

import java.util.Scanner;

public class NumberofEvenandOddDigitinNumber {

	public static void main(String[] args) {
		
		System.out.println("Enter the number you want to count the digit??");
		long oddcounter=0;
		long evencounter=0;
		long rem;
		Scanner sc = new Scanner(System.in);
		
		long num = sc.nextLong();
		System.out.println(num);
		while (num!=0 ) {
			
				rem = num/10;  // 1) rem =67;
				
				if (rem%2==0) {
					 evencounter++;
				}
				else {
					oddcounter++;
				}
			num = num/10;
			
			
				
		}
		
		System.out.println("the number of even digit =="+ evencounter);
		
		System.out.println("the number of odd digit =="+ oddcounter);
			

	}

	}


