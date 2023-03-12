package com.veni2;

public class ListOfPolyndromeNumber {

	public static void main(String[] args) {
		
	
		for (int i = 1; i <=1000; i++) {
			int m = i;
			int x = 0;
			int y = 0;
			int a;
			
			a=m;
			while (a > 0) {
				x = a % 10;
				y = y * 10 + x;

				a = a / 10;

			}
			
			if (y==m) {
				System.out.println(y + " its a Polyndrome Number");
				
				
			}
			
			
		}
		
		
	}
}
