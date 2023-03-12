package com.Venki;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.testng.annotations.Test;

public class Vowmap {

	@Test
	private static void vow() {

		String s = "welcome the jannathul firdowse musheik finally you have comes here";
		String wordddd = s.trim().replace(" ", "");
		System.out.println(wordddd);
		Map<Character, Integer> vowMap = new HashMap<Character, Integer>();
		Map<Character ,Integer> consonentsMap = new HashMap<Character ,Integer>();
		char[] c = wordddd.toCharArray();

		for (Character emptybox : c) {

			if (emptybox =='A' || emptybox == 'a' || emptybox == 'E' || emptybox == 'e' || emptybox == 'I' || emptybox == 'i' || emptybox == 'O' || emptybox == 'o' || emptybox == 'u'
					|| emptybox == 'U') {
				
				if(vowMap.containsKey(emptybox)) {
					Integer value = vowMap.get(emptybox);
					vowMap.put(emptybox , value+1);
				}
				
				else {
					vowMap.put(emptybox,1);
				}

			}
			
			else {
				if(consonentsMap.containsKey(emptybox)) {
					Integer value = consonentsMap.get(emptybox);
					consonentsMap.put(emptybox, value+1);
					
				}
				else {
					consonentsMap.put(emptybox , 1);
				}
				
			}
			

		}
		System.out.println(vowMap);
		System.out.println(consonentsMap);
		
		System.out.println("vowels");
		
		Set<Entry<Character, Integer>> entryyy = vowMap.entrySet();
		
		for(Entry<Character , Integer> entrybox : entryyy) {
			if(entrybox.getValue()>1) {
				Character key = entrybox.getKey();
				
				Integer value = entrybox.getValue();
				
				System.out.println(key+"  "+ value);
			}
		}
		
		System.out.println("consonents");
		Set<Entry<Character,Integer>> entry2 = consonentsMap.entrySet();
		
		for(Entry<Character , Integer> entrybox2: entry2) {
			Character key = entrybox2.getKey();
			Integer value = entrybox2.getValue();
			
			System.out.println(key +" "+value);
		}

	}
public static void main(String[] args) {
	
}
}
