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

public class AddCandidate extends BaseClass {
	BaseClass b = new BaseClass();
	String jobVacancy;
	int rand=(int) Math.random();

	@Given("^s2:User is on OrangeHRM page logged in with credentials \"(.*)\" and \"(.*)\"$")
	public void hrmPageLogin(String username, String password) throws Throwable {
		b.browserSetup();
		System.out.println("@Given : : " + username + " : : " + password);

		WebElement user = driver.findElement(By.xpath("//input[@id='txtUsername']"));
		WebElement pass = driver.findElement(By.xpath("//input[@id='txtPassword']"));

		user.sendKeys(username);
		pass.sendKeys(password);

		driver.findElement(By.cssSelector("input#btnLogin")).click();
	}

	@When("^s2:Navigate to the Recruitment page and click on the Add button and on the next page, fill in the details of the candidate$")
	public void navAddRec() throws Throwable {
		System.out.println("@When : : ");
		// click Recuritment
		driver.findElement(By.cssSelector("a#menu_recruitment_viewRecruitmentModule > b")).click();
		//click candidate
		driver.findElement(By.cssSelector("a#menu_recruitment_viewCandidates")).click();
		// click add
		driver.findElement(By.cssSelector("input#btnAdd")).click();

		// fill in details
		driver.findElement(By.cssSelector("input#addCandidate_firstName")).sendKeys("Abi");
		driver.findElement(By.cssSelector("input#addCandidate_lastName")).sendKeys("Mohan"+rand);
		driver.findElement(By.cssSelector("input#addCandidate_email")).sendKeys("abimohn@gmail.com");

		Select jobVac = new Select(driver.findElement(By.cssSelector("select#addCandidate_vacancy")));
		jobVac.selectByIndex(1);

	}

	@And("^s2:Upload a resume to the form and save$")
	public void uploadAndSave() throws Throwable {
		System.out.println("@And : : ");

		WebElement fileupload = driver.findElement(By.cssSelector("input#addCandidate_resume"));
		fileupload.sendKeys("C:\\Users\\ABISHEKMOHAN\\Desktop\\Ecllipse Java Project\\hrmProject\\src\\test\\java\\Resume.docx");

		driver.findElement(By.cssSelector("input#btnSave")).click();
	}

	@Then("^s2:Navigate back to the Recruitments page to confirm candidate entry and Verify$")
	public void verifyEntry() throws Throwable {
		System.out.println("@Then : : ");
		// click Recuritment
		driver.findElement(By.cssSelector("a#menu_recruitment_viewRecruitmentModule > b")).click();
		driver.findElement(By.cssSelector("input#candidateSearch_candidateName")).sendKeys("Abi Mohan"+rand);
		driver.findElement(By.cssSelector("input#btnSrch")).click();
		
	
		
	//	Assert.assertTrue(driver.findElement(By.xpath("//tbody/tr[1]/td[3]/a")).isDisplayed());
		System.out.println("IS DISPLAYED: "+driver.findElement(By.xpath("//tbody/tr[1]/td[3]/a")).isDisplayed());
	}


	@After
	public void close() {
		System.out.println("Add Candidate");
		 b.browserQuit();
	}

}
