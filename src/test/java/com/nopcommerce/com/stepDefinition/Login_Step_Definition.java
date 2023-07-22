package com.nopcommerce.com.stepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.nopcommerce.com.pageobject.Login_PageObject;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login_Step_Definition
{
	public WebDriver driver;
	public Login_PageObject lpj;
	
	@Given("launch chrome browser")
	public void launch_chrome_browser() 
	{
	    System.setProperty("webdriver.chrome.driver","C:\\Users\\afjal\\Videos\\My_eclipse_workspace\\Demo_Cucumber.zip_expanded\\CucumberDemo\\Driver\\chromedriver.exe");
	    ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
	    driver=new ChromeDriver(options);
	    lpj=new Login_PageObject(driver);
	}

	@When("opens url")
	public void opens_url() 
	{
		driver.manage().window().maximize();
	    driver.get("https://admin-demo.nopcommerce.com/login");
	    
	}

	@When("enter email as {string} and Password as {string}")
	public void enter_email_as_and_password_as(String emailaddress, String password)
	{
	    lpj.enter_mail(emailaddress);
	    lpj.enter_passd(password);
	}

	@When("click on login")
	public void click_on_login() 
	{
	   lpj.click_login_Button();
	}
	
	@Then("click on logout link")
	public void click_on_logout_link() 
	{
		lpj.click_logout_Button();
	   
	}


}
