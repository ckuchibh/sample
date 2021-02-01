package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddMultipleCandidate extends BaseClass {
	BaseClass b = new BaseClass();
	String jobVacancy;
	int rand = (int) Math.random();

//	@Before
//	public void setup() {
//		System.out.println("Add Multiple Candidate");
//		
//	}

	@Given("^s3:User is on OrangeHRM page logged in with credentials \"(.*)\" and \"(.*)\"$")
	public void hrmPageLogin(String username, String password) throws Throwable {
		b.browserSetup();
		System.out.println("@Given : : " + username + " : : " + password);

		WebElement user = driver.findElement(By.xpath("//input[@id='txtUsername']"));
		WebElement pass = driver.findElement(By.xpath("//input[@id='txtPassword']"));

		user.sendKeys(username);
		pass.sendKeys(password);

		driver.findElement(By.cssSelector("input#btnLogin")).click();
	}

	@When("^s3:Navigate to the Recruitment page and click on the Add button and on the next page, fill in the details \"(.*)\",\"(.*)\",\"(.*)\" of the candidate$")
	public void navAddRec(String fname, String lname, String email) throws Throwable {
		System.out.println("@When : : "+fname+"::"+lname+"::"+email);
		// click Recuritment
		driver.findElement(By.cssSelector("a#menu_recruitment_viewRecruitmentModule > b")).click();
		//click candidate
		driver.findElement(By.cssSelector("a#menu_recruitment_viewCandidates")).click();
		// click add
		driver.findElement(By.cssSelector("input#btnAdd")).click();

		// fill in details
		driver.findElement(By.cssSelector("input#addCandidate_firstName")).sendKeys(fname);
		driver.findElement(By.cssSelector("input#addCandidate_lastName")).sendKeys(lname+rand);
		driver.findElement(By.cssSelector("input#addCandidate_email")).sendKeys(email);

		Select jobVac = new Select(driver.findElement(By.cssSelector("select#addCandidate_vacancy")));
		jobVac.selectByIndex(1);

	}

	@And("^s3:Upload a resume \"(.*)\" to the form and save$")
	public void uploadAndSave(String path) throws Throwable {
		System.out.println("@And : : "+path);

		WebElement fileupload = driver.findElement(By.cssSelector("input#addCandidate_resume"));
		fileupload.sendKeys(path);

		driver.findElement(By.cssSelector("input#btnSave")).click();
	}

	@Then("^s3:Navigate back to the Recruitments page to confirm candidate entry and Verify \"(.*)\",\"(.*)\"$")
	public void verifyEntry(String fname,String lname) throws Throwable {
		System.out.println("@Then : : ");
		// click Recuritment
		driver.findElement(By.cssSelector("a#menu_recruitment_viewRecruitmentModule > b")).click();
		driver.findElement(By.cssSelector("input#candidateSearch_candidateName")).sendKeys(fname+" "+lname+rand);
		driver.findElement(By.cssSelector("input#btnSrch")).click();
		
	
		Assert.assertTrue(driver.findElement(By.xpath("//tbody/tr[1]/td[3]/a")).isDisplayed());
	}


	@After
	public void close() {
		System.out.println("Add Multiple Candidate");
		 b.browserQuit();
	}

}
