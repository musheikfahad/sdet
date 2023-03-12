package com.reverse;

import java.util.Scanner;

public class ReverseAnumber1 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("Enter the number to reverse????");
		 
		 int num = sc.nextInt();
		 
//		// 1) Using Algorithm
//		 
//		 int op =0; // 0p==32 
//		 
//		 while (num!=0) {
//			 op = op*10 +num%10; // 123%10=3
//			 num = num/10;
//			 
//			
//		}
		 
		// System.out.println("Reversed number is =" + op);
		 
		 int storage =0;
			
		 for (; num!=0; ) {
			 
			storage = storage*10 +num%10; // 123%10=3
		 num = num/10;
			
		}
		 System.out.println(storage);
		
	}

}
