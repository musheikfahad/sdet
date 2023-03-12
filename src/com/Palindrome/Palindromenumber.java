package com.Palindrome;

import java.util.Scanner;

public class Palindromenumber {
	public static void poly() {
System.out.println("Enter the series of number you want to check??");
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		System.out.println(num);
		
 int rev =0;
 int ognum= num;
		 
		 while (num!=0) {
			 rev = rev*10 +num%10;
			 num = num/10;
			 
			
		}
		 
		 System.out.println("Reversed number is =" + rev);
			if (rev==ognum) {
				System.out.println("given number is polindrome");
			}
			else {
				System.out.println("not a polyndrome");
			}

	}

	public static void polylist() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enther the limit??");
		int limit = sc.nextInt();
		
		int count =0;
		for(int i = 1 ; i<=limit; i++) {
			int rev= 0;
			int a;
		 a = i;
		while(a>0) {
			rev =rev*10+a%10;
			a= a/10;
			
			
		}
		
		if (rev==i) {
			System.out.println("polynumbers =" + i);
			count++;
		}
	}
		System.out.println("total polyndrome="+count);
	}
	public static void main(String[] args) {
		polylist();

	}

}
