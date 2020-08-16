package testcases;

import org.testng.annotations.Test;

import pageobjects.BookSummury;
import pageobjects.HomePage;
import pageobjects.ResultPage;
import wrapperclasses.BrowserInitiation;

public class Booking extends BrowserInitiation {
	
	
	@Test
	public void bookingTicket() throws Exception  {
		
		HomePage homePage= new HomePage(driver);
		ResultPage resultPage=new ResultPage(driver);
		BookSummury bookingSummury=new BookSummury(driver);
		homePage.tripType();
		homePage.source();
		homePage.destination();
		homePage.depDate();
		homePage.returnDate();
		homePage.search();
		//resultPage.sort();
		resultPage.selectFlight();
		resultPage.bookFlight();
		bookingSummury.riskTrip();
		bookingSummury.title();
		bookingSummury.firstName();
		bookingSummury.lastName();
		bookingSummury.email();
		bookingSummury.mobile();
		bookingSummury.proceedToPay();
		bookingSummury.ok();
		bookingSummury.proceedToFinal();
		bookingSummury.wallets();
		
		
	}

}
