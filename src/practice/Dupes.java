package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Dupes {

	public static void main(String[] args) {
		String s = "love is untill hits";
		
	String [] splitted =	s.split(" ");
	
	Map<String ,Integer> mush = new HashMap<String,Integer>();
	Map<String ,Integer> length = new HashMap<String,Integer>();
	
	for(String box : splitted) {
		
		
		if (mush.containsKey(box)) {
			
			Integer value = mush.get(box);
			mush.put(box,value+1 );
			
		}
		else {
			mush.put(box, 1);
		}
	}
	
	System.out.println(mush);
	
	
	System.out.println("dupessssss");
	
	Set<Entry<String, Integer>> log = mush.entrySet();
	
	for (Entry<String, Integer> entry : log) {
		
		if (entry.getValue()>=1) {
			String key = entry.getKey();
			
			Integer value = entry.getValue();
			
			System.out.println(key + " " + value);
		}
		
	}
	}
}