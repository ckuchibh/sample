/*	1. Create a Class and a main() method
	2.     Create a WebDriver instance, named driver, with the FirefoxDriver().
	3.     Open a browser with https://www.training-support.net/selenium/simple-form
	4.     Get the title of the page using driver.getTitle() and print out the title.
	5.     Use findElement() with xpath() to find all the input fields on the page.
	6.     Fill in the details in the fields using the sendKeys() method.
	7.     Click the submit button at the end of the form to submit the form.
*/

package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4_2 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/simple-form");
		String Title = driver.getTitle();
		System.out.println(Title);
	
		WebElement firstName = driver.findElement(By.xpath("//*[@id='firstName']"));
		firstName.sendKeys("Nithya");;
		
		WebElement lastName = driver.findElement(By.xpath("//*[@id='lastName']"));
		lastName.sendKeys("Vishnu");
		
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("abc@gmail.com");
		driver.findElement(By.xpath("//*[@id='number']")).sendKeys("9683246924");
		driver.findElement(By.xpath("//textarea")).sendKeys("My message");
		driver.findElement(By.xpath("//input[contains(@class, 'green')]")).click();
	}
}
