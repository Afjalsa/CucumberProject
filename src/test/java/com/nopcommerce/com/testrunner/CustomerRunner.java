package com.nopcommerce.com.testrunner;


import org.junit.runner.RunWith;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//import io.cucumber.junit.Cucumber;
//import io.cucumber.junit.CucumberOptions;

//@RunWith(Cucumber.class)
@CucumberOptions(
		        features=".//Features/Customers.feature",
		        glue="com.nopcommerce.com.stepDefinition",
				dryRun= false,
				monochrome = true,
				plugin = {"pretty","html:target/cucumber-reports/customer_xml.xml",}
		)
public class CustomerRunner  extends AbstractTestNGCucumberTests{

}
