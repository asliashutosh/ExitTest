package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;



public class loginPage {
	
	public WebDriver driver;	
	
	public loginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Login')]")
	WebElement btn_Login;
	
	@FindBy(how = How.XPATH, using = "//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/input[1]")
	WebElement txt_emailOrPhone;
	
	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Request OTP')]")
	WebElement btn_RequestOTP;
	
	public WebElement Login() {
		return btn_Login;
	}
	
	public WebElement emailOrPhone() {
		return txt_emailOrPhone;
	}
	
	public WebElement requestOTP() {
		return btn_RequestOTP;
	}
	

}
