package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class selenium_42 {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.training-support.net/selenium/simple-form");
		
		System.out.println("Tab Title :" + driver.getTitle());
		WebElement firstname = driver.findElement(By.xpath("//input[@id ='firstName']"));
		WebElement lastname = driver.findElement(By.xpath("//input[@id = 'lastName']"));
		WebElement email = driver.findElement(By.xpath("//input[@id = 'email']"));
		WebElement phonenum = driver.findElement(By.xpath("//input[@id = 'number']"));
		WebElement msg = driver.findElement(By.xpath("//textarea"));
		 
		firstname.sendKeys("Ramya");
		lastname.sendKeys("Chilukuri");
		email.sendKeys("ramychil@in.ibm.com");
		phonenum.sendKeys("123456789");
		msg.sendKeys("text.. to .. test");
		
		driver.close();
		
		

	}

}
