package com.AscendingandDescendingOrder;

import java.util.Arrays;

public class AsendingOrder {
	public static void main(String[] args) {
		int a[] = {25,52,65,45,89,65,74,365};
		
//		
//		for (int i : a) {
//			System.out.println(i);
//		}
//	System.out.println("Array before Starting :"+ Arrays.toString(a));
		
		int n = a.length;
		
		for (int i = 0; i < n-1; i++) {  //  no of passes
		
			for (int j = 0; j < n-1; j++) { // iterations in each pass
				
				if (a[j]>a[j+1]) {
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1]= temp;
				}
				
			}
		}
		
//		for (int i : a) {
//			System.out.println(i);
//		}
		
		System.out.println("Array After Sorted =" + Arrays.toString(a));
		
		//max number
//		for (int j = 0; j < a.length; j++) {
//			
//			System.out.println(a[j]);
//			
//			
//		}
//		System.out.println(a[a.length-1]);
	}
	
	

}
