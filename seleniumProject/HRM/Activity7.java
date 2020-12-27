/*Adding qualifications
Goal:Add employee qualificationsa.
Open the OrangeHRM page and login with credentials providedb.
Find the “My Info” menu item and click it.
c.On the new page, 
find the Qualification option on the left side menu and click it.
Add Work Experience and click Save.e.Close the browser.*/

package HRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity7 {
	
	WebDriver driver = new FirefoxDriver();
	WebDriverWait wait = new WebDriverWait(driver, 15);

	
	@BeforeClass
	public void openBrowser(){
		driver.get("http://alchemy.hguy.co/orangehrm");
		
	}

	
	@Test
	public void addQualification() throws InterruptedException {
		Reporter.log("Add Qualification");
		driver.findElement(By.id("txtUsername")).sendKeys("orange");
		driver.findElement(By.id("txtPassword")).sendKeys("orangepassword123");
		driver.findElement(By.xpath("//*[@id=\'btnLogin\']")).click();
		
		//Edit employee details
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@id='menu_pim_viewMyDetails']")));
		WebElement myInfo = driver.findElement(By.xpath("//a[@id='menu_pim_viewMyDetails']"));
		Thread.sleep(5000);
		myInfo.click();	
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='sidebar']/ul[@id='sidenav']/li[9]/a")));
		driver.findElement(By.xpath("//*[@id='sidebar']/ul[@id='sidenav']/li[9]/a")).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("addWorkExperience")));
		driver.findElement(By.id("addWorkExperience")).click();
		
		WebElement company = driver.findElement(By.id("experience_employer"));
		company.clear();
		company.sendKeys("IBM");
		
		WebElement JobTitle = driver.findElement(By.id("experience_jobtitle"));
		JobTitle.clear();
		JobTitle.sendKeys("Tester");	
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("btnWorkExpSave")));
		driver.findElement(By.id("btnWorkExpSave")).click();
		
		System.out.println("Employee qualifications are added successfully");
		}

	
	@AfterClass
	public void closeBrowser(){
		driver.close();
	}

}