package ImpJavaProgram.ImpJavaProgram.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

//import io.github.bonigarcia.wdm.WebDriverManager;


public class WebDriverManager {
	WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		
		io.github.bonigarcia.wdm.WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
	}
	
	@Test
	public void amazonTest() {
//		driver.get("https://www.amazon.in/");
		driver.get("https://www.spicejet.com/");
		System.out.println(driver.getTitle());
	}
	
	@AfterMethod
	public void tearDown() {
//		driver.quit();
	}

}
