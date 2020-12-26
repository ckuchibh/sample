package SeleniumProject;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Testcase2 {
	WebDriver driver;
	
	@BeforeClass
	public void beforeclass()
	{
		driver = new FirefoxDriver();
		
		driver.get("http://alchemy.hguy.co/orangehrm");
	}
	@Test
	public void testcase2()
	{
		String headerUrl = driver.getCurrentUrl();
		
		System.out.println("Print Title is:" + headerUrl);
	}
	@AfterClass
	public void afterclass()
	{
		driver.close();
	}
	
}
