package TESTNG_PRATICE;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Dependency {
@Test(priority=1)
	void open() {
		
	Assert.assertTrue(true);
	}
	
@Test(priority=2,dependsOnMethods = {"open"})
	void login() {
		System.out.println("this is Login");
		Assert.assertTrue(true);
	}

@Test(priority=3 , dependsOnMethods= {"login"})
	void search() {
		System.out.println("this is Search");
		Assert.assertTrue(false);
	}
	
@Test(priority=4 , dependsOnMethods ={"login","search"})
	void Advnsearch() {
	System.out.println("this is Advensearch");
	Assert.assertTrue(true);
}
}
