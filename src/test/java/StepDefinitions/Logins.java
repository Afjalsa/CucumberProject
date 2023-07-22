package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;

public class Logins 
{
	WebDriver driver=null;

	@Given("Navigate to utest url")
	public void navigate_to_utest_url()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\afjal\\eclipse-workspace\\CucumberDemo\\src\\test\\resources\\Drivers\\chromedriver.exe");
	   System.out.println("Navigate to utest url");
	   driver=new ChromeDriver();
	   driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	   driver.manage().window().maximize();
	   driver.get("https://www.utest.com/");
	}

	@When("click on sign in link")
	public void click_on_sign_in_link() throws InterruptedException
	{
	    System.out.println("click on sign in link");
	    driver.findElement(By.xpath("//a[@class=\"unauthenticated-nav-bar__link\" ]")).click();
	    Thread.sleep(3000);
	}

	@And("click on sign in button")
	public void click_on_sign_in_button() throws InterruptedException 
	{
	    System.out.println("click on sign in button");
	    driver.findElement(By.xpath("//button[@id=\"kc-login\"]")).click();
	    Thread.sleep(3000);
	}
	
	@And("Enetr email")
	public void enetr_email() throws InterruptedException
	{
	   System.out.println("Enetr email");
	   driver.findElement(By.xpath("//input[@id=\"username\"]")).sendKeys("school@gmail.com");
	   Thread.sleep(3000);
	}

	@Then("validate the error message {string}")
	public void validate_the_error_message(String expected)
	{
		driver.findElement(By.xpath("//span[text()='Invalid username or password.']")).isDisplayed();
	    System.out.println("validate the error message {string}");
	    driver.close();
	    driver.quit();
	
	}
	
	
}
