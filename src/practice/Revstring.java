package practice;

public class Revstring {

	public static void main(String[] args) {
		String str = "musheik fahath is a good muslim";
		String[] splittedd = str.split(" ");
		String REvlinereve = "";

		for (String dan : splittedd) {

			String rev = "";

			for (int j = dan.length() - 1; j >= 0; j--) {
				rev = rev + dan.charAt(j);

			}
			REvlinereve = REvlinereve + rev;

		}
		System.out.print(REvlinereve);

	}

}
