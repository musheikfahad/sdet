package com.veni2;

public class Armstrong2 {
public static void main(String[] args) {
	
	
	
	for (int i = 1; i < 1000; i++) {
		int x , m =0;
		int  b =i;
		int a= b;
		
		while(a>0) {
			x= a%10;
			m = m+x*x*x;
			
			a=a/10;
			
			
			
		}
		if (m==b) {
			System.out.println(m +" Its an Atrmsyrong number");
			
		}
		
	}
	
}
}
