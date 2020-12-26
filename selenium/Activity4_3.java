/*
1. Create a Class and a main() method
2. Create a WebDriver instance, named driver, with the FirefoxDriver(). 
3. Open a browser with https://www.training-support.net/selenium/target-practice 
4. Get the title of the page using driver.getTitle() and print out the title.
5. Use findElement() with xpath() to 
	1. Find the third header on the page.
	2. Find the fifth header on the page and get it's 'colour' CSS Property.
	3. Find the violet button on the page and print all the class attribute values.
	4. Find the grey button on the page with Absolute XPath.
*/


package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4_3 {

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/target-practice");
		System.out.println("Title :"+ driver.getTitle());
		
		//Find the third header on the page
		String header = driver.findElement(By.xpath("//h3[@id='third-header']")).getText();
		System.out.println("Third Header:"+ header);
        
		//Find the fifth header and get it's colour
        String fifthHeaderColour = driver.findElement(By.xpath("//h5")).getCssValue("color");
        System.out.println("Fith header's colour is: " + fifthHeaderColour);
        
        //Find the violet button on the page and print all the class attribute values
        
       System.out.println("Violet class attributes:"+ driver.findElement(By.xpath("//button[contains(text(),'Violet')]")).getAttribute("class"));
       System.out.println("GreyClassAttributes :" + driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div/div/div[2]/div[3]/button[2]")).getAttribute("class"));
		
       driver.close();
		}

}
