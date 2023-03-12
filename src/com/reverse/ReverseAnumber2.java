package com.reverse;

import java.util.Scanner;

public class ReverseAnumber2 {

	public static void main(String[] args) {
		System.out.println("enter the numer to reversed???");
		Scanner sc =new Scanner (System.in);
		
		int n = sc.nextInt();
		
		System.out.println(n);
		
		// 2)using String Buffer Class method
		
		StringBuffer sb = new StringBuffer(String.valueOf(n));
		StringBuffer rev = sb.reverse();
		
		
		
		 System.out.println("Reversed number is =" + rev);
	}

}
