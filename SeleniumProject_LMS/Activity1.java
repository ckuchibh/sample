package SeleniumProject_LMS;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity1 {
    WebDriver driver;
    
    @BeforeClass
    public void beforeClass() {
    	Reporter.log("Starting Activtiy1", true);
    	
        //Create a new instance of the Firefox driver
        driver = new FirefoxDriver();
    }   
    @Test
    public void titleTestCase() {
        //Open browser
        driver.get("https://alchemy.hguy.co/lms");
        
        // Check the title of the page
        String title = driver.getTitle();

        //Assertion for page title
        Assert.assertEquals(title, "Alchemy LMS – An LMS Application");
        
        //Print the title of the page
        Reporter.log("Page title is: " + title, true);
        
    }
    @AfterClass
    public void afterClass() {
        //Close the browser
        driver.close();
        Reporter.log("Activity 1 is completed", true);
    }
    
}