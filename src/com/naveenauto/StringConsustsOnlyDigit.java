package com.naveenauto;

public class StringConsustsOnlyDigit {

	public static boolean isEmpty(CharSequence cs) {
		return cs == null || cs.length() == 0;

	}

	public static boolean isnumer(CharSequence cs) {
		if (isEmpty(cs)) {
			return false;
		}

		int len = cs.length();
		for (int i = 0; i < len; i++) {
			if (!Character.isDigit(cs.charAt(i))) {
				return false;

			}
		}

		return true;

	}

	public static void main(String[] args) {

		System.out.println();

		System.out.println(isnumer(null));
		System.out.println(isnumer("123"));
		System.out.println(isnumer(""));
		System.out.println(isnumer(" "));
		System.out.println(isnumer("a"));
		System.out.println(isnumer("1"));
		System.out.println(isnumer("123"));
		System.out.println(isnumer("12345678"));
		System.out.println(isnumer("testing"));
		System.out.println(isnumer("test123"));
		System.out.println(isnumer("123t"));
		System.out.println(isnumer("2.3"));
		System.out.println(isnumer("+123"));
		System.out.println(isnumer("-123"));
		System.out.println(isnumer("0"));
		System.out.println(isnumer("1 1 1"));
		System.out.println(isnumer("$"));
	}
}
