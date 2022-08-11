package Selenium_April_2022;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class readExcel
{
	public static void main(String[] args) throws IOException
	{
		FileInputStream srsfile = new FileInputStream("F:\\test1.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook(srsfile);
		
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		
		String user = sheet.getRow(0).getCell(0).getStringCellValue();
/*		System.out.println(sheet.getRow(0).getCell(0).getStringCellValue());
		System.out.println(sheet.getRow(1).getCell(0).getStringCellValue());*/
		
		String user1= sheet.getRow(0).getCell(1).getStringCellValue();
		System.out.println(sheet.getRow(0).getCell(1).getStringCellValue());
		System.out.println(sheet.getRow(1).getCell(1).getStringCellValue());
		
		
		
		
		
		
	}

}
