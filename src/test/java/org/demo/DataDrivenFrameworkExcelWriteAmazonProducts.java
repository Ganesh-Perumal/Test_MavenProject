package org.demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.xmlbeans.impl.soap.Text;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataDrivenFrameworkExcelWriteAmazonProducts {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriverManager.edgedriver().setup();
		
		WebDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
		WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
		
		searchBox.sendKeys("Iphone mobiles",Keys.ENTER);
		
		Thread.sleep(3000);
		
		List<WebElement> iPhones = driver.findElements(By.xpath("//*[@class='a-size-medium a-color-base a-text-normal']"));
		
			
		File file = new File("E:\\Selenium-Java\\Programs Exection code\\MavenSampleProject\\Excel\\ExcelRead.xlsx");
		
		FileInputStream stream = new FileInputStream(file);
		
		Workbook workbook = new XSSFWorkbook(stream);
		
		Sheet createSheet = workbook.createSheet("Amazon products");
		
		for (int i = 0; i < iPhones.size(); i++) {
			String text = iPhones.get(i).getText();
			Row createRow = createSheet.createRow(i);
			Cell createCell = createRow.createCell(0);
			createCell.setCellValue(text);
		}
		
		FileOutputStream output = new FileOutputStream(file);
		workbook.write(output);

	}

}
