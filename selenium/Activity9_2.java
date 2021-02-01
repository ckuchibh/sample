/*1. Create a Class and a main() method
2. Create a WebDriver instance, named driver, with the FirefoxDriver(). 
3. Open the browser with https://training-support.net/selenium/selects using the get() method.
4. Use findElement() to find the multi-select WebElement on the page.
5. Create a new Select class object with the WebElement.
6. Check if the HTML element is a multi-list. Proceed with other actions if it is.
7. Select the 'JavaScript' option by visible text.
8. Select the 'NodeJS' option by value.
9. Select the 4th, 5th, and the 6th options by index.
10. Deselect the 'NodeJS' option by value attribute.
11. Deselect the 7th option by index.
12. Print the first selected option.
13. Print all selected options one by one and deselect all options.*/

package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Activity9_2 {

	public static void main(String[] args) throws InterruptedException {

		// Open browser
		WebDriver driver = new FirefoxDriver();
		driver.get("https://training-support.net/selenium/selects");
		Thread.sleep(2000);
		
        //Find MultiList option
		Select multiList = new Select(driver.findElement(By.id("multi-select")));
			
        //Chosen option		
		WebElement chosen = driver.findElement(By.id("multi-value"));
		
		
		if(multiList.isMultiple()){
			
			//Select 'JavaScript' by Visible text
			multiList.selectByVisibleText("Javascript");
			System.out.println("JavaScript is selected");
			
			////Select 'NodeJS' by Visible text
			multiList.selectByValue("node");
			System.out.println("NodeJS is selected");
			
			//Select 4,5, and 6 options by index
			for(int i=4;i<=6;i++){
				multiList.selectByIndex(i);
			}
			System.out.println(chosen.getText());
			
			//Deselect 'NodeJS' by value
			multiList.deselectByValue("node");
			System.out.println("NodeJS is deselected");
			
			//Deselect 7th opttion by index
			multiList.deselectByIndex(7);
			System.out.println(chosen.getText());
			
            //Get all selected options			
            List<WebElement> selectedOptions = multiList.getAllSelectedOptions();	
            //Print all selected options	
            for(WebElement selectedOption : selectedOptions) {	
                System.out.println("Selected option: " + selectedOption.getText());	
            }
			
			//deselect all options
			multiList.deselectAll();
			System.out.println(chosen.getText());
			
			//close browser
			driver.close();
			
		}
			
	}

}
