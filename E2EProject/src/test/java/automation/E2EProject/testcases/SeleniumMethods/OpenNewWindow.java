package automation.E2EProject.testcases.SeleniumMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenNewWindow {
	
WebDriver driver;
	
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "/Users/manishkumar/Downloads/chromedriver");
		driver = new ChromeDriver();		
	}
	
	public void openNewWindow() {
		driver.get("https://www.google.com/");
		// Opens a new window and switches to new window
		driver.switchTo().newWindow(WindowType.WINDOW);
		// Opens LambdaTest homepage in the newly opened window
		driver.navigate().to("https://www.lambdatest.com/");
	}
	
	public void openNewTab() {
		driver.get("https://www.google.com/");
		// Opens a new window and switches to new window
		driver.switchTo().newWindow(WindowType.TAB);
		// Opens LambdaTest homepage in the newly opened tab
		driver.navigate().to("https://www.lambdatest.com/");
	}
	
	public void tearDown() {
		driver.quit();
	}

	public static void main(String[] args) {
		OpenNewWindow onw = new OpenNewWindow();
		onw.launchBrowser();
		onw.openNewWindow();
		onw.openNewTab();
		onw.tearDown();
		// TODO Auto-generated method stub

	}

}
