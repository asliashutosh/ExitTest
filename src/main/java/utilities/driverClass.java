package utilities;


import java.lang.reflect.Method;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;


public class driverClass {
	
	public static WebDriver driver;
	public static ExtentTest test;
	public static ExtentReports extent;
	public static Logger log = LogManager.getLogger(driverClass.class);
	
	ChromeOptions options = new ChromeOptions();
	
	@BeforeSuite
	public void initializeDriver() {
		
		// Read the browser name from config file
		
		String browserName = ReadingPropertiesFile.getProperty("browser");
		
		if(browserName.equalsIgnoreCase("Chrome")) {

			// Driver and Driver location
			System.setProperty(ReadingPropertiesFile.getProperty("driver"), ReadingPropertiesFile.getProperty("driverPath"));
			
			// Here is the headless mode
			String mode = "headless";
			if(mode==ReadingPropertiesFile.getProperty("mode")) {
				options.addArguments("--headless");
				driver = new ChromeDriver(options);
			}
			
			else {
				driver = new ChromeDriver();
			}
			
		}
		
		else if(browserName.equalsIgnoreCase("firefox")) {
			
			System.setProperty(ReadingPropertiesFile.getProperty("driver"), ReadingPropertiesFile.getProperty("driverPath"));
			
			driver = new FirefoxDriver();
		}
		
		else if(browserName.equalsIgnoreCase("edge")) {
			
			System.setProperty(ReadingPropertiesFile.getProperty("driver"), ReadingPropertiesFile.getProperty("driverPath"));
			driver = new EdgeDriver();
						
		}
		
		driver.manage().window().maximize();
		extent = ExtentManager.getInstance("reports//ExtentReport.html");
		log.info("Opening Flipkart.com");
	}
	
	@BeforeTest
	public void openUrl() {
		driver.get(ReadingPropertiesFile.getProperty("url"));
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		log.info("Opening Browser");
	}
	
	@BeforeMethod
	public void startTest(Method method) {
		test = extent.startTest(method.getName());
		
		driver.get(ReadingPropertiesFile.getProperty("url"));
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		log.info("Testcase "+ method.getName()+ " started");
	}
	
	@AfterMethod
	public void status(ITestResult result) {
		
		if(result.getStatus()==ITestResult.SUCCESS) {
			test.log(LogStatus.PASS, "Test case got passed");
		}
		else if(result.getStatus()==ITestResult.FAILURE) {
			test.log(LogStatus.FAIL, "Test case got failed");
			Screenshots.takeScreenshot(driver,result.getTestContext().getName() + "_" + result.getName());
		}
		
		extent.flush();
		log.info("Testcase "+ result.getName() + " ended");
		
	}
	
	@AfterTest
	public void deletion() {
		driver.manage().deleteAllCookies();
	}
	
	@AfterSuite
	public void quitBrowser() {
		log.info("Quiting the browser");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.quit();
	}

}
