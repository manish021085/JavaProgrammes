package automation.E2EProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws InterruptedException
    {
        System.setProperty("webdriver.chrome.driver", "/Users/manishkumar/Downloads/chromedriver");
//        System.setProperty("webdriver.chrome.driver", "/E2EProject/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        
        Thread.sleep(3000);
        driver.quit();
        
    }
}
