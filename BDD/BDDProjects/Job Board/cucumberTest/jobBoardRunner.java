package cucumberTest;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
	    features = "src/test/java/Features",
	    glue = {"stepDefinitions"},
	    tags  = "@scenario1 or @scenario2 or @scenario3 or @scenario4",
	    monochrome=true,
	    strict=true,
	    plugin= {"pretty","html: reports/json_report.html"}
	    )


public class jobBoardRunner {

}
