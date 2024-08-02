package com.testCases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;

import com.Utilities.EXcelUtilities;
import com.Utilities.ExtentSparkReporter2;
import com.Utilities.Read_Config;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;


import io.github.bonigarcia.wdm.WebDriverManager;

@Listeners(ExtentSparkReporter2.class)
public class BaseTest {
  public  WebDriver	driver;
  
  
  Read_Config readconfig = new Read_Config();
  
  public String wwebsiteURl =readconfig.getApplicationURl();
  public String userNAME= readconfig.SetUSERNAME();
  public String passwd = readconfig.SetPASSWORD();
  public String NEW_URL = readconfig.pre_URl();
  public String First_name = readconfig.First_name();
  public String NEW_URL1= readconfig.GET_SHOP_URL();;
  public String NEWEMAIL =readconfig.newlogin();
  
  public String FIRST_NAME= readconfig.SET_SHOP_Fname();
  public String LAST_NAME = readconfig.SET_SHOP_Lname();
  public String SHOP_EMAIL= readconfig.SET_SHOP_Email();
  public String SHOP_PASSWORD= readconfig.SET_SHOP_PASSWORD();
  
  
  //String filepath = System.getProperty("user.dir")+"\\Exceldata\\newautomation.xlsx";
  
 

  
	@BeforeClass
	public void setUp() 
	{
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	init();
	}
	
	
	private void init() {
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//driver.manage().timeouts().implicitlyWait(10 ,TimeUnit.SECONDS);
	}
	
	
	
	/*public  void gettingexceldata() throws IOException {
		EXcelUtilities excel_1234 = new EXcelUtilities();
		int row = excel_1234.getRowCount(filepath,"Sheet1" );
		

	}
	*/
	
	
	
	
	
	
	
	
/*	@AfterClass
	public void tearDown()
	{
		
		driver.quit();
		
	}*/

}
