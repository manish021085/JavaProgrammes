package automation.E2EProject.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import automation.E2EProject.pages.LoginPage;
import automation.E2EProject.testBase.TestBase;

public class LoginPageTest extends TestBase{

	LoginPage loginPage;
	
	@BeforeTest
	public void launchURL() throws IOException {
			InitializationDriver();
	}
	
	@Test(priority=1)
	public void loginPageTitleTest() {
		loginPage = new LoginPage();
		String title = loginPage.validateLoginPagetitle();
		System.out.println("Title of Login Page :->> "+title);
		Assert.assertEquals(title, "CRMPRO - CRM software for customer relationship management, sales, and support.", "title is not matched");	
	}
	
	@Test(priority=2)
	public void crmLogoImageTest() {
		loginPage = new LoginPage();
		boolean flag = loginPage.validateCRMLogoImage();
		System.out.println(flag);
		Assert.assertTrue(flag);
	}
	
	@Test(priority=3)
	public void loginTest() {
		loginPage=new LoginPage();
		loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
