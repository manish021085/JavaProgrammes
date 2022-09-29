package ImpJavaProgram.ImpJavaProgram.utils;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class TakeScreenShots {

	public static String currentDir = System.getProperty("user.dir");
	
	//using TakesScreenshot interface  to take screenshot
	public static void main(String[] args) throws IOException {
		takesScreenshotInterface();
		ashotLibrary();
		

	}
	
//	public static void takeScreenShots() throws IOException {
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver = new ChromeDriver();
//		File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
////		String currentDir = System.getProperty("user dir");
//		FileUtils.copyFile(srcFile, new File(currentDir +"/screenshots/" + System.currentTimeMillis()+ ".png"));
//	}
	
	
	//using TakesScreenshot interface  to take screenshot
	public static void takesScreenshotInterface() throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
			
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		driver.get("https://www.google.com/");
		
		//Take the screenshot
        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        
        //Copy the file to a location and use try catch block to handle exception
        try {
            FileUtils.copyFile(screenshot, new File(currentDir +"/screenshots/" + System.currentTimeMillis()+ ".png"));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
		
//		takeScreenShots();
//		driver.get("https://www.amazon.in/");
//		takeScreenShots();
		System.out.println(driver.getTitle());
		
		//closing the webdriver
        driver.close();
	}
	
	//using Ashot library  to take full page screenshot
	public static void ashotLibrary() throws IOException{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
			
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		driver.get("https://www.amazon.in/");
		
		//Take the screenshot or capture screenshot and store the image
		Screenshot s=new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
		ImageIO.write(s.getImage(),"PNG",new File(currentDir +"/screenshots/" + System.currentTimeMillis()+ ".png"));
		System.out.println(driver.getTitle());
		
		//closing the webdriver
        driver.close();
	}
	

}
