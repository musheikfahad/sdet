package com.reverse;

import java.util.Scanner;

public class ReverseAnumber3 {

	public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("Enter the number to reverse????");
		 
		 int num = sc.nextInt();
		 StringBuilder sbl = new StringBuilder();
		  sbl.append(num);
		 StringBuilder rev = sbl.reverse();
		 System.out.println("Reversed number is =" + rev);
	}

}
