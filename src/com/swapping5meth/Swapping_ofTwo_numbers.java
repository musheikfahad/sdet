package com.swapping5meth;

public class Swapping_ofTwo_numbers {

	public static void main(String[] args) {
		
		//using 3rd variable
		 int a = 34; int b= 45;
		 System.out.println("before swapping a = "+a+"  & b is = "+ b);

		 int c;
		 c=b;
		 b=a;
		 a=c;
		 
		 System.out.println("the values after swapping a =" +a + "the value of b ="+b );
	}

}
