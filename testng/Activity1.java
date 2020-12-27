/*	1. Create a TestNG Class with the annotations 
		a. @Test
		b. @BeforeMethod
		c. @AfterMethod
	2. In the @BeforeMethod method, create the a driver instance for FirefoxDriver
	3. Also use the get() method to open the browser with https://www.training-support.net 
	4. In the @AfterMethod method, use close() to close the browser once the test is done.
	5. In the @Test method,
		a. Use getTitle() to get and print the title of the page.
		b. Make an assertion using assertEquals() to make sure the title of the page is "Training Support".
		c. Use findElement() to find the "About Us" Button on the page and click it.
		d. Get and print the title of the new page.
		e. Assert the title of the new page.*/

package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity1 {

	WebDriver driver;

	@BeforeMethod
	public void openBrowser() {

		driver = new FirefoxDriver();
		driver.get("https://www.training-support.net");
	}

	@Test
	public void action() {
		// Check the title of the page
		String title = driver.getTitle();

		// Print the title of the page
		System.out.println("Page title is: " + title);

		// Assertion for page title
		Assert.assertEquals("Training Support", title);

		// Find the clickable link on the page and click it
		driver.findElement(By.id("about-link")).click();

		// Print title of new page
		System.out.println("New page title is: " + driver.getTitle());
		Assert.assertEquals(driver.getTitle(), "About Training Support");
	}

	@AfterMethod
	public void closeBrowser() {
		driver.close();
	}

}
