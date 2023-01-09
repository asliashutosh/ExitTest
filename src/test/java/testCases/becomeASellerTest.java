package testCases;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import org.testng.AssertJUnit;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.becomeSeller;
import utilities.ReadingPropertiesFile;
import utilities.driverClass;

public class becomeASellerTest extends driverClass {

	public static Logger log = LogManager.getLogger(loginTest.class);
	
	@Test(priority = 0)
	public static void BecomaASeller() {
		
		becomeSeller BecomeSeller = new becomeSeller(driver);
		
		// Here i have Implemented the explicit wait
		WebDriverWait wait = new WebDriverWait(driver,30);
		
//		log.info("Clicking on the Cross buttonto get the view of Homepage");
//		BecomeSeller.cross().click();
//		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		log.info("Clicking on the Become A Seller Button");
		BecomeSeller.BecomeASeller().click();
		test.log(LogStatus.INFO, "Clicking on the Become A Seller Button");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		log.info("Sending Molile Number");
		BecomeSeller.PhoneNumber().sendKeys(ReadingPropertiesFile.getProperty("emailOrPhone"));
		test.log(LogStatus.INFO, "Sending Molile Number");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		log.info("Clicking on the Start Selling button");
		BecomeSeller.StartSelling().click();
		test.log(LogStatus.INFO, "Clicking on the Start Selling button");
		wait.until(ExpectedConditions.visibilityOfElementLocated(BecomeSeller.logo));
		
		AssertJUnit.assertEquals(driver.getTitle(), "Seller Dashboard");
		test.log(LogStatus.PASS, "Verifying it is a seller page");
		
	}
}
