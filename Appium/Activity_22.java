package activities;

import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

import org.testng.annotations.BeforeTest;

import java.net.MalformedURLException;
import java.net.URL;

import org.junit.Assert;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;

public class Activity_22 {
	WebDriverWait wait;
    AppiumDriver<MobileElement> driver = null;
	
  @BeforeTest
  public void beforeTest() throws MalformedURLException {
	  DesiredCapabilities caps = new DesiredCapabilities();
      caps.setCapability("deviceName", "Pixel 4 Emulator");
      caps.setCapability("platformName", "Android");
      caps.setCapability("appPackage", "com.android.calculator2");
      caps.setCapability("appActivity", "com.android.calculator2.Calculator");
      
   // Instantiate Appium Driver
      URL appServer = new URL("http://0.0.0.0:4723/wd/hub");
      driver = new AndroidDriver<MobileElement>(appServer, caps);
      
	  }
  

  @Test
  public void calc() {
	  driver.findElementById("digit_5").click();
	  driver.findElementById("op_add").click();
	  driver.findElementById("digit_7").click();
	  driver.findElementById("eq").click();
	  String res=driver.findElementById("result").getText();
	  Assert.assertEquals(res, "12");
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
