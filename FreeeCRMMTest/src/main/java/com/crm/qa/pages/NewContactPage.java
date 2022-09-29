package com.crm.qa.pages;import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.crm.qa.base.TestBase;

public class NewContactPage extends TestBase {
	
	public NewContactPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(id="first_name")
	WebElement firstName;
	
	@FindBy(id="surname")
	WebElement lastName;
	
	@FindBy(name="client_lookup")
	WebElement company;
	
	@FindBy(name="city")
	WebElement city;
	
	@FindBy(name="country")
	WebElement country;
	
	@FindBy(xpath="//td[@align='center']/input[2]")
	WebElement saveBtn;
	
	
	
	
	
	public void enterContactData(String fn,String ln,String co,String ci,String cou){
		Select s=new Select(driver.findElement(By.xpath("//select[@name='title']")));
		s.selectByValue("Mr.");
		firstName.sendKeys(fn);
		lastName.sendKeys(ln);
		company.sendKeys(co);
		city.sendKeys(ci);
		country.sendKeys(cou);
		saveBtn.click();
		
		
		
	}
	
}
