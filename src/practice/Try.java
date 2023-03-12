package practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.testng.collections.Objects.ToStringHelper;

import com.digitscounting.evensumoddsum;

public class Try {

	static public void ascending_order() {

		int a[] = { 25, 52, 65, 45, 89, 65, 74, 365 };

		System.out.println("Before Sorting   " + Arrays.toString(a));

		for (int i = 0; i < a.length - 1; i++) {

			for (int j = 0; j < a.length - 1; j++) {

				if (a[j] > a[j + 1]) {
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;

				}
			}

		}

		System.out.println(Arrays.toString(a));

	}
	
	public static int factorial(int n) {
		
		if (n==0) 
		{
			return 1 ;
		}			
		return n*factorial(n-1);
			
		
		
		

	}
	static public void revereAnumberUsingREcursion(int number) {
		
		if (number<10) {
		System.out.println(number);
			return ;
			
		}
		else {
			
			System.out.println(number%10);
			revereAnumberUsingREcursion(number/10);
		}
		
		
	}

	public static void descendingorder() {

		int a[] = { 25, 52, 65, 45, 89, 65, 74, 365 };

		System.out.println("Before sorted " + Arrays.toString(a));

		for (int i = 0; i < a.length - 1; i++) {

			for (int j = 0; j < a.length - 1; j++) {

				if (a[j] < a[j + 1]) {
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;

				}

			}

		}

		System.out.println("After sorted = " + Arrays.toString(a));

	}

	public static void maxNumberFromArray() {

		int a[] = { 25, 52, 65, 45, 89, 65, 74, 365 };

		int max = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			}
		}

		System.out.println("Maximum number from array = " + max);
	}

	public static void minNumberFromArray() {
		int a[] = { 25, 0, 52, 65, 45, 89, 65, 74, 365 };

		int min = a[0];

		for (int i = 0; i < a.length; i++) {
			if (a[i] < min) {

				min = a[i];

			}
		}

		System.out.println("min number from array =" + min);
	}

	public static void armstrong() {

		int count = 0;
		for (int i = 1; i < 2000000000; i++) {

			int m = 0;
			int n = 0;
			int a = i;
			while (a > 0) {

				n = a % 10;
				m = m + n * n * n;
				a = a / 10;

			}

			if (m == i) {
				System.out.println(m + "  " + i);
				count++;

			}
		}
		System.out.println();
		System.out.println(count);
	}

	public static void duplicatesInArray() {
		int a[] = { 1, 1, 2, 3, 3, 4, 5, 9, 9, 7, 8, 4 };

		List<Integer> duplicates = new LinkedList<Integer>();
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {

					duplicates.add(a[i]);
				}
			}
		}

		System.out.println(duplicates);

	}

	public static void removeDuplicatesFromArray() {
		int a[] = { 1, 1, 2, 3, 3, 4, 5, 9, 9, 7, 8, 4 };

		Set<Integer> dupefree = new HashSet<Integer>();
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {

				dupefree.add(a[i]);

			}

		}

		System.out.println(dupefree);

	}

	public static void dupefree() {
		int a[] = { 1, 1, 2, 3, 3, 4, 5, 9, 9, 7, 8, 4 };

		for (int i = 0; i < a.length; i++) {
			int count = 0;
			for (int j = i + 1; j < a.length; j++) {

				if (a[i] == a[j]) {

					count++;
				}

			}
			if (count == 0) {
				System.out.println(a[i]);

			}

		}

	}

	static public void butterfly() {
		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		int length = a.length;
		int halflength = length / 2;

		for (int i = halflength - 1; i >= 0; i--) {

			System.out.println(a[i]);

		}

		for (int i = length - 1; i >= halflength; i--) {
			System.out.println(a[i]);

		}
	}

	static public void evensumoddsum() {
		int x = 1234567;

		int oddsum = 0;
		int evensum = 0;
		while (x > 0) {

			int n = x % 10;
			if (n % 2 == 0) {
				evensum = evensum + n;
			}

			else {
				oddsum = oddsum + n;
			}
			x = x / 10;
		}

		System.out.println(oddsum);
		System.out.println(evensum);
	}

	public static void numogdigi() {
		int d = 123456;

		int count = 0;
		while (d > 0) {

			d = d / 10;
			count++;

		}
		System.out.println(count);
	}

	public static void sumofdigiinnumber() {
		int n = 12345;
		int sum = 0;
		while (n > 0) {
			int t = n % 10;
			sum = sum + t;
			n = n / 10;
		}
		System.out.println(sum);
	}

	public static void noOfevenAndOdd() {

		int x = 56575;
		int oddcount = 0;
		int evencount = 0;

		while (x > 0) {
			int c = x % 10;
			if (c % 2 == 0) {
				evencount++;
			} else {
				oddcount++;
			}
			x = x / 10;
		}
		System.out.println(oddcount);
		System.out.println(evencount);
	}

	public static void numberPoly() {
		int num = 77;
		int og = num;
		int rev = 0;
		while (num > 0) {
			int y = num % 10;
			rev = rev * 10 + y;
			num = num / 10;

		}
		if (rev == og) {
			System.out.println(og + " => poly number");
		}
	}

	static public void polyloop() {

		for (int i = 1; i < 100; i++) {

			int num = i;
			int og = i;
			int rev = 0;

			while (num > 0) {
				int c = num % 10;
				rev = rev * 10 + c;
				num = num / 10;
			}

			if (og == rev) {
				System.out.println(rev + "=>This is poly number");
			}
		}

	}

	static public void reverseastring() {

		String str = "nilamaryam";

		String rev = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);

		}

		if (rev.contentEquals(str)) {
			System.out.println(str + "==" + rev + "Given letter is polyndrome");

		} else {
			System.out.println(rev);
		}

	}

	public static void reverseAstringAnditseachletter() {
		String str = "hello world how are you";
		String[] split = str.split(" ");
		String reversedOfstring = "";

		for (String box : split) {

			String eachrevword = "";
			for (int i = box.length() - 1; i >= 0; i--) {
				eachrevword = eachrevword + box.charAt(i);
			}

			reversedOfstring = reversedOfstring + eachrevword;
		}

		System.out.println(reversedOfstring);
	}

	public static void arrayLeftrotate() {
		int a[] = { 1, 2, 3, 4 };

		for (int d = 0; d <= 2; d++) {

			int temp = a[0];
			for (int i = 0; i < a.length - 1; i++) {
				a[i] = a[i + 1];

			}

			a[a.length - 1] = temp;
		}
		System.out.println(Arrays.toString(a));
	}

	static public void arrayRotateRight() {
		int a[] = { 1, 2, 3, 4 };

		for (int d = 0; d < 1; d++) {

			int temp = a[a.length - 1];

			for (int i = a.length - 2; i >= 0; i--) {
				a[i + 1] = a[i];

			}
			a[0] = temp;
		}
		System.out.println(Arrays.toString(a));
	}

	public static void primenum() {
		int n = 11;
		int count = 0;
		for (int i = 2; i < n; i++) {

			if (n % i == 0) {
				count++;
			}
		}

		if (count == 0) {
			System.out.println(n + " Is prime number");
		} else {
			System.out.println(n + "Is not prime");
		}
	}

	static public void primenumberlist() {

		for (int i = 2; i < 100; i++) {

			int count = 0;
			for (int j = 2; j < i; j++) {

				if (i % j == 0) {
					count++;
				}
			}

			if (count == 0) {
				System.out.println(i + "Is prime");
			}
		}

	}

	public static void factorialll() {

		int num = 6;

		long fact = 1;

		for (int i = 6; i >= 1; i--) {

			fact = fact * i;

		}

		System.out.println(fact);
	}

	public static void fibonocci() {
		int a = 0;
		int b = 1;

		System.out.print(" " + a);

		System.out.print(" " + b);
		int sum = 0;

		for (int i = 2; i < 6; i++) {
			sum = a + b;
			System.out.print(" " + sum);
			a = b;
			b = sum;

		}

	}

	static public void arrayRotation() {
		int[] Array = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		for (int i = Array.length - 1; i >= 0; i--) {

			System.out.print(Array[i] + " ");

		}

	}

	static public void missing() {

		int a[] = { 1, 2, 3, 5 };

		int arraysum = 0;
		int sumwegot = 0;
		for (int i = 0; i < 5; i++) {
			arraysum = arraysum + i;
		}

		for (int i = 0; i < a.length - 1; i++) {

			sumwegot = sumwegot + a[i];

		}

		int missingnumber = arraysum - sumwegot;
		System.out.println(missingnumber);
	}

	static public int productSolution(String S, int D) {

		if (S.equalsIgnoreCase("one")) {
			String j = S.replace("one", "1");

			int h = Integer.parseInt(j);

			int resu = h * D;
			return resu;

		} else if (S.equalsIgnoreCase("two")) {
			String j = S.replace("two", "2");

			int h = Integer.parseInt(j);

			int resu = h * D;
			return resu;

		} else if (S.equalsIgnoreCase("three")) {
			String j = S.replace("three", "3");

			int h = Integer.parseInt(j);

			int resu = h * D;
			return resu;

		}

		return D;
	}

	static public void duplicateWords() {
		String s = "love is love untill love hits hits untill";

		String[] splitted = s.split(" ");

		Map<String, Integer> mappy = new HashMap<String, Integer>();
		for (String dan : splitted) {

			if (mappy.containsKey(dan)) {
				Integer value = mappy.get(dan);

				mappy.put(dan, value + 1);

			} else {
				mappy.put(dan, 1);
			}
		}

		System.out.println(mappy);

		Set<Entry<String, Integer>> log = mappy.entrySet();
		for (Entry<String, Integer> entry : log) {

			if (entry.getValue() > 1) {
				String key = entry.getKey();
				Integer value = entry.getValue();

				System.out.println(key + " " + value);
			}
		}

	}

	static public void countletters() {

		String words = "love of my life N1l@b@2u";

		int smallNumbers = 0;
		int capitalLetters = 0;

		int numbes = 0;
		int specialChars = 0;

		for (int i = 0; i < words.length(); i++) {
			if ('a' <= words.charAt(i) && words.charAt(i) <= 'z') {
				smallNumbers++;

			} else if ('A' <= words.charAt(i) && words.charAt(i) <= 'Z') {
				capitalLetters++;
			}

			else if ('0' <= words.charAt(i) && words.charAt(i) <= '9') {

				numbes++;

			} else {
				specialChars++;
			}

		}

		System.out.println("Total small Letters =" + smallNumbers);
		System.out.println("Total capital Letters =" + capitalLetters);
		System.out.println("Total Numbers =" + numbes);
		System.out.println("Total special char =" + specialChars);
	}

	public static void countcharrs() {

		String words = "LOV111111E of my life N1l@b@2u";
		String split = words.replace(" ", "");
		char[] charArray = split.toCharArray();

		int smallNumbers = 0;
		int capitalLetters = 0;

		int numbes = 0;
		int specialChars = 0;

		for (Character st : charArray) {
			if ('a' <= st && st <= 'z') {
				smallNumbers++;

			} else if ('A' <= st && st <= 'Z') {
				capitalLetters++;
			}

			else if ('0' <= st && st <= '9') {

				numbes++;

			} else {
				specialChars++;
			}

		}

		System.out.println("Total small Letters =" + smallNumbers);
		System.out.println("Total capital Letters =" + capitalLetters);
		System.out.println("Total Numbers =" + numbes);
		System.out.println("Total special char =" + specialChars);
	}

	static void removeCommonElement() {

		List<Integer> L1 = new LinkedList<Integer>();
		L1.add(1);
		L1.add(2);
		L1.add(3);
		L1.add(4);
		L1.add(5);
		L1.add(6);
		L1.add(7);
		List<Integer> L2 = new LinkedList<Integer>();
		L2.add(1);
		L2.add(2);
		L2.add(3);
		L2.add(4);

		System.out.print(L1 + " ");
		System.out.println();

		System.out.println(L2 + " ");

		// remove common element from l1

		L1.removeAll(L2);
		System.out.println(L1);

		// print only common
		List<Integer> L3 = new LinkedList<Integer>();
		L3.add(1);
		L3.add(2);
		L3.add(3);
		L3.add(4);
		L3.add(5);
		L3.add(6);
		L3.add(7);
		List<Integer> L4 = new LinkedList<Integer>();
		L4.add(1);
		L4.add(2);
		L4.add(3);
		L4.add(4);

		System.out.print(L3 + " ");
		System.out.println();

		System.out.println(L4 + " ");

		// remove common element from l13

		L3.retainAll(L4);
		System.out.println(L3);

	}

	static void replaceSpecialChar() {
		String str = "Y^%^*%&*^*(&*(Pankaj";
		str = str.replaceAll("[^a-z, 0-9, A-Z]", "");
		System.out.println(str);

	}

	public static void arrangeTheStringAsPerLength() {
		String poem = "love my country I its is";
		String[] a = poem.split(" ");

		for (int i = 0; i < a.length- 1; i++) { // no of passes

			for (int j = 0; j < a.length- 1; j++) { // iterations in each pass

				if (a[j].length() > a[j + 1].length()) {
					String temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}

			}
		}

		for (int j = 0; j < a.length; j++) {
			System.out.print(a[j] + " ");
		}
	}

	public static void arrangethestringusingCollect() {
		String poem = "GeeksforGeeks I from am";

		String[] arr = poem.split(" ");

		int n = arr.length;

		// Function to perform sorting
		Arrays.sort(arr, Comparator.comparing(s -> s.length()));

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");

		}

	}

	private static void vow() {

		String s = "welcome the jannathul firdowse musheik finally you have comes here";
		String wordddd = s.trim().replace(" ", "");
		System.out.println(wordddd);
		Map<Character, Integer> vowMap = new HashMap<Character, Integer>();
		Map<Character, Integer> consonentsMap = new HashMap<Character, Integer>();
		char[] c = wordddd.toCharArray();

		for (Character emptybox : c) {

			if (emptybox == 'A' || emptybox == 'a' || emptybox == 'E' || emptybox == 'e' || emptybox == 'I'
					|| emptybox == 'i' || emptybox == 'O' || emptybox == 'o' || emptybox == 'u' || emptybox == 'U') {

				if (vowMap.containsKey(emptybox)) {
					Integer value = vowMap.get(emptybox);
					vowMap.put(emptybox, value + 1);
				}

				else {
					vowMap.put(emptybox, 1);
				}

			}

			else {
				if (consonentsMap.containsKey(emptybox)) {
					Integer value = consonentsMap.get(emptybox);
					consonentsMap.put(emptybox, value + 1);

				} else {
					consonentsMap.put(emptybox, 1);
				}

			}

		}
		System.out.println(vowMap);
		System.out.println(consonentsMap);

		System.out.println("vowels");

		Set<Entry<Character, Integer>> entryyy = vowMap.entrySet();

		for (Entry<Character, Integer> entrybox : entryyy) {
			if (entrybox.getValue() > 1) {
				Character key = entrybox.getKey();

				Integer value = entrybox.getValue();

				System.out.println(key + "  " + value);
			}
		}

		System.out.println("consonents");
		Set<Entry<Character, Integer>> entry2 = consonentsMap.entrySet();

		for (Entry<Character, Integer> entrybox2 : entry2) {
			if (entrybox2.getValue()>1 ) {
				Character key = entrybox2.getKey();
				Integer value = entrybox2.getValue();

				System.out.println(key + " " + value);
			}
		}

	}

	public static void extractTheNUMberFRomStringAndADdThem() {
		String str = "hello mic testing 123";
		String split = str.replace(" ", "");
		str.split(" ");
		char[] charArray = split.toCharArray();
		int sum = 0;
		String empty = "";
		for (char c : charArray) {

			if ('0' <= c && c <= '9') {

				empty = empty + c;

			}

		}
		System.out.println(empty);

		int numbersinString = Integer.parseInt(empty);
		System.out.println(numbersinString);

		int n, m = 0;
		while (numbersinString > 0) {
			n = numbersinString % 10;
			m = m + n;
			numbersinString = numbersinString / 10;

		}
		System.out.println(m);
	}

	public static void missningLettersFromString() {
		String str = "ab";

		String str2 = str.replace(" ", "");

		LinkedList<Character> l1 = new LinkedList<Character>();
		for (int i = 0; i <= str2.length() - 1; i++) {
			l1.add(str2.charAt(i));

		}
		System.out.println(l1);

		String alphabets = "abcdefghijklmnopqrstuvwxyz";

		LinkedList<Character> l2 = new LinkedList<Character>();
		for (int i = 0; i <= alphabets.length() - 1; i++) {
			l2.add(alphabets.charAt(i));

		}
		System.out.println(l2);

		l2.removeAll(l1);
		System.out.println("Missing Chaarcters =" + l2);

	}

	public static void toUppercaseAndLowerCAse() {
		String s = "welcome to jurasic park";

		String[] a = s.split(" ");

		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < a.length; i++) {

			char c = a[i].charAt(0);
			char capsC = Character.toUpperCase(c);
			String substring = a[i].substring(1);
			sb.append(capsC).append(substring).append(" ");
		}
		System.out.println(sb);

	}

	public static void missingAlphabetanother() {
		String str = "ab";

		String str2 = str.replace(" ", "");
		char[] vv = str2.toCharArray();
		LinkedList<Character> l1 = new LinkedList<Character>();
		for (Character cha : vv) {

			l1.add(cha);

		}
		System.out.println(l1);

		String alphabets = "abcdefghijklmnopqrstuvwxyz";

		char[] gg = alphabets.toCharArray();

		LinkedList<Character> l2 = new LinkedList<Character>();

		for (Character krac : gg) {
			l2.add(krac);

		}

		System.out.println(l2);

		l2.removeAll(l1);
		System.out.println("Missing Chaarcters =" + l2);
	}

	public static void leadingSpaces() {
		String s = "     welcome to jurasic park    ";

		// ^[ \t]+|[ \t]$ leading and trailing

		// [ \t]+|[ \t]remove all white spaces

		// ^[ \t] ==> leading
		// [ \t]& ==>railing

//	String trim = s.trim();

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

	public static void replaceVow() {
		String s = "musheIk fahath";
		char[] ch = s.toCharArray();

		for (int i = 0; i < s.length() - 1; i++) {
			if (s.charAt(i) == 'A' || s.charAt(i) == 'a' || s.charAt(i) == 'E' || s.charAt(i) == 'e'
					|| s.charAt(i) == 'I' || s.charAt(i) == 'i' || s.charAt(i) == 'O' || s.charAt(i) == 'o'
					|| s.charAt(i) == 'U' || s.charAt(i) == 'u') {

				ch[i] = '&';

			}
		}

		System.out.println(ch);

	}

	public static void replacevowww2() {
		String s = "hello hello";

		String vow = s.replaceAll("[AEIOUaeiou]", "^^");
		System.out.println(vow);
	}

	public static void checkArrayEquality() {

		int a[] = { 1, 2, 3, 4, 5 };

		int b[] = { 1, 2, 3, 4, 5 };

		boolean isEquals = true;

		if (a.length == b.length) {
			for (int i = 0; i < a.length; i++) {

				if (a[i] != b[i]) {
					isEquals = false;
					break;
				}

			}
		} else {
			isEquals = false;
		}
		if (isEquals = true) {
			System.out.println("Array equals");
		} else {
			System.out.println("Arrays not equals");
		}

	}

	public static void allPairsFromIntegerArrayWhoseSumIsEqualToANumbere() {

		int a[] = { 1, 2, 3, 4, 5 };

		int total = 5;

		for (int i = 0; i < a.length - 1; i++) {

			for (int j = 0; j < a.length - 1; j++) {

				if (a[i] + a[j] == total) {

					System.out.println(a[i] + " " + a[j]);

				}

			}

		}

	}

	public static void main(String[] args) {
//		ascending_order();
//		descendingorder();
//		armstrong();
//		maxNumberFromArray();
//		minNumberFromArray();
//		duplicatesInArray();
//		removeDuplicatesFromArray();
//		dupefree();
//		butterfly();
//		evensumoddsum();
//		numogdigi();
//		sumofdigiinnumber();
//		noOfevenAndOdd();
//		numberPoly();
//		ployloop();
//		reverseastring();
//		reverseAstringAnditseachletter();
//		arrayLeftrotate();
//		arrayRotateRight();
//		primenum();
//		primenumberlist();
//		factorialll();
//		fibonocci();
//		missing();
//		System.out.println(productSolution("three", 5));
//		duplicateWords();
		countletters();
//		arrayRotation();
//		removeCommonElement();
//		replaceSpecialChar();
//		arrangeTheStringAsPerLength();
//		arrangethestringusingCollect();

	}

}
