package com.crm.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase{
	
    // create constructor
	// initialization the page object
	public LoginPage() {
		
		PageFactory.initElements(driver, this);
	}

	// page factory : @FindBy() annotation
	@FindBy(xpath = "//input[@name='username']")
	WebElement username;

	@FindBy(xpath ="//input[@name='password']")
	WebElement password;

	@FindBy(xpath = "//input[@value='Login']")
	WebElement loginBtn;

	@FindBy(xpath = "//a[contains(text),'Sign Up']")
	WebElement signUpBtn;

	@FindBy(xpath = "//img[contains(@class,'img-responsive')]")
	WebElement crmLogo;

	// action of verify the features
	public String validateLoginPageTitle() {
		return driver.getTitle();
	}

	public boolean validateCRMLogoImage() {
		return crmLogo.isDisplayed();
	}
	public WebElement userName(){
		return username;
		
	}
	public WebElement passWord(){
		return password;
	}
	public WebElement logInBtn(){
		return loginBtn;
	}
	
	
	
	public void login(String un, String pwd) {
		username.sendKeys(un);
		password.sendKeys(pwd);
		TestBase.clickByJavaScript(loginBtn);
		
		// after login return new homepage
		//return new HomePage();
    }
	
}
