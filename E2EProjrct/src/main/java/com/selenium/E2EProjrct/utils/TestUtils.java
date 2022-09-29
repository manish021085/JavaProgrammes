package com.selenium.E2EProjrct.utils;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.selenium.E2EProjrct.base.Base;

public class TestUtils extends Base {

	public static long PAGE_LOAD_TIMEOUT = 40;
	public static long IMPLICIT_WAIT = 30;

	// take screenshots
	public static void takesScreenShot() throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File screenshot = ts.getScreenshotAs(OutputType.FILE);
		//Copy the file to a location and use try catch block to handle exception
        try {
            FileUtils.copyFile(screenshot, new File(currentDir +"/screenshots/" + System.currentTimeMillis()+ ".png"));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
	}

}
