package org.demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDrivenFrameworkExcelWrite {

	public static void main(String[] args) throws IOException {
		
		File file = new File("E:\\Selenium-Java\\Programs Exection code\\MavenSampleProject\\Excel\\ExcelRead.xlsx");
		
		FileInputStream stream = new FileInputStream(file);
		
		Workbook workbook = new XSSFWorkbook(stream);
		
		Sheet createSheet = workbook.createSheet("Course");
		
		Row createRow = createSheet.createRow(0);
		
		Cell createCell = createRow.createCell(1);
		
		createCell.setCellValue("Test");
		
		FileOutputStream output = new FileOutputStream(file);
		
	workbook.write(output);
	
		

	}

}
