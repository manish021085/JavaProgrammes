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

public class HomePageTest extends TestBase {
	HomePage hp;
	LoginPage lp;
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
					
	}
	//test cases should be separated --independent to each other
	//before each test case --launch the browser and login
	//@test---execute test case
	//after each test case close the browser
	@Test(priority=1)
	public void verifyHomePageTitleTest(){
		String homePageTitle = hp.verifyHomePageTitle();
		System.out.println("title of the homepage is :"+homePageTitle);
		Assert.assertEquals(homePageTitle, "CRMPRO", "Home page title is not matched");
	}
	
	@Test(priority=2)
	public void verifyUserNameTest (){
		//usernamelabel is in another frame so use switch to frame method
		tu.switchtoFrame();
		Assert.assertTrue(hp.verifyCorrectUserName());
	}
	
	@Test(priority=3)
	public void verifyContactcLinkTest(){
		tu.switchtoFrame();
		cp = hp.clickOnContact();
	}
	
	
	
	
	
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	

}
