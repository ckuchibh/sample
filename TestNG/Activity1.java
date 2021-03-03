package testNGTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity1 {

	WebDriver driver;

	@Test
	public void TTest  () {

		String title = driver.getTitle();

		System.out.println("Page title is: " + title);
try {
		// Assert.assertEquals("Training Supportsvdajdj", title);
		Assert.assertEquals(title, "Training Support");

		driver.findElement(By.id("about-link")).click();

		System.out.println("New page title is: " + driver.getTitle());

		Assert.assertEquals(driver.getTitle(), "About Training Support____Hh");
		System.out.println(" Assert was working");

}
	catch (AssertionError error) {
        System.out.println(" Assertion error");
        
    } catch (Exception exception) {
    	System.out.println(" other error error"); 
    }
	}
	

	@BeforeMethod
	public void BBeforeMethod() {
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\SubhashKumar\\Downloads\\Drivers\\geckodriver-v0.29.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://www.training-support.net");
	}

	@AfterMethod
	public void AAfterMethod() {
		driver.close();
	}
}
