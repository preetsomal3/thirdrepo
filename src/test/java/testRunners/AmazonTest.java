package testRunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/resources/AppFeatures/Search.feature"},
		glue = {"stepDefinitions","MyHooks"},
		plugin = {"pretty","json:target/MyReports/report.json","junit:target/MyReports/report.xml","html:target/MyReports/report.html"},
		tags = "@Smoke or @Reg",
		monochrome = true,
		publish=true,
		dryRun = false
		//strict=true
		)
public class AmazonTest{
	
	
}