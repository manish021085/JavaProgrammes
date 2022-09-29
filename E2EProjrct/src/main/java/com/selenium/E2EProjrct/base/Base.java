package com.selenium.E2EProjrct.base;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.selenium.E2EProjrct.utils.TestUtils;



public class Base {
	
	public static WebDriver driver;
	public static Properties prop;
	public static String currentDir = System.getProperty("user.dir");
	
	
	public WebDriver InitializationDriver() {
		
		io.github.bonigarcia.wdm.WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		prop = new Properties();
		
		String browserName = prop.getProperty("browser");
		if(browserName.equals("firefox"))
		{
			io.github.bonigarcia.wdm.WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			}
		else if(browserName.equals("InternetExplorer"))
		{
			io.github.bonigarcia.wdm.WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
		}
		else if(browserName.equals("chrome"))
		{
			io.github.bonigarcia.wdm.WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtils.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtils.IMPLICIT_WAIT, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
		
		return driver;
		
	}

}
