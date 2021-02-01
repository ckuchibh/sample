/* Edit user information
 Goal:Edit a user’s information
 a.Open the OrangeHRM page and login with credentials provided
 b.Find the “My Info” menu item and click it.c.On the new page, click the Edit button.
 d.Fill in the Name, Gender, Nationality, and the DOB fields.
 e.Click Save.
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


public class Activity5 {
	
	WebDriver driver = new FirefoxDriver();
	WebDriverWait wait = new WebDriverWait(driver, 15);

	
	@BeforeClass
	public void openBrowser(){
		driver.get("http://alchemy.hguy.co/orangehrm");
		
	}

	
	@Test
	public void editUserInfo() throws InterruptedException {
		Reporter.log("Edit User Info");
		driver.findElement(By.id("txtUsername")).sendKeys("orange");
		driver.findElement(By.id("txtPassword")).sendKeys("orangepassword123");
		driver.findElement(By.xpath("//*[@id=\'btnLogin\']")).click();
		
		//Edit employee details
		WebDriverWait longWait = new WebDriverWait(driver, 10);
		longWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@id='menu_pim_viewMyDetails']")));
		WebElement myInfo = driver.findElement(By.xpath("//a[@id='menu_pim_viewMyDetails']"));
		Thread.sleep(5000);
		myInfo.click();	
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("btnSave")));
		driver.findElement(By.xpath("//input[@id='btnSave']")).click();
		
		WebElement firstName = driver.findElement(By.id("personal_txtEmpFirstName"));
		firstName.clear();
		firstName.sendKeys("Nithya");
		
		WebElement lastName = driver.findElement(By.id("personal_txtEmpLastName"));
		lastName.clear();
		lastName.sendKeys("Vishnu");
		
		driver.findElement(By.id("personal_optGender_2")).click();
		
		WebElement DOB = driver.findElement(By.id("personal_DOB"));
		DOB.clear();
		DOB.sendKeys("1994-05-05");
		
		Select select = new Select(driver.findElement(By.id("personal_cmbNation")));
		select.selectByVisibleText("American");
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("btnSave")));
		driver.findElement(By.id("btnSave")).click();
		
		System.out.println("Employee info is edited successfully");
		}

	
	@AfterClass
	public void closeBrowser(){
		driver.close();
	}

}
