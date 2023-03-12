package com.Venki;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardSoft {
	
	
	public static void main(String[] args) {
		String g ="jhhkh     hhohkj     ihihh";
		
		String rep = g.replaceAll("\\s{2,}", " ");
		
		System.out.println(rep);
	}
	
//	@Test
//	private void demo() {
//		// TODO Auto-generated method stub
//
//	
//		
//		String str = "CALLForTheDay";
//		String str2 = "CALLForTheDay             ";
//		
//		SoftAssert s = new SoftAssert();
//		
//		s.assertEquals(str, str2);	
//		System.out.println("Validation");
//		
//	
//	}
//	
//	@Test
//	private void hard() {
//
//		String str = "CALLForTheDay";
//		String str2 = "CALLForTheDay             ";
//		
//		Assert.assertNotEquals(str, str2);
//		
//		System.out.println("validated");
//		
//	}
}
