package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class help {
	
public WebDriver driver;
	
	public help(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.XPATH, using = "//button[contains(text(),'✕')]")
	WebElement crossBtn;

	@FindBy(how = How.XPATH, using = "//body/div[@id='container']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/a[2]")
	WebElement link_ExplorePlus;
	
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Payments')]")
	WebElement link_payment;
	
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Shipping')]")
	WebElement link_shiping;
	
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Cancellation & Returns')]")
	WebElement link_Cancellation;
	
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'FAQ')]")
	WebElement link_FAQ;
	
	
	public static By payment = By.xpath("//h2[@id='payments']");
	public static By shipping = By.xpath("//h2[@id='shipping']");
	public static By cancellation = By.xpath("//div[contains(text(),'Cancellations and Returns')]");
	public static By suppot = By.xpath("//h1[contains(text(),'Flipkart Help Center | 24x7 Customer Care Support')]");
	
	
	public WebElement cross() {
		return crossBtn;
	}
	
	public WebElement explorePluslink() {
		return link_ExplorePlus;
	}
	
	public WebElement Payment() {
		return link_payment;
	}
	
	public WebElement Shipping() {
		return link_shiping;
	}
	
	public WebElement Cancellation() {
		return link_Cancellation;
	}
	
	public WebElement FAQ() {
		return link_FAQ;
	}

}
