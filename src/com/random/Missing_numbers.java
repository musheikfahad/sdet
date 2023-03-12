package com.random;

public class Missing_numbers {

	public static void main(String[] args) {
		 // Array shouuld not have duplicates
		// array no need to be in shorted order
		int []a = {1,2,4,5};
		
		int sum1=0;
		int sum2=0;
		int n = a.length;
		
		
		
		
		
		for (int i = 0; i < n; i++) {
			sum1 +=a[i];
			
		}
		System.out.println(sum1);
		for (int i = 1; i <= n+1; i++) {
			sum2 += i; 
			
		}
		System.out.println(sum2);
		
		
		int result = sum2 -sum1;
		System.out.println("result = "+result);
	}

}
