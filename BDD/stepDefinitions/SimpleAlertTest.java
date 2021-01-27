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

public class SimpleAlertTest {
	WebDriverWait wait;
	WebDriver driver;
	Alert alert;
	String alertText;
	
	@Given("^User is on the page$")
	public void userPage() throws Throwable {
		
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.training-support.net/selenium/javascript-alerts");
	}

	@When("^User clicks the Simple Alert button$")
	public void clickAlert() throws Throwable {
		WebElement simple = driver.findElement(By.cssSelector("button#simple"));
		simple.click();
	}

	@Then("^Alert opens$")
	public void alertOpen() {
		alert = driver.switchTo().alert();

	}

	@And("^Read the text from it and print it$")
	public void readNPrint() throws Throwable {
		alertText = alert.getText();
		System.out.println("Alert on simple alert :"+alertText);
	}

	@And("^Close the alert$")
	public void closeAlert() throws Throwable {
		alert.accept();
	}

	@And("^Read the result text$")
	public void readResText() throws Throwable {
		Assert.assertEquals("This is a JavaScript Alert!", alertText);
		
	}

	@And("^Close Browser$")
	public void closeBrowser() throws Throwable {
		driver.close();
	}

}
