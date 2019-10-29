package Myrunner;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(features="C:\\Users\\Training_h2a.06.17\\Desktop\\New folder\\CucumberCaseStudy\\src\\test\\java\\Features\\DemoWebShopRegister.feature",
glue= {"StepDefinitions"},
plugin= {"pretty","html:target/cucumber-html-report"}
		)
public class testRunner {

}
