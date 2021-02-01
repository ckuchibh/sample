package stepDefinitions;

import java.nio.charset.Charset;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class CreateUser {
	WebDriver driver = new FirefoxDriver();
	WebDriverWait wait;
	String mailid;
	
	@Given("^user is on the job board website$")
	public void openSite() throws Throwable {
		System.out.println("openSite");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://alchemy.hguy.co/jobs/wp-admin");
		
	}
	
	@And("^logged in with credential \"(.*)\" and \"(.*)\"$")
	public void  login(String user, String pass) {
		System.out.println("@And");
		driver.findElement(By.cssSelector("input#user_login")).sendKeys(user);
		driver.findElement(By.cssSelector("input#user_pass")).sendKeys(pass);
		driver.findElement(By.cssSelector("input#wp-submit")).click();
		
	}

	@When("^i click on user menu and add new user using add new button$")
	public void addUser() throws Throwable {
		System.out.println("addUser");
		driver.findElement(By.xpath("//div[contains(text(),'Users')]")).click();
		driver.findElement(By.cssSelector("a.page-title-action")).click();
	}
	
	@And("^fill in nessesary details and click add new user button$")
	public void  fillForm() {
		System.out.println("fillForm");
		double rand =  Math.random();
	    mailid= "abimohan"+rand+"@gmail.com";

	    System.out.println("Created mail : "+mailid);
	    
		driver.findElement(By.cssSelector("input#user_login")).sendKeys("abimohan"+rand);
		driver.findElement(By.cssSelector("input#email")).sendKeys(mailid);
		driver.findElement(By.cssSelector("input#first_name")).sendKeys("Abishek");
		driver.findElement(By.cssSelector("input#last_name")).sendKeys("Mohan");
		driver.findElement(By.cssSelector("input#url")).sendKeys("www.samplewebabimohan.com");
		driver.findElement(By.cssSelector("input#createusersub")).click();
	}
	
	@Then("^i validate that the new user is created$")
	public void validateNewUser() throws Throwable {
		driver.findElement(By.cssSelector("input#user-search-input")).sendKeys(mailid);
		driver.findElement(By.cssSelector("input#search-submit")).click();
		
		String actualemail = driver.findElement(By.xpath("//a[contains(text(),'"+mailid+"')]")).getText();
		
		Assert.assertEquals(mailid, actualemail);
		System.out.println("Actual email from site : "+actualemail);
		
	}
	

	@And("^close the browser and generate html report$")
	public void closeBrowser() throws Throwable {
		driver.close();
	}

}

