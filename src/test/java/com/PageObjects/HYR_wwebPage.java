  package com.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HYR_wwebPage {
	WebDriver driver;
	
	public HYR_wwebPage(WebDriver edriver) 
	{
		driver = edriver;
		PageFactory.initElements(edriver,this);
	}
	
	
	@FindBy(xpath="//input[@id='firstName']")
	WebElement FirstName;
	
	@FindBy(xpath ="//input[@name='lName']")
	WebElement LAstName;
	
	@FindBy(xpath="//input[@id='malerb']")
	WebElement Gender;
	
	@FindBy(xpath="//input[@id='englishchbx']")
	WebElement Language;
	
	@FindBy(xpath="//input[@id='email']")
	WebElement emailbox;
	
	@FindBy(xpath="//input[@name='psw']")
	WebElement PAssWOrd;
	
	@FindBy(xpath= "//button[@id='registerbtn']")
	WebElement REGisterBUtton;
	
	
	public void FirstName(String F_name) {
		FirstName.sendKeys(F_name);
		
	}
	public void LastName(String L_name) {
		LAstName.sendKeys(L_name);

	}
	
	//public void genderClick() {
	//	Gender.click();

	//}

}
