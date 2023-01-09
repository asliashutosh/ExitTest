package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class searchPage {
	
public WebDriver driver;
	
	public searchPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.XPATH, using = "//button[contains(text(),'✕')]")
	WebElement crossBtn;

	@FindBy(how = How.XPATH, using = "//body/div[@id='container']/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/input[1]")
	WebElement txt_SearchField;
	
	@FindBy(how = How.XPATH, using = "//body/div[@id='container']/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/button[1]/*[1]")
	WebElement btn_search;
	
	@FindBy(how = How.XPATH, using = "//body/div[@id='container']/div[1]/div[3]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/a[1]/div[3]/div[2]")
	WebElement link_product;
	
	@FindBy(how = How.XPATH, using = "//body/div[@id='container']/div[1]/div[3]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/a[1]/div[3]/div[2]")
	WebElement btn_addToCart;
	
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Place Order')]")
	WebElement btn_placeOrder;
	
	public static By logo_addToCart = By.xpath("//body/div[@id='container']/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[1]/button[1]");
	public static By logo_placeOrder = By.xpath("//span[contains(text(),'Place Order')]");
	
	public WebElement cross() {
		return crossBtn;
	}
	
	public WebElement SearchField() {
		return txt_SearchField;
	}
	
	public WebElement Search() {
		return btn_search;
	}
	
	public WebElement Product() {
		return link_product;
	}
	
	public WebElement AddToCart() {
		return btn_addToCart;
	}
	
	public WebElement PlaceOrder() {
		return btn_placeOrder;
	}


}
