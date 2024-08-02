package com.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class MyStore_LOGIN {
	WebDriver driver;
	public MyStore_LOGIN(WebDriver rdriver) {
		driver  = rdriver;
		PageFactory.initElements(rdriver,this);
	
	}
		
	@FindBy (xpath="//input[@name='email_create']")
	private  WebElement EmailAddress;
	
	@FindBy(xpath = "//button[@name='SubmitCreate']")
	private  WebElement ACCOUNTCreateButton;
	
	public  void ENTER_EMAIL(String LOGIN_EMAIL) 
	{
	
	EmailAddress.sendKeys(LOGIN_EMAIL);
	
	}

	public  void CLICKBUTTON() 
	{
		ACCOUNTCreateButton.click(); 
	}
	
	
}