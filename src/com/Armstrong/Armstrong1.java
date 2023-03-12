package com.Armstrong;

import java.util.Scanner;

public class Armstrong1 {

	public static void Armstrong() {
		int i ,j =0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number??");
		
		int givenNumber = sc.nextInt();
		
		System.out.println("Given Nmber =" +givenNumber);
		  
		int a= givenNumber;
		while (a>0) {
			i = a%10;
			j = j+(i*i*i);
			a= a/10;
			
			
		}
		if (givenNumber==j) {
			System.out.println("armstrong Number");
			
		}
	}
	
	public static void main(String[] args) {
		Armstrong();
	}
}
