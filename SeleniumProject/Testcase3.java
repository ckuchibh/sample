package SeleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class Testcase3 {
	WebDriver driver;
	
	@BeforeClass
	public void beforeclass()
	{
		driver = new FirefoxDriver();
		
		driver.get("http://alchemy.hguy.co:8080/orangehrm/symfony/web/index.php/auth/login");
	}
	@Test
	public void testcase3()
	{
		WebElement username = driver.findElement(By.id("txtUsername"));
		WebElement password = driver.findElement(By.id("txtPassword"));
		
		username.sendKeys("orange");
		password.sendKeys("orangepassword123");
		
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		
		String loginmsg = driver.findElement(By.xpath("//a[@id='welcome']")).getText();
		
		Assert.assertEquals("Welcome Test9745", loginmsg);
		
	}
	@AfterClass
	public void afterclass()
	{
		driver.close();
	}
}
