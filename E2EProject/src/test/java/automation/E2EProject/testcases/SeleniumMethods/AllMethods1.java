package automation.E2EProject.testcases.SeleniumMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllMethods1 {
	WebDriver driver;
	
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "/Users/manishkumar/Downloads/chromedriver");
		driver = new ChromeDriver();		
	}
	
	public void locateByLinkText() {
		driver.get("https://www.amazon.in/");
//		driver.findElement(By.xpath("//*[contains(text(),\"Don't Change\")]")).click();
		driver.findElement(By.linkText("Today's Deals")).click();	
	}
	
	public void locateByPartialLinktext() {
		driver.get("https://www.amazon.in/");
		driver.findElement(By.partialLinkText("Customer")).click();
	}
	
	public void tearDown() {
		driver.quit();
	}
	
	
	
	

	public static void main(String[] args) throws InterruptedException {
		AllMethods1 obj = new AllMethods1();
		obj.launchBrowser();
		obj.locateByLinkText();
		Thread.sleep(3000);
		obj.locateByPartialLinktext();
		
		obj.tearDown();

	}

}
