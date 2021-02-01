package cucumberTest;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		    features = "src/test/java/Features",
		    glue = {"stepDefinitions"},
		    tags  = "@activity2_5",//"@SmokeTest or @ConfirmAlert or @SimpleAlert or @PromptAlert",
		    monochrome=true,
		    strict=true,
		    plugin= {"pretty","html: reports/json_report.html"}
			)

public class ActivityRunner {

}
