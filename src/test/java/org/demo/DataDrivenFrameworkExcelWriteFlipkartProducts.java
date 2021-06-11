package org.demo;

import java.awt.RenderingHints.Key;
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
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataDrivenFrameworkExcelWriteFlipkartProducts {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriverManager.edgedriver().setup();
		
		WebDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/?ef_id=a1f04637674714811187268ac21e9f9f:G:s&s_kwcid=AL!739!10!76347474199614!76347484024120&semcmpid=sem_F1167BY7_Brand_adcenter");;
			
		
		WebElement closeBtn = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		
		closeBtn.click();
		
		WebElement searchBox = driver.findElement(By.name("q"));
		
		searchBox.sendKeys("Iphone Mobile", Keys.ENTER);
		
		Thread.sleep(3000);
		
		List<WebElement> iPhones = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
		
		File file = new File("E:\\Selenium-Java\\Programs Exection code\\MavenSampleProject\\Excel\\ExcelRead.xlsx");
		
		FileInputStream stream = new FileInputStream(file);
		
		Workbook workbook = new XSSFWorkbook(stream);
		
		Sheet createSheet = workbook.createSheet("Flipkart");
		
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
