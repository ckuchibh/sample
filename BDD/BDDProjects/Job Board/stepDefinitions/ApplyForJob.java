package stepDefinitions;

import java.awt.List;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ApplyForJob {
	WebDriver driver = new FirefoxDriver();
	WebDriverWait wait;

	@Given("^S2:User is on Alchemy Jobs site$")
	public void openSite() throws Throwable {
		driver.get("https://alchemy.hguy.co/jobs/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@And("^S2:navigate to Jobs page and Find the Keywords search input field$")
	public void jobsPage() throws Throwable {
		driver.findElement(By.cssSelector("li#menu-item-24")).click();

	}

	@When("^S2:i type in keywords to search for jobs and change the Job type to show only FullTime jobs and click search$")
	public void searchJobs() throws Throwable {
		driver.findElement(By.cssSelector("input#search_keywords")).sendKeys("Tester");

		// job_type
		driver.findElement(By.cssSelector("input#job_type_freelance")).click();
		driver.findElement(By.cssSelector("input#job_type_internship")).click();
		driver.findElement(By.cssSelector("input#job_type_part-time")).click();
		driver.findElement(By.cssSelector("input#job_type_temporary")).click();
		// search
		driver.findElement(By.cssSelector("div.search_submit > input")).click();
	}

	@Then("^S2:I should see list of job listing and job details and print the title of the job listing to the console$")
	public void searchResult() throws Throwable {
		java.util.List<WebElement> jobs = driver.findElements(By.cssSelector("div.position > h3"));
		for (Iterator iterator = jobs.iterator(); iterator.hasNext();) {
			WebElement webElement = (WebElement) iterator.next();
			System.out.println(webElement.getText());

		}
	}

	@And("^S2:choose a job and click on the Apply for job button$")
	public void applyAssertMessage() throws Throwable {
		driver.findElement(By.xpath("//div[@class='position']/h3[text()='SDET Tester3']")).click();
		driver.findElement(By.cssSelector("input.application_button.button")).click();
		String message = driver.findElement(By.cssSelector("div.application_details > p")).getText();
		Assert.assertEquals("To apply for this job email your details to testqa12@gmail.com", message);
	}

	@And("^S2:Close the browser$")
	public void browserClose() throws Throwable {
		driver.close();
	}
}
