package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.And;


public class PromptAlertTest {
	WebDriverWait wait;
	WebDriver driver;
	Alert alert;
	String alertText;
	
	@Given("^User is on the page pa$")
	public void userPage() throws Throwable {
		
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.training-support.net/selenium/javascript-alerts");
	}

	@When("^User clicks the Prompt Alert button pa$")
	public void clickAlert() throws Throwable {
		WebElement simple = driver.findElement(By.cssSelector("button#prompt"));
		simple.click();
	}

	@Then("^Alert opens pa$")
	public void alertOpen() {
		alert = driver.switchTo().alert();

	}

	@And("^Read the text from it and print it pa$")
	public void readNPrint() throws Throwable {
		alertText = alert.getText();
		System.out.println("Alert on promt alert :"+alertText);
	}
	
	@And("^Write a custom message in it pa$")
	public void writeMessage() {
		alert.sendKeys("Hello, prompt text");
	}

	@And("^Close the alert pa$")
	public void closeAlert() throws Throwable {
		alert.accept();
	}

	@And("^Read the result text pa$")
	public void readResText() throws Throwable {
		Assert.assertEquals("This is a JavaScript Prompt!", alertText);
		
	}

	@And("^Close Browser pa$")
	public void closeBrowser() throws Throwable {
		driver.close();
	}

}
