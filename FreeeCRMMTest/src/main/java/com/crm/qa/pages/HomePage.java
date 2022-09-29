package com.crm.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class HomePage extends TestBase {
	
	/**
	 * Pagefactory HomePage Constructor - 
	 */
	public HomePage(){
		
		PageFactory.initElements(driver, this);
		
	}
	
	/**
	 * WebElements Repository
	 */
	
	
	//@FindBy(xpath="//td[@class='headertext']")
	@FindBy(xpath="//td[contains(text(),'User: Manish Singh')]")
	WebElement userNameLabel;
	
	@FindBy(xpath="//a[contains(text(),'Contacts')]")
	WebElement contactsLink;
	
	
	@FindBy(xpath="//a[contains(text(),'Deals')]")
	WebElement dealsLink;
		
	@FindBy(xpath="//a[contains(text(),'Tasks')]")
	WebElement tasksLink;
	
	@FindBy(xpath="//a[@title='New Contact']")
	WebElement newcontact;
	
	@FindBy(xpath="//a[@title='New Deal']")
	WebElement  newdeal;
	
	@FindBy(xpath="//a[@title='New Task']")
	WebElement newtask;
	
	
	
	/**
	 * Verification methods
	 * @return
	 */
	public String verifyHomePageTitle(){
		String hpTitle = driver.getTitle();
		return hpTitle;
	}
	
	public boolean verifyCorrectUserName()
	{
		boolean userName = userNameLabel.isDisplayed();
		return userName;
	}
	
	/**
	 * Action links on homePage
	 * @return
	 */
	
	public WebElement clickOnDealsLink()
	{
		return dealsLink;
		
	}
	
	public WebElement clickOnTasksLink()
	{
		return tasksLink;
		
	}
	
	
	
	public ContactsPage clickOnContact(){
		Actions act=new Actions(driver);
		act.moveToElement(contactsLink).click().build().perform();
		
		return new ContactsPage();
		
	}
	
	public void clickOnNewContact(){
		Actions act1=new Actions(driver);
		act1.moveToElement(contactsLink).build().perform();
		clickByJavaScript(newcontact);
		//newcontact.click();
	}
	
	public void clickOnDeal(){
		Actions act2=new Actions(driver);
		act2.moveToElement(dealsLink).click().build().perform();
	    //return DealsPage;
	}
	
	public void clickOnNewDeal(){
		Actions act3=new Actions(driver);
		act3.moveToElement(dealsLink).build().perform();
		clickByJavaScript(newdeal);
	}
	
	
	

}
