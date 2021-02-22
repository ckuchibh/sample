package LMS_in_TestNG_Fw;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class LMS_TNG_Activity6 {
	WebDriver driver;

	@BeforeClass
	public void beforeClass(){
		driver = new FirefoxDriver();
		driver.get("https://alchemy.hguy.co/lms/");
	}

	@Test
	public void TestAct6() {
		driver.findElement(By.xpath("//li[5]/a")).click();
		String t = driver.getTitle();
		System.out.println("My Account Page Title: "+t);
		Assert.assertEquals("My Account – Alchemy LMS", t);

		driver.findElement(By.xpath("//div/section[2]/div[2]/div[2]/div[2]/div[2]/a")).click();
		driver.findElement(By.id("user_login")).sendKeys("root");
		driver.findElement(By.id("user_pass")).sendKeys("pa$$w0rd");
		driver.findElement(By.id("wp-submit")).click();
	
		WebElement loginMessage = driver.findElement(By.id("wpadminbar"));
		Assert.assertTrue(loginMessage.isDisplayed());
	}

	@AfterClass
	public void afterClass() {
		driver.close();
		System.out.println("End of LMS_TNG_Activity6");
	}
}
