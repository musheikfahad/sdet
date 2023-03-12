package com.NumberPattern;

public class Numberpatter1InresingTrianglewithfirstro1secondrow2andsoOn {
	
	public static void rightTriangle(){
		int n= 5;
		for (int i = 1, p =1; i <=n ;i++,p++) {
			for (int j = 1; j <=i; j++) {
				
				System.out.print(p +" ");
				
			}
			System.out.println();
		}
	}
	
	public static void leftTriangle() {
		int n= 5;
		for (int i = 1,p=1; i <=n; i++ ,p++) {
			for (int j = 1; j <=i; j++) {
				System.out.print("  ");
			}
			
			for (int j = i; j <=n; j++) {
				System.out.print(p+ " ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		leftTriangle();
		rightTriangle();
	}

}
