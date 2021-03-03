package testNGTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity5 {
   
	WebDriver driver;
	@Test
    public void TestCase() {
     //title
	String title = driver.getTitle();
    	System.out.println("title is  : "+title);
    	//3rd header
    	WebElement ThirdHeader=driver.findElement(By.id("third-header"));
    	System.out.println(ThirdHeader);
    	String HeaderThird= ThirdHeader.getText();
    	System.out.println(HeaderThird);
    }
    
    @BeforeClass
    public void BeforeTestCase() {
    	System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\SubhashKumar\\Downloads\\Drivers\\geckodriver-v0.29.0-win64\\geckodriver.exe");
        //Create a new instance of the Firefox driver
        driver = new FirefoxDriver();

        //Open browser
        driver.get("https://www.training-support.net/selenium/target-practice");
 
    }
    
    
    @AfterClass
    public void AfterTestCase() {  
    	
    	driver.close();
    	driver.quit();
    	
    }
}