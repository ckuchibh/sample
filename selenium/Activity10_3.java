/*	1. Create a Class and a main() method
	2. Create a WebDriver instance, named driver, with the FirefoxDriver(). 
	3. Open a browser with https://training-support.net/selenium/drag-drop 
	4. Get the title of the page using driver.getTitle() and print out the title.
	5. Find the ball and simulate a click and drag to move it into "Dropzone 1".
	6. Verify that the ball has entered Dropzone 1.
	7. Once verified, move the ball into "Dropzone 2".
	8. Verify that the ball has entered Dropzone 2.
	9. Once verified, close the browser.*/

package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity10_3 {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		driver.get("https://training-support.net/selenium/drag-drop");
		System.out.println(driver.getTitle());
		
		// Save the different elements in variables
		WebElement ball = driver.findElement(By.id("draggable"));		
        WebElement drop1 = driver.findElement(By.id("droppable"));
        WebElement drop2 = driver.findElement(By.id("dropzone2"));
        
        // Compile a custom action for Drag/Drop and perform it
        Actions actions = new Actions(driver);
        actions.dragAndDrop(ball, drop1).build().perform();
          	
        // Wait for the Dropzone's color to change  
        wait.until(ExpectedConditions.attributeToBeNotEmpty(drop1, "background-color"));  
        System.out.println("Entered DROPZONE1");
        
        // Repeat for the second dropzone
        actions.dragAndDrop(ball, drop2).build().perform();
        wait.until(ExpectedConditions.attributeToBeNotEmpty(drop2, "background-color"));
        System.out.println("Entered DROPZONE2");
        
        //close the browser
        driver.close();		
		
	}

}
