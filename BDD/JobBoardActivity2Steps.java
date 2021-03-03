package stepDefinitions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class JobBoardActivity2Steps {

	WebDriver driver;
	WebDriverWait wait;

	@Given("^User navigated to Jobs page$")
	public void userIsOnAlchemyPage() throws Throwable {

		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\SubhashKumar\\Downloads\\Drivers\\geckodriver-v0.29.0-win64\\geckodriver.exe");
		// Create a new instance of the Firefox driver
		driver = new FirefoxDriver();
		wait = new WebDriverWait(driver, 15);

		// Open the URL
		driver.get("https://alchemy.hguy.co/jobs/jobs/");
	}

	@When ("^User search for jobs and change the Job type$")
	public void userSeacrhForJobs() throws Throwable{
		
		driver.findElement(By.xpath("//*[@id=\'search_keywords\']")).sendKeys("SDET");
	//	WebElements<list> driver.findElements(By.xpath("//*[@id=\'post-7\']/div/div/form/ul/li[1]/label"))
		
		driver.findElement(By.xpath("//*[@id=\'post-7\']/div/div/form/div[1]/div[4]/input")).click();
	}

	@Then("^User selected Job type as Full Time$")
	public void changeJobType() throws Throwable {
		List<WebElement> elements = driver.findElements(By.xpath("//*[@id=\'post-7\']/div/div/form/ul/li"));

		System.out.println("number of elements: " + elements.size());

		for (WebElement ele : elements) {
			String JobType = ele.getText();
			System.out.println(ele.getText());

			if (JobType.equals("Full Time"))
				continue;
			else {
				ele.click();
			}
		}
		Thread.sleep(5000);
	}
	

	@Given ("^Find a job listing using XPath and it to see job details$")
	public void toSeeJobDetails() throws Throwable{
		
		//*[@id="post-7"]/div/div/ul/li[1]/a/div[1]/h3
		//*[@id="post-7"]/div/div/ul/li[1]/a
		//*[@id="post-7"]/div/div/ul/li[2]/a
//		/html/body/div[2]/div/div/div/main/article/div/div/ul/li[2]/a/div[1]/h3
//		/html/body/div[2]/div/div/div/main/article/div/div/ul/li[2]/a/div[1]/h3
//		/html/body/div[2]/div/div/div/main/article/div/div/ul/li[3]/a/div[1]/h3
		//*[@id="post-7"]/div/div/ul/li[2]/a/div[1]/h3
		List<WebElement> elements = driver.findElements(By.xpath("//*[@id=\'post-7\']/div/div/ul"));

		System.out.println("number of elements: " + elements.size());
          int count=0;
		for (WebElement ele : elements) {
			String JobType = ele.getText();
			System.out.println(ele.getText());

//			if (JobType.equals("Full Time"))
//				continue;
//			else {
//				ele.click();
//			}
		}
		
	}

}
		
