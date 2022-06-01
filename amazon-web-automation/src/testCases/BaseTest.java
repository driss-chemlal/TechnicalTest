package testCases;

import java.lang.reflect.Method;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.Markup;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import utils.Constants;

public class BaseTest {

	public static WebDriver driver;
	public ExtentSparkReporter htmlReporter;
	public static ExtentReports extent;
	public static ExtentTest logger;
	
	@BeforeTest
	public void setuUp() {
		htmlReporter = new ExtentSparkReporter(Constants.automationReportPath);
		htmlReporter.config().setEncoding("utf-8");
		htmlReporter.config().setDocumentTitle("Automation Report");
		htmlReporter.config().setReportName("Automation Test Results");
		htmlReporter.config().setTheme(Theme.DARK);
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		extent.setSystemInfo("Automation Tester", "Driss Chemlal");
	}

	@BeforeMethod
	@Parameters(value = {"browserName"})
	public void beforeMethod(String browserName, Method testMethod) {
		logger = extent.createTest(testMethod.getName());
		// initializing driver variable
		setupDriver(browserName);
		// maximized the browser window
		driver.manage().window().maximize();
		// launching amazon.com on the browser
		driver.get(Constants.url);
		// implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@AfterMethod
	public void afterMethod(ITestResult result) {
		if (result.getStatus() == ITestResult.SUCCESS) {
			String methodName = result.getMethod().getMethodName();
			String logText = "Test Case:" + methodName + " Passed";
			Markup markup = MarkupHelper.createLabel(logText, ExtentColor.GREEN);
			logger.log(Status.PASS, markup);
		} else if (result.getStatus() == ITestResult.FAILURE){
			String methodName = result.getMethod().getMethodName();
			String logText = "Test Case:" + methodName + " Failed";
			Markup markup = MarkupHelper.createLabel(logText, ExtentColor.RED);
			logger.log(Status.FAIL, markup);
		}
		// closes all the browser windows opened by web driver
		driver.quit();
	}

	@AfterTest
	public void tearDown() {
		extent.flush();
	}
	
	public void setupDriver(String browserName) {
		if (browserName.equalsIgnoreCase("chrome")) {
			System.setProperty(Constants.chromeWebdriver, Constants.chromeDriverPath);
			driver = new ChromeDriver();
		}else if(browserName.equalsIgnoreCase("firefox")) {
			System.setProperty(Constants.firefoxWebdriver, Constants.firefoxDriverPath);
			driver = new FirefoxDriver();
		}else {
			System.setProperty("webdriver.chrome.driver", Constants.chromeDriverPath);
			driver = new ChromeDriver();
		}
	}
}
