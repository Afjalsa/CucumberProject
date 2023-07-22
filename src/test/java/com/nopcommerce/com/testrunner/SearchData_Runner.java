package com.nopcommerce.com.testrunner;

import org.junit.runner.RunWith;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//import io.cucumber.junit.Cucumber;
//import io.cucumber.junit.CucumberOptions;

//@RunWith(Cucumber.class)
@CucumberOptions(
		features=".//Features/SearchData.feature",// THIS IS FOR EXECUTE SINGLE FEATURE FILE
		/// features=".//Features/",THIS IS FOR EXECUTE ALL FEATURES FILES
		// features={".//Features/SearchData.feature",".//Features/Customers.feature"}, This is two execution features files  
		glue="com.nopcommerce.com.stepDefinition",
		dryRun= false,
		monochrome = true,
		tags="@Test7",  // This is for execute particular scenarios
		//plugin = {"pretty","html:target/cucumber-reports/searchdata_html.html",}
		plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
		)

 

public class SearchData_Runner extends AbstractTestNGCucumberTests {

}



/*<!-- https://mvnrepository.com/artifact/io.cucumber/cucumber-junit -->
<dependency>
<groupId>io.cucumber</groupId>
<artifactId>cucumber-junit</artifactId>
<version>7.11.0</version>
<scope>test</scope>
</dependency>*/




