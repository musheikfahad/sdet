package com.veni2;

public class TrimAndReplacevowels {
	
	
	public static void main(String[] args) {
		String str = "  Welcome to java   ";
		String trim = str.trim();
		System.out.println(trim);
		
		String replaceAllSpace = str.replace(" ", "");
		
		System.out.println(replaceAllSpace);
		
		String replaceWithStar = replaceAllSpace.replaceAll("[AEIOUaeiou]", "*");
		System.out.println(replaceWithStar);
		
	}

}
