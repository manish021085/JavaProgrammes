package com.crm.qa.testcases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.pages.NewContactPage;
import com.crm.qa.util.Helper;
import com.crm.qa.util.TestUtil;

public class NewContactPageTest extends TestBase {
	LoginPage lp;
	HomePage hp;
	TestUtil tu;
	@BeforeMethod
	public void launchNewContactPage() throws IOException{
		InitializationDriver();
		lp= new LoginPage();
		hp= new HomePage();
		tu=new TestUtil();
		lp.login(prop.getProperty("username"), prop.getProperty("password"));
		tu.switchToFrame();
		hp.clickOnNewContact();
		
		
	}
	@DataProvider
	public Object[][] getContactData() throws IOException{
		return Helper.excelHelper(1);
	}
	
	@Test(dataProvider="getContactData")
	public void newContactsCreateTest(String f,String l, String c,String ct,String ctry){
		NewContactPage ncp= new NewContactPage();
				ncp.enterContactData(f, l, c, ct, ctry);
	}
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	
	
	

}
	

