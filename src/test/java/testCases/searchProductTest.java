package testCases;

import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import pages.explorePlus;
import pages.filpkartWholeSale;
import pages.searchPage;
import utilities.ReadingPropertiesFile;
import utilities.driverClass;

public class searchProductTest extends driverClass {
	
public static Logger log = LogManager.getLogger(loginTest.class);
	
	@Test(priority = 0)
	public static void SearchProduct() {
		
		searchPage SearchPage = new searchPage(driver);
		
		// Here i have Implemented the explicit wait
		WebDriverWait wait = new WebDriverWait(driver,30);
		
		log.info("Sending data to the search Field");
		SearchPage.SearchField().sendKeys(ReadingPropertiesFile.getProperty("productName"));
		test.log(LogStatus.INFO, "Sending data to the search Field");
		
		log.info("Clicking on the Search button");
		SearchPage.Search().click();
		test.log(LogStatus.INFO, "Clicking on the Search button");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		log.info("Clicking on the product link");
		SearchPage.Product().click();
		test.log(LogStatus.INFO, "Clicking on the product link");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		log.debug("Verifying that it is a product page");
		AssertJUnit.assertEquals(driver.getTitle(), driver.getTitle());
		test.log(LogStatus.PASS, "Verifying that it is a product page");
	}

}
