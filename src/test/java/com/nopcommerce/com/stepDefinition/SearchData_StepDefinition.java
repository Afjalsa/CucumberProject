package com.nopcommerce.com.stepDefinition;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import com.nopcommerce.com.BaseClass.Base_Class;
import com.nopcommerce.com.pageobject.SearchData_Pageobject;
import com.nopcommerce.com.utilities.Baseclass;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.*;

public class SearchData_StepDefinition extends Base_Class
{
	@Before
	public void setup() {
		//log= LogManager.getLogger("SearchData_StepDefinition");

		readconfig= new Baseclass();

		System.out.println("Setup Method is executed.....");

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\afjal\\Videos\\My_eclipse_workspace\\Demo_Cucumber.zip_expanded\\CucumberDemo\\Driver\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver=new ChromeDriver(options);
		//log.info("Setup1 executed....");
	}


	@Given("browser open")
	public void browser_open() {

		Searchpage=new SearchData_Pageobject(driver);
		//log.info("Chrome browser luanched");
	}

	@When("enter URL")
	public void enter_url() {
		driver.manage().window().maximize();
		driver.get("https://admin-demo.nopcommerce.com/login");
		//log.info("Opend url");
	}

	@When("enter Mail and Password")
	public void enter_mail_and_password() {
		Searchpage.EnterMAIL();
		Searchpage.EnterPASS();
		//log.info("Mail and Password entered");
	}

	@When("click on Login")
	public void click_on_login() {
		Searchpage.ClickCLOGIN();
		//log.info("Successful Login");
	}

	@Then("We Can view Dashboad Page")
	public void we_can_view_dashboad_page() 
	{
		String actualTitle= Searchpage.getPageTitle();
		String expectedTitle="Dashboard / nopCommerce administration";

		if(actualTitle.equals(expectedTitle))
		{
			//log.warn(" Test Passed: Login feature page Title matched");
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
			//log.warn(" Test Failed: Login feature page Title not matched");
		}
	}

	@When("click on customer menu")
	public void click_on_customer_menu() {
		Searchpage.click_customerMenu();
		//log.info("clicked on customer menu");
	}

	@When("click on customer Item")
	public void click_on_customer_item() {
		Searchpage.click_customerITem();
		//log.info("clicked on customer item");
	}

	@When("enter customer Email")
	public void enter_customer_email() {
		Searchpage.Enter_Search_Email();
		//log.info("enetered email and password");
	}

	@When("click on search button")
	public void click_on_search_button() {
		Searchpage.click_Search();
		//log.info("clicked on search button");
	}

	@Then("we should found Email in the search Table")
	public void we_should_found_email_in_the_search_table() 
	{
		String expectedEmail="victoria_victoria@nopCommerce.com";
		if (Searchpage.searchCustomerByEmail(expectedEmail)==true)
		{
			//log.warn("Test Passed: Email found");
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
			//log.warn("Test Failed: Email not found");
		}
	}


	////Search Customer By Name/////

	@When("enter customer FirstName")
	public void enter_customer_first_name() {
		Searchpage.Enter_FirstName();
		//log.info("entered first name");
	}

	@When("enter customer LastName")
	public void enter_customer_last_name() {
		Searchpage.Enter_lastName();
		//log.info("entered last name");
	}

	@Then("we should found Name in the search Table")
	public void we_should_found_name_in_the_search_table() 
	{
		String expectedName="Victoria Terces";
		if (Searchpage.searchCustomerByName(expectedName)==true)
		{
			//log.warn("Test Passed: Name Found");
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
			//log.warn("Test Failed: Name ont found");
		}

	}

	//@After
	public void teardown(Scenario sc)
	{
		System.out.println("TearDown Method is executed.....");
		if(sc.isFailed()==true)
		{
			String fileWithPath="C:\\Users\\afjal\\Videos\\My_eclipse_workspace\\Demo_Cucumber.zip_expanded\\CucumberDemo\\Screenshot\\cpature1.png";
			TakesScreenshot scrshot=((TakesScreenshot)driver);

			File Srcfile=scrshot.getScreenshotAs(OutputType.FILE);

			File Destfile=new File(fileWithPath);


			try {
				FileUtils.copyFile(Srcfile,Destfile);
			} catch (IOException e) {

				e.printStackTrace();
			}

		}
		driver.quit();
	}

	/*@BeforeStep  // this is before execute for each test case
	public void BeforeStepMethod()
	{
		System.out.println("This is for before step.....");
	}
	@AfterStep  // this is after execute for each test case
	public void AfterStepMethod()
	{
		System.out.println("This is for after step....");
	}*/

	// This is validate for customer Roles..........

	@When("click on customer roles")
	public void click_on_customer_roles() throws InterruptedException {
		Searchpage.click_CustomerRoles();
	}

	@When("enter information and click on save button")
	public void enter_information_and_click_on_save_button() throws InterruptedException {
		//Searchpage.click_On_AddNew();

		//Searchpage.enter_Info_And_Save();
	}

	@Then("we can view information added successfully")
	public void we_can_view_information_added_successfully() {
		//Searchpage.check_info();
	}
    
	@When("click on venders")
	public void click_on_venders() throws InterruptedException {
	   Searchpage.click_on_Venders();
	}

	@Then("enter name and email")
	public void enter_name_and_email() {
	   Searchpage.enter_Vendor_Name();
	   Searchpage.enter_Vendor_Email();
	}

	@Then("click on button search")
	public void click_on_button_search() throws InterruptedException {
	   Searchpage.click_on_vendor_search();
	}

	@AfterStep
	public void addScreenshots(Scenario scenario)
	{
		//if(scenario.isFailed())
		//{
			final byte[] screenshot =((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(screenshot,"image/png",scenario.getName());
		//}
	}
	
	// Here ActivityLog Action Peforme
	
	@When("click on Activity Log")
	public void click_on_activity_log() {
	    Searchpage.click_on_Activitylog();
	}

	@When("enter createdfrom date")
	public void enter_createdfrom_date() {
	    Searchpage.enter_created_from();
	}

	@When("enter createdto time")
	public void enter_createdto_time() {
	    Searchpage.enter_created_to();
	}

	@When("enter IpAddress")
	public void enter_ip_address() {
	   Searchpage.enter_ip_address();
	}

	@Then("click on activity search")
	public void click_on_activity_search() {
	  Searchpage.click_on_activity_search();
	}
	
	// Here Activity Types Actions Performes
	
	@When("click on Activity Types")
	public void click_on_activity_types() {
	   Searchpage.click_ActivityTypes();
	}

	@When("click on check box")
	public void click_on_check_box() throws InterruptedException {
	    Searchpage.click_checks();
	}

	@Then("click Save button")
	public void click_save_button() {
	   Searchpage.click_SaveButton();
	}
	
	// Here  Search Catalog Product Names
	
	@When("click on Catalog")
	public void click_on_catalog() {
        Searchpage.click_on_catalog();
	}

	@When("click on products")
	public void click_on_products() {
	    Searchpage.click_on_products();
	}

	@When("enter product name")
	public void enter_product_name() {
	   Searchpage.enter_product_name();
	}

	@Then("click  on product serach button")
	public void click_on_product_serach_button() {
	   Searchpage.click_on_Product_search_btn();
	   
	}



	


}
