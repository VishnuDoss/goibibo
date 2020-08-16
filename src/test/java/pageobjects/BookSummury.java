package pageobjects;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import wrapperclasses.ActionItems;

public class BookSummury extends ActionItems{

	
	public BookSummury(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath="//input[@type='radio' and @id='risk-trip']/following-sibling::label")
	public WebElement riskTrip;
	
	@FindBy (id="Adulttitle1")
	public  WebElement title;
	
	@FindBy (id="AdultfirstName1")
	public  WebElement firstName;
	
	@FindBy (id="AdultlastName1")
	public  WebElement lastName;
	
	@FindBy (id="email")
	public  WebElement email;
	
	@FindBy (id="mobile")
	public  WebElement mobile;
	
	@FindBy (xpath="//*[contains(text(),'Proceed' )]")
	public WebElement proceed;
	
	@FindBy (xpath="//*[text()='Wallets']")
	public WebElement wallets;
	
	@FindBy (xpath="//*[text()='OK']")
	public WebElement ok;
	
	@FindBy (xpath="//*[contains(text(),'Proceed' )]")
	public WebElement proceedTo;
	
	Scanner sc= new Scanner(System.in);
	
	public void riskTrip() throws Exception {
		clickElement(riskTrip);
	}
	
	public void title() {
		System.out.println("Enter Title");
		selectDropdown(title, sc.nextLine());
	}
	
	public void firstName() throws Exception {
		System.out.println("Enter First Name");
		sendKeysElement(firstName, sc.nextLine());
	}
	
	public void lastName() throws Exception {
		System.out.println("Enter Last Name");
		sendKeysElement(lastName, sc.nextLine());
	}
	
	public void email() throws Exception {
		System.out.println("Enter Email");
		sendKeysElement(email, sc.nextLine());
	}
	public void mobile() throws Exception {
		System.out.println("Enter Mobile");
		sendKeysElement(mobile, sc.nextLine());
	}
	
	public void proceedToPay() throws Exception {
		clickElement(proceed);
	}
	
	public void ok() throws Exception {
		wait_Action(ok, 5);
		clickElement(ok);
	}
	
	public void proceedToFinal() throws Exception {
		wait_Action(proceedTo, 5);
		clickElement(proceedTo);
	}
	public void wallets() throws Exception {
		wait_Action(wallets, 10);
		clickElement(wallets);
	}
}
