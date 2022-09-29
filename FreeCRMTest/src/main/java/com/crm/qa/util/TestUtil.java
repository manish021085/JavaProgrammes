package com.crm.qa.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.commons.math3.stat.inference.TestUtils;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.crm.qa.base.TestBase;

public class TestUtil extends TestBase {
	public static long PAGE_LOAD_TIMEOUT = 20;
	public static long IMPLICIT_WAIT = 20;
	
	//switch to frame mainpanel
	public static void switchtoFrame(){
		driver.switchTo().frame("mainpanel");
	}
	
	//take screenShot
	/*public static void takeScreenShot() throws IOException{
		TakesScreenshot ts = (TakesScreenshot)driver;
		File file = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File("C:\\Selenium\\eclipse-jee-mars-2-win32-x86_64\\WorkSpace\\FreeCRMTest\\src\\main\\java\\screenShots\\Homepage.png"));
		
	}*/
	
	//take a screenshot in current directory
	public static void takesScreenShotAtEndOfTest() throws IOException{
		File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String currentDir = System.getProperty("user dir");
		FileUtils.copyFile(srcFile, new File(currentDir +"/screenshots/" + System.currentTimeMillis()+ ".png"));
		
	}
	
	//get data from excel sheet
	public static Object getTestData(int index) throws IOException{
		Object obj[][] = null;
		File file = new File("C:\\Selenium\\eclipse-jee-mars-2-win32-x86_64\\WorkSpace\\FreeCRMTest\\src\\main\\java\\com\\crm\\qa\\testdata\\FreeCRMTestData.xlsx");
		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(index);
		int rowCount = sheet.getLastRowNum();
		System.out.println("Total numbet of rows : "+ rowCount);
		int columnCount = sheet.getRow(1).getLastCellNum();
		System.out.println("Total number of columns : "+ columnCount);
		
		obj = new Object[rowCount][columnCount];
		for(int i=0; i<rowCount; i++){
			for(int j=0; j<columnCount; j++){
				obj[i][j] = sheet.getRow(i+1).getCell(j).toString();
				//System.out.print(obj[i][j]+ " ");
			}
		}
		return obj;
		
		
	}
	/*public static void main(String[] args) throws IOException {
		TestUtil.getTestData(1);
	}*/
	
	//take screenShot
	

}
