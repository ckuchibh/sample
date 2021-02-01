/*	1. Navigate to https://www.training-support.net/selenium/popups 
	2. Print the title of the page.
	3. Find the Sign in button and hover over it. Print the tooltip message.
	4. Click the button to open the Sign in form.
	5. Enter the credentials 
		a. username: admin 
		b. password: password 
	6. Click login and print the message on the page after logging in.
	7. Finally, close the browser.*/

package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity12_3 {

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait(driver, 5);
		Actions builder = new Actions(driver);
		driver.get("https://www.training-support.net/selenium/popups");
		System.out.println(driver.getTitle());
		
		//Find Sign in button
		WebElement button = driver.findElement(By.xpath("//button[contains(@class, 'orange')]"));

		//Hover over button
		builder.moveToElement(button).pause(Duration.ofSeconds(1)).build().perform();
		String tooltipText = button.getAttribute("data-tooltip");
		System.out.println("Tooltip text: " + tooltipText);
		button.click();

		// Wait for modal to appear
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("signInModal")));
		
		//Find username and pasword and fill in the details
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.id("password")).sendKeys("password");
		driver.findElement(By.xpath("//button[text()='Log in']")).click();
		
		//Read the login message
		WebElement message = driver.findElement(By.id("action-confirmation"));
		message.getText();
		
		driver.close();

	}

}
