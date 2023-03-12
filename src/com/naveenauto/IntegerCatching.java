package com.naveenauto;

public class IntegerCatching {
	
	public static void main(String[] args) {
		
		
		System.out.println(0.0/00);
		
		System.out.println(12.0/0.0);
		
		System.out.println(0/0);
		//-128 to 127 only it will return true 
		Integer n1=128;
		Integer n2=128;
		
		if (n1==n2) {
			System.out.println("both are equal");
			
		}
		else
			System.out.println("not equal");
		
		Integer n3=100;
		Integer n4=100;
		
		if (n3==n4) {
			System.out.println("both are equal");
			
		}
		else
			System.out.println("not equal");
	}

}
