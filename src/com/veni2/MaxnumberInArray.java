package com.veni2;

public class MaxnumberInArray {
public static void main(String[] args) {
	int a[] = {12,35,65,1,11,1000,45,66,22};
	
	int max = a[0];
	
	for (int i = 1; i < a.length; i++) {
		
		if (a[i]>max) {
			
			max=a[i];
			
			
		}
		
	}
	System.out.println(max);
}
}
