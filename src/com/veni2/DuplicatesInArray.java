package com.veni2;

public class DuplicatesInArray {
	public static void main(String[] args) {
		int a[] = {2,2,3,4,4,5,6,5,6};
		
		for (int i = 0; i <= a.length-1; i++) {
			for (int j = i+1; j <= a.length-1; j++) {
				
				if (a[i]==a[j]) {
					System.out.println(a[i]);
					
				}
				
			}
			
		}
	}

}
