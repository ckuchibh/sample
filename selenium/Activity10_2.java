/*	1. Create a Class and a main() method
	2. Create a WebDriver instance, named driver, with the FirefoxDriver(). 
	3. Open a browser with https://www.training-support.net/selenium/input-events 
	4. Get the title of the page using driver.getTitle() and print out the title.
	5. Perform the following actions, 
		a. Press the key of your first name in caps
		b. Press CTRL+a and the CTRL+c to copy all the text on the page.
		(Paste the text in a text editor to verify results.)
	6. Finally, close the browser.*/

package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Activity10_2 {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		String pressedKeyText;
		
		driver.get("https://www.training-support.net/selenium/input-events");
		System.out.println("Title of the page:" + driver.getTitle());
		
		Actions actions = new Actions(driver);
		WebElement pressedKey = driver.findElement(By.id("keyPressed"));
		
		//Create action sequence - Press the key of your first name in caps
		Action actionSeq1 = actions.sendKeys("N").build();
		actionSeq1.perform();
		pressedKeyText = pressedKey.getText();
	    System.out.println("Pressed key is: " + pressedKeyText);
	    
	    //Press CTRL+a and the CTRL+c to copy all the text on the page
	    Action actionSequence2 = actions
	    		.keyDown(Keys.CONTROL)
	    		.sendKeys("a")
	    		.sendKeys("c")
	    		.keyUp(Keys.CONTROL)
	    		.build();
	    actionSequence2.perform();
	    pressedKeyText = pressedKey.getText();
	    System.out.println("Pressed key is: " + pressedKeyText);
	    
	    driver.close();
	}

}
