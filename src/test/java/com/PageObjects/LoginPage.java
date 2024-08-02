package com.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
 public WebDriver driver;
  
  public  LoginPage(WebDriver rdriver) 
  {
	  driver = rdriver;
	  PageFactory.initElements(rdriver, this);
  }
  
  @FindBy(xpath="//input[@name='email']")//input[@id='email']
  private static WebElement txtusername;
  
  @FindBy(xpath="//input[@name='pass']")
  WebElement txtpassword;
  
//input[@name='pass']
  
  @FindBy(xpath="//button[@name='login']")
  WebElement btnLogin;
  
  public  void setUserName(String userName) 
  {
	txtusername.sendKeys(userName);
  
  }
  
  public void setPassword(String password) 
  {
	txtpassword.sendKeys(password);

   }
   
  public void Clickbutton() 
  {
	btnLogin.click();

  }
  
}
