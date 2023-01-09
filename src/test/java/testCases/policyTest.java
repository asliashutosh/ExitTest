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
import pages.help;
import pages.policy;
import utilities.driverClass;

public class policyTest extends driverClass{
	
	public static Logger log = LogManager.getLogger(helpTest.class);
	
	@Test(priority = 0)
	public static void ReturnPolicyTest() {
		
		explorePlus ExplorePlus = new explorePlus(driver);
		policy Policy = new policy(driver);
		
		// Here i have Implemented the explicit wait
		WebDriverWait wait = new WebDriverWait(driver,30);
		
//		log.info("Clicking on the cross to get the view of HomePage");
//		ExplorePlus.cross().click();
		
		log.info("Clicking on the Exploreplus link");
		ExplorePlus.explorePluslink().click();
		test.log(LogStatus.INFO, "Clicking on the Exploreplus link");
		wait.until(ExpectedConditions.visibilityOfElementLocated(ExplorePlus.banner));

		log.info("Clicking on the Return Page link");
		Policy.Return().click();
		test.log(LogStatus.INFO, "Clicking on the Return Page link");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		log.debug("Verifying that it is a Return page");
		wait.until(ExpectedConditions.visibilityOfElementLocated(Policy.text_returnPolicy));
		AssertJUnit.assertEquals(driver.getTitle(), "Return Policy - Flipkart.com");
		test.log(LogStatus.PASS, "Verifying that it is a Return page");
		
	}
	
	@Test(priority = 1)
	public static void TermsOfUse() {
		
		explorePlus ExplorePlus = new explorePlus(driver);
		policy Policy = new policy(driver);
		
		// Here i have Implemented the explicit wait
		WebDriverWait wait = new WebDriverWait(driver,30);
		
		// There will be no cross button the second run
//		log.info("Clicking on the cross to get the view of HomePage");
//		ExplorePlus.cross().click();
//		
		log.info("Clicking on the Exploreplus link");
		ExplorePlus.explorePluslink().click();
		test.log(LogStatus.INFO, "Clicking on the Exploreplus link");
		wait.until(ExpectedConditions.visibilityOfElementLocated(ExplorePlus.banner));

		log.info("Clicking on the Terms of Use Page link");
		Policy.Terms().click();
		test.log(LogStatus.INFO, "Clicking on the Terms of Use Page link");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		log.debug("Verifying that it is a TermsOfUse page");
		wait.until(ExpectedConditions.visibilityOfElementLocated(Policy.text_TermsOfUse));
		AssertJUnit.assertEquals(driver.getTitle(), "Terms Store Online - Buy Terms Online at Best Price in India | Flipkart.com");
		test.log(LogStatus.PASS, "Verifying that it is a TermsOfUse page");
	}
	
	@Test(priority = 2)
	public static void Security() {
		
		explorePlus ExplorePlus = new explorePlus(driver);
		policy Policy = new policy(driver);
		
		// Here i have Implemented the explicit wait
		WebDriverWait wait = new WebDriverWait(driver,30);
		
		// There will be no cross button the second run
//		log.info("Clicking on the cross to get the view of HomePage");
//		ExplorePlus.cross().click();
//		
		log.info("Clicking on the Exploreplus link");
		ExplorePlus.explorePluslink().click();
		test.log(LogStatus.INFO, "Clicking on the Exploreplus link");
		wait.until(ExpectedConditions.visibilityOfElementLocated(ExplorePlus.banner));

		log.info("Clicking on the Security Page link");
		Policy.Security().click();
		test.log(LogStatus.INFO, "Clicking on the Security Page link");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		log.debug("Verifying that it is a Security page");
		wait.until(ExpectedConditions.visibilityOfElementLocated(Policy.text_Secure));
		AssertJUnit.assertEquals(driver.getTitle(), "Paymentsecurity Store Online - Buy Paymentsecurity Online at Best Price in India | Flipkart.com");
		test.log(LogStatus.PASS, "Verifying that it is a Security page");
	}
	
	@Test(priority = 3)
	public static void Privacy() {
		
		explorePlus ExplorePlus = new explorePlus(driver);
		policy Policy = new policy(driver);
		
		// Here i have Implemented the explicit wait
		WebDriverWait wait = new WebDriverWait(driver,30);
		
		// There will be no cross button the second run
//		log.info("Clicking on the cross to get the view of HomePage");
//		ExplorePlus.cross().click();
//		
		log.info("Clicking on the Exploreplus link");
		ExplorePlus.explorePluslink().click();
		test.log(LogStatus.INFO, "Clicking on the Exploreplus link");
		wait.until(ExpectedConditions.visibilityOfElementLocated(ExplorePlus.banner));

		log.info("Clicking on the Privacy Page link");
		Policy.Privacy().click();
		test.log(LogStatus.INFO, "Clicking on the Privacy Page link");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		log.debug("Verifying that it is a Privacy page");
		wait.until(ExpectedConditions.visibilityOfElementLocated(Policy.text_privacyPolicy));
		AssertJUnit.assertEquals(driver.getTitle(), "Privacypolicy Store Online - Buy Privacypolicy Online at Best Price in India | Flipkart.com");
		test.log(LogStatus.PASS, "Verifying that it is a Privacy page");
	}



}
