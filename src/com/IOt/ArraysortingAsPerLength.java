package com.IOt;

//Java program to sort an Array of
//Strings according to their lengths
import java.util.*;

public class ArraysortingAsPerLength {

//Function to print the sorted array of string
//void printArraystring(string,int);

//Function to Sort the array of string
//according to lengths. This function
//implements Insertion Sort.
	public static void sort() {
		String poem = "GeeksforGeeks I from am" ;
		
		String[] str = poem.split(" ");
		
		int n = str.length;
		for (int i = 1; i < n; i++) {
			String words = str[i];
//			

			// Insert str[j] at its correct position
			int j = i - 1;
			while (j >= 0 && words.length() < str[j].length()) {
				str[j + 1] = str[j];
				j--;
			}
			str[j + 1] = words;
		}
		
		//Function to print the sorted array of string
		for (int i = 0; i < n; i++) {
			System.out.print(str[i] + " ");
		}
		
		
	}


	

//Driver function
	public static void main(String args[]) {

		sort();
		
		
	}
}
