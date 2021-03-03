package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class JobBoardActivity6 {

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
	public void ApplyJob() {
		// to Alchemy
		driver.navigate().to("https://alchemy.hguy.co/jobs/jobs/");
		//click on input search
		driver.findElement(By.xpath("//*[@id=\'search_keywords\']")).click();
		//sending search text
		driver.findElement(By.xpath("//*[@id=\'search_keywords\']")).sendKeys("QA");
		//clicking on search button
		WebElement e= driver.findElement(By.xpath("//*[@id=\'post-7\']/div/div/form/div[1]/div[4]/input"));
		e.click();
		//select any result which contain QA
		
		driver.findElement(By.xpath("//div//h3[contains(text(),'QA')]")).click();
		//click on apply
		driver.findElement(By.xpath("//*[@id=\'post-2497\']/div/div/div/div[3]/input")).click();
		//get the email
		String email= driver.findElement(By.xpath("//*[@id=\'post-2497\']/div/div/div/div[3]/div/p/a")).getText();
		System.out.println(email);
		driver.close();
			
		}

	}

