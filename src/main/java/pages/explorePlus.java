package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class explorePlus {
	
	public WebDriver driver;
	
	public explorePlus(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.XPATH, using = "//button[contains(text(),'✕')]")
	WebElement crossBtn;
	
	@FindBy(how = How.XPATH, using = "//body/div[@id='container']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/a[2]")
	WebElement link_ExplorePlus;
	
	@FindBy(how = How.XPATH, using = "//body/div[@id='container']/div[1]/div[3]/div[1]/div[1]/div[1]/a[1]/div[1]/div[1]/img[2]")
	WebElement banner_coinBalance;
	
	// These are the banner location that are being using in Explicit wait
	public static By banner = By.xpath("//body/div[@id='container']/div[1]/div[3]/div[1]/div[3]/div[1]/div[1]/div[1]/img[2]");
	public static By coinBanner = By.xpath("//body/div[@id='container']/div[1]/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/img[2]");
	
	
	public WebElement cross() {
		return crossBtn;
	}
	
	public WebElement explorePluslink() {
		return link_ExplorePlus;
	}
	
	public WebElement bannerCoinBalance() {
		return banner_coinBalance;
	}

}
