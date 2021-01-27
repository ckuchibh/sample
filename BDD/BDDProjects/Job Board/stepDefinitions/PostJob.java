package stepDefinitions;

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

public class PostJob {
	WebDriver driver = new FirefoxDriver();
	WebDriverWait wait;
	
	@Given("^S3, user open browser with Alchemy Jobs site$")
	public void openJobSite() throws Throwable {
		driver.get("https://alchemy.hguy.co/jobs/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@When("^S3, i go to Post a Job page and fill in detaile like \"(.*)\",\"(.*)\",\"(.*)\",\"(.*)\" and Click submit.$")
	public void when(String jobtitle, String desc, String email, String comp) throws Throwable {
		//post job link
		driver.findElement(By.cssSelector("li#menu-item-26 > a")).click();
		//fill in details
		driver.findElement(By.cssSelector("input#create_account_email")).sendKeys(email);
		driver.findElement(By.cssSelector("input#job_title")).sendKeys(jobtitle);
		driver.findElement(By.cssSelector("div#mceu_16 > iframe")).sendKeys(desc);
		driver.findElement(By.cssSelector("input#application")).sendKeys(email);
		driver.findElement(By.cssSelector("input#company_name")).sendKeys(comp);
		
		//preview
		driver.findElement(By.xpath("//input[@class='button' and @name='submit_job']")).click();
		driver.findElement(By.cssSelector("input#job_preview_submit_button")).click();
		
	}

	@Then("^S3, the job should get posted and should be present in the Jobs page.$")
	public void verifyPost() throws Throwable {
		//click to verify the post
		driver.findElement(By.cssSelector("div.entry-content.clear > a")).click();
		boolean flag = driver.findElement(By.cssSelector("div.ast-single-post-order > h1")).isDisplayed();
		Assert.assertTrue(flag);
	}

	@And("^S3, confirm job listing is shown on page is same as posted\"(.*)\"$")
	public void confirmListing(String posted) throws Throwable {
		String actual = driver.findElement(By.cssSelector("div.ast-single-post-order > h1")).getText();
		Assert.assertEquals(posted, actual);
	}

	@And("^S3, close Browser and Generate HTML report.$")
	public void and1() throws Throwable {
		driver.close();
	}

}
