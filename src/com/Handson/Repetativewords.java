package com.Handson;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Repetativewords {
	public static void main(String[] args) {
		String str = "I hear my train coming , i hear my car coming";

		String[] splitted = str.split(" ");
		
		
		

		Map<String, Integer> jimmyMap = new HashMap<String, Integer>();

		for (String Danush : splitted) {

			if (jimmyMap.containsKey(Danush)) {

				Integer value = jimmyMap.get(Danush);
				
				jimmyMap.put(Danush , value+1);
			}

			else {
				jimmyMap.put(Danush, 1);
			}
		}
		System.out.println(jimmyMap);
		
		System.out.println("Duplicates only");
		
		Set<Entry<String ,Integer>> sentyyy = jimmyMap.entrySet();
		
		for(Entry<String ,Integer> entry :sentyyy) {
			
			if (entry.getValue()>1) {
				
				String key = entry.getKey();
				Integer value = entry.getValue();
				
				System.out.println(key+ "  =  " +value);
				
			}
			
		}

	}

}
