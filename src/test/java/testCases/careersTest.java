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

import pages.careers;
import pages.explorePlus;
import utilities.driverClass;

public class careersTest extends driverClass {
	
	public static Logger log = LogManager.getLogger(loginTest.class);
	
	@Test(priority = 0)
	public static void aboutUs() {
		
		explorePlus ExplorePlus = new explorePlus(driver);
		careers Careers = new careers(driver);
		
		// Here i have Implemented the explicit wait
		WebDriverWait wait = new WebDriverWait(driver,30);
		
//		log.info("Clicking on the cross to get the view of HomePage");
//		ExplorePlus.cross().click();
		
		log.info("Clicking on the Exploreplus link");
		ExplorePlus.explorePluslink().click();
		test.log(LogStatus.INFO, "Clicking on the Exploreplus link");
		wait.until(ExpectedConditions.visibilityOfElementLocated(ExplorePlus.banner));

		log.info("Clicking on the Career link");
		Careers.Link_Carrers().click();
		test.log(LogStatus.INFO, "Clicking on the Career link");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		log.debug("Verifying that it is a Careers page");
		wait.until(ExpectedConditions.visibilityOfElementLocated(Careers.flipkart_logo));
		AssertJUnit.assertEquals(driver.getTitle(), "Flipkart - Careers");
		test.log(LogStatus.PASS, "Verifying that it is a Careers page");
	}


}
