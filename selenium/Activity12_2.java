/*	1. Navigate to https://www.training-support.net/selenium/nested-iframes 
	2. Print the title of the page.
	3. Traverse into the iframe that is on the page.
	4. Traverse into the first iframe in that frame.
	5. Print the heading of that frame.
	6. Navigate to the second iframe in that frame.
	7. Print the heading of that frame.*/

package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity12_2 {

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/nested-iframes");
		System.out.println(driver.getTitle());

		// Switch to first iFrame on the page
		driver.switchTo().frame(0);

		//Switch to first iFrame in that frame
		driver.switchTo().frame(0);

		// Perform operation on the first frame
		WebElement frameHeading1 = driver.findElement(By.cssSelector("div.content"));
		System.out.println(frameHeading1.getText());

        //Switch back to parent page		
        driver.switchTo().defaultContent();

        //Switch to first iFrame on the page	
        driver.switchTo().frame(0);

		//Switch to second iFrame in that frame
		driver.switchTo().frame(1);

		// Perform operation on the second frame
		WebElement frameHeading2 = driver.findElement(By.cssSelector("div.content"));
		System.out.println(frameHeading2.getText());

		driver.close();
	}

}
