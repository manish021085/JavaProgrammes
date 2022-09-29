package com.selenium.E2EProjrct;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;



public class Demo {

	@Test
	public void setup() {
		WebDriver driver;
//		WebDriverManager.getInstance(CHROME).setup();
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		String title = driver.getTitle();
		System.out.println(title);
//		driver.quit();
	}

}
