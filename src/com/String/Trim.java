package com.String;

public class Trim {
public static void main (String args []) {
	String  s = "    welcome to the world   ";
	String trim = s.trim();
	System.out.println(trim);
	
	String replace = trim.replace(" ", "%");
	System.out.println(replace);
}
}
