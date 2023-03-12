package practice;

public class PrintThe {
	
	public static void main(String[] args) {
		String str = "the love of my life is the";
		
		String[ ] splitted = str.split(" ");
		
		int count = 0;
		
		for (String mush : splitted) {
			
			if (mush.equalsIgnoreCase("the")) {
				count++;
				System.out.println(mush);
				
			}
			
		}
		System.out.println(count);
	}

}
