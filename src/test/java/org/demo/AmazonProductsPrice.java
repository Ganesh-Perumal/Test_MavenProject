package org.demo;

import java.awt.image.AreaAveragingScaleFilter;
import java.sql.Driver;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.main.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AmazonProductsPrice extends BaseClass {

	public static void main(String[] args) throws InterruptedException {

		BaseClass b = new BaseClass();

		b.browserLaunch();

		b.urlNavigate("https://www.amazon.in/");

		WebElement findElement = driver.findElement(By.id("twotabsearchtextbox"));

		b.passValue(findElement, "Iphone Mobiles");

		Thread.sleep(3000);

		List<WebElement> findElements = driver.findElements(By.xpath("//span[@class='a-price-whole']"));

		List<Integer> l = new ArrayList<Integer>();
		
		for (int i = 0; i < findElements.size(); i++) {
			
			WebElement webElement = findElements.get(i);
			
			String text = webElement.getText();
			
			Integer integer = l.get(i).getInteger(text);
			
			System.out.println(integer);
								

		}
		
		
			
			
			
			
		}
		}
	


