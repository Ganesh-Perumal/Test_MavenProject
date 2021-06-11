package org.demo;

import org.locator.BookAHotelPage;
import org.locator.BookingConfirmPage;
import org.locator.LoginPage;
import org.locator.SearchPage;
import org.main.BaseClass;
import org.openqa.selenium.WebElement;

public class HotelBooking extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		BaseClass Bclass = new BaseClass();

		Bclass.browserLaunch();
		Bclass.urlNavigate("http://adactinhotelapp.com/");

		LoginPage loginPage = new LoginPage();

		WebElement txtUserName = loginPage.getTxtUserName();
		Bclass.passValue(txtUserName, "karthi007");

		WebElement txtPassword = loginPage.getTxtPassword();
		Bclass.passValue(txtPassword, "Karthi@1989");

		WebElement loginBtn = loginPage.getLoginBtn();
		Bclass.btnClick(loginBtn);

		SearchPage searchPage = new SearchPage();
		WebElement location = searchPage.getLocation();

		Bclass.selectClass(location);

		Bclass.selectByVisibleText("Brisbane");

		WebElement hotels = searchPage.getHotels();
		Bclass.selectClass(hotels);
		Bclass.selectByvalue("Hotel Hervey");

		WebElement roomType = searchPage.getRoomType();
		Bclass.selectClass(roomType);
		Bclass.selectbyIndex(2);

		WebElement roomNos = searchPage.getRoomNos();
		Bclass.selectClass(roomNos);
		Bclass.selectbyIndex(4);

		WebElement checkInDate = searchPage.getCheckInDate();
		checkInDate.clear();
		Bclass.passValue(checkInDate, "01/08/2021");

		WebElement checkOutDate = searchPage.getCheckOutDate();
		checkOutDate.clear();
		Bclass.passValue(checkOutDate, "10/08/2021");

		WebElement adultRoom = searchPage.getAdultRoom();
		Bclass.selectClass(adultRoom);
		Bclass.selectbyIndex(3);

		WebElement childRoom = searchPage.getChildRoom();
		Bclass.selectClass(childRoom);
		Bclass.selectbyIndex(2);

		WebElement submitBtn = searchPage.getSubmitBtn();
		Bclass.btnClick(submitBtn);

		Thread.sleep(2000);

		BookingConfirmPage book = new BookingConfirmPage();
		WebElement select = book.getSelect();
		Bclass.btnClick(select);

		WebElement continueBtn = book.getContinueBtn();
		Bclass.btnClick(continueBtn);

		Thread.sleep(2000);

		BookAHotelPage page = new BookAHotelPage();

		WebElement firstName = page.getFirstName();
		Bclass.passValue(firstName, "Greens");

		WebElement lastname = page.getLastname();
		Bclass.passValue(lastname, "technolog");

		WebElement address = page.getAddress();
		Bclass.passValue(address, "OMR");

		WebElement creditCardNumber = page.getCreditCardNumber();
		Bclass.passValue(creditCardNumber, "5461234567891236");

		WebElement creditCardType = page.getCreditCardType();
		Bclass.selectClass(creditCardType);
		Bclass.selectbyIndex(2);

		WebElement creditCardExpMonth = page.getCreditCardExpMonth();
		Bclass.selectClass(creditCardExpMonth);
		Bclass.selectbyIndex(5);

		WebElement creditCardExpYear = page.getCreditCardExpYear();
		Bclass.selectClass(creditCardExpYear);
		Bclass.selectbyIndex(11);

		WebElement cvv = page.getCvv();
		Bclass.passValue(cvv, "123");

		WebElement bookNowBtn = page.getBookNowBtn();
		Bclass.btnClick(bookNowBtn);

	}

}
