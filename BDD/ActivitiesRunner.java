package testRunner;


	import org.junit.runner.RunWith;
	import io.cucumber.junit.Cucumber;
	import io.cucumber.junit.CucumberOptions;
	
		
	@RunWith(Cucumber.class)
	@CucumberOptions(
	    features = "src/test/java/Features",
	    glue = {"stepDefinitions"},
	    tags = "@JobPortalActivity3",
	    plugin = {"pretty", "html:target/Destination.html"},
	    monochrome = false
			)
	
	public class ActivitiesRunner {
		
		//........
	}
