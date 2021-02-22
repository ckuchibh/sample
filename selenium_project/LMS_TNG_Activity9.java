package LMS_in_TestNG_Fw;

import org.testng.annotations.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class LMS_TNG_Activity9 {
	WebDriver driver;

	@BeforeClass
	public void beforeClass() {
		driver = new FirefoxDriver();
		driver.get("https://alchemy.hguy.co/lms/");
	}

	@Test
	public void TestAct9() {
		//Need to login to view lessons and course progress
		driver.findElement(By.xpath("//li[5]/a")).click();
		driver.findElement(By.xpath("//div/section[2]/div[2]/div[2]/div[2]/div[2]/a")).click();
		driver.findElement(By.id("user_login")).sendKeys("root");
		driver.findElement(By.id("user_pass")).sendKeys("pa$$w0rd");
		driver.findElement(By.id("wp-submit")).click();

		//Viewing the course for Activity 9
		driver.findElement(By.xpath("//li[2]/a")).click();
		driver.findElement(By.xpath("//div[2]/p[2]/a")).click();
		driver.findElement(By.xpath("//div[1]/a/div[2]")).click();

		String t = driver.getTitle();
		Assert.assertEquals("Developing Strategy – Alchemy LMS", t);

		WebElement s = driver.findElement(By.xpath("//div[4]/div[2]"));
		String a = s.getText();
		Boolean c = a.contains("Mark Completed");

		if (c==true)
		{
			s.click();
			System.out.println("Found "+a+", hence clicking on it.");
		} 
		else {
			System.out.println("Found "+a+", hence not clicking on it.");}
	}

	@AfterClass
	public void afterClass() {
		driver.close();
		System.out.println("End of LMS_TNG_Activity9");
	}
}
