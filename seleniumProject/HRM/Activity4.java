/*Add a new employee
Goal:Add an employee and their details to the site
a.Open the OrangeHRM page and login with credentials provided
b.Find the PIM option in the menu and click it.
c.Click the Add button to add a new Employee.
d.Fill in the required fields and click Save.
e.Navigate back to the Admin page and verify the creation of your employee.
f.Close the browser*/

package HRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class Activity4 {
	
	WebDriver driver = new FirefoxDriver();
	
	@BeforeClass
	public void openBrowser(){
		driver.get("http://alchemy.hguy.co/orangehrm");
	}
	
	@Test
	public void addEmployee() {
		Reporter.log("Add a new employee");
		driver.findElement(By.id("txtUsername")).sendKeys("orange");
		driver.findElement(By.id("txtPassword")).sendKeys("orangepassword123");
		driver.findElement(By.xpath("//*[@id=\'btnLogin\']")).click();

		//Add employee details
		WebDriverWait wait = new WebDriverWait(driver, 3);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("menu_pim_viewPimModule")));
		driver.findElement(By.id("menu_pim_viewPimModule")).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("menu_pim_viewEmployeeList")));
		driver.findElement(By.id("menu_pim_viewEmployeeList")).click();
		
		driver.findElement(By.id("btnAdd")).click();
		driver.findElement(By.id("firstName")).sendKeys("Nithya");
		driver.findElement(By.id("lastName")).sendKeys("Vishnu");
		
		//create credentials for an employee
		Reporter.log("creating credentials for employee");
		driver.findElement(By.xpath("//input[@id='chkLogin']")).click();
		driver.findElement(By.id("user_name")).sendKeys("Nithya Vishnu");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("btnSave")));
		driver.findElement(By.id("btnSave")).click();
		Reporter.log("New Employee created");
		
		//Verify if the employee is created using username
		driver.findElement(By.id("menu_admin_viewAdminModule")).click();
		driver.findElement(By.id("searchSystemUser_userName")).sendKeys("Nithya Vishnu");
		driver.findElement(By.id("searchBtn")).click();
		System.out.println("Employee is created successfully");
		}

	
	@AfterClass
	public void closeBrowser(){
		driver.close();
	}

}
