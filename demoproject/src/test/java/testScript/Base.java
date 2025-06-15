package testScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class Base {

	WebDriver driver;
	
	@Parameters("browser")
	@BeforeMethod
	public void browserInitialisation(String browser) throws Exception
    {
        //driver=new ChromeDriver();
		if(browser.equalsIgnoreCase("chrome"))
		{
			driver=new ChromeDriver();
	
		}
		else if(browser.equalsIgnoreCase("edge"))
		{
			driver=new EdgeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			driver=new FirefoxDriver();
		}
		else
		{
			throw new Exception("Invalid");
		}
    	driver.get("https://groceryapp.uniqassosiates.com/admin");
    	driver.manage().window().maximize();
    	
    }
	
	
	@AfterMethod
	public void driverQuit() {
		//driver.close();
    	driver.quit();
	}	
	
}
