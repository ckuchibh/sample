package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity1 {

    public static void main(String[] args) {
    
   // System.setProperty("webdriver.gecko.driver","<Path to geckodriver.exe>)");
	// Create a new instance of the Firefox driver
	WebDriver driver = new FirefoxDriver();
		
	//Open the browser
	driver.get("https://www.training-support.net");
	WebElement idLocator = driver.findElement(By.id("about-link"));
	System.out.println("Text in idLocator element:" + idLocator.getText());
		
	//Close the browser
	driver.close();
    }

}
