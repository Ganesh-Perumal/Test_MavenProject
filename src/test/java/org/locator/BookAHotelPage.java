package org.locator;

import org.main.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookAHotelPage extends BaseClass{
	
	public BookAHotelPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "first_name")
	private WebElement firstName;
	
	@FindBy(id = "last_name")
	private WebElement lastname;
	
	@FindBy(name = "address")
	private WebElement address;
	
	@FindBy(name = "cc_num")
	private WebElement creditCardNumber;
	
	@FindBy(name="cc_type")
	private WebElement CreditCardType;
	
	@FindBy(name = "cc_exp_month")
	private WebElement creditCardExpMonth;
	
	@FindBy(name="cc_exp_year")
	private WebElement creditCardExpYear;
	
	@FindBy(name = "cc_cvv")
	private WebElement cvv;
	
	@FindBy(id="book_now")
	private WebElement bookNowBtn;

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCreditCardNumber() {
		return creditCardNumber;
	}

	public WebElement getCreditCardType() {
		return CreditCardType;
	}

	public WebElement getCreditCardExpMonth() {
		return creditCardExpMonth;
	}

	public WebElement getCreditCardExpYear() {
		return creditCardExpYear;
	}

	public WebElement getCvv() {
		return cvv;
	}

	public WebElement getBookNowBtn() {
		return bookNowBtn;
	}
	
	

}
