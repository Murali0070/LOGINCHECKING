package com.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AutomationLoginPage {

	// email address  //input[@id='email']
	//password //input[@id='passwd']
	// signin button //button[@id='SubmitLogin']
	
	//a[@title='Log me out']
	
	
	WebDriver driver;
	public AutomationLoginPage(WebDriver edriver) {
		driver = edriver;
		PageFactory.initElements(edriver,this);
	}
	
	@FindBy(xpath="//input[@id='email']")
	private  WebElement EmailAddress;
	
	@FindBy (xpath ="//input[@id='passwd']")
	private  WebElement password;
	
	@FindBy(xpath= "//button[@id='SubmitLogin']") //button[@id='SubmitLogin']
	private  WebElement Signin;
	
	@FindBy (xpath ="//a[@title='Log me out']")
	private WebElement signout;
	
	
	public void enteremailaddress(String email) {
		EmailAddress.sendKeys(email);
	}
	
	public void enterpassword(String enterpassword) {
		 password.sendKeys(enterpassword);
	}	
	public void SIGHINBUTTON() {
		Signin.click();

	}
	public void SiGNOUT() {
		signout.click();
	}
	
	}
