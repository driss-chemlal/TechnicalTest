package utils;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import testCases.BaseTest;

public class ElementFetch {

	public WebElement getWebElement(String identifierType, String identifier) {
		switch (identifierType) {
		case "ID":
			return BaseTest.driver.findElement(By.id(identifier));
		case "XPATH":
			return BaseTest.driver.findElement(By.xpath(identifier));
		case "CSS":
			return BaseTest.driver.findElement(By.cssSelector(identifier));
		case "TAGNAME":
			return BaseTest.driver.findElement(By.tagName(identifier));
		default:
			return null;
		}
	}

	public List<WebElement> getListWebElements(String identifierType, String identifier) {
		switch (identifierType) {
		case "ID":
			return BaseTest.driver.findElements(By.id(identifier));
		case "XPATH":
			return BaseTest.driver.findElements(By.xpath(identifier));
		case "CSS":
			return BaseTest.driver.findElements(By.cssSelector(identifier));
		case "TAGNAME":
			return BaseTest.driver.findElements(By.tagName(identifier));
		default:
			return null;
		}
	}
}
