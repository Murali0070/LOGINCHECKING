package com.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MY_StorePAGE {
	//create object for webDriver.
	WebDriver driver;
	
	public MY_StorePAGE(WebDriver rdriver) {
		// TODO Auto-generated constructor stub

	driver  = rdriver;
		PageFactory.initElements(rdriver,this);
	}	
	
@FindBy(xpath = "//a[normalize-space()='Sign in']")
private  WebElement signIn;
	
	
public  void SIGNBUTTON() 
{
	signIn.click();
	
}
}
