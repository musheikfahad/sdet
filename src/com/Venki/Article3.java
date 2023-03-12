package com.Venki;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Article3 {
	public static void main(String[] args) {
		String s ="wake up wake up its a lovely day oh please get up and come and play the birds are singing in the tree and your ear hear the buzzing bees";
	String [] carrier =	s.split(" ");
	Map<String , Integer> poemMap = new HashMap<String ,Integer>();
	
	for (String paper : carrier) {
		if(poemMap.containsKey(paper)) {
			
			Integer value = poemMap.get(paper);
			poemMap.put(paper, value+1);
			
		}
		else {
			poemMap.put(paper , 1);
		}
	}
	System.out.println(poemMap);
	
	System.out.println("duplicate values");
	
	
	Set<Entry<String ,Integer>> entrypodu = poemMap.entrySet();
	
	for (Entry<String, Integer> entry : entrypodu) {
		if (entry.getValue()==1) {
			String key = entry.getKey();
			Integer value = entry.getValue();
			
			System.out.println(key + "  =====  " + value);
		}
	}
		
	}
	


}
