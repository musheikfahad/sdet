package com.AscendingandDescendingOrder;

public class MaxNumberFromArray {

	public static void main(String[] args) {
		int a[] = { 06, 52, 32, 14, 11, 07, 89, 02, 56 };

		int max = a[0];

		for (int i = 0; i < a.length - 1; i++) {

			if (a[i] > max) {

				max = a[i];

			}
		}
		
		System.out.println("maximum value in the Array =" + max);

	}
}
