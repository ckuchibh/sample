/*	1. Create a Package with a Class and a main() method
	2. For this activity import the following classes 
		a. org.openqa.selenium.support.ui.Alert
	3. Create a WebDriver instance, named driver, with the FirefoxDriver(). 
	4. Open a browser with https://www.training-support.net/selenium/javascript-alerts 
	5. Get the title of the page using driver.getTitle() and print out the title.
	6. Also use findElement() to find the button to open a PROMPT alert and click it.
	7. Switch the focus from the main window to the Alert box.
	8. Use sendKeys() to type in "Yes, you are!".
	9. Close the alert with alert.accept(). 
	10. Finally, close() the browser.*/

package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity11_3 {

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/javascript-alerts");
		System.out.println(driver.getTitle());
		
		driver.findElement(By.id("prompt")).click();
		Alert promptAlert = driver.switchTo().alert();
		System.out.println("Alert Text is: "+promptAlert.getText());
		promptAlert.sendKeys("Awesome!");
		promptAlert.accept();
		driver.close();
		
	}

}
