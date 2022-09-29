package com.crm.qa.testcases;

import java.io.IOException;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtil;

public class HomePageTest extends TestBase {
	
	HomePage hp;
	LoginPage lp;
	TestUtil tu;
	
	@BeforeMethod
	public void setupHomePage() throws IOException{
		InitializationDriver();
		lp=new LoginPage();
		
		tu=new TestUtil();
		lp.login(prop.getProperty("username"), prop.getProperty("password"));
		
		tu.switchToFrame();
	}
	
	@Test(priority=1)
	public void validateContactClickTest() throws IOException{
		tu.takesScreenShot("Parameter");
		hp=new HomePage();
		hp.clickOnContact();
	}
	
	@Test(priority=2)
	public void validateNewContactClickTest(){
		hp=new HomePage();
		hp.clickOnNewContact();
	}
	
	
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
}
