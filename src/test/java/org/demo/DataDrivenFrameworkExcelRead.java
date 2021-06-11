package org.demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDrivenFrameworkExcelRead {

	public static void main(String[] args) throws IOException {
		
		File file = new File("E:\\Selenium-Java\\Programs Exection code\\MavenSampleProject\\Excel\\ExcelRead.xlsx");
		
		FileInputStream stream = new FileInputStream(file);
		
		Workbook workbook = new XSSFWorkbook(stream);
		
		Sheet sheet = workbook.getSheet("Sheet1");
		
		Row row = sheet.getRow(2);
		
		Cell cell = row.getCell(1);
		
		String stringCellValue = cell.getStringCellValue();
		
		System.out.println(stringCellValue);

	}

}
