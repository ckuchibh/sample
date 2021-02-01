/*	1. In the @BeforeMethod method, create the a driver instance for FirefoxDriver 
	2. Also use the get() method to open the browser with https://www.training-support.net/selenium/login-form 
	3. In the @AfterMethod method, use close() to close the browser once the test is done.
	4. Add a @DataProviders method credentials() with the name parameter set to "Authentication".
	5. Set the return type of the method as Object[][].
	6. It should return two Objects with a username and a password each.
	7. Write a @Test method, with the parameter dataProvider set to name of the @DataProvider method.
	8. Add them as formal parameters for the test method.
	9. In the @Test method:
		a. Use findElements() to find the username and password text boxes and the login button.
		b. Use sendKeys() with the variable names as input.
		c. Click the login button.
		d. Run the test script as a TestNG Test.*/
package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Activity7 {
    WebDriver driver;
    WebDriverWait wait;

    @BeforeClass
    public void beforeClass() {
        driver = new FirefoxDriver();
        wait = new WebDriverWait(driver, 10);
        
        //Open browser
        driver.get("https://www.training-support.net/selenium/login-form");
    }
    
    @DataProvider(name = "Authentication")
    public static Object[][] credentials() {
        return new Object[][] { { "admin", "password" }};
    }
    
    @Test (dataProvider = "Authentication")
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
