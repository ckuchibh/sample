package SeleniumProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;



public class Testcase1 {
	WebDriver driver;
	
	@BeforeClass
	public void beforeclass()
	{
		driver= new FirefoxDriver();
		
		driver.get("http://alchemy.hguy.co/orangehrm");
	}
	
	@Test
	public void testcase1()
	{
		String Title = driver.getTitle();
		System.out.println("Title :" + Title);
		
		Assert.assertEquals("OrangeHRM" , Title);
		
	}
	
	@AfterClass
	public void afterclass()
	{
		driver.close();
	}

}
