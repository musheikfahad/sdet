package com.Venki;

import java.util.Arrays;

public class ARraysRightRotations {

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5 };

		for (int d = 0; d < 3; d++) {

			int lasttemp = a[a.length - 1];
			for (int i = a.length - 2; i >= 0; i--) {
				a[i + 1] = a[i];
			}

			a[0] = lasttemp;
			System.out.println(Arrays.toString(a));
		}

	}
}
