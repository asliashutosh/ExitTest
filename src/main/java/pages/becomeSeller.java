package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class becomeSeller {
	
	public WebDriver driver;
	
	public becomeSeller(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.XPATH, using = "//button[contains(text(),'✕')]")
	WebElement crossBtn;
	
	@FindBy(how = How.XPATH, using = "//body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[4]/a[1]/span[1]")
	WebElement btn_BecomeASeller;
	
	@FindBy(how = How.XPATH, using = "//body/div[@id='app']/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]")
	WebElement txt_phoneNumber;
	
	@FindBy(how = How.XPATH, using = "//body/div[@id='app']/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/button[1]")
	WebElement btn_startSelling;
	
	
	// These are the banner location that are being using in Explicit wait

	public static By logo = By.xpath("//header/div[1]/div[1]/figure[1]/img[1]");
	
	public WebElement cross() {
		return crossBtn;
	}
	
	public WebElement BecomeASeller() {
		return btn_BecomeASeller;
	}
	
	public WebElement PhoneNumber() {
		return txt_phoneNumber;
	}
	
	public WebElement StartSelling() {
		return btn_startSelling;
	}
	

}
