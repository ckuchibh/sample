/*1. Create a Package with a Class and a main() method
2. Create a WebDriver instance, named driver, with the FirefoxDriver(). 
3. Launch the web browser and open https://training-support.net/selenium/dynamic-controls using the get() method. 
4. Get the page title and print it to the console.
5. Use findElement() to find the text field.
6. Use the isEnabled() method to check if the text field is enabled.
7. Click the "Enable Input" button to enable the input field.
8. Use the isEnabled() method again and print the result.
*/
package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity5_3 {

	public static void main(String[] args) throws InterruptedException {

		/*WebDriver driver = new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/dynamic-controls");
		Thread.sleep(2000);
		System.out.println("Title:" + driver.getTitle());
		
		//Find the checkbox
		WebElement checkbox = driver.findElement(By.xpath("//input[@type='text']"));
		System.out.println("The checkbox is selected:" + checkbox.isEnabled());
		driver.findElement(By.id("toggleInput")).click();
		System.out.println("The checkbox is selected:" + checkbox.isEnabled());
		driver.close();*/
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/dynamic-controls");
		Thread.sleep(2000);
		System.out.println("Title:" + driver.getTitle());
		
		//Find the checkbox toggle button and click it
		driver.findElement(By.id("toggleCheckbox")).click();
		WebElement checkbox = driver.findElement(By.xpath("//input[@type='checkbox']"));
		System.out.println("Visibility of checkbox:" + checkbox.isDisplayed());
		WebDriverWait wait = new WebDriverWait (driver, 5);
		if(checkbox.isDisplayed()==false){
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//input[@type='checkbox']")));
			driver.findElement(By.id("toggleCheckbox")).click();	
		}	
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='checkbox']")));
		checkbox.click();
		driver.close();

	}

}
