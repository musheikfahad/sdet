package com.Venki;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.CopyOnWriteArrayList;

public class Arraylist {
	int sum =0;
	public static void main(String[] args) {
		CopyOnWriteArrayList<String> myarraylist = new CopyOnWriteArrayList<String>();
		
		myarraylist.add("1");
		myarraylist.add("2");
		myarraylist.add("3");
		myarraylist.add("four");
		myarraylist.add("7");
		
		String fo = myarraylist.get(3);
		String replace = fo.replace("four", "4");
		myarraylist.set(3, replace);
		
		System.out.println(myarraylist);
		
//		myarraylist.remove(3);
//		String result = "";
//		for (String temp : myarraylist) {
//			
//			if (temp.equalsIgnoreCase("four")) {
//				result= result+"4";
//				myarraylist.set(3,	 result);
//				
//				
//			}
			
		
//		}
//		System.out.println(myarraylist);
//		
//		
		int sum = 0;
		for (String var : myarraylist) {
			
			int intarray = Integer.parseInt(var);
			sum = sum +intarray;
			
		}
		System.out.println(sum);
//		System.out.println(myarraylist.toString());
//		
//		System.out.println(myarraylist.toString());

		System.out.println("=================");
//		System.out.println(myarraylist);
		int size = myarraylist.size();
		System.out.println(size);
		System.out.println("=============================");
	
		for (String contents : myarraylist) {
			System.out.println(contents);
			
			if (contents.equalsIgnoreCase("opera")) {
				System.out.println(contents);
				
			}
			else {
				System.out.println("Opera not Found in myarraylist");
				break;
			}
			
		}
//		
//		
		
		
	}

}
