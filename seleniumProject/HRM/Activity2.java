package HRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class Activity2 {
	
	WebDriver driver = new FirefoxDriver();
	
	@BeforeClass
	public void openBrowser(){
		driver.get("http://alchemy.hguy.co/orangehrm");
	}
	
	@Test(priority=2)
	public void getUrlofHeaderImage() {
		Reporter.log("Get URL of the header image");
		driver.findElement(By.id("divLogo"));
		System.out.println("Header Image URL is:" + driver.getCurrentUrl());
	}
	
	@AfterClass
	public void closeBrowser(){
		driver.close();
	}

}
