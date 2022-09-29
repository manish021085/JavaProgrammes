package automation.E2EProject.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelHelper {
	
	public static String currentDir = System.getProperty("user.dir");
	
	public static Object[][] excelHelper(int index) throws IOException {
		
		Object obj[][];
		File file =new File("/Users/manishkumar/Documents/New-Selenium/E2EProject/src/main/java/automation/E2EProject/testdata/credentials.xlsx");
		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(index);
		int rowCount = sheet.getLastRowNum();
		System.out.println("totalnum of row :--> "+rowCount);
		short columnCount = sheet.getRow(1).getLastCellNum();
		System.out.println("total number of column :--> "+columnCount);
		obj = new Object[rowCount][columnCount];
		for(int i=0; i<rowCount; i++) {
			for(int j=0;j<columnCount; j++){
				obj[i][j]=sheet.getRow(i).getCell(j).toString();
				System.out.print(obj[i][j]+" ");
			}
		}
		return obj;		
	}
	public static void main(String[] args) throws IOException {
		ExcelHelper.excelHelper(1);
	}
	

}
