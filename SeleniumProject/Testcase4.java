package SeleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Testcase4 {
     WebDriver driver;
     @BeforeClass
     public void beforeclass()
     {
    	 driver= new FirefoxDriver();
    	 driver.get("http://alchemy.hguy.co:8080/orangehrm/symfony/web/index.php/auth/login");
     }
     @Test
     public void testcase4()
     {
    	 //login to url
    	WebElement username = driver.findElement(By.id("txtUsername"));
 		WebElement password = driver.findElement(By.id("txtPassword"));
 		username.sendKeys("orange");
 		password.sendKeys("orangepassword123");
 		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
 		
 		//Click on PIM > AddEmployee 
 		driver.findElement(By.xpath("//a[@id='menu_pim_viewPimModule']")).click();
 	 	driver.findElement(By.xpath("//a[@id='menu_pim_addEmployee']")).click();
 		
 	 	//Enter user credentials
 		WebElement frstnme = driver.findElement(By.xpath("//input[@id='firstName']"));
 		WebElement lastnme = driver.findElement(By.xpath("//input[@id='lastName']"));
 		frstnme.sendKeys("testrr3");
 		lastnme.sendKeys("testrr4");
 		
 		driver.findElement(By.id("chkLogin")).click();
 		
 		WebElement uname = driver.findElement(By.id("user_name"));
 		uname.sendKeys("rr002");
 		
 		Select status = new Select(driver.findElement(By.id("status")));
 		status.selectByValue("Enabled");
 		
 		driver.findElement(By.xpath("//input[@id='btnSave']")).click();
 		
 		//Navigate to Admin Page
 		driver.findElement(By.cssSelector("a#menu_admin_viewAdminModule")).click();
 		
 		//Search by username
 		WebElement s_uname = driver.findElement(By.id("searchSystemUser_userName"));
 		s_uname.sendKeys("rr002");
 		
 		WebElement search = driver.findElement(By.id("searchBtn"));
 		search.click();
 		
 		//Output of search check
 		WebElement employeeElement = driver.findElement(By.linkText("rr002"));
        Assert.assertEquals(employeeElement.getText(),"rr002");
        
 		
     }
     @AfterClass
     public void afterclass()
     {
    	 driver.close();
     }
}
