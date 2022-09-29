package com.crm.qa.pages;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase {
	//create constructor to initialize the page factory objects by 'PageFactory.initElements(driver, this);'
	/**
	 * Pagefactory loginpage Constructor - 
	 */
	public LoginPage(){
		PageFactory.initElements(driver, this);
		}
	
	// page factory : @FindBy() annotation
	/**
	 * WebElements Repository
	 */
	@FindBy(name = "username")
	WebElement username;
	
	@FindBy(name = "password")
	WebElement password;
	
	@FindBy(xpath = "//input[@value='Login']")
	WebElement loginbtn;
	
	@FindBy(xpath = "//a[contains(text), 'Sign Up']")
	WebElement signupbtn;
	
	@FindBy(xpath = "//img[@class='img-responsive']")
	WebElement crmlogo;
	
	//actions
	/**
	 * Validation methods
	 * @return
	 */
	public String validateLoginPageTitle(){
		return driver.getTitle();
	}
	
	public boolean validateCRMImage(){
		return crmlogo.isDisplayed();
	}
	
	public WebElement userName(){
		return username;
	}
	
	public WebElement passWord(){
		return password;
	}
	
	public WebElement logInBtn(){
		return loginbtn;
	}
	
	
	/**
	 * Action links on loginpage
	 * @return
	 */
	
	public HomePage login(String un, String pwd){
		username.sendKeys(un);
		password.sendKeys(pwd);
		//loginbtn.click();
		TestBase.clickByJavaScript(loginbtn);
		//when we click login button we reach homepage so it return new homepage
		return new HomePage();
	}
	
	

	

}
