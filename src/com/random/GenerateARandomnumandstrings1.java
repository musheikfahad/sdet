package com.random;

import java.util.Random;

public class GenerateARandomnumandstrings1 {

	public static void main(String[] args) {
		//1) using inbulit random class 
		Random randd = new Random();

		int randd_Int = randd.nextInt(678);
		System.out.println(randd_Int);
		
		
		double randdd_Double = randd.nextDouble(); // range 0.0 t0 1.0
		
		System.out.println(randdd_Double);
		
		// 2) Using Math class
		
		System.out.println(Math.random());
		
		
	}

}
