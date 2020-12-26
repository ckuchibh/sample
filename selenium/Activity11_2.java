
/*	1. Create a Class and a main() method
	2. For this activity import the following classes 
		a. org.openqa.selenium.support.ui.Alert
	3. Create a WebDriver instance, named driver, with the FirefoxDriver(). 
	4. Open a browser with https://www.training-support.net/selenium/javascript-alerts 
	5. Get the title of the page using driver.getTitle() and print out the title.
	6. Use findElement() to find the button to open a CONFIRM alert and click it.
	7. Switch the focus from the main window to the Alert box and get the text in it and print it.
	8. Close the alert once with alert.accept() and again with alert.dismiss() 
	9. Finally, close() the browser.*/

package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity11_2 {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/javascript-alerts");
		System.out.println(driver.getTitle());
		
		driver.findElement(By.id("confirm")).click();
		Alert confirmAlert = driver.switchTo().alert();
		System.out.println(confirmAlert.getText());
		confirmAlert.accept();
		
		//confirmAlert.dismiss();
		
		driver.close();		
		
	}

}
