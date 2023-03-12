package com.TrianglePattern;

public class RightSideTriangleIncresing {
	public static void main(String[] args) {
		//1) combo of decresing pattern of triangle+Incresing pattern of triangle
		
		
		int n = 5;
		for (int i = 0; i <= n; i++) {
			
			for (int j = i; j <=n; j++) {
				
				System.out.print("  ");
				
			}
			for (int j = 0; j <=i; j++) {
				System.out.print("* ");
				
			}
			
			System.out.println();
			
		}
	}

}
