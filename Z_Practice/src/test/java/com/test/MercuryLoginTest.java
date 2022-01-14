package com.test;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.PageFactory.pages.LoginWithPagefactory;
import com.PageFactory.pages.MercuryLogin;

public class MercuryLoginTest {

	static Logger log=Logger.getLogger(MercuryLoginTest.class);
	WebDriver driver;
	@Test(enabled = false)
	public void loginTest()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Chrome95\\chrome97\\chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/newtours/");
		driver.manage().window().maximize();
		
		MercuryLogin m=new MercuryLogin(driver);
		m.LoginPage();
		
		log.info("Sucessss");
	}
	
	@Test
	public void loginTest1()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Chrome95\\chrome97\\chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/newtours/");
		driver.manage().window().maximize();
		
		LoginWithPagefactory lp=PageFactory.initElements(driver, LoginWithPagefactory.class);
		lp.loginuser();
		
		log.info("Sucessss");
	}
}
