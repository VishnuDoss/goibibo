package wrapperclasses;
import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.NoSuchElementException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.Assertion;


public class ActionItems {



	
public  void clickElement(WebElement element) throws Exception 
		{
			try{
				element.click();
				System.out.println(element+" is clicked");
			}
			catch(NoSuchElementException exception) {
				
				System.out.println(element+" is not present");
				
			}
			catch(ElementNotVisibleException exception)
			{
				System.out.println(element+" is not visible");
				
			}
			catch(WebDriverException exception)
			{
				System.out.println("Webdriver Exception "+ element);
				
			}
		}

public  void sendKeysElement(WebElement element, String data) throws Exception 
		{
			try{
				element.sendKeys(data);
				System.out.println(element+" is enterd");
				
			}
			catch(NoSuchElementException exception) {
				
				System.out.println(element+" is not enterd");
				
			}
			catch(ElementNotVisibleException exception)
			{
				System.out.println(element+" is not enterd");
			
			}
			catch(WebDriverException exception)
			{
				System.out.println("Webdriver Exception "+ element);
			
			}
			
		}

public  void verifyEnabled(WebElement element) throws Exception 
{
	try{
		Assert.assertEquals(!element.isEnabled(), false);
		System.out.println(element+" is not Enabled");
	
	}
	catch(AssertionError exeception)
	{
		System.out.println("Assertion Error");
	}
	catch(NoSuchElementException exception) {
		
		System.out.println(element+" is Enabled");
		
		
	}
	catch(ElementNotVisibleException exception)
	{
		System.out.println(element+" Enabled");
	
	}
	catch(WebDriverException exception)
	{
		System.out.println("Webdriver Exception "+ element);

	}
}

public void selectDropdown(WebElement element, String text) {
	Select dropdown= new Select(element);
	dropdown.selectByVisibleText(text);
	}	

public void wait_Action(WebElement element, int seconds) {
	        new WebDriverWait(BrowserInitiation.driver, seconds).until(ExpectedConditions.visibilityOf(element)).isDisplayed();
	    }
}
