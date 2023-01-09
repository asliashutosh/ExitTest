package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class aboutUs {
	
	public WebDriver driver;
	
	public aboutUs(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.XPATH, using = "//button[contains(text(),'✕')]")
	WebElement crossBtn;

	@FindBy(how = How.XPATH, using = "//body/div[@id='container']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/a[2]")
	WebElement link_ExplorePlus;
	
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'About Us')]")
	WebElement link_aboutUs;
	
	
	public WebElement cross() {
		return crossBtn;
	}
	
	public WebElement explorePluslink() {
		return link_ExplorePlus;
	}
	
	public WebElement AboutUs() {
		return link_aboutUs;
	}

}
