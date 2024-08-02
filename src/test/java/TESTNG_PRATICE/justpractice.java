package TESTNG_PRATICE;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class justpractice {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.automationpractice.pl/index.php");
		driver.findElement(By.xpath("//a[contains(text(), 'Sign in')]")).click();
	}

}
