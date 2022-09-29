package com.crm.qa.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtil;

public class LoginPageTest extends TestBase {
	LoginPage lp;
	HomePage hp;
	TestUtil tu;
	
	@BeforeMethod
	public void launchURL() throws IOException{
		//define the open url in base class
		//driver.get(prop.getProperty("url"));
		InitializationDriver();
		tu = new TestUtil();
		lp = new LoginPage();
	}
	
	@Test(priority=1)
	public void loginPageTitleTest(){
		String title=lp.validateLoginPageTitle();
		System.out.println("Title of loginpage is;;->> "+title);
		Assert.assertEquals(title, "CRMPRO - CRM software for customer relationship management, sales, and support.");
		//Assert.assertEquals(title, "CRMPRO - CRM software for customer relationship management, sales, and support.");
	}
	
	@Test(priority=2)
	public void crmLogoImageTest(){
		boolean flag=lp.validateCRMImage();
		System.out.println(flag);
		Assert.assertTrue(flag);
	}
	
	@DataProvider()
	public Object getDataProvider() throws IOException{
		return TestUtil.getTestData(0);
	}
	
	@Test(priority=3, dataProvider = "getDataProvider")
	//same number of variables is created in method
	public void loginTest(String un, String pwd){
		lp = new LoginPage();
		lp.login(un, pwd);
		//hp =lp.login(prop.getProperty("username"), prop.getProperty("password"));
		
	}
	
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}

}
