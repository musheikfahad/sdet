package com.Venki;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Article4 {
	public static void main(String[] args) {
		String s = "wake up wake up its a lovely lovely day";
	String []	splitted =s.split(" ");
	
	Map<String , Integer> poemMap = new LinkedHashMap<String, Integer>();
	
	for(String box :splitted) {
		if(poemMap.containsKey(box)) {
			Integer value =poemMap.get(box);
			poemMap.put(box , value+1);
			
		}
		else {
			poemMap.put(box , 1);
		}
	}
	
	System.out.println(poemMap);
	
	Set<Entry<String , Integer>> entrrrryy = poemMap.entrySet();
	
	
	
	for(Entry <String , Integer> entry : entrrrryy) {
		
		if(entry.getValue()>1) {
		String key =	entry.getKey();
		Integer value = entry.getValue();
			
		System.out.println(key + " = " + value);
		}
		
	}
	}

}
