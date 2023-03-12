package com.StringManipulation;

import java.util.Arrays;

public class SumOfElementsOFArray {public static void main(String[] args) {
	int arr []= {1,2,3};
//	boolean sum =false;
//	
//	for (int i : arr) {
//		if (i==6) {
//			System.out.println("i is present");
//			
//		}
//		else
//			sum=true;
//		
//	}
//	
//	if (sum==true) {
//		System.out.println("not");
//	}
	
	int binarySearch = Arrays.binarySearch(arr, 3);
	System.out.println(binarySearch);
	
}

}
