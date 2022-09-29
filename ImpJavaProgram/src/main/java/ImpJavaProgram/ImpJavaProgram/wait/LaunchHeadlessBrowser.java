package ImpJavaProgram.ImpJavaProgram.wait;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchHeadlessBrowser {
	public static void main(String[] args) {
		ChromeOptions co = new ChromeOptions();
		co.setHeadless(true);
//		WebDriver driver = WebDriverManager.chromedriver().create();
		WebDriver driver = WebDriverManager.chromedriver().capabilities(co).create();
		driver.get("https://www.google.co.in/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.quit();
	}

}
