package com.NumberPattern;

public class Numberpatter1DecresingTrianglewithfirstro5secondrow4andsoO {
public static void main(String[] args) {
	int n= 5;
	
	for (int i = 1, p=n; i <= n; i++ ,p--) {
		for (int j = 1; j <=i; j++) {
			System.out.print(p+ " ");
			
		}
		System.out.println();
	}
}
}
