package com.crm.qa.testcases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.pages.NewDealPage;
import com.crm.qa.util.Helper;
import com.crm.qa.util.Helper1;
import com.crm.qa.util.TestUtil;

public class NewDealPageTest extends TestBase {
	LoginPage lp;
	HomePage hp;
	TestUtil tu;
	@BeforeMethod
	public void LaunchNewDealPage() throws IOException{
		InitializationDriver();
		lp=new LoginPage();
		hp=new HomePage();
		tu=new TestUtil();
		lp.login(prop.getProperty("username"), prop.getProperty("password"));
		tu.switchToFrame();
		hp.clickOnNewDeal();
	}
	
	
	@DataProvider
	public Object[][] getDealData1() throws IOException{
		return Helper1.excelHelper1(1);
		
	}
	
	@Test(dataProvider="getDealData1")
	public void newDealCreateTest(String tit, String com, String tas){
		NewDealPage ndp= new NewDealPage();
		ndp.enterDealData(tit, com, tas);
		
		
	}
/*
	@Test
	public void newDealCreateTest(){
		NewDealPage ndp= new NewDealPage();
		ndp.enterDealData("tit", "com", "tas");
	
}*/
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	
}
