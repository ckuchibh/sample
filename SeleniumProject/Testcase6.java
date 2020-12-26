package SeleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class Testcase6 {
	
	WebDriver driver;
	WebDriverWait wait;
	
	@BeforeClass
	public void beforeclass()
	{
		driver = new FirefoxDriver();
		wait = new WebDriverWait(driver, 10);
		driver.get("http://alchemy.hguy.co:8080/orangehrm/symfony/web/index.php/auth/login");
	}
	
	@Test
	public void testcase6() 
	{
		//login to url
		WebElement username = driver.findElement(By.id("txtUsername"));
		WebElement password = driver.findElement(By.id("txtPassword"));
		username.sendKeys("orange");
		password.sendKeys("orangepassword123");
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		
		//Locate the navigation menu
		WebElement directory= driver.findElement(By.id("menu_directory_viewDirectory"));
		
	
		//If clickable, click on the menu item
			wait.until(ExpectedConditions.elementToBeClickable(directory));
			
			System.out.println("displayed & clickable");
			directory.click();
			directory.click();
			
			//Verify that the heading of the page matches “Search Directory”
			 String header = driver.findElement(By.cssSelector("h1")).getText();
			 System.out.println(header);
			 Assert.assertEquals("Search Directory", header);
		
		
			
	}
	
	@AfterClass
	public void afterclass()
	{
		driver.close();
	}

}
