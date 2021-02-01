/*    Create a Class and a main() method
    Create a WebDriver instance, named driver, with the FirefoxDriver().
    Open a browser with https://training-support.net/selenium/dynamic-attributes
    Get the title of the page using driver.getTitle() and print out the title.
    Find the input fields of the Sign Up form. Fill in the details in the fields with your own data.
    Wait for success message to appear and print it to the console.
    Finally, close the browser.*/

package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity7_2 {

	public static void main(String[] args) {

WebDriver driver = new FirefoxDriver();
		
		////open browser
		driver.get("https://training-support.net/selenium/dynamic-attributes");
		System.out.println("Title of the page is: " + driver.getTitle());
		
		//Find username and password fields
		WebElement username = driver.findElement(By.xpath("//input[contains(@class,'-username')]"));
		WebElement password = driver.findElement(By.xpath("//input[contains(@class,'-password')]"));
        WebElement confirmPassword = driver.findElement(By.xpath("//label[text() = 'Confirm Password']/following::input"));	
        WebElement email = driver.findElement(By.xpath("//label[contains(text(), 'mail')]/following-sibling::input"));
		
		 //Type credentials
		username.sendKeys("Nithya");
		password.sendKeys("Vishnu");
		confirmPassword.sendKeys("Vishnu");
		email.sendKeys("abc@gmail.com");
		
		//Click Log in
		driver.findElement(By.xpath("//button[contains(text(), 'Sign Up')]")).click();
		
        //Print login message
        String loginMessage = driver.findElement(By.id("action-confirmation")).getText();	
        System.out.println("Login message: " + loginMessage);

        //Close browser
        driver.close();
	}

}
