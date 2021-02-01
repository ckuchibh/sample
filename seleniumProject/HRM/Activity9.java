/*Retrieve emergency contacts
Goal: Login and retrieve the emergency contacts for the user

	a.Open the OrangeHRM page and login with credentials provided.
	b.Navigate to the “My Info” page.
	c.Locate the left hand menu.
	d.Click on the “Emergency Contacts” menu item.
	e.Retrieve information about all the contacts listed in the table.
	f.Print all the information to the console.
	g.Close the browser.*/

package HRM;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity9 {

	WebDriver driver = new FirefoxDriver();
	WebDriverWait wait = new WebDriverWait(driver, 15);

	@BeforeClass
	public void openBrowser() {
		driver.get("http://alchemy.hguy.co/orangehrm");
	}

	@Test
	public void retrieveContact() throws InterruptedException {
		Reporter.log("Retrieve Emergency Contacts");
		driver.findElement(By.id("txtUsername")).sendKeys("orange");
		driver.findElement(By.id("txtPassword")).sendKeys("orangepassword123");
		driver.findElement(By.xpath("//*[@id=\'btnLogin\']")).click();

		// Goto My info
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@id='menu_pim_viewMyDetails']")));
		WebElement myInfo = driver.findElement(By.xpath("//a[@id='menu_pim_viewMyDetails']"));
		Thread.sleep(5000);
		myInfo.click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ul/li/a[text()='Emergency Contacts']")));
		driver.findElement(By.xpath("//ul/li/a[text()='Emergency Contacts']")).click();

		WebElement heading = driver.findElement(By.xpath("//table[@id='emgcontact_list']/thead/tr"));
		System.out.println(heading.getText());

		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='emgcontact_list']/tbody/tr"));

		for (int i = 1; i <= rows.size(); i++) {
			WebElement row = driver.findElement(By.xpath("//table[@id='emgcontact_list']/tbody/tr[" + i + "]"));
			System.out.println("Row" + i + ":" + row.getText());
		}

	}

	@AfterClass
	public void closeBrowser() {
		driver.close();
	}

}