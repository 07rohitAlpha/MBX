package com.MBX.testCase;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.MBX.pageObjects.LoginPage;



public class TC_Login_001 extends BaseClass
{
	
@Test 	
public void loginTest() throws InterruptedException {
	driver.get(baseURl);
	Thread.sleep(3000);
	LoginPage lp = new LoginPage(driver); 
	Thread.sleep(2000);
	lp.setUserName(username);
	Thread.sleep(3000);
	lp.setPassword(password);
	Thread.sleep(2000);
	lp.clickLogin();
	 
	if (driver.getTitle().equals("Mail Box")) {
		Assert.assertTrue(true);
		}
	else {
		Assert.assertTrue(false);
	}



}
}
