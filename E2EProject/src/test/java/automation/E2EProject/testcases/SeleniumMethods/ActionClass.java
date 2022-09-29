package automation.E2EProject.testcases.SeleniumMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {
	
WebDriver driver;
	
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "/Users/manishkumar/Downloads/chromedriver");
		driver = new ChromeDriver();		
	}
	
	public void moveMouse() {
		driver.get("https://www.amazon.in/");
		WebElement acList = driver.findElement(By.id("nav-link-accountList"));
		Actions act = new Actions(driver);
		act.moveToElement(acList).perform();
		
				
	}

	public static void main(String[] args) {
		ActionClass actClass = new ActionClass();
		actClass.launchBrowser();
		actClass.moveMouse();
	}

}
