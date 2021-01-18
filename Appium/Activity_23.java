package activities;

import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

import org.testng.annotations.BeforeTest;

import java.net.MalformedURLException;
import java.net.URL;

import org.junit.Assert;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;

public class Activity_23 {
 
	AppiumDriver<MobileElement> driver = null;
    WebDriverWait wait;
    
  @BeforeTest
  public void beforeTest() throws MalformedURLException {
	// Set the Desired Capabilities
      DesiredCapabilities caps = new DesiredCapabilities();
      caps.setCapability("platformName", "Android");
      caps.setCapability("appPackage", "com.android.contacts");
      caps.setCapability("appActivity", ".activities.PeopleActivity");
      caps.setCapability("noReset", true);

      // Instantiate Appium Driver
      URL appServer = new URL("http://0.0.0.0:4723/wd/hub");
      driver = new AndroidDriver<MobileElement>(appServer, caps);
      wait = new WebDriverWait(driver,10);
  }

  @Test
  public void addcntct() throws InterruptedException {
	// Click on add new contact floating button
      driver.findElementByAccessibilityId("Create new contact").click();
      Thread.sleep(5000);
     
      // Find the first name, last name, and phone number fields
      MobileElement firstName = driver.findElementByXPath("//android.widget.EditText[@text='First name']");
      MobileElement lastName = driver.findElementByXPath("//android.widget.EditText[@text='Last name']");
      MobileElement phoneNumber = driver.findElementByXPath("//android.widget.EditText[@text='Phone']");
      
      // Enter the text in the fields
      firstName.sendKeys("Aaditya");
      lastName.sendKeys("Varma");
      phoneNumber.sendKeys("9991284782");
      
      // Save the contact
      driver.findElementById("editor_menu_save_button").click();
      
      // Wait for contact card to appear
      wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.id("toolbar_parent")));

      // Assertion
      MobileElement mobileCard = driver.findElementById("toolbar_parent");
      Assert.assertTrue(mobileCard.isDisplayed());
      
      String contactName = driver.findElementById("large_title").getText();
      Assert.assertEquals(contactName, "Aaditya Varma");
  }
  
  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
