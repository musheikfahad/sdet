package com.reverse;

import java.util.Scanner;

public class ReverseString1 {

	public static void main(String[] args) {
		System.out.println("Enter the string you want to revberse??");
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		System.out.println(str);
		
		//1) using +(string concatenation ) operator
		
		String rev = "";
		
		int leng = str.length();
		
		for (int i =leng-1; i >=0; i--) {
			rev=rev+str.charAt(i);
		}
System.out.println("reversed string is :" + rev);
	}

}
