package com.Venki;

import java.util.concurrent.CopyOnWriteArrayList;

public class StringlistToIntList {
	public static void main(String[] args) {
		CopyOnWriteArrayList<String> myArrayList = new CopyOnWriteArrayList<String>();

		myArrayList.add("1");
		myArrayList.add("2");
		myArrayList.add("3");
		myArrayList.add("4");

//		System.out.println(myArrayList);
		int sum =0;
		for (String var : myArrayList) {
			
			int ar = Integer.parseInt(var);
			
			sum = sum+ar;

			

		}
		System.out.println(sum);
	}

}
