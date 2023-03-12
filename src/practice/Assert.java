package practice;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assert {
	@Test
	public void hard() {
		String str1 = "muSHEIK";
		String str2 ="MUSHEIK";
		org.testng.Assert.assertEquals(str1 ,str2);
		
		System.out.println("validation");
		
	}
	
	@Test
	public void soft() {
		String str3 ="mUSheik";
		String str4 = "muSHJG       ";
		
		SoftAssert m = new SoftAssert();
		
		m.assertEquals(str3, str4);
		System.out.println("validation");
	}

}
