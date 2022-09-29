package com.selenium.E2EProjrct;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchChrome {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();



		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.in/");
		String title = driver.getTitle();
		System.out.println("title : " + title);
//		WebDriverManager.chromedriver().setup();
////		WebDriverManager.chromedriver().version("96.0.4664.110").setup();
//		 ChromeOptions options = new ChromeOptions();
//		WebDriver driver = new ChromeDriver(options);
////		driver = driver.Chrome(ChromeDriverManager().install());
//		driver.get("https://www.google.com/");

	}

}
