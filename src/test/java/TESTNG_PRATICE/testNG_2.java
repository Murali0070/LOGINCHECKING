package TESTNG_PRATICE;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
/* open application
 * test logo presence
 * login 
 * close
 */
import org.testng.annotations.Test;

public class testNG_2 {
	WebDriver driver;
	
	@Test(priority=1)
	void openapp() {	
    driver =new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	
	@Test(priority=2)
	void Testlogo() throws InterruptedException
	{
		Thread.sleep(10000);
	boolean status = driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
	System.out.println("logo is displayed " + status);	
	}

	@Test(priority=3)
	void Testlogin() throws InterruptedException {
	driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
	driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
	driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
	Thread.sleep(4000);
	}

	@Test(priority=4)
	void close() {
		driver.quit();
	}
	
}
