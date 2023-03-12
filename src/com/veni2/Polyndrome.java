package com.veni2;

public class Polyndrome {

	public static void main(String[] args) {
		int i = 123;
		
		int m =i;
		int rev = 0;
		while (i> 0) {
			int x = i % 10;
			rev = rev * 10 + x;
			i=i/10;

		}
		System.out.println(rev);
		
		if (m==rev) {
			System.out.println(m+" is polyndrome");
			
		}
		
		else {
			System.out.println(m+ " Is not Polyndrome");
		}
	}

}
