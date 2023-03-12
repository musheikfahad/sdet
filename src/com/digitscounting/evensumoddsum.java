package com.digitscounting;

public class evensumoddsum {
	public static void main(String[] args) {
int number = 12345;
		
		int i ,j=0;
		int evensum =0;
		int oddsum =0;
		while(number > 0) {
			
			
			i = number %10;
			if (i%2==0) {
				evensum =evensum+i;
			}
			else {
				oddsum = oddsum+i;
			}
		
			number = number /10;
			
		}
		System.out.println(evensum+"=evensum");
		System.out.println();
		System.out.println(oddsum+"=oddsum");
		
		
	}

}
