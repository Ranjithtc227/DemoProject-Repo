package testScript;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.ManageNewsPage;

public class ManageNewsTest extends Base{
	
	@Test
	
	public void verifyTheUserIsAbleToEnterTheNews()
	{
		String username="admin";
		String password="admin"; 
		String alertmsg="New Product Launched";
		
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterTheUserName(username);
		loginpage.enterThePassword(password);
		loginpage.clickTheSignInButton();
		
		
		ManageNewsPage managenewspage=new ManageNewsPage(driver);
		managenewspage.clickMoreInformation();
		managenewspage.clickNewButton();
		managenewspage.enterNewsInformation(alertmsg);
		managenewspage.saveNews();
		boolean alertmessage=managenewspage.displayAlertMessage();
		Assert.assertTrue(alertmessage);
		
	}
}
