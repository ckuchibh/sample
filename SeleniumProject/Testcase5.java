package SeleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Testcase5 {
	
	WebDriver driver;
	
	@BeforeClass
	public void beforeclass()
	{
		driver = new FirefoxDriver();
		driver.get("http://alchemy.hguy.co:8080/orangehrm/symfony/web/index.php/auth/login");
	}
	
	@Test
	public void testcase5()
	{
		//login to url
		WebElement username = driver.findElement(By.id("txtUsername"));
 		WebElement password = driver.findElement(By.id("txtPassword"));
 		username.sendKeys("orange");
 		password.sendKeys("orangepassword123");
 		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
 		
 		//Find the “My Info” menu item and click it.
 		driver.findElement(By.id("menu_pim_viewMyDetails")).click();
 		
 		//On the new page, click the Edit button.
 		driver.findElement(By.xpath("//input[@id='btnSave']")).click();
 		
 		//Fill in the Name, Gender, Nationality, and the DOB fields
 		WebElement fname = driver.findElement(By.id("personal_txtEmpFirstName"));
 		WebElement lname = driver.findElement(By.id("personal_txtEmpLastName"));
 		fname.clear();
 		fname.sendKeys("Hello");
 		lname.clear();
 		lname.sendKeys("World");
 		//Gender updated to Female
 		driver.findElement(By.id("personal_optGender_2")).click();
 		//Edit dob
 		WebElement dob = driver.findElement(By.xpath("//input[@id='personal_DOB']"));
 		dob.clear();
 		dob.sendKeys("1972-06-12");
 		
 		//Click Save
 		driver.findElement(By.xpath("//input[@id='btnSave']")).click();
	}
	
	@org.testng.annotations.AfterClass
	public void AfterClass()
	{
		driver.close();
	}

}
