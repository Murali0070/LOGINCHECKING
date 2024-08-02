package com.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ORANFGE_Login_Page {
WebDriver driver;

  ORANFGE_Login_Page(WebDriver driver){
	  this.driver =driver;
	  PageFactory.initElements( driver, this);
  }
  

	@FindBy(id="email")
	@CacheLookup
	WebElement username;
	
	@FindBy(id="passContainer")
	@CacheLookup
	WebElement PASSWORD;
	
	@FindBy(id="u_0_5_+W")
	@CacheLookup
	WebElement LoginButton;
	
	
	public void SetUserName(String usrName) {
		username.sendKeys(usrName);
	}
	
	public void Setpassowrd(String password) {
	PASSWORD.sendKeys(password);
	}
	public void LoginClick(String click) { 
		LoginButton.sendKeys(click);
	}
	
	
	



}
