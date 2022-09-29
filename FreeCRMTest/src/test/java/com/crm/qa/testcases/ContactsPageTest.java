package com.crm.qa.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactsPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtil;

public class ContactsPageTest extends TestBase{
	LoginPage lp;
	HomePage hp;
	TestUtil tu;
	ContactsPage cp;
	@BeforeMethod
	public void setupHomePage() throws IOException{
		InitializationDriver();
		lp = new LoginPage();
		hp = new HomePage();
		tu = new TestUtil();
		cp = new ContactsPage();
		//because these define home page objects
		hp = lp.login(prop.getProperty("username"), prop.getProperty("password"));
		tu.switchtoFrame();
		cp = hp.clickOnContact();
		
					
	}
	//if priorities are same then testng will decide which one is greater
	@Test(priority=1)
	public void verifyContactsPageLevelTest(){
		//verify the level by assert
		boolean conLevel = cp.verifyContactsPageLabel();
		Assert.assertTrue(conLevel, "Contacts level is missing on the page");
		//Assert.assertTrue(cp.verifyContactsLabel(), "Contacts level is missing on the page");
	}
	
	@Test(priority=2)
	public void selectSingleContactsTest(){
		//cp = new ContactsPage();
		cp.selectContactsByName("ira rajput");
	}
	
	//for multiple select checkbox use multiple times
	@Test(priority=3)
	public void selectMultipleeContactsTest(){
		//cp = new ContactsPage();
		cp.selectContactsByName("ira rajput");
		cp.selectContactsByName("eva rajput");
	}
	
	/*@Test(priority=4)
	public void validateCreateNewContact(){
		hp.clickOnNewContact();
		cp.createNewContact("Mr.", "Raj", "Verma", "Google");
	}*/
	
	@DataProvider
	public Object getDataNewCreateContact() throws IOException{
		return TestUtil.getTestData(1);
	}
	@Test(priority=4, dataProvider="getDataNewCreateContact")
	public void validateCreateNewContact(String title, String fname, String lname, String com){
		hp.clickOnNewContact();
		cp.createNewContact(title, fname, lname, com);
	}
	
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}

}
