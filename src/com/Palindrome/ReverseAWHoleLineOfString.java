package com.Palindrome;

public class ReverseAWHoleLineOfString {
	public static void main (String args[]) {
		
	String poem = "Welcome to java";	
		String[] split = poem.split(" ");
		String reversedpoem = "";
		
		for (String str : split) {
			
			String reversedword ="";
			for(int i =str.length()-1 ; i >=0 ; i--) {
				reversedword = reversedword +str.charAt(i);
			}
			reversedpoem= reversedpoem+reversedword;
		}
		
		System.out.println(reversedpoem);
		
	}

}
