package utilities;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitUtility 
{
	public static final int EXPLICIT_WAIT = 50;
	public static final int IMPLICIT_WAIT = 30;
	

	public void waitForElementToBeClickable(WebDriver driver,WebElement element) {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(EXPLICIT_WAIT));
	    wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	
	public void waitForAlert(WebDriver driver,WebElement element)
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(EXPLICIT_WAIT));
	    wait.until(ExpectedConditions.alertIsPresent());
	}
	
	public void waitForVisibilityOfAllElements(WebDriver driver,WebElement element)
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(EXPLICIT_WAIT));
	    wait.until(ExpectedConditions.visibilityOfAllElements(element));
	}
	
	public void waitForAttributeContains(WebDriver driver,WebElement element)
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(EXPLICIT_WAIT));
	    wait.until(ExpectedConditions.attributeContains(element, null, null));
	}
	
	
}
