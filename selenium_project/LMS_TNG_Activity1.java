package LMS_in_TestNG_Fw;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class LMS_TNG_Activity1 {
	WebDriver driver;

	@BeforeClass
	public void beforeClass() {
		driver = new FirefoxDriver();
		driver.get("https://alchemy.hguy.co/lms/");
	}

	@Test
	public void TestAct1() {
		String t = driver.getTitle();
		System.out.println("Title of the page: "+t);
		Assert.assertEquals("Alchemy LMS – An LMS Application", t);
		driver.close();
	}

	@AfterClass
	public void afterClass() {
		System.out.println("End of LMS_TNG_Activity1");
	}
}
