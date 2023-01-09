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

import pages.addingProductAddToCart;
import pages.explorePlus;
import utilities.driverClass;

public class addToCartTest extends driverClass{
	
public static Logger log = LogManager.getLogger(loginTest.class);
	
	@Test(priority = 0)
	public static void addtoCart() throws InterruptedException {
		
		addingProductAddToCart AddToCart = new addingProductAddToCart(driver);
		
		// Here i have Implemented the explicit wait
		WebDriverWait wait = new WebDriverWait(driver,30);
		
//		log.info("Clicking on the cross button to the proper view of Homepage");
//		AddToCart.cross().click();
//		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		log.info("Clicking on the mobile icos");
		AddToCart.mobileIcon().click();
		test.log(LogStatus.INFO, "Clicking on the mobile icos");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		log.info("Clicking on brand Banner");
		AddToCart.brandbanner().click();
		test.log(LogStatus.INFO, "Clicking on brand Banner");
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		log.info("Clicking on the product");
		AddToCart.Link_product().click();
		test.log(LogStatus.INFO, "Clicking on the product");
		
		// Switching to another tab
		log.info("Switching to new tab");
		driver.getWindowHandles().forEach(tab->driver.switchTo().window(tab));
		AddToCart.notifyme().click();
		
		AssertJUnit.assertEquals(driver.getTitle(), driver.getTitle());
		
		test.log(LogStatus.PASS, "Verifying it is a product page");
//		AddToCart.addtoCart().click();
//		Thread.sleep(6000);
		
	}

}
