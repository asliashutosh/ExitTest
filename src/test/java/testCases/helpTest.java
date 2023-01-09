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
import pages.help;
import utilities.driverClass;

public class helpTest extends driverClass {
	

	public static Logger log = LogManager.getLogger(helpTest.class);
	
	@Test(priority = 0)
	public static void PaymentPageTest() {
		
		explorePlus ExplorePlus = new explorePlus(driver);
		help Help = new help(driver);
		
		// Here i have Implemented the explicit wait
		WebDriverWait wait = new WebDriverWait(driver,30);
		
//		log.info("Clicking on the cross to get the view of HomePage");
//		ExplorePlus.cross().click();
		
		log.info("Clicking on the Exploreplus link");
		ExplorePlus.explorePluslink().click();
		test.log(LogStatus.INFO, "Clicking on the Exploreplus link");
		wait.until(ExpectedConditions.visibilityOfElementLocated(ExplorePlus.banner));

		log.info("Clicking on the Payment Page link");
		Help.Payment().click();
		test.log(LogStatus.INFO, "Clicking on the Payment Page link");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		log.debug("Verifying that it is a Payment page");
		wait.until(ExpectedConditions.visibilityOfElementLocated(Help.payment));
		AssertJUnit.assertEquals(driver.getTitle(), "Payments Store Online - Buy Payments Online at Best Price in India | Flipkart.com");
		test.log(LogStatus.PASS, "Verifying that it is a Payment page");
	}
	
	@Test(priority = 1)
	public static void ShippingPageTest() {
		
		explorePlus ExplorePlus = new explorePlus(driver);
		help Help = new help(driver);
		
		// Here i have Implemented the explicit wait
		WebDriverWait wait = new WebDriverWait(driver,30);
		
		// This cross button will not appearing in the second run 
		
//		log.info("Clicking on the cross to get the view of HomePage");
//		Help.cross().click();
		
		log.info("Clicking on the Exploreplus link");
		Help.explorePluslink().click();
		test.log(LogStatus.INFO, "Clicking on the Exploreplus link");
		wait.until(ExpectedConditions.visibilityOfElementLocated(ExplorePlus.banner));

		log.info("Clicking on the Shipping Page link");
		Help.Shipping().click();
		test.log(LogStatus.INFO, "Clicking on the Shipping Page link");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		log.debug("Verifying that it is a Shiping page");
		wait.until(ExpectedConditions.visibilityOfElementLocated(Help.shipping));
		AssertJUnit.assertEquals(driver.getTitle(), "Shipping Store Online - Buy Shipping Online at Best Price in India | Flipkart.com");
		test.log(LogStatus.PASS, "Verifying that it is a Shiping page");
	}
	
	@Test(priority = 2)
	public static void Cancelattion() {
		
		explorePlus ExplorePlus = new explorePlus(driver);
		help Help = new help(driver);
		
		// Here i have Implemented the explicit wait
		WebDriverWait wait = new WebDriverWait(driver,30);
		
		// This cross button will not appearing in the second run 
		
//		log.info("Clicking on the cross to get the view of HomePage");
//		Help.cross().click();
		
		log.info("Clicking on the Exploreplus link");
		Help.explorePluslink().click();
		test.log(LogStatus.INFO, "Clicking on the Exploreplus link");
		wait.until(ExpectedConditions.visibilityOfElementLocated(ExplorePlus.banner));

		log.info("Clicking on the Cancellation Page link");
		Help.Cancellation().click();
		test.log(LogStatus.INFO, "Clicking on the Cancellation Page link");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		log.debug("Verifying that it is a Cancellation page");
		wait.until(ExpectedConditions.visibilityOfElementLocated(Help.cancellation));
		AssertJUnit.assertEquals(driver.getTitle(), "Online Shopping India | Buy Mobiles, Electronics, Appliances, Clothing and More Online at Flipkart.com");
		test.log(LogStatus.PASS, "Verifying that it is a Cancellation page");
	}
	
	@Test(priority = 3)
	public static void FAQ() {
		
		explorePlus ExplorePlus = new explorePlus(driver);
		help Help = new help(driver);
		
		// Here i have Implemented the explicit wait
		WebDriverWait wait = new WebDriverWait(driver,30);
		
		// This cross button will not appearing in the second run 
		
//		log.info("Clicking on the cross to get the view of HomePage");
//		Help.cross().click();
		
		log.info("Clicking on the Exploreplus link");
		Help.explorePluslink().click();
		test.log(LogStatus.INFO, "Clicking on the Exploreplus link");
		wait.until(ExpectedConditions.visibilityOfElementLocated(ExplorePlus.banner));

		log.info("Clicking on the FAQ link");
		Help.FAQ().click();
		test.log(LogStatus.INFO, "Clicking on the FAQ link");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		log.debug("Verifying that it is a FAQ page");
		wait.until(ExpectedConditions.visibilityOfElementLocated(Help.suppot));
		AssertJUnit.assertEquals(driver.getTitle(), "Online Shopping India | Buy Mobiles, Electronics, Appliances, Clothing and More Online at Flipkart.com");
		test.log(LogStatus.PASS, "Verifying that it is a FAQ page");
	}

	

}
