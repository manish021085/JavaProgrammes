package automation.E2EProject.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import automation.E2EProject.testBase.TestBase;

public class LoginPage extends TestBase {

	// create constructor
	// initialization the page object
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	// page factory : @FindBy() annotation
	@FindBy(xpath="//input[@name='username']")
	WebElement username;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement password;
	
	@FindBy(xpath="//input[@value='Login']")
	WebElement loginBtn;
	
	@FindBy(xpath="//img[@class='img-responsive']")
	WebElement crmLogo;
	
	// action of verify the features
	public String validateLoginPagetitle() {
		return driver.getTitle();
	}
	
	public boolean validateCRMLogoImage() {
		return crmLogo.isDisplayed();
	}
	
	public WebElement loginBtn() {
		return loginBtn;
	}
	
	
	public void login(String un, String pwd) {
		username.sendKeys(un);
		password.sendKeys(pwd);
		TestBase.clickByJavaScript(loginBtn);
	}
	
	
	
	

}
