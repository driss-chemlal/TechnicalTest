package utils;

import java.io.File;

public interface Constants {

	String url = "https://www.amazon.com/";
	String chromeWebdriver = "webdriver.chrome.driver";
	String firefoxWebdriver = "webdriver.gecko.driver";
	String chromeDriverPath = System.getProperty("user.dir") + File.separator + "drivers" + File.separator + "chromedriver.exe";
	String firefoxDriverPath = System.getProperty("user.dir") + File.separator + "drivers" + File.separator + "geckodriver.exe";
	String automationReportPath = System.getProperty("user.dir") + File.separator + "reports" + File.separator + "AutomationReport.html";
	String excelDataPath = System.getProperty("user.dir") + File.separator + "data" + File.separator + "data.xlsx";
	String screenShotsPath = System.getProperty("user.dir") + File.separator + "screenshots" + File.separator;
	String excelSheetName = "data";
}
