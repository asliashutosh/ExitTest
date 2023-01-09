package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class careers {
	
	public WebDriver driver;
	
	public careers(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.XPATH, using = "//button[contains(text(),'✕')]")
	WebElement crossBtn;

	@FindBy(how = How.XPATH, using = "//body/div[@id='container']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/a[2]")
	WebElement link_ExplorePlus;
	
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Careers')]")
	WebElement link_Careers;
	
	public static By flipkart_logo = By.xpath("//header/nav[@id='main-navbar']/div[1]/div[1]/a[1]/img[1]");
	
	public WebElement cross() {
		return crossBtn;
	}
	
	public WebElement explorePluslink() {
		return link_ExplorePlus;
	}
	
	public WebElement Link_Carrers() {
		return link_Careers;
	}


}
