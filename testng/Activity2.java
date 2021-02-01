/*	1. Create a TestNG Class with the annotations 
		a. @Test
		b. @BeforeClass
		c. @AfterClass
	2. In the @BeforeClass method, create the a driver instance for FirefoxDriver
	3. Also use the get() method to open the browser with https://www.training-support.net/selenium/target-practice 
	4. In the @AfterClass method, use close() to close the browser once the test is done.
	5. Add 4 @Test methods.
	6. In the first @Test method, use getTitle() to get and assert the title of the page.
	7. In the second @Test method, use findElement() to look for the black button. Make an incorrect assertion. (This test case is meant to throw an error)
	8. For the third @Test method, skip it by setting it's enabled parameter to false. 
		a. The third method will be skipped, but will not be shown as skipped.
	9. For the fourth @Test method, skip it by throwing a SkipException inside the method. 
		a. The fourth method will be skipped and it will be shown as skipped.
	10. Observe the result in the console.*/

package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity2 {

	WebDriver driver;

	@BeforeMethod
	public void openBrowser() {

		driver = new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/target-practice");
	}

	@Test
	public void testcase1() {
		// Check the title of the page
		String title = driver.getTitle();
		// Print the title of the page
		System.out.println("Page title is: " + title);
		Assert.assertEquals(title, "Target Practice");
	}

	@Test
	public void testcase2() {

		// This testcase will fail
		WebElement blackbutton = driver.findElement(By.cssSelector("button.black"));
		Assert.assertTrue(blackbutton.isDisplayed());
		Assert.assertEquals(blackbutton.getText(), "black");
	}

	@Test(enabled = false)
	public void testcase3() {
		//This test will be skipped and not shown in report
		System.out.println("This testcase is skipped");
	}
	@Test
	public void testcase4() {
		//This test will be skipped and shown as skipped
		throw new SkipException("Throws skip exception");
	}

	@AfterMethod
	public void closeBrowser() {
		driver.close();
	}

}
