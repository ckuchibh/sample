package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class selenium_41 {
	
	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.training-support.net");
		
		System.out.println(driver.getTitle());
		
		driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[2]/a")).click();
		
		System.out.println("New Page Heading :"+ driver.getTitle());
		
		driver.close();
		
	}

}
