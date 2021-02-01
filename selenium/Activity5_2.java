/*	1. Create a Package with a Class and a main() method
	2. Create a WebDriver instance, named driver, with the FirefoxDriver(). 
	3. Launch the web browser and open https://training-support.net/selenium/dynamic-controls using the get() method. 
	4. Get the page title and print it to the console.
	5. Use findElement() to find the checkbox input element.
	6. Use the isSelected() method to check if the checkbox is selected.
	7. Click the checkbox to select it.
	8. Use the isSelected() method again and print the result.
*/

package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5_2 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/dynamic-controls");
		Thread.sleep(2000);
		System.out.println("Title:" + driver.getTitle());
		
		//Find the checkbox
		WebElement checkbox = driver.findElement(By.xpath("//input[@type='checkbox']"));
		System.out.println("The checkbox is selected:" + checkbox.isSelected());
		checkbox.click();
		System.out.println("The checkbox is selected:" + checkbox.isSelected());
		driver.close();
	}

}
