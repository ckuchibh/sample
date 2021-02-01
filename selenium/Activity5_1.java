/*1. Create a Package with a Class and a main() method
2. Create a WebDriver instance, named driver, with the FirefoxDriver(). 
3. Launch the web browser and open https://training-support.net/selenium/dynamic-controls using the get() method. 
4. Get the page title and print it to the console.
5. Use findElement() to find the check box input element.
6. Use the isDisplayed() method to check if it is visible on the page.
7. Click the "Remove Check box".
8. Print the result of the isDisplayed() method again.
*/


package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5_1 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/dynamic-controls");
		System.out.println("Title:" + driver.getTitle());
		
		//Find the checkbox
		WebElement checkbox = driver.findElement(By.xpath("//input[@type='checkbox']"));
		System.out.println("Checkbox is displayed" + checkbox.isDisplayed());
		
		driver.findElement(By.xpath("//button[@id='toggleCheckbox']")).click();;
		System.out.println("Checkbox is displayed" + checkbox.isDisplayed());		
		
       driver.close();
	}
	

}
