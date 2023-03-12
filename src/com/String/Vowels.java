package com.String;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Vowels {
	public static void main(String[] args) {
		String s = "Musheik Fahath";

		int vowels = 0;
		int consonent = 0;

		Map<Character, Integer> vowelsMap = new HashMap<Character, Integer>();

		Map<Character, Integer> ConsonentMap = new HashMap<Character, Integer>();

		for (int i = 0; i < s.length(); i++) {

			char c = s.charAt(i);

			if (c == 'A' || c == 'a' || c == 'E' || c == 'e' || c == 'I' || c == 'i' || c == 'O' || c == 'o' || c == 'U'
					|| c == 'u') {

				if (vowelsMap.get(c) == null) {
					vowelsMap.put(c, 1);

				} else {
					Integer value = vowelsMap.get(c);

					vowelsMap.put(c, value + 1);
				}

				vowels++;

			}

			else {
				if (ConsonentMap.get(c)==null) {
					
					ConsonentMap.put(c,1);
					
				}
				else {
					Integer Value2 = ConsonentMap.get(c);
					ConsonentMap.put(c , Value2+1);
				}
				
				consonent++;

			}

		}
		
		System.out.println("Vowels and count");
		Set<java.util.Map.Entry<Character,Integer>> entryset1 =  vowelsMap.entrySet();
		for (java.util.Map.Entry<Character, Integer> entry : entryset1) {
			
			Character key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println(key +" = "+value);
		}
		
		System.out.println("vowels  totals count =" +vowels);
		
		
		System.out.println("consonent and its count");
		
		Set<java.util.Map.Entry<Character ,Integer>> entryset2 = ConsonentMap.entrySet();
		
		for(java.util.Map.Entry <Character ,Integer> entry : entryset2) {
			
			Character key = entry.getKey();
			Integer value = entry.getValue();
			
			System.out.println(key + " =  " + value);
		}
		
		System.out.println("consonents total value =" + consonent);
		

	}

}
