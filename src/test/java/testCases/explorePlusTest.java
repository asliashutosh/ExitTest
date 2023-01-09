package testCases;


import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import org.testng.AssertJUnit;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.explorePlus;
import utilities.driverClass;

public class explorePlusTest extends driverClass {
	
	public static Logger log = LogManager.getLogger(loginTest.class);
	
	@Test(priority = 0)
	public static void plusTest() throws InterruptedException {
		
		explorePlus ExplorePlus = new explorePlus(driver);
		// Here i have Implemented the explicit wait
		WebDriverWait wait = new WebDriverWait(driver,30);
		
//		log.info("Clicking on the cross to get the view of HomePage");
//		ExplorePlus.cross().click();
		
		log.info("Clicking on the Exploreplus link");
		ExplorePlus.explorePluslink().click();
		test.log(LogStatus.INFO, "Clicking on the Exploreplus link");
		wait.until(ExpectedConditions.visibilityOfElementLocated(ExplorePlus.banner));

		log.debug("Verifying Flipkart Plus Page");
		AssertJUnit.assertEquals(driver.getTitle(), "Flipkart Plus – The Ultimate Rewards Program for Flipkart Customers | Flipkart");
		test.log(LogStatus.PASS, "Verifying Flipkart Plus Page");
		
		log.info("Clicking on the coin banner");
		ExplorePlus.bannerCoinBalance().click();
		test.log(LogStatus.INFO, "Clicking on the coin banner");
		wait.until(ExpectedConditions.visibilityOfElementLocated(ExplorePlus.coinBanner));

		log.debug("Verifying Coin Balance Page");
		AssertJUnit.assertEquals(driver.getTitle(), "Coins Balance – Check confirmed Flipkart coins for your Account");
		test.log(LogStatus.PASS, "Verifying Coin Balance Page");
	}

}
