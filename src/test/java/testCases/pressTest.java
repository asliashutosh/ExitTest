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

import pages.press;
import pages.explorePlus;
import utilities.driverClass;

public class pressTest extends driverClass {
	
	public static Logger log = LogManager.getLogger(loginTest.class);
	
	@Test(priority = 0)
	public static void press() {
		
		explorePlus ExplorePlus = new explorePlus(driver);
		press Press = new press(driver);
		
		// Here i have Implemented the explicit wait
		WebDriverWait wait = new WebDriverWait(driver,30);
		
//		log.info("Clicking on the cross to get the view of HomePage");
//		ExplorePlus.cross().click();
		
		log.info("Clicking on the Exploreplus link");
		ExplorePlus.explorePluslink().click();
		test.log(LogStatus.INFO, "Clicking on the Exploreplus link");
		wait.until(ExpectedConditions.visibilityOfElementLocated(ExplorePlus.banner));

		log.info("Clicking on the Press link");
		Press.Press().click();
		test.log(LogStatus.INFO, "Clicking on the Press link");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		log.debug("Verifying that it is a Press page");
		wait.until(ExpectedConditions.visibilityOfElementLocated(Press.News));
		AssertJUnit.assertEquals(driver.getTitle(), "News Archives - Flipkart Stories");
		test.log(LogStatus.PASS, "Verifying that it is a Press page");
	}


}
