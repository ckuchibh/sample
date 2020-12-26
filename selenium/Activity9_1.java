/*1. Create a Class and a main() method
2. Create a WebDriver instance, named driver, with the FirefoxDriver(). 
3. Open the browser with https://training-support.net/selenium/selects using the get() method.
4. Use findElement() to find the dropdown WebElement on the page.
5. Create a new Select class object with the WebElement.
6. On the dropdown, 
	1. Select the second option using selectByVisibleText() 
	2. Select the third option using selectByIndex() 
	3. Select the fourth option using selectByValue() 
	4. Finally, get all the options in the dropdown and print them one by one.*/


package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Activity9_1 {

	public static void main(String[] args) {
		
		//Open browser
		WebDriver driver = new FirefoxDriver();
		driver.get("https://training-support.net/selenium/selects");
		
        //Chosen option		
        WebElement chosen = driver.findElement(By.id("single-value"));
		
        //Find dropdwon
		Select dropdown = new Select(driver.findElement(By.id("single-select")));
		
		dropdown.selectByVisibleText("Option 2");
		System.out.println(chosen.getText());
		
		dropdown.selectByIndex(2);
		System.out.println(chosen.getText());
		
		dropdown.selectByValue("4");
		System.out.println(chosen.getText());		
		
		//Get all options
		List<WebElement> options = dropdown.getOptions();
		for(WebElement option:options)
		{
			System.out.println("Options are:" + option.getText());
		}
		
		//close browser
		driver.close();
	}

}
