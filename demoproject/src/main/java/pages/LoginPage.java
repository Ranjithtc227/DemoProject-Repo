package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage{
	
	//globally declared the variable 'driver' because the driver in constructor is local,and to get the access in entire class
	public WebDriver driver;    
	
	@FindBy(xpath="//input[@placeholder='Username']")WebElement uname;
	@FindBy(xpath="//input[@placeholder='Password']")WebElement pword;
	@FindBy(xpath="//button[@type='submit']")WebElement signin;
	@FindBy(xpath="//p[text()='Dashboard']")WebElement dashboard;
	@FindBy(xpath="//div[@class='alert alert-danger alert-dismissible']")WebElement alertmsg;
	
	                  // Here 'driver' is local variable
	public LoginPage(WebDriver driver)    
	{
		this.driver=driver;    // Assigned local driver with global driver using 'this' keyword 
		PageFactory.initElements(driver, this);   //The method  'initElements' is used for initializing WebElements,PageFactory is a class
	}
	
	public void enterTheUserName(String username)
	{
		uname.sendKeys(username);
	}
	
	public void enterThePassword(String password)
	{
		pword.sendKeys(password);
	}
	
	public void clickTheSignInButton()
	{
		signin.click();
	}
	
	public boolean isDashBoardDisplayed()
	{
		return dashboard.isDisplayed();
	}
	
	public boolean isAlertMessageDisplayed()
	{
		return alertmsg.isDisplayed();
	}
}
