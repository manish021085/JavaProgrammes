package automation.E2EProject.testcases.SeleniumMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSValue {
	//getCssValue() method is used to retrieve CSS properties of any web element
	
WebDriver driver;
	
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "/Users/manishkumar/Downloads/chromedriver");
		driver = new ChromeDriver();		
	}
	
	public void getCSSFontSize() {
		driver.get("https://www.facebook.com/");
//		driver.findElement(By.xpath("//*[contains(text(),\"Don't Change\")]")).click();
		String fontSize = driver.findElement(By.cssSelector("[data-testid=\"royal_login_button\"]")).getCssValue("font-size");
		System.out.println("fontSize:-> "+ fontSize);
	}
	
	public void tearDown() {
		driver.quit();
	}

	public static void main(String[] args) {
		CSSValue cssValue = new CSSValue();
		cssValue.launchBrowser();
		cssValue.getCSSFontSize();
		

	}

}
