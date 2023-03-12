package com.Venki;

public class CountCapitalSmallSpecialChar {
public static void main(String[] args) {
	String str = "wElcomE tO @^%&*()javA123";
	
	String strnew = str.replace(" ", "");
	int smallCount=0;
	int capitalCount=0;
	int numberCount=0;
	int specialCount=0;
	char[] charArray = strnew.toCharArray();
	for (char c : charArray) {
		System.out.print(c +" ");
	}
	for (char c : charArray) {
		if ('a'<=c && c<='z') {
			smallCount++;
		}
		else if ('A'<=c && c<='Z') {
			capitalCount++;
			
		}
		else if ('0'<=c &&c<='9') {
			numberCount++;
		}
		else {
			specialCount++;
		}
		
	}
	System.out.println();
	System.out.println("total small letters ="+smallCount);
	
	System.out.println("total capitalletter =" + capitalCount);
	
	System.out.println("total numbers =" +numberCount);
	
	System.out.println("special chars ==" +specialCount);
	
}
}
