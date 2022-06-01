package pageEvents;

import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjects.CheckoutPageElements;
import testCases.BaseTest;
import utils.ElementFetch;

public class CheckoutPageEvents {

	WebDriverWait wait = new WebDriverWait(BaseTest.driver, Duration.ofSeconds(15));
	
	// Click CheckOut Action
	public void clickCheckOutButton() {
		ElementFetch elementFetch = new ElementFetch();
		BaseTest.logger.info("Clicking checkout button");
		wait.until(ExpectedConditions.visibilityOf(elementFetch.getWebElement("XPATH", CheckoutPageElements.checkOutButton)));
		elementFetch.getWebElement("XPATH", CheckoutPageElements.checkOutButton).click();
	}
}
