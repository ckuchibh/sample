package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DriverAndWaitClass {

	static WebDriver driver=new FirefoxDriver();
    static WebDriverWait wait=new WebDriverWait(driver, 15);    
}
