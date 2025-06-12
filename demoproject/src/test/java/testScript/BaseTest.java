package testScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;


public class BaseTest {
  
	WebDriver driver;
	
	@BeforeMethod
	public void browserInitialisation()
    {
        driver=new ChromeDriver();
    	driver.get("https://groceryapp.uniqassosiates.com/admin");
    	driver.manage().window().maximize();
    	
    }
	
	
	//@AfterMethod
	public void driverQuit() {
		//driver.close();
    	driver.quit();
	}	
	
}
