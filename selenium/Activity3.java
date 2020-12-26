package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity3 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/simple-form");
		String Title = driver.getTitle();
		System.out.println(Title);
	
		WebElement firstName = driver.findElement(By.id("firstName"));
		firstName.sendKeys("Nith");;
		
		WebElement lastName = driver.findElement(By.id("lastName"));
		lastName.sendKeys("Vish");
		
		driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
		driver.findElement(By.id("number")).sendKeys("9016825698");
		driver.findElement(By.cssSelector(".ui.green.button")).click();
		driver.close();

		
	}

}
