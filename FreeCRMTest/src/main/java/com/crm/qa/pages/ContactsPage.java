package com.crm.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByName;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.crm.qa.base.TestBase;

public class ContactsPage extends TestBase{
	public ContactsPage(){
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//td[contains(text(),'Contacts')]")
	WebElement contactsLable;
	
	/*@FindBy(xpath = "//a[text()='name']//parent::td[@class='datalistrow']//preceding-sibling::td[@class='datalistrow']//input[@name='contact_id']")
	WebElement chechBox;*/
	
	//new contact pagefactory elements
	@FindBy(id = "first_name")
	WebElement firstName;
	
	@FindBy(id = "surname")
	WebElement lasttName;
	
	@FindBy(name = "client_lookup")
	WebElement company;
	
	@FindBy(xpath = "//input[@type='sumit' and @value='Save']")
	WebElement saveBtn;
	
	/*@FindBy(xpath = "//td[contains(text(),'Contacts')]")
	WebElement contactsLable;*/
	
	public boolean verifyContactsPageLabel(){
		return contactsLable.isDisplayed();
	}
	
	public void selectContactsByName(String name){
		driver.findElement(By.xpath("//a[text()='"+name+"']//parent::td[@class='datalistrow']//preceding-sibling::td[@class='datalistrow']//input[@name='contact_id']")).click();
	}
	
	public void createNewContact(String title,String ftname, String ltname, String comp ){
		Select s =new Select(driver.findElement(By.name("title")));
		s.selectByVisibleText(title);
		firstName.sendKeys(ftname);
		lasttName.sendKeys(ltname);
		company.sendKeys(comp);
		saveBtn.click();
		
		
		
		
	}

	
	
	
    
}
