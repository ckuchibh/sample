package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class JobBoardActivity4 {

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
	public void getSecondHeadingOfWebsite() {

		WebElement SecondHeading = driver.findElement(By.xpath("//h2"));
		String SecondHeadingURL = SecondHeading.getText();
		//String  expected ="Quia quis non";
		System.out.println("SecondHeading is  " + SecondHeadingURL);
		if (SecondHeadingURL.equals("Quia quis non"))
			{System.out.println(" Second heading is expected " +SecondHeadingURL+ "\n Closing the browser");
		driver.close();
		}
		else {System.out.println(" Sorry 2nd heading is not as expected");}

	}
}
