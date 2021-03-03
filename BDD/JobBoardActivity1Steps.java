package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class JobBoardActivity1Steps {
	
	WebDriver driver;
    WebDriverWait wait;

	@Given("^User is on alchemy login Page$")
	public void userIsOnAlchemyPage() throws Throwable {
       
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\SubhashKumar\\Downloads\\Drivers\\geckodriver-v0.29.0-win64\\geckodriver.exe");
        //Create a new instance of the Firefox driver
        driver = new FirefoxDriver();
        wait = new WebDriverWait(driver, 15);
                
        //Open the browser
        driver.get("https://alchemy.hguy.co/jobs/wp-admin");}

	@When("^User logged in$")
	 public void userLoggedIn() throws Throwable {
        driver.findElement(By.xpath("//*[@id=\'user_login\']")).sendKeys("root");
        driver.findElement(By.xpath("//*[@id='user_pass']")).sendKeys("pa$$w0rd");
        driver.findElement(By.xpath("//*[@id=\'wp-submit\']")).click();
	}
	@Then("^User clicked the menu item that says Users$")
	 public void clickOnUsers() throws Throwable {
       driver.findElement(By.xpath("//*[@id=\'menu-users\']/a/div[3]")).click();
	}
	
	@Given("^User click Add New button$")
	public void userClickedOnAddNew() throws Throwable{
		driver.findElement(By.xpath("//*[@id=\'wpbody-content\']/div[4]/a")).click();
	}
	
	@When("^User fill in the necessary details$")
	public void fillDetails() throws Throwable{
		
		driver.findElement(By.xpath("//*[@id=\'user_login\']")).sendKeys("sk0880077");
		driver.findElement(By.xpath("//*[@id=\'email\']")).sendKeys("sk0007788@gmail.com");
		driver.findElement(By.xpath("//*[@id=\'first_name']")).sendKeys("sk000h778");
		driver.findElement(By.xpath("//*[@id=\'last_name\']")).sendKeys("sk00078");
		driver.findElement(By.xpath("//*[@id=\'url\']")).sendKeys("sk0007.com");
		driver.findElement(By.xpath("//*[@id='createuser']/table/tbody/tr[6]/td/button")).click();
		driver.findElement(By.xpath("//*[@id=\'pass1\']")).clear();
		driver.findElement(By.xpath("//*[@id=\'pass1\']")).sendKeys("1323S456789asdfg");
		driver.findElement(By.xpath("//*[@id=\'createuser\']/table/tbody/tr[8]/td/label")).click();
		driver.findElement(By.xpath("//*[@id=\'createusersub\']")).click();
		
	}
		@Then("^Verify that the user was created$")
		public void userCreated() throws Throwable{
			
			Boolean iselementpresent = driver.findElement(By.xpath("//*[@id=\'message\']/p")).isDisplayed();
			if(iselementpresent)
			{
				System.out.println("User Added");
			}
			
	}
	
	@And("^Close the Browser$")
	public void closeTheBrowser() throws Throwable {
        driver.close();

	}
}



