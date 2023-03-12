package com.Palindrome;

public class prac {

	public static void main(String[] args) {
		String s = "musheik fahath  is a good muslim";
		String revsent ="";
		String[] split = s.split(" ");
		
		for (String dan : split) {
			
			String rev = "";
			
			for (int i = dan.length()-1; i >=0; i--) {
				
				rev = rev+dan.charAt(i);
				
			}
		
			revsent=revsent+" "+rev;
		}
		System.out.println(revsent);
	}
}
