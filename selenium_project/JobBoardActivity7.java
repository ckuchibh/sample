package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class JobBoardActivity7 {

	WebDriver driver;

	@BeforeMethod
	public void beforeMethod() throws Exception {
		// Create instance for Firefox
		System.setProperty("webdriver.gecko.driver",
				"C://Users//SubhashKumar//Downloads//Drivers//geckodriver-v0.29.0-win64//geckodriver.exe");
		driver = new FirefoxDriver();
		// Opening browser with https://alchemy.hguy.co/jobs/
		System.out.println("loading broswer....wait \n ");
		driver.get("https://alchemy.hguy.co/jobs/");
	}

	@Test
	public void ApplyJob() throws InterruptedException {
		// to Alchemy
		driver.navigate().to("https://alchemy.hguy.co/jobs/jobs/");
		// click on post JOb search
		driver.findElement(By.xpath("//*[@id=\'menu-item-26\']/a")).click();
		// sending email
		driver.findElement(By.xpath("//*[@id=\'create_account_email\']")).click();
		driver.findElement(By.xpath("//*[@id=\'create_account_email\']")).sendKeys("QA_IBM6@IBM.com");

		// send Job title
		String JobTitle="QA_JOB6";
		driver.findElement(By.xpath("//*[@id=\'job_title\']")).sendKeys(JobTitle);
		driver.findElement(By.xpath("//*[@id=\'job_location\']")).sendKeys("MUMBAI");

		Select JobType = new Select(driver.findElement(By.name("job_type")));
		JobType.selectByVisibleText("Freelance");
		// driver.close();

		// to enter text desc
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,500)");
			System.out.println(" Inside try of frame");
			driver.switchTo().frame(0);
			WebElement element = driver.findElement(By.id("tinymce"));
			element.click();
			element.sendKeys("THiS IS DESC TEXT\n");
			driver.switchTo().defaultContent();
			
		} catch (Exception e) {
			throw (e);
		}
		driver.findElement(By.id("application")).sendKeys("URL@URL.com");
		driver.findElement(By.xpath("//*[@id=\'company_name\']")).sendKeys("IBM");
		// clcik on preview button

		driver.findElement(By.xpath("//*[@id=\'submit-job-form\']/p/input[4]")).click();
		Thread.sleep(3000);
		// submit listing
		driver.findElement(By.xpath("//*[@id=\'job_preview_submit_button\']")).click();

		WebElement s = driver.findElement(By.xpath("//*[@id=\"post-5\"]/div"));
		String text = s.getText();
		System.out.println(text);
		if (text.equals("Job listed successfully. To view your listing click here.")) {
			System.out.println("Submitted successfully \n");
			//driver.findElement(By.xpath("//*[@id=\'post-5\']/div/a")).click();
//			Boolean verifytext = driver.findElement(By.xpath("//div//ul//li//a//div//h3[contains(text(),'QA_JOB5')]")).isDisplayed();
//			if (verifytext) {
				//System.out.println("Job placed displayed");
				
				driver.navigate().to("https://alchemy.hguy.co/jobs/jobs/");
				//click on input search
				driver.findElement(By.xpath("//*[@id=\'search_keywords\']")).click();
				//sending search text
				driver.findElement(By.xpath("//*[@id=\'search_keywords\']")).sendKeys(JobTitle);
				//clicking on search button
				WebElement e= driver.findElement(By.xpath("//*[@id=\'post-7\']/div/div/form/div[1]/div[4]/input"));
				e.click();
				Boolean verifytextJOB = driver.findElement(By.xpath("//div//ul//li//a//div//h3[contains(text(),'QA_JOB6')]")).isDisplayed();
			if(verifytextJOB)
			{ System.out.println("Found");
			    driver.close();}
			}
		
	}

}
