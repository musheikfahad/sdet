package com.naveenauto;

public class PassNullArgWithMethOvrLoadingWithStringAndObjTypes {
	
	public static void testINg(Object O) {
		System.out.println("Object has won");
	}
	public static void testINg(String S) {
		System.out.println("String has won");
	}
//	public static void testINg(StringBuffer S) {
//		System.out.println("String has won");
//	}
public static void main(String[] args) {
	testINg(null);
//	testINg(null);
	
}
}
