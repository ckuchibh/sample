/*a. Create a Class and a main() method
b. For this activity import the following classes 
	a. org.openqa.selenium.support.ui.ExpectedConditions
	b. org.openqa.selenium.support.ui.WebDriverWait
c. Create a WebDriver instance, named driver, with the FirefoxDriver(). 
d. Open a browser with https://training-support.net/selenium/dynamic-controls 
e. Get the title of the page using driver.getTitle() and print out the title.
f. Find the  toggle checkbox button and click it.
g. Wait till the checkbox disappears.
h. Click the toggle checkbox button again. Wait till the checkbox appears and check on it.
i. Finally, close the browser.*/

package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity6_1 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait(driver, 5);
		
		//open the browser
		driver.get("https://www.training-support.net/selenium/dynamic-controls");
		Thread.sleep(2000);
		System.out.println("Title:" + driver.getTitle());

		// Find the checkbox & toggle button 
		WebElement toggleCheckboxButton = driver.findElement(By.id("toggleCheckbox"));
		WebElement checkbox = driver.findElement(By.xpath("//input[@type='checkbox']"));

		 //Click the toggle button
		toggleCheckboxButton.click();
		System.out.println("toggleCheckbox(Remove checkbox) button is clicked");

		//Wait for checkbox to disappear
		wait.until(ExpectedConditions.invisibilityOf(checkbox));
		System.out.println("checkbox displayed:" +checkbox.isDisplayed());
		
		// Click the toggle checkbox button again
		toggleCheckboxButton.click();
		System.out.println("toggleCheckbox(Add checkbox) button is clicked");

		// Wait till the checkbox appears and check on it
		wait.until(ExpectedConditions.visibilityOf(checkbox));
		System.out.println("checkbox displayed:" +checkbox.isDisplayed());
		checkbox.click();
		System.out.println("Checkbox button is clicked");
		
		//close the browser
		driver.close();

	}

}
