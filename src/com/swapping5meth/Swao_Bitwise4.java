package com.swapping5meth;

public class Swao_Bitwise4 {

	public static void main(String[] args) {
		int a = 10; int b= 3;
		 System.out.println("before swapping a = "+a+"  & b is = "+ b);

		 a=a^b;
		 b=a^b;
		 a=a^b;
		 
		 System.out.println("the values after swapping a =" +a + "  &  the value of b ="+b );

	}

}
