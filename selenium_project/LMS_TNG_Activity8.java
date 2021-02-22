package LMS_in_TestNG_Fw;

import org.testng.annotations.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class LMS_TNG_Activity8 {
	WebDriver driver;

	@BeforeClass
	public void beforeClass() {
		driver = new FirefoxDriver();
		driver.get("https://alchemy.hguy.co/lms/");
	}

	@Test
	public void TestAct8() {
		driver.findElement(By.xpath("//li[4]/a")).click();

		driver.findElement(By.xpath("//*[@id=\"wpforms-8-field_0\"]")).sendKeys("Tejaswini");
		driver.findElement(By.xpath("//*[@id=\"wpforms-8-field_1\"]")).sendKeys("tsn@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"wpforms-8-field_3\"]")).sendKeys("Selenium Project");
		driver.findElement(By.xpath("//*[@id=\"wpforms-8-field_2\"]")).sendKeys("This is a part of Selenium Project in TestNG Framework");
		
		driver.findElement(By.xpath("//*[@id=\"wpforms-submit-8\"]")).click();
		System.out.println("Submission Message: " +driver.findElement(By.xpath("//*[@id=\"wpforms-confirmation-8\"]")).getText());
	}

	@AfterClass
	public void afterClass() {
		driver.close();
		System.out.println("End of LMS_TNG_Activity8");
	}
}
