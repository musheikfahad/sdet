package com.TrianglePattern;

public class DecreasingTriangle {
	public static void main(String[] args) {
		int n=5;
		for(int i = 0 ; i<= n ;i++) {
			for(int j =i ; j<=n ; j++) {
				System.out.print(" *");
				
			}
			System.out.println();
		}
	}

}
