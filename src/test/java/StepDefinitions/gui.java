package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

public class gui 
{
	WebDriver driver=null;
	
	@Given("i open to browser")
	public void i_open_to_browser() 
	{ 
		System.out.println("i open to browser");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\afjal\\eclipse-workspace\\CucumberDemo\\src\\test\\resources\\Drivers\\chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.manage().timeouts().pageLoadTimeout(2000, TimeUnit.SECONDS);
	    driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
	    driver.manage().window().maximize();
	    
	}

	@And("i enter the url")
	public void i_enter_the_url()
	{  
		System.out.println("i enter the url");
		driver.get("https://bsreview-v2.mfilterit.net/");
 	  
	}

	@And("enters the username")
	public void enters_the_username() throws InterruptedException
	{
	   System.out.println("enters the username");
	   Select select=new Select(driver.findElement(By.id("//select[@name=\"inputcustomer\"]")));
	   select.selectByVisibleText("AmazonCL1");
	   Thread.sleep(3000);
	}

	@And("enters the password")
	public void enters_the_password() throws InterruptedException 
	{  
		System.out.println("enters the password");
		Select select=new Select(driver.findElement(By.id("//select[@id=\"inputplatform\"]")));
		   select.selectByVisibleText("Social Media");
		   Thread.sleep(3000);

		
	    
	}

}
