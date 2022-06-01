package pageEvents;

import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjects.HomePageElements;
import testCases.BaseTest;
import utils.ElementFetch;
import utils.ExcelUtils;

public class HomePageEvents {

	WebDriverWait wait = new WebDriverWait(BaseTest.driver, Duration.ofSeconds(15));
	
	// Enter Item to Search Action
	public void enterItemToSearch() {
		ElementFetch elementFetch = new ElementFetch();
		ExcelUtils excelUtils = new ExcelUtils();
		String item = excelUtils.getCellDataString(1, 0);
		BaseTest.logger.info("Entering product item");
		wait.until(ExpectedConditions.visibilityOf(elementFetch.getWebElement("ID", HomePageElements.searchTextbox)));
		elementFetch.getWebElement("ID", HomePageElements.searchTextbox).sendKeys(item);
	}

	// Click Search Button Action
	public void clickOnSearchButton() {
		ElementFetch elementFetch = new ElementFetch();
		BaseTest.logger.info("Clicking on search button");
		wait.until(ExpectedConditions.visibilityOf(elementFetch.getWebElement("ID", HomePageElements.searchButton)));
		elementFetch.getWebElement("ID", HomePageElements.searchButton).click();
	}
}
