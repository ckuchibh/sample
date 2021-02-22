package LMS_in_TestNG_Fw;

import org.testng.annotations.Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class LMS_TNG_Activity7 {
	WebDriver driver;

	@BeforeClass
	public void beforeClass() {
		driver = new FirefoxDriver();
		driver.get("https://alchemy.hguy.co/lms/");
	}

	@Test
	public void TestAct7() {
		driver.findElement(By.xpath("//div/div[3]/div/nav/div/ul/li[2]/a")).click();
		List<WebElement> elements = driver.findElements(By.xpath("//div[2]/h3"));
		System.out.println("Number of Courses found in the page: "+elements.size());
	}

	@AfterClass
	public void afterClass() {
		driver.close();
		System.out.println("End of LMS_TNG_Activity7");
	}
}
