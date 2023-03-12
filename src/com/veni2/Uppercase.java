package com.veni2;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Uppercase {
public static void main(String[] args) {
	String s = "welcome home musheik musheik hello home";
	String [] splitted = s.split(" ");
	
	Map<String ,Integer> countMap = new HashMap<String , Integer>();
	
	for(String box :splitted) {
		if(countMap.containsKey(box)) {
			Integer value = countMap.get(box);
			countMap.put(box , value+1);
		}
		else {
			countMap.put(box , 1);
		}
	}
	System.out.println(countMap);
	
	Set<Entry<String ,Integer>> log = countMap.entrySet();
	
	for(Entry<String ,Integer> log2 :log) {
		
		if (log2.getValue()>1) {
			String key = log2.getKey();
			Integer value = log2.getValue();
			
			System.out.println(key + " == " +value);
		}
		
	}

	
	
	
	
		
			
		
	
}
}
