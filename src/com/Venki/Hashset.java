package com.Venki;

import java.util.HashSet;
import java.util.Iterator;

public class Hashset {
	public static void main(String[] args) {
		//1)create hashset
		HashSet<String> os = new HashSet<String>();
		
		os.add("Windows");
		os.add("unix");
		os.add("Ubuntu");
		os.add("Windows");
		
		System.out.println(os);
		
		//2)size of hashset
		int size = os.size();
		System.out.println("Size of hashset =" +size);
		
		//3) iterate using iterator
		
		Iterator<String> iterateThroughSet = os.iterator();
			
		while (iterateThroughSet.hasNext()) {
			String string = (String) iterateThroughSet.next();
			System.out.println(string);
			
		}
		//4) remove the wondows from hashset
		
		os.remove("Windows");
		
		System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
		System.out.println(os);
		
		int size2 = os.size();
		System.out.println("new size ="+size2);
		
	}
	
	

}
