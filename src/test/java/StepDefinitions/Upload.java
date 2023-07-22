package StepDefinitions;




import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Upload
{   WebDriver driver=null;
	
	@Given("I open the browser")
	public void i_open_the_browser() 
	{
	    System.out.println("I open the browser");
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\afjal\\eclipse-workspace\\CucumberDemo\\src\\test\\resources\\Drivers\\chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.manage().timeouts().pageLoadTimeout(2000, TimeUnit.SECONDS);
	    driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
	    driver.manage().window().maximize();
	}

	@And("I enter the url")
	public void i_enter_the_url()
	{
	    System.out.println("I enter the url");
	    driver.get("https://www.monsterindia.com/");
	}

	@And("I click on uplaod link")
	public void i_click_on_uplaod_link() 
	{
	    System.out.println("I click on uplaod link");
	    driver.findElement(By.xpath("//span[text()=\"Upload Resume\"]")).click();
	}

	@Then("I  can upload a file")
	public void i_can_upload_a_file( ) throws InterruptedException 
	{
		String path="C:\\Users\\afjal\\eclipse-workspace\\CucumberDemo\\src\\test\\resources\\test-data\\BgcForm.pdf";
		
		System.out.println("I  can upload a file");
//	    driver.findElement(By.id("file-upload")).sendKeys("C:\\Users\\afjal\\eclipse-workspace\\CucumberDemo\\src\\test\\resources\\test-data\\BgcForm.pdf");
		driver.findElement(By.id("file-upload")).click();
		Thread.sleep(2000);
	    try 
	    { 
	    	StringSelection s1=new StringSelection(path);
	    	Clipboard clipboard=Toolkit.getDefaultToolkit().getSystemClipboard();
	    	clipboard.setContents(s1, null);
	    	
	    	Robot robot=new Robot();
	    	robot.keyPress(KeyEvent.VK_ENTER);
	    	robot.keyRelease(KeyEvent.VK_ENTER);
	    	robot.keyPress(KeyEvent.VK_CONTROL);
	    	robot.keyPress(KeyEvent.VK_V);
	    	robot.keyRelease(KeyEvent.VK_CONTROL);
	    	robot.keyRelease(KeyEvent.VK_V);
	    	robot.keyPress(KeyEvent.VK_ENTER);
	    	robot.delay(250);
	    	robot.keyRelease(KeyEvent.VK_ENTER);
			
		} catch (Exception e) 
	    {
			System.out.println("Issue in upload file"+e);
		}
	    
	}



}
