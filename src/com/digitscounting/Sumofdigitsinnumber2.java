package com.digitscounting;

import java.util.Scanner;

public class Sumofdigitsinnumber2 {

	public static void main(String[] args) {
		System.out.println("Print the number ???");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		
		int i ,j=0;
		
		while(number > 0) {
			i = number %10;
			j = j+i;
			number = number /10;
			
		}
		System.out.println(j);
		
	}

}
