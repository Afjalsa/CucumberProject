package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Filldetails 
{   
	WebDriver driver=null;
	Select select;



//	@Given("i open browser")
//	public void i_open_browser()
//	{
//		System.out.println("i open browser");
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\afjal\\eclipse-workspace\\CucumberDemo\\src\\test\\resources\\Drivers\\chromedriver.exe");
//		driver=new ChromeDriver();
//		driver.manage().timeouts().pageLoadTimeout(2000, TimeUnit.SECONDS);
//		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
//		driver.manage().window().maximize();
//	}
//
//	@And("i enter url")
//	public void i_enter_url() 
//	{
//		System.out.println("i enter url");
//		driver.get("https://demo.automationtesting.in/Register.html");
//	}
//
	@And("i enter fiestname & lastname and address")
	public void i_enter_fiestname_lastname_and_address() 
	{
		System.out.println("i enter fiestname & lastname and address");
		driver.findElement(By.xpath("(//input[@class=\"form-control ng-pristine ng-untouched ng-invalid ng-invalid-required\"])[1]")).sendKeys("Samar");
		driver.findElement(By.xpath("(//input[@class=\"form-control ng-pristine ng-untouched ng-invalid ng-invalid-required\"])[2]")).sendKeys("Saifi");
		driver.findElement(By.xpath("//div[@class=\"col-md-8 col-xs-8 col-sm-8\"]/descendant::textarea")).sendKeys("New Delhi");

	}

	@And("i enter email adress")
	public void i_enter_email_adress() 
	{
		System.out.println("i enter email adress");
		driver.findElement(By.xpath("//input[@ng-model=\"EmailAdress\"]")).sendKeys("school@gmail.com");
	}

	@When("i give phone number")
	public void i_give_phone_number() 
	{
		System.out.println("i give phone number");
		driver.findElement(By.xpath("//input[@ng-model=\"Phone\"]")).sendKeys("1234567890");
	}

	@And("i select male in gender")
	public void i_select_male_in_gender() 
	{
		System.out.println("i select male in gender");
		driver.findElement(By.xpath("(//input[@name=\"radiooptions\"])[1]")).click();
	}

	@And("i select cricket in hobbies")
	public void i_select_cricket_in_hobbies() 
	{  
		System.out.println("i select cricket in hobbies");
		driver.findElement(By.xpath("//input[@id=\"checkbox1\"]")).click();

	}

//	@Then("i fill Hindi in language")
//	public void i_fill_hindi_in_language() 
//	{ 
//		System.out.println("i fill Hindi in language");
//		select=new Select(driver.findElement(By.xpath("//div[@id=\"msdd\"]")));
//		select.selectByVisibleText("English");
//
//	}
	
	
	
	@Given("i open browser")
	public void i_open_browser()
	{
		System.out.println("i open browser");
		System.setProperty("webdriver.chrome.driver", "");
		driver=new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(2000, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	@And("i enter url")
	public void i_enter_url() 
	{
		System.out.println("i enter url");
		driver.get("https://demo.automationtesting.in/Register.html");
	}


	@Given("I select Java in skills")
	public void i_select_java_in_skills() 
	{   
		System.out.println("I select Java in skills");
		select=new Select(driver.findElement(By.xpath("//select[@id=\"Skills\"]")));
		select.selectByVisibleText("Java");
	}

//	@And("I select India in contry")
//	public void i_select_india_in_contry() 
//	{  
//		System.out.println("I select India in contry");
//		select=new Select(driver.findElement(By.xpath("//span[@class=\"select2-selection select2-selection--single\"]")));
//		select.selectByVisibleText("India");
//
//
//	}

	@When("I select date of brith")
	public void i_select_date_of_brith() 
	{  
		System.out.println("I select date of brith");
		select=new Select(driver.findElement(By.xpath("//select[@id=\"yearbox\"]")));
		select.selectByVisibleText("2000");
		select=new Select(driver.findElement(By.xpath("//select[@placeholder=\"Month\"]")));
		select.selectByVisibleText("July");
		select=new Select(driver.findElement(By.xpath("//select[@id=\"daybox\"]")));
		select.selectByVisibleText("9");


	}

	@And("I enter the password")
	public void i_enter_the_password() 
	{
		System.out.println("I enter the password");
		driver.findElement(By.xpath("//input[@ng-model=\"Password\"]")).sendKeys("012345");
	}

	@Then("I enter confirm password")
	public void i_enter_confirm_password()
	{ 
		System.out.println("I enter confirm password");
		driver.findElement(By.xpath("//input[@ng-model=\"CPassword\"]")).sendKeys("012345");

	}


}
