package com.swapping5meth;

public class Swapp3rd {

	public static void main(String[] args) {
		
		// a and b values should not be zero
		int a=10; int b=3;
		
		 System.out.println("before swapping a = "+a+"  & b is = "+ b);
		 
		 a= a*b;  // a= 10*3=30;
		 
		 b = a/b; // b= 30/3=10;
		 
		 a= a/b; //  a= 30/10=3; 
	
		 
		 System.out.println("the values after swapping a =" +a + "  &  the value of b ="+b );
	}

}
