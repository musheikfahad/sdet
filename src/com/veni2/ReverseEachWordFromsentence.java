package com.veni2;

public class ReverseEachWordFromsentence {
public static void main(String[] args) {
	String s= "Welcome to Java";
	
	String[] split = s.split(" ");
	String reversedwordssss =" ";
	
	for (String str : split) {
		
		String rev="";
		
		for (int i =str.length()-1; i >=0; i--) {
			
			rev = rev+str.charAt(i);
			
			
		}
		System.out.println(rev);
		
		reversedwordssss= reversedwordssss+rev+" ";
		
	}
	System.out.println(reversedwordssss);
}
}
