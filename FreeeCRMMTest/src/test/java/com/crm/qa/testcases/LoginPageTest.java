package com.crm.qa.testcases;

import java.io.IOException;

import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.Helper;

public class LoginPageTest extends TestBase {
	LoginPage loginpage;
	
	
	
	@BeforeMethod
	public void launchURL() throws IOException{
		
			InitializationDriver();
			//define the open url in base class
			//driver.get(prop.getProperty("url"));
			}
	
	@Test(priority=1)
	public void loginPageTitleTest(){
		loginpage=new LoginPage();
		String title = loginpage.validateLoginPageTitle();
		System.out.println("Title of loginpage is:->> "+title);
		Assert.assertEquals(title, "CRMPRO - CRM software for customer relationship management, sales, and support.");
	}
	@Test(priority=2)
	public void crmLogoImageTest(){
		loginpage=new LoginPage();
		boolean flag = loginpage.validateCRMLogoImage();
		System.out.println(flag);
		Assert.assertTrue(flag);
	}
	
	
	@DataProvider
	public Object[][] getDataProvider() throws IOException{
		return Helper.excelHelper(0);
	}
	
	@Test(dataProvider="getDataProvider")
	public void loginTest(String unm, String psw){
		
		loginpage=new LoginPage();
		loginpage.login(unm, psw);
		
		//loginppage.userName().sendKeys("singhgirjesh007");
		//loginppage.passWord().sendKeys("cimple@007");
		//clickByJavaScript(loginppage.logInBtn(),driver);
		//WebDriverWait wait= new WebDriverWait(driver, 40);
		//wait.until(ExpectedConditions.elementToBeClickable(lp.logInBtn()));
		//lp.logInBtn().click();
	}
	
	
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	

}
