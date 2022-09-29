package com.crm.qa.util;

import java.io.File;
import java.io.IOException;

import org.apache.commons.collections4.FactoryUtils;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
//import org.testng.ITestResult;

import com.crm.qa.base.TestBase;

public class TestUtil extends TestBase {

	public static long PAGE_LOAD_TIMEOUT = 40;
	public static long IMPLICIT_WAIT = 30;

	// switch to frame mainpanel
	public void switchToFrame() {
		driver.switchTo().frame("mainpanel");
	}

	// take screenshot
	public static void takesScreenShot() throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File file = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File(
				"C:\\Selenium\\eclipse-jee-mars-2-win32-x86_64\\WorkSpace\\FreeeCRMMTest\\screenshot\\Homepage.png"));
	}

	// take screenshot
	public static void takesScreenShot(String gs) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File file = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file,
				new File("C:\\Selenium\\eclipse-jee-mars-2-win32-x86_64\\WorkSpace\\FreeeCRMMTest\\screenshot\\" + gs
						+ "Google_pa.png"));
	}

}
