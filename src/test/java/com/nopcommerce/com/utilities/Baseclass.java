package com.nopcommerce.com.utilities;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Baseclass 
{
	public static WebDriver driver;
	public static Properties prop;
	public static String properties_path="C:\\Users\\afjal\\Videos\\My_eclipse_workspace\\Demo_Cucumber.zip_expanded\\CucumberDemo\\config.properties";
	public static BufferedReader reader;
	
	public Baseclass()
	{
		try 
    	{
    		reader=new BufferedReader(new FileReader(properties_path));
    		prop=new Properties();
    		prop.load(reader);
			
		} catch (FileNotFoundException f)
    	{
			f.printStackTrace();
		} catch (IOException i) 
    	{
			i.printStackTrace();
		}

	}

	public void launch_browser()
	{
		String browsername=prop.getProperty("browser");
    	if(browsername.equalsIgnoreCase("chrome"))
    	{
    		System.setProperty("webdriver.chrome.driver", "C:\\Users\\afjal\\Videos\\My_eclipse_workspace\\Demo_Cucumber.zip_expanded\\CucumberDemo\\Driver\\chromedriver.exe");
    		ChromeOptions options = new ChromeOptions();
    		options.addArguments("--remote-allow-origins=*");
    		driver=new ChromeDriver(options);
    	}
    	else if(browsername.equalsIgnoreCase("Firefox"))
    	{
    		System.setProperty("webdriver.gecko.driver", "C:\\Users\\afjal\\eclipse-workspace\\Maven_2022_decem\\geckodriver.exe");
    		driver=new FirefoxDriver();
    	}
    	else if(browsername.equalsIgnoreCase("Edge"))
    	{
    		System.setProperty("webdriver.edge.driver", "C:\\Users\\afjal\\eclipse-workspace\\Maven_2022_decem\\msedgedriver.exe");
    	}
    	driver.manage().window().maximize();
    	driver.manage().deleteAllCookies();
    	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(3));
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    	driver.get(prop.getProperty("BaseUrl"));
	}
	
}
