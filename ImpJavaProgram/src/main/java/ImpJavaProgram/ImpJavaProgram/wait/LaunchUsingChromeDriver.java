package ImpJavaProgram.ImpJavaProgram.wait;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchUsingChromeDriver {

	public static void main(String[] args) {
		String currentDir = System.getProperty("user.dir");
		
		System.setProperty("webdriver.chrome.driver",currentDir+"/drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
			
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		driver.get("https://www.google.com/");
		driver.get("https://www.amazon.in/");
		System.out.println(driver.getTitle());
		driver.quit();

	}

}
