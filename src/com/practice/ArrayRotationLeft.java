package com.practice;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayRotationLeft {
	
	public static void main(String[] args) {
		int a [] = {1,2,3,4,5,6,7,8,9};
		
		System.out.println("Before Rotating ="+Arrays.toString(a));
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the distance??");
		int distance = sc.nextInt();
		
		for (int i = 0; i < distance; i++) {
			
			
			int first = a[0];
			
			for (int j = 0; j < a.length-1; j++) {
				
				a[j]= a[j+1];
			}
			
			a[a.length-1]= first;
		}
		
		System.out.println(Arrays.toString(a));
		
	}

}
