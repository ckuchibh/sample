package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class JobBoardActivity5 {

	WebDriver driver;

	@BeforeMethod
	public void beforeMethod() throws Exception {
		// Create instance for Firefox
		System.setProperty("webdriver.gecko.driver",
				"C://Users//SubhashKumar//Downloads//Drivers//geckodriver-v0.29.0-win64//geckodriver.exe");
		driver = new FirefoxDriver();
		// Opening browser with https://alchemy.hguy.co/jobs/
		System.out.println("loading broswer....wait \n ");
		driver.get("https://alchemy.hguy.co/jobs/");
	}

	@Test
	public void getNavigationBar() {
		driver.navigate().to("https://alchemy.hguy.co/jobs/jobs/");
		driver.findElement(By.xpath("//*[@id=\'menu-item-24\']/a")).click();;
		String pageTitle= driver.getTitle();
		System.out.println(pageTitle+"\n ");
		if(pageTitle.equals("Jobs – Alchemy Jobs"))
				{
			System.out.println(" Yes Title of page is correct");
			driver.close();
				}
		else {
			System.out.println("Sorry- Page title was not as expected");
		}

	}
}
