package ImpJavaProgram.ImpJavaProgram.wait;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.google.common.base.Function;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FluintWaitDemo {
	// launch the driver with updated webdrivermanager dependency 5.x version
	/**
	 * <!-- https://mvnrepository.com/artifact/io.github.bonigarcia/webdrivermanager
	 * --> <dependency> <groupId>io.github.bonigarcia</groupId>
	 * <artifactId>webdrivermanager</artifactId> <version>5.1.1</version>
	 * </dependency>
	 * 
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException {
		test();
	}

	public static void test() throws InterruptedException {

//		WebDriverManager.chromedriver().setup();
//		WebDriver driver = new ChromeDriver();
		WebDriver driver = WebDriverManager.chromedriver().create();

		driver.get("https://www.google.co.in/");
//		driver.findElements(By.xpath("//input[@type='text']")).sendKeys("abcdefgh");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.name("q")).sendKeys("ABCD");
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		Thread.sleep(3000);
		

//		driver.findElement(By.linkText("ABCD: American-Born Confused Desi - Wikipedia")).click();

		// Waiting 30 seconds for an element to be present on the page, checking
		// for its presence once every 5 seconds.
		//Syntax for Selenium 4:
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(30, TimeUnit.SECONDS)
				.pollingEvery(5, TimeUnit.SECONDS)
				.ignoring(NoSuchElementException.class);
//		Wait wait = new FluentWait(driver)
//			    .withTimeout(30, TimeUnit.SECONDS)
//			    .pollingEvery(5, TimeUnit.SECONDS)
//			    .ignoring(NoSuchElementException.class);

		WebElement element = wait.until(new Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver driver) {
//				return driver.findElement(By.id("foo"));
				WebElement linkElement = driver.findElement(By.linkText("ABCD: American-Born Confused Desi - Wikipedia"));
				
				if(linkElement.isEnabled()) {
					System.out.println("Element is found");
				}
				return linkElement;
			}
		});
		
		element.click();

		Thread.sleep(3000);

		driver.close();
		driver.quit();

	}

}
