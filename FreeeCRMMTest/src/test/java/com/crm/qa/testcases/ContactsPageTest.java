package com.crm.qa.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactsPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtil;

public class ContactsPageTest extends TestBase {
	LoginPage lp;
	HomePage hp;
	TestUtil tu;
	ContactsPage cp;
	@BeforeMethod
	public void launchURL() throws IOException{
		InitializationDriver();
		lp=new LoginPage();
		lp.login(prop.getProperty("username"), prop.getProperty("password"));
		tu= new TestUtil();
		tu.switchToFrame();
		hp= new HomePage();
		hp.clickOnContact();
		cp=new ContactsPage();
		
		}
	
	@Test(priority=1)
	public void verifyContactLabelTest(){
		cp= new ContactsPage();
		boolean conlabel = cp.verifyContactsLabel();
		Assert.assertTrue(conlabel, "contact label is missing on the page");
	}
	
	
	@Test(priority=2)
	public void selectSingleContactsTest(){
		cp= new ContactsPage();
		cp.selectContactsByName("Raj Singh");
	}
	
	@Test(priority=3)
	//for multiple select checkbox use multiple times
	public void selectMultipleContactsTest(){
		cp= new ContactsPage();
		cp.selectContactsByName("Raj Singh");
		cp.selectContactsByName("Deepak Raj");
	}
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	

}
