/*Verify that the “Directory” menu item is visible and clickable 
Goal: Verify that the “Directory” menu item is visible and clickable 

 a. Open the OrangeHRM page and login with credentials provided. 
 b. Locate the navigation menu. 
 c. Verify that the “Directory” menu item is visible and clickable. 
 d. If clickable, click on the menu item. 
 e. Verify that the heading of the page matches “Search Directory”. 
 f. Close the browser.*/

package HRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity6 {

	WebDriver driver = new FirefoxDriver();
	WebDriverWait wait = new WebDriverWait(driver, 10);

	@BeforeClass
	public void openBrowser() {
		driver.get("http://alchemy.hguy.co/orangehrm");

	}

	@Test
	public void editDirectory() throws InterruptedException{
		Reporter.log("Verify that the “Directory” menu item is visible and clickable");
		driver.findElement(By.id("txtUsername")).sendKeys("orange");
		driver.findElement(By.id("txtPassword")).sendKeys("orangepassword123");
		driver.findElement(By.xpath("//*[@id=\'btnLogin\']")).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='menu_directory_viewDirectory']")));
		WebElement myInfo = driver.findElement(By.xpath("//a[@id='menu_directory_viewDirectory']"));
		Thread.sleep(5000);
		myInfo.click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("h1")));
		
		//Verify that the heading of the page matches “Search Directory”. 
		String title = driver.findElement(By.tagName("h1")).getText();
		System.out.println("Title of the menu directory:" + title);
		Assert.assertEquals(title, "Search Directory");
		System.out.println("Directory verified successfully");
	}

	@AfterClass
	public void closeBrowser() {
		driver.close();
	}

}
