package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import wrapperclasses.ActionItems;
import wrapperclasses.BrowserInitiation;

public class HomePage extends ActionItems{
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (id="roundTrip")
	public  WebElement roundTrip;
	
	@FindBy (id="gosuggest_inputSrc")
	public  WebElement fromCity;
	
	@FindBy (id="gosuggest_inputDest")
	public  WebElement toCity;
	
	@FindBy (id="departureCalendar")
	public  WebElement departureCalendar;
	
	@FindBy (id="returnCalendar")
	public  WebElement returnCalendar;
	
	@FindBy (xpath="//div[@class='DayPicker-Day']/div[text()='28']")
	public  WebElement depDate;
	
	@FindBy (xpath="//div[@class='DayPicker-Day']/div[text()='30']")
	public  WebElement returnDate;
	
	@FindBy (id="gi_search_btn")
	public WebElement search;
	
	@FindBy (xpath="//*[@id='react-autosuggest-1-suggestion--0']")
	public WebElement suggestion;
	
	
	
	public void tripType() throws Exception {
		clickElement(roundTrip);
	}
	
	public void source() throws Exception {
		sendKeysElement(fromCity, "Delhi (DEL)");
		wait_Action(suggestion, 5);
		clickElement(suggestion);
		
	}
	
	public void destination() throws Exception {
		sendKeysElement(toCity, "Mumbai (BOM)");
		wait_Action(suggestion, 5);
		clickElement(suggestion);
	}
	
	public void depDate() throws Exception {
		clickElement(departureCalendar);
		clickElement(depDate);
	}

	public void returnDate() throws Exception {
		clickElement(returnCalendar);
		clickElement(returnDate);
	}
	
	public void search() throws Exception {
		clickElement(search);
	}
}
