package stepDefinitions;

import java.awt.RenderingHints.Key;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSearchSteps {
	WebDriver driver = new FirefoxDriver();
	WebDriverWait wait;
	
	@Given("^User is on Google Home Page$")
	public void given() throws Throwable {
		System.out.println("Given");
		driver.get("http://www.google.com");
	}

	@When("^User types in Cheese and hits ENTER$")
	public void when() throws Throwable {
		System.out.println("When");
		driver.findElement(By.cssSelector("input.gLFyf.gsfi")).sendKeys("Cheese",Keys.RETURN);
		
	}

	@Then("^Show how many search results were shown$")
	public void then() throws Throwable {
		System.out.println("Then");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("result-stats")));
		String results = driver.findElement(By.id("result-stats")).getText();
		System.out.println("Number of results : "+results);
		
	}

	@And("^Close the browser$")
	public void and() throws Throwable {
		driver.close();
	}

}
