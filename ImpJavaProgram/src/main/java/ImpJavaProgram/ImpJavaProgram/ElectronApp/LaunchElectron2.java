package ImpJavaProgram.ImpJavaProgram.ElectronApp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchElectron2 {

	public static void main(String[] args) {
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
//		options.addArguments("--start-maximized"); //open Browser in maximized mode
//		options.addArguments("--no-sandbox"); //bypass OS security model
//		options.addArguments("--disable-dev-shm-usage"); //overcome limited resource problems
////		options.add_experimental_option("excludeSwitches",["enable-automation"]);
////		options.add_experimental_option("useAutomationExtension", False);
//		options.addArguments("--start-fullscreen");
//		options.addArguments("start-maximized");
//		options.addArguments("disable-infobars");
//		options.setBinary("/Users/manishkumar/Documents/New-lalitech-code/Phoenix-App/slackTeam_electron");
//		
		DesiredCapabilities capabilities = new DesiredCapabilities();
////		String remoteDebuggingAddress = "http://localhost:3000";
////		options.setExperimentalOption("debuggingAddress", remoteDebuggingAddress);
//		capabilities.setCapability(ChromeOptions.CAPABILITY, options);
//		ChromeDriverService chromeservices = new ChromeDriverService.Builder().build(); 
//		capabilities.setCapability("chromeOptions", options);
//		capabilities.setBrowserName("chrome");
//		
//		driver = new ChromeDriver(capabilities);

//		if (driver.findElements(By.id("button-about")).size() > 0) {
//	           driver.findElement(By.id("button-about")).click();
//		}
//		List elements = driver.findElements(By.className("nav-button"));
//	       for (WebElement element : elements) {
//	           element.click();
//	       }

//		driver.get("https://www.google.com/");

		ChromeOptions opt = new ChromeOptions();
//		opt.addArguments("--start-fullscreen");
//		opt.addArguments("disable-infobars");
		String remoteDebuggingAddress = "http://localhost:3000";
		opt.setExperimentalOption("debuggingAddress", remoteDebuggingAddress);
//		opt.setBinary("/Users/manishkumar/Documents/New-lalitech-code/Phoenix-App/slackTeam_electron");
//		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(ChromeOptions.CAPABILITY, opt);
//		capabilities.setBrowserName("chrome");
		driver = new ChromeDriver(opt);
		
//		WebDriver driver;
//		ChromeOptions options = new ChromeOptions();
//		options.capabilitiesrManager.chromedriver().setup(); //you have to add WebDriverManager dependency or library.
//		driver = new ChromeDriver(options);
		driver.get("https://www.google.com/");

	}

}
