package testScript;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.ManageNewsPage;
import utilities.ExcelUtility;

public class ManageNewsTest extends Base{
	
	@Test
	
	public void verifyTheUserIsAbleToEnterTheNews() throws IOException
	{
		//String username="admin";
		//String password="admin"; 
		//String news="New Offer Alert!Don't miss out!Flash sale ends soon.";
		
		String username=ExcelUtility.getStringData(1, 0,"loginpage");
		String password=ExcelUtility.getStringData(1, 1,"loginpage");
		String news=ExcelUtility.getStringData(1, 0,"managenews");
		
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterTheUserName(username);
		loginpage.enterThePassword(password);
		loginpage.clickTheSignInButton();
		
		
		ManageNewsPage managenewspage=new ManageNewsPage(driver);
		managenewspage.clickMoreInformation();
		managenewspage.clickNewButton();
		managenewspage.enterNewsInformation(news);
		managenewspage.saveNews();
		boolean alertmessage=managenewspage.displayAlertMessage();
		Assert.assertTrue(alertmessage);
		
	}
}
