package com.practice;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayRotationRight {
	public static void main(String[] args) {
		int a [] = {1,2,3,4,5,6,7,8,9,10};
		
		
		
		System.out.println("Before Rotating ="+Arrays.toString(a));
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the distance??");
//		int distance = sc.nextInt();
//		
		for (int i = 0; i < 5; i++) {
			
			
			int last = a[a.length-1]; 
		
			                      //1
			for (int j = a.length-2; j >=0; j--) {
				
				a[j+1]= a[j];
			}
			
			a[0]= last;
		}
		
		System.out.println(Arrays.toString(a));
		
	}
}
