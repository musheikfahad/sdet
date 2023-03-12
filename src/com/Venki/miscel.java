package com.Venki;

public class miscel {

 public static void main(String[] args) {
	try {
		String m = null;
		int length = m.length();
		
		System.out.println(length);
	} catch (NullPointerException e) {
		System.out.println(e);
	}
	finally {
		
	}
}
}
