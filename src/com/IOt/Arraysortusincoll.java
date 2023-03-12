package com.IOt;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Arraysortusincoll {
	public static void main(String[] args) {
		String s ="love is lik";
		
		String[] splitted = s.split(" ");
		
		Map<String, Integer> mappy = new HashMap<String, Integer>();
		for (String dan : splitted) {
			
			if (mappy.containsKey(dan)) {
				Integer value = mappy.get(dan);
				
				mappy.put(dan, value+1);
				
			}
			else {
				mappy.put(dan, 1);
			}
		}
		
		System.out.println(mappy);
		
		TreeMap<String, Integer> nn = new TreeMap<String, Integer>();
		nn.putAll(mappy);
		
		System.out.println(nn);

		}
	}


