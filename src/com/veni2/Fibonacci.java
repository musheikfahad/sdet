package com.veni2;

public class Fibonacci {
	public static void main(String[] args) {
		int a =0;
		
		int b = 1;
		int c =0;
		
		 System.out.print(a + " , " +b);
		for (int i = 2; i <=4; i++) {
			
			 c=a+b;
			 
			 System.out.print(" , " +c);
			 
			 a=b;
			 b=c;
			
		}
		
		
		

	}

}
