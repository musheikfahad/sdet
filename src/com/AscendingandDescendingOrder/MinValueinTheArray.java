package com.AscendingandDescendingOrder;

public class MinValueinTheArray {

	public static void main(String[] args) {
		int a[]= {12,52,32,14,11,07,89,02,56};
		
		int min = a[0];
		
		for (int i = 1; i < a.length; i++) {
			if (a[i]<min) {
				
				min = a[i];
			}
			
		}
		System.out.println("Min Value in the array = " + min); 
	}
}
