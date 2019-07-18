package stepdefination;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "src\\main\\java\\demo\\Cucumber\\" }, tags = {}, strict = true, dryRun = false, glue = {
				"stepdefination" }, monochrome = true, plugin = "html:target")
public class TestRunner {

}
