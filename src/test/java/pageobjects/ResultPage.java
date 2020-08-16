package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import wrapperclasses.ActionItems;

public class ResultPage extends ActionItems{
	
	
	public ResultPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath="//*[@class='fltHpyOnwrdWrp']//*[@id='PRICE']")
	public WebElement depPriceSort;
	
	@FindBy (xpath="//*[@class='fltHpyRtrnWrp']//*[@id='PRICE']")
	public WebElement retPriceSort;
	
	@FindBy (xpath="//*[@class='fltHpyOnwrdWrp']//input[@type='radio']/following-sibling::label")
	public WebElement depRadio;
	
	@FindBy (xpath="//*[@class='fltHpyRtrnWrp']//input[@type='radio']/following-sibling::label")
	public WebElement retRadio;
	
	@FindBy (css ="input.button.fr.fltbook.fb.widthF105.quicks.fb")
	public WebElement book;
	
	public void sort() throws Exception {
		wait_Action(depPriceSort, 5);
		clickElement(depPriceSort);
		clickElement(retPriceSort);
	}
	
	public void selectFlight() throws Exception {

		clickElement(depRadio);
		clickElement(retRadio);
		
	}

	public void bookFlight() throws Exception {
		clickElement(book);
	}
}
