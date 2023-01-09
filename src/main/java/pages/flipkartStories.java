package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class flipkartStories {
	
	
	public WebDriver driver;
	
	public flipkartStories(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.XPATH, using = "//button[contains(text(),'✕')]")
	WebElement crossBtn;

	@FindBy(how = How.XPATH, using = "//body/div[@id='container']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/a[2]")
	WebElement link_ExplorePlus;
	
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Flipkart Stories')]")
	WebElement flipkartStories;
	
	public static By Stories_logo = By.xpath("//header/div[@id='ast-desktop-header']/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/a[1]/div[1]");
	
	public WebElement cross() {
		return crossBtn;
	}
	
	public WebElement explorePluslink() {
		return link_ExplorePlus;
	}
	
	public WebElement FlipkartStories() {
		return flipkartStories;
	}

}
