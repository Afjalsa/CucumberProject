package StepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Autofill 
{
	WebDriver driver=null;


	@Given("open browser")
	public void open_browser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\afjal\\Videos\\My_eclipse_workspace\\Demo_Cucumber.zip_expanded\\CucumberDemo\\Driver\\chromedriver.exe");
		System.out.println("open browser"); 
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver=new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();

	}

	@And("enter url")
	public void enter_url() 
	{
		System.out.println("enter url");
		driver.get("https://demo.automationtesting.in/Register.html");

	}

	@And("enter firstname and lastname")
	public void enter_firstname_and_lastname() 
	{
		System.out.println("enter firstname and lastname");
		driver.findElement(By.xpath("//input[@ng-model=\"FirstName\"]")).sendKeys("AFjal");
		driver.findElement(By.xpath("//input[@ng-model=\"LastName\"]")).sendKeys("Saifi");

	}

	@And("enter address and email address")
	public void enter_address_and_email_address() 
	{
		System.out.println("enter address and email address");
		driver.findElement(By.xpath("//textarea[@ng-model=\"Adress\"]")).sendKeys("Hapur");
		driver.findElement(By.xpath("//input[@ng-model=\"EmailAdress\"]")).sendKeys("afjalsaifi@gmal.com");
	}

	@And("enter phone number")
	public void enter_phone_number() 
	{
		System.out.println("enter phone number");
		driver.findElement(By.xpath("//input[@ng-model=\"Phone\"]")).sendKeys("9193625413");
	}

	@And("click on male and cricket")
	public void click_on_male_and_cricket() 
	{
		System.out.println("click on male and cricket");
		driver.findElement(By.xpath("//input[@value=\"Male\"]")).click();
		driver.findElement(By.xpath("//input[@value=\"Cricket\"]")).click();
	}

	@Then("select language,skills and country")
	public void select_language_skills_and_country()
	{
		System.out.println("select language,skills and country");
		//Select select=new Select(driver.findElement(By.xpath("//div[@id=\"msdd\"]")));
		//select.selectByVisibleText("Arabic");
		Select select1=new Select(driver.findElement(By.xpath("//select[@id=\"Skills\"]")));
		select1.selectByVisibleText("Java");
		//driver.findElement(By.linkText("Select Country")).click();
	}

	@And("select country and date of brith")
	public void select_country_and_date_of_brith() 
	{
		System.out.println("select country and date of brith");
		Select select2=new Select(driver.findElement(By.xpath("//select[@id=\"yearbox\"]")));
		select2.selectByVisibleText("2000");
		Select select3=new Select(driver.findElement(By.xpath("//select[@placeholder=\"Month\"]")));
		select3.selectByVisibleText("July");
		Select select4=new Select(driver.findElement(By.xpath("//select[@id=\"daybox\"]")));
		select4.selectByVisibleText("9");
	}

	@When("enter pass and confirm pass")
	public void enter_pass_and_confirm_pass() 
	{
		System.out.println("enter pass and confirm pass");
		driver.findElement(By.xpath("//input[@id=\"firstpassword\"]")).sendKeys("12345");
		driver.findElement(By.xpath("//input[@id=\"secondpassword\"]")).sendKeys("12345");
	}

	@Then("upload file")
	public void upload_file() 
	{
		System.out.println("upload file");
		driver.findElement(By.xpath("//input[@id=\"imagesrc\"]")).sendKeys("C:\\Users\\afjal\\eclipse-workspace\\Selenium_Demo_Project\\Factors02.jpg");
	}


}
