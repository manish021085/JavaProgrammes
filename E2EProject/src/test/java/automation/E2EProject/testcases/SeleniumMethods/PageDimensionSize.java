package automation.E2EProject.testcases.SeleniumMethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageDimensionSize {
	
	WebDriver driver;
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "/Users/manishkumar/Downloads/chromedriver");
		driver = new ChromeDriver();
	}
	
	public void pageDimension() {
		driver.get("https://www.google.com/");
//		driver.manage().window().maximize();
		Dimension d = new Dimension(200, 200);
		driver.manage().window().setSize(d);
		
	}
	
	public void tearDown() {
		driver.quit();
	}

	public static void main(String[] args) {
		PageDimensionSize pds = new PageDimensionSize();
		pds.launchBrowser();
		pds.pageDimension();
//		pds.tearDown();

	}

}
