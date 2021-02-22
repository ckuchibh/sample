package LMS_in_TestNG_Fw;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class LMS_TNG_Activity2 {
	WebDriver driver;

	@BeforeClass
	public void beforeClass() {
		driver = new FirefoxDriver();
		driver.get("https://alchemy.hguy.co/lms/");
	}

	@Test
	public void TestAct2() {
		WebElement header = driver.findElement(By.className("uagb-ifb-title-wrap"));

		String h = header.getText();
		System.out.println("Header is : "+h);
		
		Assert.assertEquals("Learn from Industry Experts", h);
		driver.close();
	}

	@AfterClass
	public void afterClass() {
		System.out.println("End of LMS_TNG_Activity2");
	}
}
