package automation.E2EProject.testcases.SeleniumMethods;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSExecutorMethods {

	/***
	 * JavascriptExecutor is a interface so we can not create object of JavascriptExecutor 
	 * so we use type-casting of JavascriptExecutor
	 */

	WebDriver driver;

	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "/Users/manishkumar/Downloads/chromedriver");
		driver = new ChromeDriver();
	}

	public void scrolDownPage1() {
		driver.get("https://www.amazon.in/");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1000)");
	}
	
//	public void scrolDownPage2() {
//		driver.get("https://www.amazon.in/");
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("arguments[0].scrollIntoView(true), //*[contains(text(),'Back to top')]");
//	}
	
	public void sendKey() {
		driver.get("https://www.amazon.in/");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("document.getElementById('twotabsearchtextbox').value='abc.efg@xyz.com'");
	}
	
	
	
	
	public void tearDown() {
		driver.quit();
	}

	public static void main(String[] args) throws InterruptedException {
		JSExecutorMethods jse = new JSExecutorMethods();
		jse.launchBrowser();
//		jse.scrolDownPage1();
		jse.sendKey();
		
		Thread.sleep(3000);
		jse.tearDown();
	}

}
