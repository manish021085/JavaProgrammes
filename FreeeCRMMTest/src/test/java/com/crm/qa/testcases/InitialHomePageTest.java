package com.crm.qa.testcases;

import java.io.IOException;

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtil;

public class InitialHomePageTest extends TestBase {
	
	HomePage hp;
	LoginPage lp;
	TestUtil tu;
	
	@BeforeMethod
	public void setupHomePage() throws IOException{
		InitializationDriver();
		lp=new LoginPage();
		hp=new HomePage();
		tu=new TestUtil();
		lp.login(prop.getProperty("username"), prop.getProperty("password"));
		
	}
	
	@Test(priority=1)
	public void verifyHomePageTitleTest(){
		hp=new HomePage();
		String hpTitle = hp.verifyHomePageTitle();
		System.out.println("HOMEPAGE TITLE :-->  "+hpTitle);
		Assert.assertEquals(hpTitle, "CRMPRO","Homepage title is not match");
	}
		
	@Test(priority=2)
	public void verifyUserNameTest(){
		hp=new HomePage();
		tu.switchToFrame();
		boolean un = hp.verifyCorrectUserName();
		Assert.assertTrue(un);
	}
	
	@Test
	public void verifyClickContactTest(){
		tu.switchToFrame();
		hp.clickOnContact();
	}
	
	@AfterMethod
	public void teraDown(){
		driver.quit();
	}
}
