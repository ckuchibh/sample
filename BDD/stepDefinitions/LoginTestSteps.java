package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class LoginTestSteps {
	WebDriver driver;

	@Given("^User is on Login page$")
	public void Login() throws Throwable {
		driver = new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/login-form");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	@When("^User enters username and password$")
	public void enterCred() throws Throwable {
		
		driver.findElement(By.cssSelector("input#username")).sendKeys("admin");
		driver.findElement(By.cssSelector("input#password")).sendKeys("password");
		driver.findElement(By.cssSelector("div.ui.form.segment > button.ui.button")).click();
	}
	
	@When("^User enters \"(.*)\" and \"(.*)\"$")
	public void enterCred1(String user,String pass) throws Throwable {
		
		driver.findElement(By.cssSelector("input#username")).sendKeys(user);
		driver.findElement(By.cssSelector("input#password")).sendKeys(pass);
		driver.findElement(By.cssSelector("div.ui.form.segment > button.ui.button")).click();
	}

	@Then("^Read the page title and confirmation message$")
	public void titlenConf() throws Throwable {
		String loginMessage = driver.findElement(By.cssSelector("div#action-confirmation")).getText();
		String title = driver.getTitle();
		System.out.println("Login Message is : "+loginMessage);
		System.out.println("Title is : "+title);
	
	}

	@And("^Close the browser1$")
	public void closeBrowser() throws Throwable {
		driver.close();
	}

}
