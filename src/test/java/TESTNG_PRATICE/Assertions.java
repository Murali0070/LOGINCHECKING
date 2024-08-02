package TESTNG_PRATICE;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertions {
	@Test
	void Test_title() {
		String Exp_title = "OpenCraft";
		String act_expected = "OpenCraft";
		if (Exp_title.equals(act_expected)) 
		{ 
			System.out.println("both are same ");
			Assert.assertTrue(true);
		
		}
		else {
			System.out.println("both are not same");
			Assert.assertTrue(false);
		}
	
		//Assert.assertEquals(Exp_title, act_expected);
	// both are not same so result is faild.//
		
		
	}	
}
