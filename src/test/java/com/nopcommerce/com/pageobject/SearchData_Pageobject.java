package com.nopcommerce.com.pageobject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchData_Pageobject 
{
	WebDriver sdriver;

	public 	SearchData_Pageobject(WebDriver edriver)
	{
		sdriver=edriver;
		PageFactory.initElements(edriver,this);
	}
	@FindBy(xpath = "//input[@id=\"Email\"]")
	WebElement EMAIL;
	@FindBy(xpath = "//input[@value=\"admin\"]")
	WebElement PASS;
	@FindBy(xpath = "//button[@class=\"button-1 login-button\"]")
	WebElement CLOGIN;
	@FindBy(xpath = "(//a[@href=\"#\"])[7]")
	WebElement CUSTOMERMENU;
	@FindBy(xpath = "//p[text()=' Customers']")
	WebElement CUSTOMERITEM;
	@FindBy(xpath = "//input[@type=\"email\"]")
	WebElement SEARCHEMAIL;
	@FindBy(xpath = "//button[@id=\"search-customers\"]")
	WebElement CSEARCH;
	@FindBy(xpath = "//table[@id=\"customers-grid\"]")
	WebElement searchResult;
	@FindBy(xpath = "//table[@id='customers-grid']//tbody/tr")
	List<WebElement> tableRows;
	/*@FindBy(xpath = "//table[@id='customers-grid']//tbody/tr[1]/td")
	List<WebElement> tabcolumns;*/
	@FindBy(xpath = "//input[@id=\"SearchFirstName\"]")
	WebElement firstname;
	@FindBy(xpath = "//input[@id=\"SearchLastName\"]")
	WebElement lastname;
	@FindBy(xpath = "//p[text()=' Customer roles']")  ////table[@id="customerroles-grid"]//tbody/tr[1]
	WebElement customerrole;
	@FindBy(xpath = "//a[@href=\"/Admin/CustomerRole/Create\"]")
	WebElement addnew;
	@FindBy(xpath = "//input[@id=\"Name\"]")
	WebElement entername;
	@FindBy(xpath = "//input[@id=\"Active\"]")
	WebElement active;
	@FindBy(xpath = "//input[@id=\"FreeShipping\"]")
	WebElement freeshipping;
	@FindBy(xpath = "//input[@id=\"TaxExempt\"]")
	WebElement taxexempt;
	@FindBy(xpath = "//input[@id=\"OverrideTaxDisplayType\"]")
	WebElement displaytype;
	@FindBy(xpath = "//input[@id=\"EnablePasswordLifetime\"]")
	WebElement enablepass;
	@FindBy(xpath = "//input[@id=\"SystemName\"]")
	WebElement systemname;
	@FindBy(xpath = "//button[@name=\"save\"]")
	WebElement savebtn;
	@FindBy(xpath = "//div[@class=\"alert alert-success alert-dismissable\"]")
    WebElement readtext;
	@FindBy(xpath = "//p[normalize-space()='Vendors']")////p[text()=' Vendors']
	WebElement clickVendor;
	@FindBy(xpath = "//input[@id=\"SearchName\"]")
	WebElement vendorname;
	@FindBy(xpath = "//input[@id=\"SearchEmail\"]")
	WebElement vendoremail;
	@FindBy(xpath = "//button[@id=\"search-vendors\"]")
	WebElement vendorserach;
	@FindBy(xpath = "//p[text()=' Activity log']")
	WebElement cactivitylog;
	@FindBy(xpath = "//input[@id=\"CreatedOnFrom\"]")
	WebElement createdfrom;
	@FindBy(xpath = "//input[@id=\"CreatedOnTo\"]")
	WebElement createdto;
	@FindBy(xpath = "//input[@id=\"IpAddress\"]")
	WebElement ipaddress;
	@FindBy(xpath = "//button[@id=\"search-log\"]")
	WebElement activitysearch;
	@FindBy(xpath = "//p[text()=' Activity Types']")
	WebElement ActivityTypes;
	@FindBy(xpath = "//input[@value=\"1\"]")
	WebElement check1;
	@FindBy(xpath = "//input[@value=\"2\"]")
	WebElement check2;
	@FindBy(xpath = "//input[@value=\"3\"]")
	WebElement check3;
	@FindBy(xpath = "//input[@value=\"4\"]")
	WebElement check4;
	@FindBy(xpath = "//input[@value=\"5\"]")
	WebElement check5;
	@FindBy(xpath = "//button[@name=\"save\"]")
	WebElement SaveButton;
	@FindBy(xpath = "(//a[@href=\"#\"]/p)[1]")
	WebElement catalogbtn;
	@FindBy(xpath = "//p[text()= ' Products']")
	WebElement productbtn;
	@FindBy(xpath = "//input[@id=\"SearchProductName\"]")
	WebElement productnamebtn;
	@FindBy(xpath = "//button[@id=\"search-products\"]")
	WebElement productserachbtn;
	@FindBy(xpath = "//td[text()='Apple MacBook Pro 13-inch']")
	WebElement ReadProduct;

	
	
	public void EnterMAIL()
	{
		EMAIL.clear();
		EMAIL.sendKeys("admin@yourstore.com");
	}
	public void EnterPASS()
	{
		PASS.clear();
		PASS.sendKeys("admin");
	}
	public void ClickCLOGIN()
	{
		CLOGIN.click();
	}
	public String getPageTitle()
	{
		return sdriver.getTitle();
	}
	public void click_customerMenu()
	{
		CUSTOMERMENU.click();
	}
	public void click_customerITem()
	{
		CUSTOMERITEM.click();
	}
	public void Enter_Search_Email()
	{
		SEARCHEMAIL.sendKeys("victoria_victoria@nopCommerce.com");
	}
	public void click_Search()
	{
		CSEARCH.click();
	}
	//// This is for Search by Email Id/////
	public boolean searchCustomerByEmail(String email)
	{
		boolean found= false;

		//total no. of rows in a grid
		int tRow= tableRows.size();

		//total no. of columns in a grid
		//int tColumns= tabcolumns.size();

		for(int i=1;i<=tRow;i++)
		{
			WebElement webelementEmail= sdriver.findElement(By.xpath("//table[@id='customers-grid']//tbody/tr[" + i + "]/td[2]"));

			String actualEmailadd= webelementEmail.getText();

			if(actualEmailadd.equals(email))
			{
				found=true;
			}


		}

		return found;
	}
	////table[@id=\\\"customers-grid\\\"]//tbody/tr[" + i + "]/td[2]

	////////// search customer by name
	public void Enter_FirstName()
	{
		firstname.sendKeys("Victoria"); //Victoria
	}
	public void Enter_lastName()
	{
		lastname.sendKeys("Terces"); //Terces
	}

	public boolean searchCustomerByName(String name)
	{
		boolean found= false;

		//total no. of rows in a grid
		int tRow= tableRows.size();



		for(int i=1;i<=tRow;i++)
		{
			WebElement webelementName= sdriver.findElement(By.xpath("//table[@id='customers-grid']//tbody/tr[" + i + "]/td[3]"));

			String actualName= webelementName.getText();

			if(actualName.equals(name))
			{
				found=true;
				break;
			}


		}

		return found;
	}
	public void click_CustomerRoles() throws InterruptedException
	{
		Thread.sleep(2000);
		customerrole.click();
		Thread.sleep(2000);
		addnew.click();
		entername.sendKeys("Naeem");
		active.click();
		freeshipping.click();
		taxexempt.click();
		displaytype.click();
		enablepass.click();
		systemname.sendKeys("Naeem System");
		Thread.sleep(2000);
		savebtn.click();
		System.out.println(readtext.getText());
	}
	
	// Here Vendor Actions 
	public void click_on_Venders() throws InterruptedException
	{
		CUSTOMERMENU.click();
		Thread.sleep(2000);
		clickVendor.click();
	}
	
	public void enter_Vendor_Name()
	{
		vendorname.sendKeys("Vendor 1");
	}
	public void enter_Vendor_Email()
	{
		vendoremail.sendKeys("vendor1email@gmail.com");
	}
	public void click_on_vendor_search() throws InterruptedException
	{
		Thread.sleep(2000);
		vendorserach.click();
	}
	// Here Activity log Actions
	public void click_on_Activitylog()
	{
		cactivitylog.click();
	}
	public void enter_created_from()
	{
		createdfrom.sendKeys("7/14/2023");
	}
	public void enter_created_to()
	{
		createdto.sendKeys("8:47:22 PM");
	}
	public void enter_ip_address()
	{
		ipaddress.sendKeys("172.71.218.71");
	}
	public void click_on_activity_search()
	{
		activitysearch.click();
	}
	// Here ActivityTypes Actions Perfromes
	public void click_ActivityTypes()
	{
		ActivityTypes.click();
	}
	public void click_checks() throws InterruptedException
	{
		check1.click();
		Thread.sleep(2000);
		check2.click();
		Thread.sleep(2000);
		check3.click();
		Thread.sleep(2000);
		check4.click();
		Thread.sleep(2000);
		check5.click();
	}
	public void click_SaveButton()
	{
		SaveButton.click();
	}
	
	// Here Serach Catalog Produtcs
	
	public void click_on_catalog()
	{
		catalogbtn.click();
	}
	public void click_on_products()
	{
		productbtn.click();
	}
	public void enter_product_name()
	{
		productnamebtn.sendKeys("Apple Macbook Pro");
	}
	public void click_on_Product_search_btn()
	{
		productserachbtn.click();
		System.out.println(ReadProduct.getText());
	}
}