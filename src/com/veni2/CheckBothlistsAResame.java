package com.veni2;

import java.awt.List;
import java.util.Arrays;

import com.beust.jcommander.internal.Lists;

public class CheckBothlistsAResame {

	static int a[] = { 1, 2, 3 };

	static int b[] = { 1, 2, 3 };

	private static void mymeth() {
		String str = Arrays.toString(a);

		String srk = Arrays.toString(b);

		if (str.contentEquals(srk)) {
			System.out.println("list are same");
		} else {
			System.out.println("not same");
		}

	}

	public static void newMethod() {
		java.util.List<Integer> safwanlist1 = Lists.newArrayList(1, 2, 3, 4, 5);

		Object[] array = safwanlist1.toArray();

		String simbu = Arrays.toString(array);

		java.util.List<Integer> hayyanList2 = Lists.newArrayList(1, 2, 3, 4, 5);
		
		Object[] array2 = hayyanList2.toArray();
		
		String danush = Arrays.toString(array2);
		
		if (simbu.contentEquals(danush)) {
			System.out.println("list are same");
		} else {
			System.out.println("not same");
		}

		
		
	}

	private static void anotherMeth() {
		java.util.List<Integer> safwanlist1 = Lists.newArrayList(1, 2, 3, 4, 5);

		Object[] array = safwanlist1.toArray();

		Arrays.toString(array);

		java.util.List<Integer> hayyanList2 = Lists.newArrayList(1, 2, 3, 4, 5);

		boolean flag = Arrays.equals(safwanlist1.toArray(), hayyanList2.toArray());

		if (flag == true) {
			System.out.println("SafwanList ====" + safwanlist1);
			System.out.println("HayyanList ====" + hayyanList2);
			System.out.println("Both lists are equal");

		} else {
			System.out.println("Both list are not equal");
		}

	}

	public static void main(String[] args) {
//		mymeth();
//		anotherMeth();
		newMethod();
	}

}
