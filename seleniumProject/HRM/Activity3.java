/*Logging into the site
Goal:Open the site and login with the credentials provided
a.Open the browser to the login page of OrangeHRM site.
b.Find and select the username and password fields
c.Enter login credentials into the respective fields
d.Click login
e.Verify that the homepage has opened.
f.Close the browser.*/

package HRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class Activity3 {
	
	WebDriver driver = new FirefoxDriver();
	
	@BeforeClass
	public void openBrowser(){
		driver.get("http://alchemy.hguy.co/orangehrm");
	}

	
	@Test
	public void logInSite() {
		Reporter.log("Log into the site");
		driver.findElement(By.id("txtUsername")).sendKeys("orange");
		driver.findElement(By.id("txtPassword")).sendKeys("orangepassword123");
		driver.findElement(By.xpath("//*[@id=\'btnLogin\']")).click();
		
		//Verifying the home page opened or not
		if (driver.getTitle().contains("OrangeHRM")){
			System.out.println("HomePage is opened successfully");
		}
		else{
			System.out.println("Homepage is not opened");
			}
	}
	
	
	@AfterClass
	public void closeBrowser(){
		driver.close();
	}

}
