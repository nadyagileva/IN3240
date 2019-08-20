package testautomation.assignmentIN3240;

import org.testng.annotations.Test;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import testautomation.assignmentIN3240.NewUserWebElement;
import testautomation.assignmentIN3240.ScreenShots;
import org.testng.annotations.BeforeClass;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;

public class Task1User {
	private WebDriver driver;
	private static ExtentReports report;
	private static ExtentTest test;
	

	@BeforeClass
	public void beforeClass() {
		/**
	     * Test report will be generated to below path
	     * This path (C:\\Reports\\IN3240\\Task1.html) for Windows. 
	     * For Mac/Linux you need to change path
	    */
		report = new ExtentReports("C:\\Reports\\IN3240\\Task1.html");  
		test = report.startTest("Task 1");
		
		//System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver"); 
		driver = new ChromeDriver();
		test.log(LogStatus.INFO, "Browser started");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://itera-qa.azurewebsites.net/");
		
	}

	@Test
	public void createNewUser() {
		
		//Create a new instance of the NewUserWebElement page object
		//NewUserWebElement user = new NewUserWebElement(driver);
		
		NewUserWebElement user = new NewUserWebElement(driver);
		
		user.clickSignUpBtn();
		
		/**
	     * fill in the code to complete the test method
	    */
		
	}
	
	
	
	/**
     * For Mac/Linux you need to change path in ScreenShots.java    
    */
	
	//Take a screenShots if test fail
	@AfterMethod
	public void tearDown(ITestResult testResult) throws IOException {
		if (testResult.getStatus() == ITestResult.FAILURE) {
			String path = ScreenShots.takeScreenshot(driver, testResult.getName());
			String imagePath = test.addScreenCapture(path);
			test.log(LogStatus.FAIL, "TASK 1 - FAILED", imagePath);
		}
	}
	
	//Take a screenShots if test pass
	@AfterMethod
	public void Summary(ITestResult summary) throws IOException {
		if (summary.getStatus() == ITestResult.SUCCESS) {
			String path = ScreenShots.takeScreenshot(driver, summary.getName());
			String imagePath = test.addScreenCapture(path);
			test.log(LogStatus.PASS, "TASK 1 - PASSED", imagePath);
		}
	}

	@AfterClass
	public void endTest() {
		driver.close(); //Close browser
		report.flush(); // Appends the HTML file with all the ended tests.
	}

}
