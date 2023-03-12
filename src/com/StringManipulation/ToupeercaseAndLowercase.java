package com.StringManipulation;

public class ToupeercaseAndLowercase {
	private  static void meth2() {

		String s = "welcome to jurasic park jj";

		String[] a = s.split(" ");
		
		StringBuffer sb = new StringBuffer();
		
		for (int i = 0; i < a.length; i++) {
			
			char c = a[i].charAt(0);
			char CapCase = Character.toUpperCase(c);
			String substring = a[i].substring(1);
			sb.append(CapCase).append(substring).append(" ");
		}
		System.out.println(sb);
			}
		
		

	public static void main(String[] args) {
		meth2();
}
}