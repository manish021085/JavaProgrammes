package com.selenium.E2EProjrct.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.selenium.E2EProjrct.base.Base;



public class ExcelData extends Base{
	
	public static void main(String[] args) throws IOException {
		//call the read method
		ExcelData.getData(0);
	}
	
	public static Object getData(int index) throws IOException{
		Object obj[][] = null;
		File file = new File(currentDir+ "/readDataFile/TestData.xlsx");
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
				System.out.print(obj[i][j]+ " ");
			}
		}
		return obj;		
	}
	
}
