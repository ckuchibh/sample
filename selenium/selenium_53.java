package Selenium;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class selenium_53 {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		 
        driver.get("https://training-support.net/selenium/dynamic-controls");
 
        WebElement textInput = driver.findElement(By.xpath("//input[@type='text']"));

        System.out.println("The checkbox is selected: " + textInput.isEnabled());
 
        driver.findElement(By.id("toggleInput")).click();

        System.out.println("The checkbox is selected: " + textInput.isEnabled());
 
        driver.close();
	}

}
