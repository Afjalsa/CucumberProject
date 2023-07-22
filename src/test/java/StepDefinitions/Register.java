package StepDefinitions;

import java.awt.RenderingHints.Key;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.bytebuddy.asm.Advice.Enter;

public class Register 
{
	WebDriver driver=null;



	@Given("Opens the browser")
	public void opens_the_browser() 
	{
		System.out.println("Opens the browser");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\afjal\\eclipse-workspace\\CucumberDemo\\src\\test\\resources\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(2000, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		driver.manage().window().maximize();

	}

	@And("Enters the url")
	public void enters_the_url()
	{
		System.out.println("Enters the url");
		driver.get("https://demo.automationtesting.in/Register.html");
	}

	@And("Clicks on choose file")
	public void clicks_on_choose_file() throws InterruptedException 
	{
		Thread.sleep(2000);
		System.out.println("Clicks on choose file as");
//		driver.findElement(By.xpath("//input[@id=\"imagesrc\"]")).sendKeys("C:\\Users\\afjal\\eclipse-workspace\\CucumberDemo\\src\\test\\resources\\test-data\\BgcForm.pdf");
		System.out.println("Clicks on choose file");
		driver.findElement(By.xpath("//input[@type='file']")).click();
		System.out.println("Clicks on choose file");
//        String path="C:\\Users\\afjal\\eclipse-workspace\\CucumberDemo\\src\\test\\resources\\test-data\\BgcForm.pdf";
//		
//		
//	    try 
//	    { 
//	    	StringSelection s1=new StringSelection(path);
//	    	Clipboard clipboard=Toolkit.getDefaultToolkit().getSystemClipboard();
//	    	clipboard.setContents(s1, null);
//	    	
//	    	Robot robot=new Robot();
//	    	robot.keyPress(KeyEvent.VK_ENTER);
//	    	robot.keyRelease(KeyEvent.VK_ENTER);
//	    	robot.keyPress(KeyEvent.VK_CONTROL);
//	    	robot.keyPress(KeyEvent.VK_V);
//	    	robot.keyRelease(KeyEvent.VK_CONTROL);
////	    	robot.keyRelease(KeyEvent.VK_V);
//	    	robot.keyPress(KeyEvent.VK_ENTER);
//	    	robot.delay(250);
//	    	robot.keyRelease(KeyEvent.VK_ENTER);
//			
//		} catch (Exception e) 
//	    {
//			System.out.println("Issue in upload file"+e);
//		}
		
		//try {


			//driver.findElement(By.xpath("//input[@id=\"imagesrc\"]")).click();

			//String filePath=System.getProperty("user.dir")+File.separator+"test-data"+File.separator+"BgcFrom.pdf";
			//StringSelection stringselection=new StringSelection(filePath);
			//Toolkit.getDefaultToolkit().getSystemClipboard();

			//Robot robot =new Robot();

			//robot.keyPress(KeyEvent.VK_ENTER);
			//robot.keyRelease(KeyEvent.VK_ENTER);

			//robot.setAutoDelay(250);

			//robot.keyPress(KeyEvent.VK_CONTROL);
			//robot.keyPress(KeyEvent.VK_V);
			//robot.keyRelease(KeyEvent.VK_CONTROL);
			//robot.keyRelease(KeyEvent.VK_V);

			//robot.setAutoDelay(250);

			//robot.keyPress(KeyEvent.VK_ENTER);
			//robot.keyRelease(KeyEvent.VK_ENTER); 



	//	}catch(Exception e) 
		//{
			//System.out.println("Clicks on choose file"+e);
		//}


	}

	@Then("I can uploaded file")
	public void i_can_uploaded_file() 
	{
		System.out.println("I can uploaded file");
		SoftAssert soft=new SoftAssert();
		soft.assertTrue(driver.findElement(By.xpath("//header[@id=\"header\"]/descendant::h1")).isEnabled());

	}


}
