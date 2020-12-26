package SeleniumProject;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

public class Testcase7 {
	WebDriver driver;
	
	@BeforeClass
	public void beforeclass()
	{
		driver = new FirefoxDriver();
		driver.get("http://alchemy.hguy.co:8080/orangehrm/symfony/web/index.php/auth/login");
	}
	@Test
	public void testcase7() throws InterruptedException
	{
		//login to url
		WebElement username = driver.findElement(By.id("txtUsername"));
		WebElement password = driver.findElement(By.id("txtPassword"));
		username.sendKeys("orange");
		password.sendKeys("orangepassword123");
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
				
		//Find the “My Info” menu item and click it.
		driver.findElement(By.id("menu_pim_viewMyDetails")).click();
		driver.findElement(By.id("menu_pim_viewMyDetails")).click();
		
		//On the new page, find the Qualification option on the left side menu and click it
		driver.findElement(By.linkText("Qualifications")).click();

		//Add Work Experience and click Save.
		driver.findElement(By.id("addWorkExperience")).click();
		
		WebElement cmpny = driver.findElement(By.id("experience_employer"));
		cmpny.sendKeys("IBM India");
		WebElement jbtitle = driver.findElement(By.id("experience_jobtitle"));
		jbtitle.sendKeys("Quality Analyst-Test Specialist");
		WebElement frmdte = driver.findElement(By.id("experience_from_date"));
		frmdte.clear();
		frmdte.sendKeys("2014-10-31");
		WebElement todte = driver.findElement(By.id("experience_to_date"));
		todte.clear();
		todte.sendKeys("2020-12-24");
		WebElement cmts = driver.findElement(By.id("experience_comments"));
		cmts.sendKeys("worklife balance");
		
		driver.findElement(By.cssSelector("input#btnWorkExpSave")).click();
		Thread.sleep(5000);
		
	}
	@AfterClass
	public void afterclass()
	{
		driver.close();
	}
}
