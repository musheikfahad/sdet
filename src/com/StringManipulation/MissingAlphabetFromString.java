package com.StringManipulation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class MissingAlphabetFromString {
	public static void main(String[] args) {
		String str = "ab";
	
		String str2 = str.replace(" ", "");
		
		LinkedList<Character> l1 = new LinkedList<Character>();
		for (int i = 0; i <=str2.length()-1; i++) {
			l1.add(str2.charAt(i));
			
			
		}
		System.out.println(l1);
		
		String alphabets ="abcdefghijklmnopqrstuvwxyz";

		LinkedList<Character> l2 = new LinkedList<Character>();
		for (int i =0; i <= alphabets.length()-1; i++) {
			l2.add(alphabets.charAt(i));
			
			
		}
		System.out.println(l2);
		
		
		l2.removeAll(l1);
		System.out.println("Missing Chaarcters ="+l2);
	}

}
