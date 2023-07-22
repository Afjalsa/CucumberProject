//package utilities;
//
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome. ChromeDriver;
//
//import.io.github.bonigarcia.wdm.WebDriverManager;
//
//public class BrowserUtility 
//{
//	
//	public static WebDriver OpenBrowser(WebDriver,String browserName,String url)
//	{
//		if(browser.Name.equals("Chrome"))
//		{
//			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Drivers/chromedriver.exe");
//			//WebDriverManager.chromedriver().setup();
//			driver=new ChromeDriver();
//			driver.manage().timeouts().pageLoadTimeout(2000, TimeUnit.SECONDS);
//			driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
//			driver.manage().window().maximize();
//			
//			
//			driver.get(url);
//			Thread.sleep(2000);
//			return driver;
//			   
//			
//		}
//		return null;
//	}
//
//}
