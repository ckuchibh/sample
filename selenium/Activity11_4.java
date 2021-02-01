/*	1. Create a Package with a Class and a main() method
	2. For this activity, import java.util.Set 
	3. Create a WebDriver instance, named driver, with the FirefoxDriver(). 
	4. Open a browser with https://www.training-support.net/selenium/tab-opener 
	5. Print the Page Title and Handle of that tab.
	6. Find the button to open a new tab and click it.
	7. Wait for the new tab to open.
	8. Print all the handles.
	9. Switch to the newly opened tab, print it's title and heading.
	10. Repeat steps 6-8 by clicking the button on the new tab.
	11. Finally, close both windows using quit().*/
package selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity11_4 {

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait(driver, 5);
		driver.get("https://www.training-support.net/selenium/tab-opener");
		System.out.println(driver.getTitle());

		// Get parent window handle
		String parentWindow = driver.getWindowHandle();
		System.out.println("Parent Window: " + parentWindow);

		// Find link to open new tab and click it
		driver.findElement(By.id("launcher")).click();
		wait.until(ExpectedConditions.numberOfWindowsToBe(2));

		// Get Window handles
		Set<String> allWindowHandles = driver.getWindowHandles();
		System.out.println("All window handles: " + allWindowHandles);

		// Loop through each handle
		for (String handle : driver.getWindowHandles()) {
			driver.switchTo().window(handle);
		}
		
        //Print the handle of the current window
        System.out.println("Current window handle: " + driver.getWindowHandle());
        
        //Wait for page to load completely
        wait.until(ExpectedConditions.titleIs("Newtab"));
        
        //Print New Tab Title
        System.out.println("New Tab Title is: " + driver.getTitle());
        
        //Get heading on new page
        String newTabText = driver.findElement(By.cssSelector("div.content")).getText();
        System.out.println("New tab heading is: " + newTabText);
        
        //Open Another Tab
        driver.findElement(By.linkText("Open Another One!")).click();
        wait.until(ExpectedConditions.numberOfWindowsToBe(3));

        //Make sure the new tab's handle is part of the handles set
        allWindowHandles = driver.getWindowHandles();
        System.out.println("All window handles: " + allWindowHandles);

        //Loop through the handles set till we get to the newest handle
        for (String handle : driver.getWindowHandles()) {
            driver.switchTo().window(handle);
        }

        //Print the handle of the current window
        System.out.println("New tab handle: " + driver.getWindowHandle());

        //Wait for the newest tab to load completely
        wait.until(ExpectedConditions.titleIs("Newtab2"));

        //Print New Tab Title
        System.out.println("New Tab Title is: " + driver.getTitle());

        //Get heading on new page
        newTabText = driver.findElement(By.cssSelector("div.content")).getText();
        System.out.println("New tab heading is: " + newTabText);

        //Close the browser
        driver.quit();
	}

}
