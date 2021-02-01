/*	1. In the @BeforeClass method, create the a driver instance for FirefoxDriver 
	2. Also use the get() method to open the browser with https://www.training-support.net/selenium/login-form 
	3. In the @AfterClass method, use close() to close the browser once the test is done.
	4. Write a @Test method, with the annotation @Parameters below @Test.
	5. Pass "username" and "password" as the parameters. Also add them as formal parameters for the test method.
	6. Use findElements() to find the username and password text boxes and the login button.
	7. Use sendKeys() with the variable names as input. Then click() the login button.
	8. In testng.xml,
		a. Add the <parameter> tags before the <classes> tag.
		b. Add name parameters for username and password.
		c. Set their value to "admin" and "password", respectively.
		d. Save all the files and RUN testng.xml, NOT the test script.*/

package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Activity6 {
    WebDriver driver;
    WebDriverWait wait;

    @BeforeClass
    public void beforeClass() {
        driver = new FirefoxDriver();
        wait = new WebDriverWait(driver, 10);
        
        //Open browser
        driver.get("https://www.training-support.net/selenium/login-form");
    }
    
    @Test
    @Parameters({"username", "password"})
    public void loginTestCase(String username, String password) {
        //Find username and pasword fields
        WebElement usernameField = driver.findElement(By.id("username"));
        WebElement passwordField = driver.findElement(By.id("password"));
        
        //Enter values
        usernameField.sendKeys(username);
        passwordField.sendKeys(password);
        
        //Click Log in
        driver.findElement(By.cssSelector("button[type='submit']")).click();
        
        //Assert Message
        String loginMessage = driver.findElement(By.id("action-confirmation")).getText();
        Assert.assertEquals(loginMessage, "Welcome Back, admin");
    }

    @AfterClass
    public void afterClass() {
        //Close browser
        driver.close();
    }

}