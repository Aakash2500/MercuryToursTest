package com.PageFactory.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginWithPagefactory {

	WebDriver driv;
	
	public LoginWithPagefactory(WebDriver driver)
	{
		driv=driver;
	}
	
	@FindBy(xpath = "//input[@name=\"userName\"]")
	WebElement uname;
	
	@FindBy(how = How.XPATH,using = "//input[@name=\"password\"]")
	WebElement pass;
	
	@FindBy(css = "input[name=\"submit\"]")
	@CacheLookup
	WebElement click;
	
	
	public void loginuser()
	{
		uname.sendKeys("BBBBB");
		pass.sendKeys("bbbbb");
		click.click();
	}
}
