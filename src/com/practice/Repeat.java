package com.practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Repeat {
public static void main(String[] args) {
	String str ="hello miss miss hello dear day like you you";
	
	String [] splitted =str.split(" ");
	
	Map<String ,Integer> mareMap = new HashMap<String, Integer>();
	
	for(String box : splitted) {
		if(mareMap.containsKey(box)) {
			Integer value = mareMap.get(box);
			mareMap.put(box ,value+1);
		}
		
		else {
			mareMap.put(box , 1);
		}
	}
	System.out.println(mareMap);


	Set<Entry<String, Integer>> entryy = mareMap.entrySet();

	for(Entry<String ,Integer> Ebox :entryy) {
		if(Ebox.getValue()>1) {
			String key = Ebox.getKey();
			
			Integer value = Ebox.getValue();
			
			System.out.println(key+ "  ===    " +value);
			
		}
	}
}

}
