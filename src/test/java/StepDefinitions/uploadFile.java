//package StepDefinitions;
//
//import java.awt.Robot;
//import java.awt.Toolkit;
//import java.awt.datatransfer.Clipboard;
//import java.awt.datatransfer.StringSelection;
//import java.awt.event.KeyEvent;
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//
//public class uploadFile 
//{ 
//	WebDriver driver=null;
//	
//	@Given("open browser")
//	public void open_browser()
//	{
//		System.out.println("open browser");
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\afjal\\eclipse-workspace\\CucumberDemo\\src\\test\\resources\\Drivers\\chromedriver.exe");
//	    driver=new ChromeDriver();
//	    driver.manage().timeouts().pageLoadTimeout(2000, TimeUnit.SECONDS);
//	    driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
//	    driver.manage().window().maximize();
//	}
//
//	@And("enter url")
//	public void enter_url() 
//	{
//	    System.out.println("enter url");
//	    driver.get("https://www.testingbaba.com/");
//	}
//
//	@And("clicks on cross button")
//	public void clicks_on_cross_button() 
//	{ 
//		System.out.println("clicks on cross button");
//		driver.findElement(By.xpath("//button[@class=\"close\"]")).click();
//	}
//
//	@And("clicks oc practice")
//	public void clicks_oc_practice() 
//	{
//	    System.out.println("clicks oc practice");
//	    driver.findElement(By.xpath("(//a[text()='Practice'])[1]")).click();
//	}
//
//	@And("click on cross")
//	public void click_on_cross() 
//	{ 
//		System.out.println("click on cross");
//		//driver.findElement(By.xpath("//button[@data-target=\"#elements\"]")).click();
//	    
//	}
//
//	@And("clicks on webelement")
//	public void clicks_on_webelement() 
//	{ 
//		System.out.println("clicks on webelement");
//		driver.findElement(By.xpath("//button[@data-target=\"#elements\"]")).click();
//	    
//	}
//
//	@When("clicks on uploadfile")
//	public void clicks_on_uploadfile() 
//	{ 
//		System.out.println("clicks on uploadfile");
//		driver.findElement(By.xpath("//a[text()='upload and download']")).click();
//	    
//	}
//
//	@Then("can upload file")
//	public void can_upload_file() 
//	{
//		//String path="C:\\\\Users\\\\afjal\\\\eclipse-workspace\\\\CucumberDemo\\\\src\\\\test\\\\resources\\\\test-data\\\\BgcForm.pdf";
//		
//	    driver.findElement(By.xpath("//input[@id=\"File1\"]")).sendKeys("C:\\Users\\afjal\\eclipse-workspace\\CucumberDemo\\src\\test\\resources\\test-data\\BgcForm.pdf");
//	    //try 
////	    {
////	    	StringSelection s1=new StringSelection(path);
////	    	Clipboard clipboard=Toolkit.getDefaultToolkit().getSystemClipboard();
////	    	clipboard.setContents(s1, null);
////	    	
////	    	Robot robot=new Robot();
////	    	robot.keyPress(KeyEvent.VK_ENTER);
////	    	robot.keyRelease(KeyEvent.VK_ENTER);
////	    	robot.keyPress(KeyEvent.VK_CONTROL);
////	    	robot.keyPress(KeyEvent.VK_V);
////	    	robot.keyRelease(KeyEvent.VK_CONTROL);
////	    	robot.keyRelease(KeyEvent.VK_V);
////	    	robot.keyPress(KeyEvent.VK_ENTER);
////	    	robot.delay(250);
////	    	robot.keyRelease(KeyEvent.VK_ENTER);
////			
////
////	    	
////			
////		} catch (Exception e)
////	    {
////			
////		   System.out.println("Issue in upload file"+e);
////		}
//	    
//	    
//	    
//	}
//
//
//}
