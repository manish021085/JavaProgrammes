package com.crm.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.crm.qa.base.TestBase;

public class NewDealPage extends TestBase {
	
	public NewDealPage(){
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="title")
	WebElement title;
	
	@FindBy(name="client_lookup")
	WebElement company;
	
	@FindBy(id="tags")
	WebElement tag;
	
	@FindBy(xpath="//form[@id='prospectForm']/table/tbody/tr[1]/td/input[1]")
	WebElement savebtn;
	
	public void enterDealData(String ti, String co, String ta){
		title.sendKeys(ti);
		company.sendKeys(co);
		tag.sendKeys(ta);
		Select s=new Select(driver.findElement(By.xpath("//select[@name='type']")));
		s.selectByValue("New");
		savebtn.click();
	}
	
	

}
