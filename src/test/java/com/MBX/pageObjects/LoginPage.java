package com.MBX.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	    WebDriver ldriver;
		
	public LoginPage(WebDriver rdriver){
			
			ldriver= rdriver;
			PageFactory.initElements(rdriver, this);     //Constructor
		}
		
	@FindBy(xpath="//input[@placeholder='Username']")
	@CacheLookup
	WebElement txtUserName;
	
	@FindBy(xpath="//input[@placeholder='Password']")
	@CacheLookup
	WebElement txtPassword;
	
	@FindBy(xpath="//button[@type='submit']")
	@CacheLookup
	WebElement txtlogin;
	
	
		public void setUserName(String uname) {
		txtUserName.sendKeys(uname);
		}
		
		public void setPassword(String password) {
			txtPassword.sendKeys(password);
		}
		public void clickLogin() {
			txtlogin.click();
		}

}
