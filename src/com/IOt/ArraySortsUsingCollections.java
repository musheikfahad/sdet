package com.IOt;
import java.util.Arrays;
import java.util.Comparator;

public class ArraySortsUsingCollections {
	

	

	// Function to check the small String

	// Function to print the sorted array of String
	static void printArrayString(String str[], int n) {
		for (int i = 0; i < n; i++)
		System.out.print(str[i] + " ");
	}

	// Driver function
	public static void main(String[] args) {
		String arr[] = { "GeeksforGeeks", "I", "from", "am" };
		int n = arr.length;

		// Function to perform sorting
		Arrays.sort(arr, Comparator.comparing(s->s.length()));

		// Calling the function to print result
		printArrayString(arr, n);
	}
	}

	// This code is contributed by 29AjayKumar


