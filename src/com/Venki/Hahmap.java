package com.Venki;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Hahmap {
	public static void main(String[] args) {
		
		//1)create map
		HashMap<Integer, String> doraMap = new HashMap<Integer, String>();
		
		doraMap.put(1, "Windows");
		doraMap.put(2, "Ubuntu");
		doraMap.put(3, "OsX");
		doraMap.put(4, "NewOperatingSystem");
		doraMap.put(5, "NewOperatingSystem11");
		//2)print map
		System.out.println(doraMap);
		
		//3) size of map
		System.out.println(doraMap.size());
		
		//print all key
		
		System.out.println(doraMap.keySet());
		
		//print all valus
		
		System.out.println(doraMap.values());
		
		
		doraMap.remove(4);
		System.out.println(doraMap);
		Set<Entry<Integer, String>> entryyysettt = doraMap.entrySet();
		
		System.out.println(entryyysettt);
		// remove pair from key map which contains operating system
		for (Entry<Integer, String> entry : entryyysettt) {
			if (entry.getValue().equalsIgnoreCase("ubuntu")) {
				
				Integer key = entry.getKey();
				System.out.println(key);
				
			entryyysettt.remove(key);
			}
			
		}
		System.out.println(entryyysettt);
			
		}
	
}

