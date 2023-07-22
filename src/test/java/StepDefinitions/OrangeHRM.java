package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class OrangeHRM 
{   
	
	WebDriver driver=null;
	Select select;
	
	@Given("open new browser")
	public void open_new_browser()
	{
	     System.out.println("open new browser");
	     System.setProperty("webdriver.chrome.driver", "C:\\Users\\afjal\\eclipse-workspace\\CucumberDemo\\src\\test\\resources\\Drivers\\chromedriver.exe");
	     driver=new ChromeDriver();
	     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	     driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	     driver.manage().window().maximize();
	}

	@And("hit the url")
	public void hit_the_url() 
	{
	    System.out.println("hit the url");
	    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	@And("enter username and password")
	public void enter_username_and_password() 
	{
	    System.out.println("enter username and password");
	    driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("Admin");
	    driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("admin123");
	}

	@Then("clicl on login button")
	public void clicl_on_login_button() 
	{
	   System.out.println("clicl on login button");
	   driver.findElement(By.xpath("//button[@class=\"oxd-button oxd-button--medium oxd-button--main orangehrm-login-button\"]")).click();
	}

	@And("enter employee name")
	public void enter_employee_name() 
	{
	    System.out.println("enter employee name");
	    driver.findElement(By.xpath("(//div[@class=\"oxd-autocomplete-wrapper\"]/descendant::input)[1]")).sendKeys("Samar Saifi");
	    //(//div[@class="oxd-autocomplete-wrapper"]/descendant::input)[2]
	}

	@And("enter employee id")
	public void enter_employee_id() 
	{
	    System.out.println("enter employee id");
	    driver.findElement(By.xpath("(//input[@class=\"oxd-input oxd-input--active\"])[2]")).sendKeys("2407824");
	}

	@And("select employement status")
	public void select_employement_status() 
	{
	    System.out.println("select employement status");
	    
	    WebElement preSelection=driver.findElement(By.xpath("(//div[text()='-- Select --'])[1]"));
	    preSelection.click();
	    preSelection.getText();
	   // select=new Select(driver.findElement(By.xpath("(//div[@tabindex=\"0\"])[1]")));
	   // select.selectByVisibleText("Full-Time Contract");
	}

	@And("select include")
	public void select_include()
	{
	    System.out.println("select include");
	}

	@And("enter supervisor name")
	public void enter_supervisor_name()
	{
	    System.out.println("enter supervisor name");
	}

	@And("select job title")
	public void select_job_title() 
	{
	    System.out.println("select job title");
	}

	@Then("select sub unit")
	public void select_sub_unit()
	{
	    System.out.println("select sub unit");
	}


}
