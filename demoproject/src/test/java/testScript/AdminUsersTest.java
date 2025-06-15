package testScript;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AdminUsersPage;
import pages.LoginPage;
import utilities.ExcelUtility;

public class AdminUsersTest extends Base{
   
	@Test
	public void verifyTheUserIsAbleToCreateTheAdminUsers() throws IOException
	{
		        //String username="Ranjith";
				//String password="Ranjith@321"; 
				
		        String username=ExcelUtility.getStringData(1, 0, "loginpage");
		        String password=ExcelUtility.getStringData(1, 1, "loginpage");
		        
		        String user=ExcelUtility.getStringData(1, 0, "adminusers");
				String pass=ExcelUtility.getStringData(1, 1, "adminusers");
				
				LoginPage loginpage=new LoginPage(driver);
				loginpage.enterTheUserName(username);
				loginpage.enterThePassword(password);
				loginpage.clickTheSignInButton();
				
				AdminUsersPage adminuserspage=new AdminUsersPage(driver);
				adminuserspage.clickMoreInformationAdmin();
				adminuserspage.clickNewButton();
				adminuserspage.enterUserName(user);
				adminuserspage.enterPassword(pass);
				adminuserspage.selectUserType();
				adminuserspage.saveAdminUsers();
				boolean alertmsg=adminuserspage.displayAlertMessage();
				Assert.assertTrue(alertmsg);
	}
	
}
