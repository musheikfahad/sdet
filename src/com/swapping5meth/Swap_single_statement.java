package com.swapping5meth;

public class Swap_single_statement {

	public static void main(String[] args) {
		int a = 10; int b= 3;
		 System.out.println("before swapping a = "+a+"  & b is = "+ b);
		 
		 // in pgm language execution always start from right to left
		 b=a+b - (a=b);
		 
		 
		 System.out.println("the values after swapping a =" +a + "  &  the value of b ="+b );
		 

	}

}
