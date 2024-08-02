package com.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ACCOUNT_CREATIONS{
    
	 public WebDriver driver;
	  
 public ACCOUNT_CREATIONS(WebDriver rdriver) {
		  driver = rdriver;
		  PageFactory.initElements(rdriver, this);
	  }
	
	//mr.   //input[@name='id_gender']  //label[@for='id_gender1'] //div[@id='uniform-id_gender1']
	//Firstname.  //input[@name='customer_firstname']
	//lastname. //input[@name='customer_lastname']
	//email. //input[@name='email']
	//password.  //input[@name='passwd']
	//dateofbirth.
	//rightBUTTON   //input[@name='newsletter']
	//RIGESTERBUtton //button[@name='submitAccount']
	
	@FindBy(xpath = "//input[@name='id_gender']")  //input[@id='id_gender1']"
	private  WebElement mr_mis;
	
	@FindBy(xpath ="//input[@name='customer_firstname']" )
	private  WebElement FIRSTNAME;
	
	@FindBy(xpath ="//input[@name='customer_lastname']" )
	private  WebElement LASTNAME;
	
	@FindBy(xpath ="//input[@name='email']" )
	private  WebElement EMAIL;
	
	@FindBy(xpath ="//input[@name='passwd']" )
	private  WebElement passwd;
	
	@FindBy(xpath ="//input[@name='newsletter']" )
	private  WebElement RADIObutton;
	
	@FindBy(xpath ="//button[@name='submitAccount']" )
	private  WebElement REGISTERBUTTOON;
	
	//AFTER creation of ACCOUNT , this is  checking 
	@FindBy(xpath="//span[normalize-space()='Manu dasari']")
	private WebElement USERNAME;
	
	@FindBy(xpath ="//a[@title='Log me out']")//a[@title='Log me out']
	private WebElement logout;
	
	public  void CLICK_McRs_MIs() {
		mr_mis.click();
	}
	
	public  void ENTER_FIRSSTNAME(String f_name) {
		FIRSTNAME.sendKeys(f_name);
	}
	
	public  void ENTER_LASRNAME(String l_name) {
		LASTNAME.sendKeys(l_name);

	}
	
	public  void ENTER_EMAIL(String email) {
		EMAIL.sendKeys(email);

	}
	
	public  void ENTER_PASSWORD(String password) {
		passwd.sendKeys(password);  

	}
	
	public  void CLICKbutton() {
		RADIObutton.click();
	}
	
	public  void REGISTERBUTTON_CLICK() {
		REGISTERBUTTOON.click();
	}
	
	public void LOGOUT() {
		logout.click();

	
}

}
 