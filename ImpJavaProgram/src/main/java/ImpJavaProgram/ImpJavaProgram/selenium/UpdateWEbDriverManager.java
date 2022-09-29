package ImpJavaProgram.ImpJavaProgram.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UpdateWEbDriverManager {
	//launch the driver with updated webdrivermanager dependency 5.x version
		/**
		 * <!-- https://mvnrepository.com/artifact/io.github.bonigarcia/webdrivermanager -->
			<dependency>
				<groupId>io.github.bonigarcia</groupId>
				<artifactId>webdrivermanager</artifactId>
				<version>5.1.1</version>
			</dependency>
		 * @param args
		 */
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
//		WebDriver driver = WebDriverManager.chromedriver().create();
		
		driver.get("https://www.google.co.in/");
//		driver.get("https://www.spicejet.com/");
//		driver.findElements(By.xpath("//input[@type='text']")).sendKeys("abcdefgh");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
//		driver.findElements(By.xpath("//input[@type='text']")).getText();
//		driver.quit();
		

	}

}
