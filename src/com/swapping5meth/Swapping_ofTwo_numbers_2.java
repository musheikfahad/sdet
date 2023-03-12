package com.swapping5meth;

public class Swapping_ofTwo_numbers_2 {
//swapping using addition
	public static void main(String[] args) {
		int a = 1; int b= 3;
		 System.out.println("before swapping a = "+a+"  & b is = "+ b);
		 
		a= a+b; //a= 1+3=4
		//System.out.println(" the new a =" +a);
		b= a-b;  // b= 4-3=1
		
		a=a-b;  // a=a-b;
		
		 
		 System.out.println("the values after swapping a =" +a + "  &  the value of b ="+b );

	}

}
