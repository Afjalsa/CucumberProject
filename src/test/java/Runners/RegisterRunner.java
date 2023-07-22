package Runners;

import org.junit.runner.RunWith;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//import io.cucumber.junit.Cucumber;
//import io.cucumber.junit.CucumberOptions;

//@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"src\\test\\resources\\Features\\Register.feature"},
		glue= {"StepDefifnitions"},
		tags="@register"
		)

public class RegisterRunner extends AbstractTestNGCucumberTests{

}
