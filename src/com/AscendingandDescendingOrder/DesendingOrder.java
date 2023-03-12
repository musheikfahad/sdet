package com.AscendingandDescendingOrder;

import java.util.Arrays;

public class DesendingOrder {

	public static void main(String[] args) {
		int a[]= {12,52,32,14,11,07,89,02,56};
		
		System.out.println("Array before descending =" +Arrays.toString(a));
		
		for (int i = 0; i < a.length-1; i++) {
			
			for (int j = 0; j < a.length-1; j++) {
				
				if (a[j]<a[j+1]) {
					
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
					
				}
			}
			
		}
		
		System.out.println("Array after Descending order =" + Arrays.toString(a));
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		
		//min number
		int minnumber = a[a.length-1];
		System.out.println("minNumber ="+minnumber);
	}
	
	
	
}
