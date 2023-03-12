package com.veni2;

public class ReverseAword {

	public static void main(String[] args) {
		String s = "Madam";
		String rev ="";
		
		for (int i = s.length()-1; i >=0; i--) {
			rev = rev +s.charAt(i);
			
		}
		System.out.println(rev);
		
		if (rev.equalsIgnoreCase(s)) {
			System.out.println(s+" is polyndrome");
			
		}
		else {
			System.out.println(s+" not a polyndrome");
		}
	}
}
