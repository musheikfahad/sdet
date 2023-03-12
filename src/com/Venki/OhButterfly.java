package com.Venki;

import java.util.List;

import com.beust.jcommander.internal.Lists;

public class OhButterfly {
	
static	List<Integer> mum = Lists.newArrayList(1,2,3,4,5,6,7,8,9,10);
	
	public static void main(String[] args) {
		System.out.println(mum);
		int length = mum.size()  ;
//		System.out.println(length);
		int firstHalf = length/2;
		for (int i = firstHalf; i>0; i--) {
			
			System.out.println(i);
			
		}
		
		for (int i = length; i >length/2; i--) {
			System.out.println(i);
		}
		
	}

}
