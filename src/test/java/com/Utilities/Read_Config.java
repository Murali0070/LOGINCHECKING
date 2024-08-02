package com.Utilities;

import java.io.File;
import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.util.Properties;

import javax.swing.text.PasswordView;

public class Read_Config {
	Properties pro;
	public Read_Config() { try {
	
		File src = new File("./Configurations/confing.properties");
		
		FileInputStream fis = new FileInputStream(src);
		 
		pro = new Properties();
		pro.load(fis);}
	catch (Exception e) {
		System.out.println("Exception is  " + e.getMessage());
	}
	}
	
	public String getApplicationURl() {
	String WEBURL = pro.getProperty("WebsiteURl");
	return WEBURL;
	}
	
	public String SetUSERNAME() {
		String USERNAME = pro.getProperty("userNAME");
	return USERNAME;
	
	}
	
	
	public String SetPASSWORD() {
		String PASSWORD = pro.getProperty("passwd");
		return PASSWORD;
	}
	//calling new uri.
	public String pre_URl() {
		String pEW_URL = pro.getProperty("NEW_URL");
		return pEW_URL;
	}
	
	public String First_name() {
		String first_name = pro.getProperty("First_name");
		return first_name;
	}
	private String final_name()  {
		String last_name = pro.getProperty("Last_name");
		return last_name;
	}
	
	public String email() {
		String Email = pro.getProperty("email");
		return Email;
	}
	
	public String Password() {
	String newpass = pro.getProperty("passWORD");
	return newpass;
	}
	
	public String GET_SHOP_URL() 
	{
	String URL1 = pro.getProperty("SHOP_URL");
	return URL1;

	}
	
	public  String newlogin() {
		String newlogin1 =pro.getProperty("LOGIN_EMAIL");
		return newlogin1;
	}
	
	public String SET_SHOP_Fname() {
		String GETTING_F_NAME =pro.getProperty("SHOP_Fname");
		return GETTING_F_NAME;

	}
	
	public String SET_SHOP_Lname() {
		String GETTING_L_NAME =pro.getProperty("SHOP_lname");
		return GETTING_L_NAME;

	}
	
	public String SET_SHOP_Email() {
		String GETTING_email =pro.getProperty("SHOP_EMAIL");
		return GETTING_email;

	}
	
	public String SET_SHOP_PASSWORD() {
		String GETTING_PASSWORD =pro.getProperty("SHOP_PASSWORD");
		return GETTING_PASSWORD;

	}
	
}
