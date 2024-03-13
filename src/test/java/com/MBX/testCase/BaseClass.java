package com.MBX.testCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


public class BaseClass {

	public String baseURl =" http://14.140.15.95:3000/login";
	public String username = "test2";
	public String password = "123456";
	public static WebDriver driver;
	
	@BeforeClass
	public void setup() throws InterruptedException {
	 System.setProperty("Webdriver.chrome.driver", System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
	 ChromeOptions co = new ChromeOptions();
	 co.addArguments("--remote-allow-origins=*");
	 driver= new ChromeDriver(co);
	 driver.manage().window().maximize();
	 Thread.sleep(3000);
	}
	
	
	@AfterClass
	public void teamDown() {
		//driver.quit();
	}
	

	}


