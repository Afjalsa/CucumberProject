package com.nopcommerce.com.stepDefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.nopcommerce.com.pageobject.Customer_PageObject;

import io.cucumber.java.en.*;

public class Customer_StepDefinition 
{
	public WebDriver driver;
	public Customer_PageObject cpj;
	
	
	@Given("User launch browser")
	public void user_launch_browser() 
	{
		    System.setProperty("webdriver.chrome.driver", "C:\\Users\\afjal\\Videos\\My_eclipse_workspace\\Demo_Cucumber.zip_expanded\\CucumberDemo\\Driver\\chromedriver.exe");
		    ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
		    driver=new ChromeDriver(options);
		    cpj=new Customer_PageObject(driver);

	}

	@When("User opens URL")
	public void user_opens_url()
	{
		driver.manage().window().maximize();
	    driver.get("https://admin-demo.nopcommerce.com/login");
	}

	@When("User enters Email and Password")
	public void user_enters_email_and_password() 
	{
	   cpj.Entermail();
	   cpj.EnterPass();
	}

	@When("User click on Login")
	public void user_click_on_login() 
	{
	   cpj.clickLogin();
	}

	@Then("User can view Dashboad")
	public void user_can_view_dashboad() 
	{
	    String actualTitle= cpj.getPageTitle();
	    String expectedTitle="Dashboard / nopCommerce administration";
	    
	    if(actualTitle.equals(expectedTitle))
	    {
	    	Assert.assertTrue(true);
	    }
	    else
	    {
	    	Assert.assertTrue(false);
	    }
	}

	@When("User click on customer menu")
	public void user_click_on_customer_menu() 
	{
	   cpj.clickCusmenu();
	}

	@When("click on Add new customer Item")
	public void click_on_add_new_customer_item() 
	{
	    cpj.clickCusItem();
	}

	@When("click on Add new button")
	public void click_on_add_new_button() 
	{
	    cpj.clickAddnew();
	}

	@Then("User can view Add new customer page")
	public void user_can_view_add_new_customer_page() 
	{
	   String actualTitle=cpj.getPageTitle();
	   String expectedTitle="Add a new customer / nopCommerce administration";
	   
	   if(actualTitle.equals(expectedTitle))
	    {
	    	Assert.assertTrue(true);
	    }
	    else
	    {
	    	Assert.assertTrue(false);
	    }

	}

	@When("User enter customer info")
	public void user_enter_customer_info() 
	{
	    cpj.clickonCustomerEmail();
	    cpj.clickoncustomerpass();
	    cpj.enterFirstname();
	    cpj.enterlastname();
	    cpj.clickonmale();
	    cpj.enter_date_of_brith();
	    cpj.enter_company_name();
	    cpj.clickontax();
	    //cpj.enter_news_letter();
	   // cpj.enter_customer_roles();
	   // cpj.enter_Vender();
	    cpj.clickonActive();
	    cpj.enter_comment();
	}

	@When("click on save button")
	public void click_on_save_button() 
	{
	    cpj.clicksave();
	}

	@Then("User can view confirmation message {string}")
	public void user_can_view_confirmation_message(String expectedConfirmationMessage) 
	{
	    String bodyTag=driver.findElement(By.tagName("Body")).getText();
	    if(bodyTag.contains(expectedConfirmationMessage))
	    {
	    	Assert.assertTrue(true);
	    }
	    else
	    {
	    	Assert.assertTrue(false);
	    }
	}

	@Then("close browser")
	public void close_browser() 
	{
	   // driver.close();
	   // driver.quit();
	}

	

}
