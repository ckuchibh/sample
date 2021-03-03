package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class JobBoardActivity2 {

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
	public void websiteHeading () {
		// Check the Heading of the page
		WebElement element = driver.findElement(By.xpath("//*[@id=\'post-16\']/header/h1"));
		String heading = element.getText();
		// Print the title of the page
		System.out.println("Page heading is: " + heading);
		// checking if title is same as below
		if (heading.equals("“Welcome to Alchemy Jobs"))
		{
			System.out.println("yes heading is same  "+ heading);
			System.out.println("Closing the browser");
			driver.close();}
		else {System.out.println("Sorry Page heading was not same as expected "+ heading);
		driver.close();}
	}
}