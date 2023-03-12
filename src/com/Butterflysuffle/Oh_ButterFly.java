package com.Butterflysuffle;

public class Oh_ButterFly {
	public static void main(String[] args) {
		int a [] = {1,2,3,4,5,6,7,8,9,10};
		int leng = a.length/2;
		
		
		for (int i = leng; i >=0; i--) {
			System.out.println(a[i]);
			
		}
		for (int i = a.length-1; i >=leng; i--) {
			System.out.println(a[i]);
		}
	}

}
