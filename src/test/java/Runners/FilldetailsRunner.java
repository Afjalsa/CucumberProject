package Runners;

import org.junit.runner.RunWith;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//import io.cucumber.junit.Cucumber;
//import io.cucumber.junit.CucumberOptions;

//@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"src\\test\\resources\\Features\\Filldetails.feature"},
		glue= {"StepDefinitions"},
		tags="@fill2"
		)

public class FilldetailsRunner extends AbstractTestNGCucumberTests {

}
