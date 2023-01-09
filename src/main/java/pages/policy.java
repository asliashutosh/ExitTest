package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class policy {
	
	public WebDriver driver;
	
	public policy(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.XPATH, using = "//button[contains(text(),'✕')]")
	WebElement crossBtn;

	@FindBy(how = How.XPATH, using = "//body/div[@id='container']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/a[2]")
	WebElement link_ExplorePlus;
	
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Return Policy')]")
	WebElement link_returnPolicy;
	
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Terms Of Use')]")
	WebElement link_termsOfUse;
	
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Security')]")
	WebElement link_Security;
	
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Privacy')]")
	WebElement link_privacy;
	
	
	public static By text_Secure = By.xpath("//h2[@id='safe-and-secure-shopping']");
	public static By text_TermsOfUse = By.xpath("//body[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/p[1]/strong[1]");
	public static By text_returnPolicy = By.xpath("//h1[@id='returns-policy']");
	public static By text_privacyPolicy = By.xpath("//h1[@id='privacy-policy']");
	
	
	public WebElement cross() {
		return crossBtn;
	}
	
	public WebElement explorePluslink() {
		return link_ExplorePlus;
	}
	
	public WebElement Return() {
		return link_returnPolicy;
	}
	
	public WebElement Terms() {
		return link_termsOfUse;
	}
	
	public WebElement Security() {
		return link_Security;
	}
	
	public WebElement Privacy() {
		return link_privacy;
	}


}
