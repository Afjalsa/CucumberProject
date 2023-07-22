package com.nopcommerce.com.testrunner;

import org.junit.runner.RunWith;

import io.cucumber.testng.CucumberOptions;

//import io.cucumber.junit.Cucumber;
//import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
//@RunWith(Cucumber.class)
@CucumberOptions(
		        features=".//Features/Login.feature",
		        glue="com.nopcommerce.com.stepDefinition",
				dryRun= false,
				monochrome = true,
				plugin = {"pretty","html:target/cucumber-reports/login_xml.xml","html:target/cucumber-reports/login.html","html:target/cucumber-reports/login_json.json"}
		)

//plugin = {"pretty","html:target/cucumber-reports/login.html"}
//plugin = {"pretty","html:target/cucumber-reports/login_json.json"}
public class Login_Runner  extends AbstractTestNGCucumberTests{

}
