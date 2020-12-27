/*Applying for a leave
Goal:Login and apply for a leave on the HRM site

a.Open the OrangeHRM page and login with credentials provided
b.Navigate to the Dashboard page and click on the Apply Leave option.
c.Select leave type and duration of the leave.
d.Click Apply.
e.Navigate to the My Leave page to check the status of leave application.
f.Close the browser.*/

package HRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity8 {

	WebDriver driver = new FirefoxDriver();
	WebDriverWait wait = new WebDriverWait(driver, 15);

	@BeforeClass
	public void openBrowser() {
		driver.get("http://alchemy.hguy.co/orangehrm");
	}

	@Test
	public void applyLeave() throws InterruptedException {
		Reporter.log("Apply leave");
		driver.findElement(By.id("txtUsername")).sendKeys("orange");
		driver.findElement(By.id("txtPassword")).sendKeys("orangepassword123");
		driver.findElement(By.xpath("//*[@id=\'btnLogin\']")).click();

		// goto dashboard to get apply leave option
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@id='menu_dashboard_index']")));
		WebElement myInfo = driver.findElement(By.xpath("//a[@id='menu_dashboard_index']"));
		Thread.sleep(5000);
		myInfo.click();
		
		//click on apply leave
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Apply Leave']")));
		driver.findElement(By.xpath("//span[text()='Apply Leave']")).click();
		
		//select leave type from dropdown
		Select leavetype = new Select(driver.findElement(By.id("applyleave_txtLeaveType")));
		leavetype.selectByVisibleText("Paid Leave");

		WebElement FromDate = driver.findElement(By.id("applyleave_txtFromDate"));
		FromDate.clear();
		FromDate.sendKeys("2020-12-29");

		WebElement ToDate = driver.findElement(By.id("applyleave_txtToDate"));
		ToDate.clear();
		ToDate.sendKeys("2020-12-31");
		driver.findElement(By.id("applyBtn")).click();

		System.out.println("Leave Applied successfully");
		// check the leave status
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("menu_leave_viewMyLeaveList")));
		driver.findElement(By.id("menu_leave_viewMyLeaveList")).click();

		WebElement calFromDate = driver.findElement(By.id("calFromDate"));
		calFromDate.clear();
		calFromDate.sendKeys("2020-12-29");

		WebElement calToDate = driver.findElement(By.id("calToDate"));
		calToDate.clear();
		calToDate.sendKeys("2020-12-31");

		driver.findElement(By.id("btnSearch")).click();
	}

	@AfterClass
	public void closeBrowser() {
		driver.close();
	}

}
