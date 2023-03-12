package com.StringManipulation;

public class LeadinAndTraingSpaces {

	public static void main(String[] args) {
		String s = "     welcome to jurasic park    ";

		// ^[ \t]+|[ \t]$ leading and trailing

		// [ \t]+|[ \t]remove all white spaces

		// ^[ \t] ==> leading
		// [ \t]& ==>railing

//		String trim = s.trim();

		String op = s.replaceAll("^[ \t]+|[ \t]$", "");
		System.out.println(op);

		String hhh = "           hello love hoe wre you     ";
		System.out.println(hhh);
		String ff = hhh.replaceAll("^[ \t]+|[ \t]$", "");
		System.out.println(ff);

		String kk = "   hi musheik  ";
		System.out.println(kk);
		String nn = kk.replaceAll("^[ \t]+|[ \t]", "");
		System.out.println(nn);
	}
}
