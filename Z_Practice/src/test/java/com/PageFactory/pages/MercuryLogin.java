package com.PageFactory.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MercuryLogin {

	WebDriver driver;
	
	public MercuryLogin(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By username=By.xpath("//input[@name=\"userName\"]");
	By pass=By.xpath("//input[@name=\"password\"]");
	By click=By.cssSelector("input[name=\"submit\"]");
	
	public void LoginPage()
	{
		driver.findElement(username).sendKeys("AAAAA");
		driver.findElement(pass).sendKeys("aaaaa");
		driver.findElement(click).click();
	}
}
