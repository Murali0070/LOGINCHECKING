package TESTNG_PRATICE;
/*open
 * 
 * login
 /logout
*/

import org.testng.annotations.Test;

public class tESTNG_1 {
   
	@Test(priority=0)
	void open () {
	
	System.out.println("openning the application");	
    }
	
	@Test(priority=1)
	void login() {
		
		System.out.println("login into the application");
		
	}
	
	@Test(priority=2)
	void logout() {
		
		System.out.println("logout from the application");
		
	}
	
	
}

