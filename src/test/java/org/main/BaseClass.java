
package org.main;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {

	public static WebDriver driver;

	Actions action;

	public void browserLaunch() {

		System.setProperty("webdriver.edge.driver",
				"E:\\Selenium-Java\\Programs Exection code\\MavenSampleProject\\EdgeDriver\\msedgedriver.exe");

		driver = new EdgeDriver();

		driver.manage().window().maximize();
	}

	public void urlNavigate(String URL) {

		driver.get(URL);

	}
	
	

	public void passValue(WebElement element, String text) {

		element.sendKeys(text);

	}
	
	

	public void btnClick(WebElement element) {
		element.click();

	}

	public void moveToElement(WebElement target) {

		action = new Actions(driver);
		action.moveToElement(target).perform();

	}

	public void dragAndDrop(WebElement source, WebElement target) {
		action.dragAndDrop(source, target).perform();

	}
	
	public void mouseRightClick(WebElement target) {
		action.contextClick(target);

	}
	
	Alert alert;
	public void Alert(String value) {
		alert = driver.switchTo().alert();
		alert.sendKeys(value);
		alert.accept();

	}
	
	JavascriptExecutor js;
	public void javaScriptSetAttribute(String value, WebElement element) {
		js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('value','01/08/2021')",element);

	}
	
	public void javaScriptGetAttribute(WebElement element) {
		js.executeScript("return arguemtns[0].getAttribute('value')", element);

	}
	
	public void javaScriptClick(WebElement element) {
		js.executeScript("arguments[0].click()", element);

	}
	
	public void scrollDown(WebElement scrollDown) {
		
		js.executeScript("arguments[0].scrollIntoView(true)", scrollDown);

	}
	
	public void scrollUp(WebElement scrollUp) {
		js.executeScript("arguments[0].scrollIntoView(false)", scrollUp);

	}
	Select s;
	public void selectClass(WebElement element) {
		s = new Select(element);
		
	}
	
	public void selectbyIndex(int index) {
		s.selectByIndex(index);

	}
	public void selectByvalue(String value) {
		s.selectByValue(value);

	}
	
	public void selectByVisibleText(String text) {
		s.selectByVisibleText(text);

	}
	
	public void deSelectByIndex(int index) {
		s.deselectByIndex(index);

	}
	
	public void deSelectbyValue(String Value) {
		s.deselectByValue(Value);

	}
	
	public void deSelectbyVisibleText(String Text) {
		s.deselectByVisibleText(Text);

	}

}
