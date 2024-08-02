package JUNE_PRACTICE_PACKAGE;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
public class selenium_practice 
{

	@Test		
	public void first() {
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://www.w3schools.com");
			driver.close();
	}
	public static void main(String[] args)
	{
		

    }

}

  