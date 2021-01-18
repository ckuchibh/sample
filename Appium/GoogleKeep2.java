package activities;

import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

import org.testng.annotations.BeforeTest;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;

public class GoogleKeep2 {
	
	AppiumDriver<MobileElement> driver = null;
    WebDriverWait wait;
    
   @BeforeTest
   public void beforeTest() throws MalformedURLException {
	// Set the Desired Capabilities
	      DesiredCapabilities caps = new DesiredCapabilities();
	      caps.setCapability("platformName", "Android");
	      caps.setCapability("noReset", true);
	      caps.setCapability("appPackage", "com.google.android.keep");
	      caps.setCapability("appActivity", ".activities.BrowseActivity");

	      // Instantiate Appium Driver
	      URL appServer = new URL("http://0.0.0.0:4723/wd/hub");
	      driver = new AndroidDriver<MobileElement>(appServer, caps);
	      wait = new WebDriverWait(driver, 5);
	   
    }
    
  @Test
  public void GKeepNote1() {
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  
	  driver.findElementById("new_note_button").click();
	  driver.findElementById("editable_title").click();
	  driver.findElementById("editable_title").sendKeys("Title To Test Google Keep Notes");
	  driver.findElementById("edit_note_text").click();
	  driver.findElementById("edit_note_text").sendKeys("This a sample note to test google keeps");
	  
	  driver.findElementById("menu_switch_to_list_view").click();
	 
	  driver.findElementByXPath("//android.widget.TextView[@text='Pick a date & time']").click();
  
  }

  @AfterTest
  public void afterTest() {
  }

}
