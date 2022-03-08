package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

//Test Runner for all cucumber test at once
@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/resources/featurefiles"},
		glue = {"steps", "AppHooks"},
		plugin = {"pretty",
				"timeline:test-output-thread/"

				
		})
public class TestRunner {
	
}
