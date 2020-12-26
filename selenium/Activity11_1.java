/*	1. Create a Class and a main() method
	2. For this activity import the following classes 
		a. org.openqa.selenium.support.ui.Alert
	3. Create a WebDriver instance, named driver, with the FirefoxDriver(). 
	4. Open a browser with https://www.training-support.net/selenium/javascript-alerts 
	5. Get the title of the page using driver.getTitle() and print out the title.
	6. Use findElement() to find the button to open a SIMPLE alert and click it.
	7. Switch the focus from the main window to the Alert box and get the text in it and print it.
	8. Finally, close the alert with alert.accept() and close() the browser*/

package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity11_1 {

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/javascript-alerts");
		System.out.println(driver.getTitle());
		
		driver.findElement(By.id("simple")).click();
		Alert simpleAlert = driver.switchTo().alert();
		System.out.println("Alert Message:" + simpleAlert.getText());
		simpleAlert.accept();
		driver.close();
	}

}
