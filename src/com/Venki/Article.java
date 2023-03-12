package com.Venki;

public class Article {
	
	
	public static void main (String [] args) {

		String s = "This the story about the boy in london";
		
		String[] splited = s.split(" ");
		int count = 0;
		
		boolean flag = true;
		for (String box : splited) {
			if (box.contentEquals("the")) {
//				System.out.println(box);
				count++;
				flag = false;
				
			}
			
		}
		
		if (flag==false) {
			System.out.println("Total numbers of the is ="+count);
			
		}
		
	}

}
