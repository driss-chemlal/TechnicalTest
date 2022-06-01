package testCases;

import org.testng.annotations.Test;
import pageEvents.CartPageEvents;
import pageEvents.CheckoutPageEvents;
import pageEvents.HomePageEvents;
import pageEvents.ResultsPageEvents;

public class PurchaseTest extends BaseTest{

	@Test
	public void purchaseMethod() {
		
		HomePageEvents homePageEvents = new HomePageEvents();
		homePageEvents.enterItemToSearch();
		homePageEvents.clickOnSearchButton();
		
		ResultsPageEvents resultsPageEvents = new ResultsPageEvents();
		resultsPageEvents.selectFirstItem();
		
		CartPageEvents cartPageEvents = new CartPageEvents();
		cartPageEvents.clickOnAddCartButton();
		
		CheckoutPageEvents checkoutPageEvents = new CheckoutPageEvents();
		checkoutPageEvents.clickCheckOutButton();
	}
}
