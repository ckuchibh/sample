package cucumberTest;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/Features",
	    glue = {"stepDefinitions"},
	    tags  = "@hrmscenario1 or @hrmscenario2 or @hrmscenario3 or @hrmscenario4",
	    monochrome=true,
	    strict=true,
	    plugin= {"pretty","html: reports/json_report.html"}
		)

public class HRMRunner {
}
