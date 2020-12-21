package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class selenium_3 {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		 driver.get("https://training-support.net/selenium/simple-form");
		  
		 System.out.println("Webpage Title :" + driver.getTitle());
		 
		 WebElement firstname = driver.findElement(By.id("firstName"));
		 WebElement lastname = driver.findElement(By.id("lastName"));
		 
		 firstname.sendKeys("Ramya");
		 lastname.sendKeys("Chilukuri");
		 
		 driver.findElement(By.id("email")).sendKeys("ramychil@in.ibm.com");
		 driver.findElement(By.id("number")).sendKeys("8699730012");
		 
		 driver.findElement(By.className("green")).click();
		 
		 //driver.switchTo().alert().accept();
		 
		 driver.close();

	}

}
