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

import pages.explorePlus;
import pages.filpkartWholeSale;
import utilities.driverClass;

public class flipkartWholeSaleTest extends driverClass {

	public static Logger log = LogManager.getLogger(loginTest.class);
	
	@Test(priority = 0)
	public static void flipkartWholeSale() {
		
		explorePlus ExplorePlus = new explorePlus(driver);
		filpkartWholeSale FilpkartWholeSale = new filpkartWholeSale(driver);
		
		// Here i have Implemented the explicit wait
		WebDriverWait wait = new WebDriverWait(driver,30);
		
		log.info("Clicking on the cross to get the view of HomePage");
		ExplorePlus.cross().click();
		test.log(LogStatus.INFO, "Clicking on the cross to get the view of HomePage");
		
		log.info("Clicking on the Exploreplus link");
		ExplorePlus.explorePluslink().click();
		test.log(LogStatus.INFO, "Clicking on the Exploreplus link");
		wait.until(ExpectedConditions.visibilityOfElementLocated(ExplorePlus.banner));

		log.info("Clicking on the Flipkart WholeSale link");
		FilpkartWholeSale.FlipkartWholesale().click();
		test.log(LogStatus.INFO, "Clicking on the Flipkart WholeSale link");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		// Switching to another tab
		log.info("Switching to new tab");
		driver.getWindowHandles().forEach(tab->driver.switchTo().window(tab));
		
		log.debug("Verifying that it is a Press page");
		wait.until(ExpectedConditions.visibilityOfElementLocated(FilpkartWholeSale.imageWholesale));
		AssertJUnit.assertEquals(driver.getTitle(), "Flipkart Wholesale: India's B2B Wholesale online Market");
		test.log(LogStatus.PASS, "Verifying that it is a Press page");
	}
}
