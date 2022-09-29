package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
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
	//@CacheLookup is in only selenium and it increase the performance of test
	//if page will refresh or will change then cashe memory disturbed
	// and create stale element exception
	@FindBy(xpath="//td[contains(text(),'User: Manish Singh')]")
	@CacheLookup
	WebElement userNameLable;
	
	@FindBy(xpath="//a[contains(text(),'Contacts')]")
	WebElement contactsLink;
	
	@FindBy(xpath="//a[contains(text(),'Deals')]")
	WebElement dealsLink;

	@FindBy(xpath="//a[contains(text(),'Tasks')]")
	WebElement tasksLink;
	
	@FindBy(xpath="//a[@title='New Contact']") //"//a[contains(text(),'New Contacts')]"
	WebElement newContactLink;
	
	@FindBy(xpath="//a[@title='New Deal']")
	WebElement newDealLink;
	
	@FindBy(xpath="//a[@title='New Task']")
	WebElement newTasksLink;
	
	/**
	 * Verification methods
	 * @return 
	 * @return
	 */
	public String verifyHomePageTitle(){
		String hpTitle = driver.getTitle();
		return hpTitle;
	}
	public boolean verifyCorrectUserName(){
		boolean userName = userNameLable.isDisplayed();
		return userName;
	}
	
	/**
	 * Action links on homePage
	 * @return 
	 * @return
	 */
	public WebElement clickOnDealLink(){
		return dealsLink;
	}
	
	public WebElement clickOnTaskLink(){
		return tasksLink;
	}
	
	public ContactsPage clickOnContact(){
		contactsLink.click();
		//Actions act = new Actions(driver);
		//act.moveToElement(contactsLink).build().perform();
		return new ContactsPage();
	}
	
	public void clickOnNewContact(){
		Actions act1=new Actions(driver);
		//first move to mouse on contactslink
		act1.moveToElement(contactsLink).build().perform();
		//click by javascript
		//clickByJavaScript(newContactLink);
		newContactLink.click();
	}
	
	public DealsPage clickOnDeal(){
		dealsLink.click();
		//Actions act2 = new Actions(driver);
		//act2.moveToElement(dealsLink).build().perform();
		return new DealsPage();
		}
	
	public void clickOnNewDeal(){
		Actions act3 = new Actions(driver);
		act3.moveToElement(newDealLink).build().perform();
		//click by javascript
		clickByJavaScript(newDealLink);
	}
	
	public TasksPage clickOnTask(){
		tasksLink.click();
		return new TasksPage();
		
		
	}
	
	

}
