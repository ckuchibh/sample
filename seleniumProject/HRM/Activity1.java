package HRM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class Activity1 {
	
	WebDriver driver = new FirefoxDriver();
	
	@BeforeClass
	public void openBrowser(){
		driver.get("http://alchemy.hguy.co/orangehrm");
	}

	@Test
	public void verifySiteTitle() {
		Reporter.log("Get & verify the Title of the URL");
		String Title = driver.getTitle();
		System.out.println("Title of the page:" + Title);
		Assert.assertEquals(Title, "OrangeHRM");
	}

	@AfterClass
	public void closeBrowser(){
		driver.close();
	}

}
