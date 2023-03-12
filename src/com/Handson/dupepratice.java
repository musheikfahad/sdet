package com.Handson;

import java.awt.RenderingHints.Key;
import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class dupepratice {
	public static void main(String[] args) {
		String str = "I hear my train coming , i hear my car coming";
		String[] splitted = str.split(" ");

		Map<String, Integer> jimmyMap = new HashMap<String, Integer>();

		for (String danus : splitted) {
			if (jimmyMap.containsKey(danus)) {
				Integer value = jimmyMap.get(danus);

				jimmyMap.put(danus, value + 1);
			}

			else {
				jimmyMap.put(danus, 1);
			}

		}

		System.out.println(jimmyMap);
		System.out.println("duplicates");

		Set<java.util.Map.Entry<String, Integer>> log = jimmyMap.entrySet();

		for (java.util.Map.Entry<String, Integer> entryyy : log) {

			if (entryyy.getValue() > 1) {
				Integer value = entryyy.getValue();

				String key = entryyy.getKey();
				System.out.println(key + "  ==" +value);
			}
		}

		

	}
}
