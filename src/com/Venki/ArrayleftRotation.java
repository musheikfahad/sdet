package com.Venki;

import java.util.Arrays;

public class ArrayleftRotation {

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4, 5 };

		System.out.println(Arrays.toString(a));

		for (int d = 0; d < 4; d++) {

			int temp = a[0];
			for (int i = 0; i < a.length-1; i++) {
				a[i] = a[i + 1];

			}
			a[a.length - 1] = temp;

		}
		
		System.out.println(Arrays.toString(a));
	}
}
