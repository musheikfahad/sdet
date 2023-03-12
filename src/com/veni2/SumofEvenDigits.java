package com.veni2;

public class SumofEvenDigits {

	public static void main(String[] args) {
		int n = 123;
		int oddsum=0;
		int evensum=0;
		
		while(n>0) {
			
			int x = n%10;
			if (x%2==0) {
				evensum = evensum+x;
			}
			else {
				oddsum=oddsum+x;
			}
			n=n/10;
		}
		
		System.out.println("sum of odd values "+ oddsum);
		System.out.println("sum of even values "+ evensum);
	}
}
