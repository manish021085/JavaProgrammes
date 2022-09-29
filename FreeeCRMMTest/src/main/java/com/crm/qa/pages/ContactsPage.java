package com.crm.qa.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.BeforeMethod;

import com.crm.qa.base.TestBase;
import com.crm.qa.util.TestUtil;

public class ContactsPage extends TestBase {
	LoginPage loginpage;
	
	public ContactsPage(){
		
		PageFactory.initElements(driver, this);
	}
		
		@FindBy(xpath = "//td[contains(text(),'Contacts')]")
		WebElement contactslabel;
		
		//@FindBy(xpath="//a[text()='name']//parent::td[@class='datalistrow']//preceding-sibling::td[@class='datalistrow']//input[@name='contact_id']")
		//WebElement checkbox;
		
		
		public boolean verifyContactsLabel(){
			boolean cl = contactslabel.isDisplayed();
			return cl;
		}
		
		public void selectContactsByName(String name){
			driver.findElement(By.xpath("//a[text()='"+name+"']//parent::td[@class='datalistrow']//preceding-sibling::td[@class='datalistrow']//input[@name='contact_id']")).click();
		}
		
		
		
		
		
	
	
	
	
	
	
	
	
	
	

}
