package utilities;

import org.junit.runner.RunWith;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//import io.cucumber.junit.Cucumber;
//import io.cucumber.junit.CucumberOptions;

//@RunWith(Cucumber.class)
@CucumberOptions(
		        features=".//Features/SearchData.feature",
		        glue="com.nopcommerce.com.stepDefinition",
				dryRun= false,
				monochrome = true,
				plugin = {"pretty","html:target/cucumber-reports/login_xml.xml","html:target/cucumber-reports/login.html","html:target/cucumber-reports/login_json.json"}
		)



public class SearchData_Runner  extends AbstractTestNGCucumberTests{

}
