package com.Venki;

public class Exception2 {
	public static void appropriate(String m ) {
		
		
		if (m==null) {
			throw new NullPointerException("Dude !!you cant find length of null");
			
			
		}
		else {
			System.out.println(m);
		}
	}
	public static void main(String[] args) {
		appropriate(null);
	}

}
