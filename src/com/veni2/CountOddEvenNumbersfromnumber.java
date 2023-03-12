package com.veni2;

public class CountOddEvenNumbersfromnumber {
	public static void main(String[] args) {
		int m = 2;
		int oddcount = 0;
		int evencount = 0;

		while (m > 0) {

			int x = m % 10;
			if (x % 2 == 0) {
				evencount++;
			}

			else {
				oddcount++;
			}
			
			m=m/10;

		}
		System.out.println("evencount = " + evencount);
		
		System.out.println("oddcount =" +oddcount);
	}
}
