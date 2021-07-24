package StepDefs;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(
		
		monochrome=true,
		plugin = {"pretty","html:target/cucumber-html"},
		features = "src/test/java/feature",
		tags = {"@DataTable"},
		glue = {"StepDefs"}	
		)

public class TestRunner {

}
