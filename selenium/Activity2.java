package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity2 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.training-support.net");
		String Title = driver.getTitle();
		System.out.println(Title);
		
		WebElement idLocator = driver.findElement(By.id("about-link"));
		System.out.println("Text in idLocator element:" + idLocator.getText());
		
        //Find the About Us link using className()
		
        WebElement classNameLocator = driver.findElement(By.className("green"));
        System.out.println("Text in classNameLocator element: " + classNameLocator.getText());
        
        //Find the About Us link using cssSelector()
	
        WebElement cssLocator = driver.findElement(By.cssSelector(".green"));
        System.out.println("Text in cssLocator element: " + cssLocator.getText());

        //Find the About Us link using linkText()
	
        WebElement linkTextLocator = driver.findElement(By.linkText("About Us"));
        System.out.println("Text in linkTextLocator element: " + linkTextLocator.getText());
        

        //Find the About Us link using partialLinkText()
	
        WebElement partialLinkTextLocator = driver.findElement(By.partialLinkText("About"));
        System.out.println("Text in partialLinkTextLocator element: " + partialLinkTextLocator.getText());

		driver.close();
	}

}
