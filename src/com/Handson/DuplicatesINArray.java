package com.Handson;

public class DuplicatesINArray {

	public static void main(String[] args) {
		int a [] = {1,1,2,3,3,4,5,9,9,7,8,4	};
		
		boolean flag= false;
	for (int i = 0; i < a.length-1; i++) {
		
		for (int j = i+1; j < a.length-1; j++) {
			
			if (a[i] == a[j]) {
				
				System.out.println("found duplicates"+a[i]);
				flag = true;
			}
			
		}
		
	}
	
	if(flag==false) {
		System.out.println("no duplicates");
	}
}
}