package com.crm.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.crm.qa.util.TestUtil;
import com.crm.qa.util.WebEventListener;

public class TestBase {
	//private static final TimeUnit Timeunits = null;
	// global variables
	public static WebDriver driver;
	public static Properties prop;
	public static EventFiringWebDriver e_driver;
	public static WebEventListener eventlistener;

	// create constructor
	/*public TestBase() throws IOException {
		prop = new Properties();
		
		 * FileInputStream fis = new FileInputStream(
		 * "C:\\Selenium\\eclipse-jee-mars-2-win32-x86_64\\WorkSpace\\FreeCRMTest\\"
		 * + "src\\main\\java\\com\\crm\\qa\\config\\config.properties");
		 
		FileInputStream fis = new FileInputStream("/FreeCRMTest/src/main/java/com/crm/qa/config/config.properties");
		prop.load(fis);

	}*/

	public static WebDriver InitializationDriver() throws IOException {
		prop = new Properties();
		
		 FileInputStream fis = new FileInputStream(
		 "C:\\Selenium\\eclipse-jee-mars-2-win32-x86_64\\WorkSpace\\FreeCRMTest\\"
		 + "src\\main\\java\\com\\crm\\qa\\config\\config.properties");
		 
		//FileInputStream fis = new FileInputStream("/FreeCRMTest/src/main/java/com/crm/qa/config/config.properties");
		prop.load(fis);
		String browserName = prop.getProperty("browser");
		if (browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",
			"D:\\AUTOMATION\\Iimp_Files\\Library Files & Jar files\\Browser Driver\\chromedriver.exe");
			//System.setProperty("webdriver.chrome.driver", "/FreeCRMTest/src/main/java/drivers/chromedriver.exe");
			driver = new ChromeDriver();

		} else if (browserName.equals("InternetExplorer")) {
			System.setProperty("webdriver.ie.driver",
					"C:\\Selenium\\eclipse-jee-mars-2-win32-x86_64\\WorkSpace\\FreeeCRMMTest\\src\\main\\java\\drivers\\IEDriverServer.exe");
			// WebDriver driver= new InternetExplorerDriver();
			driver = new InternetExplorerDriver();
		} else if (browserName.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\Browser Driver\\geckodriver.exe");
			// WebDriver driver=new FirefoxDriver();
			driver = new FirefoxDriver();
		}
		
		//event listner 
		e_driver = new EventFiringWebDriver(driver);
		//now create the object of EventListenerHandler to register it with EventFiringWebDriver
		eventlistener = new WebEventListener();
		e_driver.register(eventlistener);
		driver = e_driver;
		
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		
		driver.get(prop.getProperty("url"));
		
		return driver;
	}
	
	//explicit wait for visible element
	public static void elementVisible(WebElement element, long timeout){
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	//explicit wait for clickable element
	public static void elementClickble(WebElement element, long timeout){
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		wait.until(ExpectedConditions.elementToBeClickable(element));
		}
	//click by javascript
	public static void clickByJavaScript(WebElement element){
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", element);
	}
}
