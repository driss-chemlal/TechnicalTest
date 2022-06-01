package pageEvents;

import java.time.Duration;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjects.ResultsPageElements;
import testCases.BaseTest;
import utils.ElementFetch;

public class ResultsPageEvents {
	
	WebDriverWait wait = new WebDriverWait(BaseTest.driver, Duration.ofSeconds(15));
	
	// Select First Item Action
	public void selectFirstItem() {
		ElementFetch elementFetch = new ElementFetch();
		BaseTest.logger.info("Selecting first item from the results");
		wait.until(ExpectedConditions.visibilityOf(elementFetch.getWebElement("XPATH", ResultsPageElements.firstElement)));
		elementFetch.getWebElement("XPATH", ResultsPageElements.firstElement).click();
	}
}
