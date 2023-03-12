package com.Venki;

import java.util.Arrays;

public class Ascending {

	public static void main(String[] args) {
		int a[] = { 54, 65, 65, 45, 14, 78, 9, 124, 657, 23, 49 };
		System.out.println("before sortong " + a);

		int n = a.length;
//		System.out.println(length);

		
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n- 1; j++) {
				if (a[j]>a[j+1]) {

					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}

			}

		}
//		System.out.println("after ssortong ==" +Arrays.toString(a) );
		for (int i : a) {
			System.out.println(i);
		}

	}
}
