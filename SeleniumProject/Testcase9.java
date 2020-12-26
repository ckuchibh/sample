package SeleniumProject;

import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

public class Testcase9 {
  
	WebDriver driver;
	
	@BeforeClass
	public void beforeclass()
	{
		driver = new FirefoxDriver();
		driver.get("http://alchemy.hguy.co:8080/orangehrm/symfony/web/index.php/auth/login");
	}
	@Test
	public void testcase9()
	{
		//login to the url
		WebElement username = driver.findElement(By.id("txtUsername"));
		WebElement password = driver.findElement(By.id("txtPassword"));
		username.sendKeys("orange");
		password.sendKeys("orangepassword123");
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		
		//Navigate to the “My Info” page
		WebElement myinfotab=driver.findElement(By.xpath("//b[contains(text(),'My Info')]"));
        myinfotab.click();
        driver.findElement(By.xpath("//b[contains(text(),'My Info')]")).click();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated((By.id("sidenav")))) ;
        driver.findElement(By.xpath("//a[contains(text(),'Emergency Contacts')]")).click();
        driver.findElement(By.xpath("//a[contains(text(),'Emergency Contacts')]")).click();
        List<WebElement> rows = driver.findElements(By.xpath("//table[@id='emgcontact_list']/tbody/tr"));
        List<WebElement> cols= driver.findElements(By.xpath("//table[@id='emgcontact_list']/tbody/tr[1]/td"));
       
        System.out.println(cols.size());
        System.out.println(rows.size());
       
      //divided xpath In three parts to pass Row_count and Col_count values.
        String first_part = "//table[@id='emgcontact_list']/tbody/tr[";
        String second_part = "]/td[";
        String third_part = "]";
       
        //Used for loop for number of rows.
        for (int i=1; i<=rows.size(); i++){
         //Used for loop for number of columns.
         for(int j=1; j<=cols.size(); j++){
          //Prepared final xpath of specific cell as per values of i and j.
          String final_xpath = first_part+i+second_part+j+third_part;
          //Will retrieve value from located cell and print It.
          String Table_data = driver.findElement(By.xpath(final_xpath)).getText();
          System.out.print(Table_data +"  ");
         }
          System.out.println("");
          System.out.println("");
        }
		
		
			
				
	}
	@AfterClass
	public void afterclass()
	{
		driver.close();
	}
}
