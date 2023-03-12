package com.Venki;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ArticleTwoMap {
	
	static String s = "musheik is the best developer among the best developer";
	static String [] splitted=s.split(" ");
	static int count = 0;
	
	public static void easyway() {
		
		for (String box : splitted) {
			if (box.equalsIgnoreCase("the")) {
				
				count++;
				
			}
			
		}
		System.out.println(count);
	}
	
	public static void hardway() {
		
		
		Map<Character , Integer> articleMap = new HashMap<Character , Integer>();
		String trim = s.trim().replace(" ", "");
		char[] letterbox = trim.toCharArray();
		
		for (char box2 : letterbox) {
			
			if(articleMap.containsKey(box2)) {
				Integer value = articleMap.get(box2);
				articleMap.put(box2, value+1);
				
				}
			else {
				articleMap.put(box2, 1);
			}
			
		}
		System.out.println(articleMap);
		
		
		Set<Entry<Character,Integer>> entryyyyyyset = articleMap.entrySet();
		
		for (Entry<Character, Integer> entry : entryyyyyyset) {
			
			if (entry.getValue()==1) {
				Character key = entry.getKey();
				Integer value = entry.getValue();
				
				System.out.println(key + " === " +value);
			}
			
		}
	}
	public static void main(String[] args) {
		
//easyway();
		hardway();
	}
}