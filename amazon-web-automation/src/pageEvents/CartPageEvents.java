package pageEvents;

import java.time.Duration;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjects.CartPageElements;
import testCases.BaseTest;
import utils.ElementFetch;

public class CartPageEvents {

	WebDriverWait wait = new WebDriverWait(BaseTest.driver, Duration.ofSeconds(15));
	
	// Click Add To Cart Button Action
	public void clickOnAddCartButton() {
		ElementFetch elementFetch = new ElementFetch();
		BaseTest.logger.info("Clicking add to cart button");
		wait.until(ExpectedConditions.visibilityOf(elementFetch.getWebElement("ID", CartPageElements.addToCartButton)));
		elementFetch.getWebElement("ID", CartPageElements.addToCartButton).click();
	}
}
