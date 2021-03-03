package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class JobBoardActivity1 {

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
	public void websiteTitle () {
		// Check the title of the page
		String title = driver.getTitle();
		// Print the title of the page
		System.out.println("Page title is: " + title);
		// checking if title is same as below
		if (title.equals("Alchemy Jobs – Job Board Application"))
		{
			System.out.println("yes title is same  "+ title);
			System.out.println("Closing the browser");
			driver.close();}

	}
}