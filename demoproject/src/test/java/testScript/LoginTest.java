package testScript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;
import utilities.ExcelUtility;

public class LoginTest extends Base {
     
	@Test
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
	public void verifyTheUserIsAbleToLoginUsingValidUsername_InvalidPassword()
	 {
		String username="admin";
		String password="adm"; 
	     
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterTheUserName(username);
		loginpage.enterThePassword(password);
		loginpage.clickTheSignInButton();
		boolean alert=loginpage.isAlertMessageDisplayed();
		Assert.assertTrue(alert, "Home Page Not Loaded");
		
	 }
	@Test
	public void verifyTheUserIsAbleToLoginUsingInalidUsername_validPassword()
	 {
		String username="adm";
		String password="admin"; 
	
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterTheUserName(username);
		loginpage.enterThePassword(password);
		loginpage.clickTheSignInButton();
		boolean alert=loginpage.isAlertMessageDisplayed();
		Assert.assertTrue(alert, "Home Page Not Loaded");
		
	 }
	@Test
	public void verifyTheUserIsAbleToLoginUsingInvalidUsername_InvalidPassword()
	 {
		String username="adm";
		String password="adm"; 
	
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterTheUserName(username);
		loginpage.enterThePassword(password);
		loginpage.clickTheSignInButton();
		boolean alert=loginpage.isAlertMessageDisplayed();
		Assert.assertTrue(alert, "Home Page Not Loaded");
		
	 }
}
