package com.veni2;

import java.awt.List;
import java.util.Arrays;

import javax.swing.text.StyledEditorKit.ForegroundAction;

import com.Venki.Arraylist;

public class Ascending {
	
	
	
	public static void main(String[] args) {
		int a[] = {12,35,65,1,11,1000,45,66,22};
		
		System.out.println("before sorted =" + Arrays.toString(a));
		for (int i = 0; i < a.length-1; i++) {
			
			for (int j = 0; j < a.length-1; j++) {
				
				if (a[j]>a[j+1]) {
					int temp =a[j];
					a[j]=a[j+1];
					a[j+1] = temp;
					
				}
				
			}
			
		}
		
		System.out.println("After sorted "+ Arrays.toString(a));
		
	}

}
