package Runners;

import org.junit.runner.RunWith;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//import io.cucumber.junit.Cucumber;
//import io.cucumber.junit.CucumberOptions;

//@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features/Logins.feature",
glue="StepDefinitions",
tags= "@sprint1 ",
plugin= {"pretty","json:target/test-report/cucumber.json"}
)

public class TestRunner extends AbstractTestNGCucumberTests{

}
