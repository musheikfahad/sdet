package com.veni2;

import java.util.Scanner;

public class Multiplication_table {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The multiplication Table??? ");
		int A = sc.nextInt();
		
		System.out.println("Enter the Limit ???");
		int n = sc.nextInt();
		
		for (int i = 0; i <=n; i++) {
			
			int a = A*i;
			System.out.println(A +" * " + i +" ==" +a  );
		}
		
		
	}

}
