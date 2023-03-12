package com.veni2;

public class DuplicatesInArrayString {

	public static void main(String[] args) {
		int []a = {2,3,4,2,5,1,3,2,4,8,8,9,7,5,5,4,6,7,2,1,12,12,13,3,13};
		
		for (int i = 0; i < a.length; i++) {
			
			for (int j = i+1; j < a.length; j++) {
				
				if (a[i]==a[j]) {
					
					System.out.println(a[i]);
					
				}
				
			}
			
		}
	}
}
