package com.Venki;

public class Exception {
	public static void main(String[] args) {
		String s = null;
		String m = "adcfg";

		try {
			int length1 = s.length();
			int length2 = m.length();

			if (length1 > length2) {
				System.out.println(length1);
			} else {
				System.out.println(length2);
			}
		}
	//		catch (NullPointerException e) {
////			e.printStackTrace();
//			System.out.println("exception handles");
//		} 
			finally {
			System.out.println("we have done");
		}

	}

}
