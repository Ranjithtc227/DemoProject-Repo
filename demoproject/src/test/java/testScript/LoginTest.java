package testScript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;
import utilities.ExcelUtility;

public class LoginTest extends Base {
     
	@Test(retryAnalyzer=retry.Retry.class,groups= {"Regression"})  /*Retry mechanism is used for re-execute failed test cases */
	 public void verifyTheUserIsAbleToLoginUsingValidCredentials() throws IOException
	 {
		//String username="admin";
		//String password="admin"; 
	    
		String username=ExcelUtility.getStringData(1, 0, "loginpage");
		String password=ExcelUtility.getStringData(1, 1, "loginpage");
		
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterTheUserName(username);
		loginpage.enterThePassword(password);
		loginpage.clickTheSignInButton();
		boolean dashboardloaded=loginpage.isDashBoardDisplayed();
		Assert.assertTrue(dashboardloaded);
		
	 }
	@Test
	public void verifyTheUserIsAbleToLoginUsingValidUsername_InvalidPassword() throws IOException
	 {
		//String username="admin";
		//String password="adm"; 
	     
		String username=ExcelUtility.getStringData(2, 0, "loginpage");
		String password=ExcelUtility.getStringData(2, 1, "loginpage");
		
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterTheUserName(username);
		loginpage.enterThePassword(password);
		loginpage.clickTheSignInButton();
		boolean alert=loginpage.isAlertMessageDisplayed();
		Assert.assertTrue(alert, "Home Page Not Loaded");
		
	 }
	@Test
	public void verifyTheUserIsAbleToLoginUsingInalidUsername_validPassword() throws IOException
	 {
		//String username="adm";
		//String password="admin"; 
	
		String username=ExcelUtility.getStringData(3, 0, "loginpage");
		String password=ExcelUtility.getStringData(3, 1, "loginpage");
		
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterTheUserName(username);
		loginpage.enterThePassword(password);
		loginpage.clickTheSignInButton();
		boolean alert=loginpage.isAlertMessageDisplayed();
		Assert.assertTrue(alert, "Home Page Not Loaded");
		
	 }
	@Test
	public void verifyTheUserIsAbleToLoginUsingInvalidUsername_InvalidPassword() throws IOException
	 {
		//String username="adm";
		//String password="adm"; 
	
		String username=ExcelUtility.getStringData(4, 0, "loginpage");
		String password=ExcelUtility.getStringData(4, 1, "loginpage");
		
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterTheUserName(username);
		loginpage.enterThePassword(password);
		loginpage.clickTheSignInButton();
		boolean alert=loginpage.isAlertMessageDisplayed();
		Assert.assertTrue(alert, "Home Page Not Loaded");
		
	 }
}
