/*	1. Navigate to https://www.training-support.net/selenium/iframes 
	2. Print the title of the page
	3. Print the Heading of the 1st iframe.
	4. Print the Button Text and color of the button in that frame.
	5. Click th button in that frame.
	6. Print the new Button Text and color of the button.
	7. Repeat Steps 3-6 with the 2nd iframe.*/

package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity12_1 {

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/iframes");
		System.out.println(driver.getTitle());

		//Switch to first iFrame on the page
		driver.switchTo().frame(0);
		
		//Perform operation on the first frame
		WebElement frameHeading1 = driver.findElement(By.cssSelector("div.content"));
		System.out.println(frameHeading1.getText());

		//Click button in iFrame 1
		WebElement button1 = driver.findElement(By.cssSelector("button"));
		System.out.println("Button Text on 1st frame before: " + button1.getText());
		System.out.println("Button color on 1st frame before: " + button1.getCssValue("background-color"));
		button1.click();
		
		//Print New Button Info
		System.out.println("Button Text on 1st frame after: " + button1.getText());
		System.out.println("Button color on 1st frame after: " + button1.getCssValue("background-color"));

        //Switch back to parent page
        driver.switchTo().defaultContent();

        //Switch to second iFrame on the page
        driver.switchTo().frame(1);

        //Perform operation on the second frame
        WebElement frameHeading2 = driver.findElement(By.cssSelector("div.content"));
        System.out.println(frameHeading2.getText());
        
        //Click button in iFrame 2
		WebElement button2 = driver.findElement(By.cssSelector("button"));
		System.out.println("Button Text on 2nd frame before: " + button2.getText());
		System.out.println("Button color on 2nd frame before: " + button2.getCssValue("background-color"));
		button2.click();
		
		//Print New Button Info
		System.out.println("Button Text on 2nd frame after: " + button2.getText());
		System.out.println("Button color on 2nd frame after: " + button2.getCssValue("background-color"));

		driver.close();

	}

}


