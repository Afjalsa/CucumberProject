package com.nopcommerce.com.pageobject;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.nopcommerce.com.BaseClass.Base_Class;

public class Customer_PageObject extends Base_Class
{
	WebDriver wdriver;
	
	public Customer_PageObject(WebDriver cdriver)
	{
		wdriver=cdriver;
		PageFactory.initElements(cdriver,this );
	}

@FindBy(xpath = "//input[@id=\"Email\"]")
WebElement email;
@FindBy(xpath = "//input[@value=\"admin\"]")
WebElement pass;
@FindBy(xpath = "//button[@class=\"button-1 login-button\"]")
WebElement clogin;
@FindBy(xpath = "(//a[@href=\"#\"])[7]")
WebElement cus;
@FindBy(xpath = "//p[text()=' Customers']")
WebElement cusitem;
@FindBy(xpath = "//a[@href=\"/Admin/Customer/Create\"]")
WebElement addnew;
@FindBy(xpath = "//input[@type=\"email\"]")
WebElement cemail;
@FindBy(xpath = "//input[@type=\"password\"]")
WebElement cpass;
@FindBy(xpath = "//input[@id=\"FirstName\"]")
WebElement firstname;
@FindBy(xpath = "//input[@id=\"LastName\"]")
WebElement lastname;
@FindBy(xpath = "//input[@id=\"Gender_Male\"]")
WebElement gender;
@FindBy(xpath = "//input[@id=\"DateOfBirth\"]")
WebElement dateofbrith;
@FindBy(xpath = "//input[@id=\"Company\"]")
WebElement companyname;
@FindBy(xpath = "(//input[@name=\"IsTaxExempt\"])[1]")
WebElement taxdepartment;
@FindBy(xpath = "//input[@class=\"k-input k-readonly\"]")
WebElement newslatter;
@FindBy(xpath = "//input[@class=\"k-input\"]")
WebElement cusRole;
@FindBy(xpath = "//select[@id=\"VendorId\"]")
WebElement managerofvender;
@FindBy(xpath = "//input[@id=\"Active\"]")
WebElement active;
@FindBy(xpath = "//textarea[@id=\"AdminComment\"]")
WebElement admincomment;
@FindBy(xpath = "//button[@name=\"save\"]")
WebElement save;

public void Entermail()
{
	email.clear();
	String mail="admin@yourstore.com";
	email.sendKeys(mail);
}
public void EnterPass()
{
	pass.clear();
	String pas="admin";
	pass.sendKeys(pas);
}
public void clickLogin()
{
	clogin.click();
}
public String getPageTitle()
{
	return wdriver.getTitle();
}
public void clickCusmenu()
{
	cus.click();
}
public void clickCusItem()
{
	cusitem.click();
}
public void clickAddnew()
{
	addnew.click();
}
public void clickonCustomerEmail()
{
	cemail.sendKeys(genrateEmailID() + "@gmail.com");
}
public void clickoncustomerpass()
{
	cpass.sendKeys("kasim");
}
public void enterFirstname()
{
	firstname.sendKeys("kasim");
}
public void enterlastname()
{
	lastname.sendKeys("Saifi");
}
public void clickonmale() 
{
	gender.click();
}
public void enter_date_of_brith()
{
	dateofbrith.sendKeys("07/09/2023");
}
public void enter_company_name()
{
	companyname.sendKeys("Xapotech System PVT(LTD)");
}
public void clickontax()
{
	taxdepartment.click();
}
public void enter_news_letter()
{
	newslatter.sendKeys("Test");
	newslatter.sendKeys(Keys.ARROW_DOWN);
	newslatter.sendKeys(Keys.ENTER);
}
public void enter_customer_roles()
{
	cusRole.sendKeys("");
	cusRole.sendKeys(Keys.ARROW_DOWN);
	cusRole.sendKeys(Keys.ENTER);
}
public void enter_Vender()
{
	Select select =new Select(managerofvender);
	select.deselectByVisibleText("Vendor 1");
}
public void clickonActive()
{
	active.click();
}
public void enter_comment()
{
	admincomment.sendKeys("Thanks");
}
public void clicksave()
{
	save.click();
}

}
