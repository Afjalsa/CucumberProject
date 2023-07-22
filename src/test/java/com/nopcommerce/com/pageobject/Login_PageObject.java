package com.nopcommerce.com.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_PageObject 
{
	WebDriver wdriver;
	
	public Login_PageObject(WebDriver rdriver)
	{
		wdriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath = "//input[@id=\"Email\"]")
	WebElement email;
	@FindBy(xpath = "//input[@value=\"admin\"]")
	WebElement pass;
	@FindBy(xpath = "//button[@class=\"button-1 login-button\"]")
	WebElement clogin;
	@FindBy(xpath = "//a[@href=\"/logout\"]") 
	WebElement logout;
	
	public void enter_mail(String emailadd) 
	{
		email.clear();
		email.sendKeys(emailadd);
	}
	
	public void enter_passd(String pss)
	{
		pass.clear();
		pass.sendKeys(pss);
	}
	
	public void click_login_Button()
	{
		clogin.click();
	}
	
	public void click_logout_Button()
	{
		logout.click();
	}

}
