package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Dropdown
{  
	WebDriver driver=null;
	
	@Given("opens browser")
	public void opens_browser() 
	{  
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\afjal\\eclipse-workspace\\CucumberDemo\\src\\test\\resources\\Drivers\\chromedriver.exe");
		   System.out.println("opens browser");
		   driver=new ChromeDriver();
		   driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		   driver.manage().window().maximize();
		 

	    
	}

	@And("enters the url")
	public void enters_the_url() 
	{ 
		System.out.println("enters the url");
		driver.get("https://demo.automationtesting.in/Register.html");
	   
	}

	@And("chooses Java")
	public void chooses_java() 
	{
	    System.out.println("chooses Java");
	    Select select=new Select(driver.findElement(By.xpath("//select[@id=\"Skills\"]")));
	    select.selectByVisibleText("Java");
	}

	@And("chooses year")
	public void chooses_year() 
	{
	    System.out.println("chooses year");
	    Select select=new Select(driver.findElement(By.id("yearbox")));
	    select.selectByVisibleText("2000");
	}

	@And("choosers month")
	public void choosers_month() 
	{  
		System.out.println("choosers month");
		Select select=new Select(driver.findElement(By.xpath("//select[@ng-init=\"monthbox=''\"]")));
		select.selectByVisibleText("July");
	    
	}

	@Then("chooses day")
	public void chooses_day() 
	{
	    System.out.println("chooses day");
	    Select select=new Select(driver.findElement(By.id("daybox")));
	    select.selectByVisibleText("9");
	}
////div[@class="col-md-4 col-xs-4 col-sm-4"]/following::label[11]/following::div/descendant::div[@style="min-height:30px;max-width:200px"]
////select[@id="country"]/following::span/descendant::span[@tabindex="-1"]	

}
