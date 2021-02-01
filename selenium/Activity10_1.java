/*	1. Create a Class and a main() method
	2. Create a WebDriver instance, named driver, with the FirefoxDriver(). 
	3. Open a browser with https://www.training-support.net/selenium/input-events 
	4. Get the title of the page using driver.getTitle() and print out the title.
	5. On the page, perform 
		a. Left click and print the value of the side in the front.
		b. Double click to show a random side and print the number.
		c. Right click and print the value shown on the front of the cube.
	6. Finally, close the browser.*/

package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity10_1 {

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/input-events");
		System.out.println("Title of the page:" + driver.getTitle());

		// Find the cube
		WebElement cube = driver.findElement(By.id("wrapD3Cube"));

		Actions actions = new Actions(driver);
		// Left click
		actions.click(cube);
		WebElement cubeVal = driver.findElement(By.className("active"));
		System.out.println("Left Click: " + cubeVal.getText());

		// Left click
		actions.doubleClick(cube).perform();
		cubeVal = driver.findElement(By.className("active"));
		System.out.println("Double Click: " + cubeVal.getText());
		

		// Right click
		actions.contextClick(cube).perform();
		cubeVal = driver.findElement(By.className("active"));
		System.out.println("Right Click: " + cubeVal.getText());
		
		//close the browser
		driver.close();		

	}

}
