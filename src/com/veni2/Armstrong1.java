package com.veni2;

public class Armstrong1 {
public static void main(String[] args) {

	
	int y=153;
	int a =0;
		int m =0;
		
		a =153;
		
		while(a>0) {
			int  x = a%10;
			m = m +x*x*x;
			
			a=a/10;
			
			
		}
		
	if(m==y) {
		System.out.println(m +" Its an armstrong Number");
	}
	
}
}
