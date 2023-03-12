package practice;

import java.awt.List;

public class ArrayList {

	
	
	public static void main(String[] args) {
		java.util.List<String> myArrayList = new java.util.ArrayList<String>();
		
		myArrayList.add("1");
		myArrayList.add("2");
		myArrayList.add("3");
		myArrayList.add("Four");
		myArrayList.add("5");
		
		String result ="";
		for(String c : myArrayList) {
			System.out.println(c);
			
			if(c.equalsIgnoreCase("four")) {
				result=result+4;
				
//				System.out.println(indexOf);
				myArrayList.set(3, result);
				
			}
			
		}
		
		String string = myArrayList.toString();
		System.out.println(string);
		
		
		int sum = 0;
		for (String var : myArrayList) {
			
			int intarray = Integer.parseInt(var);
			sum = sum +intarray;
			
		}
		
		System.out.println("total" +sum);
		
		for (String string2 : myArrayList) {
			
			if (string2.equalsIgnoreCase("opera")) {
				System.out.println("operA");
			}
			
		}
		
			System.out.println("no opera");
		
		
	}
}
