package testCases;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import org.testng.AssertJUnit;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.loginPage;
import utilities.ReadingPropertiesFile;
import utilities.driverClass;


public class loginTest extends driverClass {
	
	public static Logger log = LogManager.getLogger(loginTest.class);
	
	@Test(priority = 0)
	public static void loginPageTest() throws InterruptedException {
	
	loginPage LoginPage = new loginPage(driver);
	
	log.info("Clicking on the Login button");
	LoginPage.Login().click();
	test.log(LogStatus.INFO, "Clicking on the Login button");
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	
	log.info("Sending Email or Phone Number");
	LoginPage.emailOrPhone().sendKeys(ReadingPropertiesFile.getProperty("emailOrPhone"));
	test.log(LogStatus.INFO, "Sending Email or Phone Number");
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	
	log.info("Clicking on the Request OTP button");
	LoginPage.requestOTP().click();
	test.log(LogStatus.INFO, "Clicking on the Request OTP button");
	
	log.debug("Verifying it is a Homepage");
	AssertJUnit.assertEquals(driver.getTitle(), "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!");
	test.log(LogStatus.PASS, "Verifying it is a Homepage");
	}
	
}

