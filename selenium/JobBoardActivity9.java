package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class JobBoardActivity9 {

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
	public void Login() throws InterruptedException {
		// to Alchemy
		driver.navigate().to("https://alchemy.hguy.co/jobs/wp-admin");
		driver.findElement(By.xpath("//*[@id=\'user_login\']")).sendKeys("root");
		driver.findElement(By.xpath("//*[@id=\'user_pass\']")).sendKeys("pa$$w0rd");
		driver.findElement(By.xpath("//*[@id=\'wp-submit\']")).click();
		Boolean b= driver.findElement(By.xpath("//*[@id=\'wpbody-content\']/div[4]/h1")).isDisplayed();
		if(b)
		{	System.out.println("login success");
		
		driver.findElement(By.xpath("//*[@id=\'menu-posts-job_listing\']/a/div[3]")).click();
		driver.findElement(By.xpath("//*[@id=\'wpbody-content\']/div[4]/a")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\'post-title-0\']")).sendKeys("Batch6");
		driver.findElement(By.xpath("//*[@id=\'_job_location\']")).sendKeys("London");
		driver.findElement(By.xpath("//*[@id=\'_company_name\']")).sendKeys("ABC");
		driver.findElement(By.xpath("//*[@id=\'_company_website\']")).sendKeys("DEF@h.com");
		driver.findElement(By.xpath("//*[@id=\'_company_tagline\']")).sendKeys("tagline is thissss");
		driver.findElement(By.xpath("//*[@id=\'_filled\']")).click();
		driver.findElement(By.xpath("//*[@id=\'editor\']/div/div/div[1]/div/div[1]/div/div[2]/button[2]")).click();
		driver.findElement(By.xpath("//*[@id=\'editor\']/div/div/div[1]/div/div[2]/div[3]/div/div/div/div[1]/div/button")).click();
				
		
		//driver.close();
		
		
		}

	}

}
