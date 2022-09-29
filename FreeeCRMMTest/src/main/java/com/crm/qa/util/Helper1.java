package com.crm.qa.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Helper1 {
	
	public static Object[][] excelHelper1(int index) throws IOException{
	//public static void main(String args[]) throws IOException{	
		Object obj[][];
		
		File file= new File("/Users/manishkumar/Documents/New-Selenium/FreeeCRMMTest/src/main/java/com/crm/qa/testdata/crmtestdata1.xlsx");
		FileInputStream fiss=new FileInputStream(file);
		XSSFWorkbook wb1= new XSSFWorkbook(fiss);
		XSSFSheet shee = wb1.getSheetAt(index);
		int rowcou = shee.getLastRowNum();
		System.out.println("totalnum of row :--> "+rowcou);
		int columncou = shee.getRow(1).getLastCellNum();
		System.out.println("total number of column :--> "+columncou);
		obj=new Object[rowcou][columncou];
		for(int k=0; k<rowcou; k++){
			for(int l=0;l<columncou; l++){
				obj[k][l]=shee.getRow(k).getCell(l).toString();
				System.out.print(obj[k][l]+" ");
			}
		}
		return obj;
				
		
		
	}
	public static void main(String[] args) throws IOException {
		Helper1.excelHelper1(1);
	}

}
