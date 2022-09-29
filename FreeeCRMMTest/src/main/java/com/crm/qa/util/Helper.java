package com.crm.qa.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//import org.testng.annotations.Test;
//@Test
public class Helper {
	
	public static Object[][] excelHelper(int index) throws IOException{
		
		Object obj [][]=null;
		File fil=new File("C:\\Selenium\\eclipse-jee-mars-2-win32-x86_64\\WorkSpace\\FreeeCRMMTest\\src\\main\\java\\com\\crm\\qa\\testdata\\crmtestdata.xlsx");
		FileInputStream fis= new FileInputStream(fil);
		XSSFWorkbook wb= new XSSFWorkbook(fis);
		XSSFSheet sh = wb.getSheetAt(index);
		int rowcount = sh.getLastRowNum();
		System.out.println("total row in sheet :-->  "+rowcount);
		int columncount = sh.getRow(1).getLastCellNum();
		System.out.println("total number of colums :-->"+columncount);
		obj=new Object[rowcount][columncount];
		for(int i=0; i<rowcount;i++){
			for(int j=0;j<columncount;j++){
				obj[i][j]=sh.getRow(i+1).getCell(j).toString();
			}
		}
		return obj;
		
		
		
	}

}
