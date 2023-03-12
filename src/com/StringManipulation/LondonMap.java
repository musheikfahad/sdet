package com.StringManipulation;

import java.util.HashMap;
import java.util.Map;

public class LondonMap {

	public static void london() {
		String str = "the londen the the";
		int count = 0;
		String[] split = str.split(" ");

		boolean flag = false;
		for (String string : split) {
			if (string.contentEquals("the")) {
				System.out.println(string);
				count++;
				flag = true;

			}

		}

		if (flag == true) {
			System.out.println(count);
		}

	}

	public static void vow() {
		String m = "musheik sadam";

		char[] charArray = m.toCharArray();

		for (char c : charArray) {
			if (c == 'a' || c == 'A' || c == 'e' || c == 'E' || c == 'i' || c == 'I' || c == 'o' || c == 'O' || c == 'u'
					|| c == 'U') {
				System.out.println(c);
				

			}
		}
		
		Map<Character,Integer> vowmap = new HashMap<Character, Integer>();
	for (char c : charArray) {
		
		if (vowmap.containsKey(c)) {
			
			Integer value = vowmap.get(c);
			
			vowmap.put(c, value+1);
			
		}
		else {
			vowmap.put(c, 1);
		}
	}
		
	System.out.println("number of times");
	System.out.println("=======================================");
	System.out.println(vowmap);
	
	System.out.println();
	}

	public static void main(String[] args) {
//		london();
		vow();
	}

}
