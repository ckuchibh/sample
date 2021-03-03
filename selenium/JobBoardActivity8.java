package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class JobBoardActivity8 {

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
	public void Login() {
		// to Alchemy
		driver.navigate().to("https://alchemy.hguy.co/jobs/wp-admin");
		driver.findElement(By.xpath("//*[@id=\'user_login\']")).sendKeys("root");
		driver.findElement(By.xpath("//*[@id=\'user_pass\']")).sendKeys("pa$$w0rd");
		driver.findElement(By.xpath("//*[@id=\'wp-submit\']")).click();
		Boolean b= driver.findElement(By.xpath("//*[@id=\'wpbody-content\']/div[4]/h1")).isDisplayed();
		if(b)
		{	System.out.println("login success");
		driver.close();}

	}

}
