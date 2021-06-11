package org.locator;

import org.main.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingConfirmPage extends BaseClass {
	
	public BookingConfirmPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name = "radiobutton_0")
	private WebElement select;
	
	@FindBy(name = "continue")
	private WebElement continueBtn;

	public WebElement getSelect() {
		return select;
	}

	public WebElement getContinueBtn() {
		return continueBtn;
	}
	
	

}
