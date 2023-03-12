package com.reverse;

import java.util.Scanner;

public class ReverseAString2 {

	public static void main(String[] args) {
		//2) using Char Array 
System.out.println("Enter the string you want to revberse??");
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		System.out.println(str);
		String rev = "";
		
		
		char a[] = str.toCharArray();
		int leng = a.length;
		
		for (int i = leng-1; i >=0; i--) {
			rev = rev+a[i];
		}
		System.out.println("reversed string is :" + rev);
	}

}
