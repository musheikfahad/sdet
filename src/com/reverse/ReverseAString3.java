package com.reverse;

import java.util.Scanner;

public class ReverseAString3 {
	//Using string Buffer Class

	public static void main(String[] args) {
System.out.println("Enter the string you want to revberse??");
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		System.out.println(str);
		
		
		StringBuffer sb = new StringBuffer(str);
		  
		
		
		
		System.out.println("reversed string is :" +  sb.reverse());

	}

}
