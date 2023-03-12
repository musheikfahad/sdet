package com.StringManipulation;

public class ReplaceVowelsWithSpecialChar {
	public static void main(String[] args) {
		easymeth();
		anotherMeth();

	}

	public static void easymeth() {
		String s = "musheIk fahath";
		String replaceAll = s.replaceAll("[AEIOUaeiou]", "99");
		System.out.println(replaceAll);
	}
	public static void anotherMeth() {
		
			String s = "musheIk fahath";
			char[] ch = s.toCharArray();

			for (int i = 0; i < s.length() - 1; i++) {
				if (s.charAt(i) == 'A' || s.charAt(i) == 'a' || s.charAt(i) == 'E' || s.charAt(i) == 'e'
						|| s.charAt(i) == 'I' || s.charAt(i) == 'i' || s.charAt(i) == 'O' || s.charAt(i) == 'o'
						|| s.charAt(i) == 'U' || s.charAt(i) == 'u') {
					ch[i] = '&';
					
//					System.out.println(ch[i]);+
					

				}
			}
			
			System.out.println(ch);
		}
		
	}

