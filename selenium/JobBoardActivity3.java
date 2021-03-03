package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class JobBoardActivity3 {

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
	public void websiteHeadingImageURL() {
		
		WebElement element = driver.findElement(By.xpath("//*[@id=\'post-16\']/header/div/img"));
		String headingURL = element.getAttribute("src");
		// Print the HeadingImageURL of the page
			System.out.println("HeadingIMG URL is  " + headingURL);
			System.out.println("Closing the browser");
			driver.close();
		
		}
	}

