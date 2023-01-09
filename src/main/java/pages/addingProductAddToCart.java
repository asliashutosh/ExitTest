package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class addingProductAddToCart {
	
	public WebDriver driver;
	
	public addingProductAddToCart(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.XPATH, using = "//button[contains(text(),'✕')]")
	WebElement crossBtn;
	
	@FindBy(how = How.XPATH, using = "//body/div[@id='container']/div[1]/div[2]/div[1]/div[1]/div[2]/a[1]/div[1]/div[1]/img[1]")
	WebElement mobile;
	
	@FindBy(how = How.XPATH, using = "//body/div[@id='container']/div[1]/div[3]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]/div[1]/img[1]")
	WebElement brandBanner;
	
	@FindBy(how = How.XPATH, using = "//body/div[@id='container']/div[1]/div[3]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/a[1]/div[2]/div[1]/div[1]")
	WebElement product_Link;
	
	@FindBy(how = How.XPATH, using = "//button[contains(text(),'NOTIFY ME')]")
	WebElement notifyMe;
			
	@FindBy(how = How.XPATH, using = "//body/div[@id='container']/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[1]/button[1]")
	WebElement addToCart;
	
	// These are the banner location that are being using in Explicit wait
//	public static By imgBrand = By.xpath("");
	public static By productBanner = By.xpath("//body/div[@id='container']/div[1]/div[3]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]/div[1]/img[1]");
	public static By buyNow = By.xpath("//body/div[@id='container']/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[2]/form[1]/button[1]");
	
	
	public WebElement cross() {
		return crossBtn;
	}
	
	public WebElement mobileIcon() {
		return mobile;
	}
	
	public WebElement brandbanner() {
		return brandBanner;
	}
	
	public WebElement Link_product() {
		return product_Link;
	}
	
	public WebElement addtoCart() {
		return addToCart;
	}
	
	public WebElement notifyme() {
		return notifyMe;
	}

}
