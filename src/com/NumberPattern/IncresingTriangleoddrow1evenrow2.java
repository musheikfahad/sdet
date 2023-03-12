package com.NumberPattern;

public class IncresingTriangleoddrow1evenrow2 {
	public static void main(String[] args) {
		int n =5;
		for (int i = 1 , p=1; i <=n; i++,p++) {
			for (int j = 1; j <=i; j++) {
				
				if(p%2==0) {
				System.out.print(2+" ");
				}
				else {
					System.out.print(1+ " ");
				}
				}
			System.out.println();
		}
	}

}
