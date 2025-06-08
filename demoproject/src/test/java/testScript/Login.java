package testScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Login extends Base{
	
	@Test
	public void login()
	{
		String username="admin";
		String password="admin";
		
		driver.navigate().to("https://groceryapp.uniqassosiates.com/admin");
		WebElement uname=driver.findElement(By.xpath("//input[@placeholder='Username']"));
		uname.sendKeys(username);
		
		WebElement pword=driver.findElement(By.xpath("//input[@placeholder='Password']"));
		pword.sendKeys(password);
		
		WebElement signin=driver.findElement(By.xpath("//button[@type='submit']"));
		signin.click();
		
		WebElement dashboard=driver.findElement(By.xpath("//p[text()='Dashboard']"));
		boolean displayed=dashboard.isDisplayed();
		Assert.assertTrue(displayed, "Home Page not Loaded");
	}
	@Test
	public void invalidUsername()
	{
		String username="Admi";
		String password="admin";
		
		driver.navigate().to("https://groceryapp.uniqassosiates.com/admin");
		WebElement uname=driver.findElement(By.xpath("//input[@placeholder='Username']"));
		uname.sendKeys(username);
		
		WebElement pword=driver.findElement(By.xpath("//input[@placeholder='Password']"));
		pword.sendKeys(password);
		
		WebElement signin=driver.findElement(By.xpath("//button[@type='submit']"));
		signin.click();
		
		WebElement alertmsg=driver.findElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']"));
		boolean alert=alertmsg.isDisplayed();
		Assert.assertTrue(alert, "Home Page Not Loaded");
	}
	
	@Test
	public void invalidPassword()
	{
		String username="admin";
		String password="Adminn";
		
		driver.navigate().to("https://groceryapp.uniqassosiates.com/admin");
		WebElement uname=driver.findElement(By.xpath("//input[@placeholder='Username']"));
		uname.sendKeys(username);
		
		WebElement pword=driver.findElement(By.xpath("//input[@placeholder='Password']"));
		pword.sendKeys(password);
		
		WebElement signin=driver.findElement(By.xpath("//button[@type='submit']"));
		signin.click();
		
		WebElement alertmsg=driver.findElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']"));
		boolean alert=alertmsg.isDisplayed();
		Assert.assertTrue(alert, "Home Page Not Loaded");
	}
	@Test
	public void invalidUsernameInvalidPassword()
	{
		String username="Admi";
		String password="adminnn";
		
		driver.navigate().to("https://groceryapp.uniqassosiates.com/admin");
		WebElement uname=driver.findElement(By.xpath("//input[@placeholder='Username']"));
		uname.sendKeys(username);
		
		WebElement pword=driver.findElement(By.xpath("//input[@placeholder='Password']"));
		pword.sendKeys(password);
		
		WebElement signin=driver.findElement(By.xpath("//button[@type='submit']"));
		signin.click();
		
		WebElement alertmsg=driver.findElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']"));
		boolean alert=alertmsg.isDisplayed();
		Assert.assertTrue(alert, "Home Page Not Loaded");
	}
}
