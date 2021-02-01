	/*1.     Create a Class and a main() method
	2.     Create a WebDriver instance, named driver, with the FirefoxDriver().
	3.     Open a browser with https://www.training-support.net
	4.     Get the title of the page using driver.getTitle() and print out the title.
	5.     Use findElement() with xpath() to find and click the "About Us" link on the page.
	6.     Print the title of the new page that open when the link is clicked.
*/

package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4_1 {

	public static void main(String[] args) {
		//Create a new instance of the Firefox driver
		WebDriver driver = new FirefoxDriver();
		
		//And now use this to visit the website
		driver.get("https://www.training-support.net");
		
		//Get & Print the title of the page
		System.out.println(driver.getTitle());	
		
		//Find the "Get Started!" link and click it
		driver.findElement(By.xpath("//*[@id=\"about-link\"]")).click();
		
		//Print title of new page
		System.out.println("Page Heading is :" + driver.getTitle());
		
		//close the browser
		driver.close();
	}

}
