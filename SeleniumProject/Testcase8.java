package SeleniumProject;

import java.util.List;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.*;



public class Testcase8 {
	WebDriver driver;
	
	@BeforeClass
	public void beforeclass()
	{
		driver = new FirefoxDriver();
		driver.get("http://alchemy.hguy.co:8080/orangehrm/symfony/web/index.php/auth/login");
	}
	
	@Test
	public void testcase8() throws InterruptedException
	{
		//login to the url
		WebElement username = driver.findElement(By.id("txtUsername"));
		WebElement password = driver.findElement(By.id("txtPassword"));
		username.sendKeys("orange");
		password.sendKeys("orangepassword123");
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		
		//Navigate to the Dashboard page and click on the Apply Leave option
		driver.findElement(By.linkText("Apply Leave")).click();
		driver.findElement(By.linkText("Apply Leave")).click();
		
		//Select leave type and duration of the leave
		 Select leavetyp = new Select(driver.findElement(By.id("applyleave_txtLeaveType")));
		 leavetyp.selectByValue("1");
		 WebElement frmdte = driver.findElement(By.id("applyleave_txtFromDate"));
		 frmdte.clear();
		 frmdte.sendKeys("2020-12-30");
		 WebElement todte = driver.findElement(By.id("applyleave_txtToDate"));
		 todte.clear();
		 todte.sendKeys("2020-12-31");
		 WebElement comments = driver.findElement(By.id("applyleave_txtComment"));
		 comments.sendKeys("Planned Vacation");
		 
		 //Click Apply
		 driver.findElement(By.xpath("//input[@id='applyBtn']")).click();
		 
		 //Navigate to the My Leave page to check the status of leave application.
		 
		 driver.findElement(By.id("menu_leave_viewMyLeaveList")).click();
		 driver.findElement(By.id("menu_leave_viewMyLeaveList")).click();
		 
		 
		 //search
		 WebElement calfromdate = driver.findElement(By.id("calFromDate"));
			calfromdate.clear();
			calfromdate.sendKeys("2020-12-30");
		WebElement caltodate = driver.findElement(By.id("calToDate"));
			caltodate.clear();
			caltodate.sendKeys("2020-12-31");
		driver.findElement(By.id("btnSearch")).click();
		
		//Get Status
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr/td[7]"));

		for (int i = 0; i <= rows.size(); i++) {
			String vacation = rows.get(i).getText();
			
			if (vacation.equalsIgnoreCase("Planned Vacation")) {
				String status = driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr/td[6]")).getText();
				System.out.println("Staus of the leave :" + status);
				Assert.assertTrue(status!=null);
				break;
			}
	}
	
	}
	
	@AfterClass
	public void afterclass()
	{
		driver.close();
	}
	

}
