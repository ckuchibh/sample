/*	1. Create a TestNG Class with the annotations 
		a. @Test
		b. @BeforeClass
		c. @AfterClass
	2. In the @BeforeClass method, create the a driver instance for FirefoxDriver
	3. Also use the get() method to open the browser with https://www.training-support.net/selenium/login-form 
	4. In the @AfterClass method, use close() to close the browser once the test is done.
	5. Find the login input fields - username and password
	6. Enter the credentials - admin and password - and click the "Log in" button.
	7. Read the confirmation message and make and assertion to check if the correct message has been printed.*/


package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity3 {
    WebDriver driver;

    @BeforeClass
    public void beforeClass() {
        driver = new FirefoxDriver();

        //Open browser
        driver.get("https://www.training-support.net/selenium/login-form");
    }

    @Test
    public void loginTest() {
        //Find the username and password fields
        WebElement username = driver.findElement(By.id("username"));
        WebElement password = driver.findElement(By.id("password"));
        
        //Enter credentials
        username.sendKeys("admin");
        password.sendKeys("password");
        
        //Click login
        driver.findElement(By.xpath("//button[text()='Log in']")).click();
        
        //Read login message
        String loginMessage = driver.findElement(By.id("action-confirmation")).getText();
        Assert.assertEquals("Welcome Back, admin", loginMessage);
    }

    @AfterClass
    public void afterClass() {
        //Close browser
        driver.close();
    }
}