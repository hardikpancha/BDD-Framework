package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.TestBase;

public class HomePage extends TestBase {

	@FindBy(xpath = "//h3[@class='RTL']")
	WebElement userNameLable;
	
	@FindBy(xpath = "//ul[@class='nav navbar-nav']//a[@title='Hotels']")
	WebElement HOTELS_link;
	
	@FindBy(xpath = "//ul[@class='nav navbar-nav']//a[@title='Flights']")
	WebElement FLIGHTS_link;
	
	@FindBy(xpath = "//li[@class = 'dropdown open']//a[@class='dropdown-toggle go-text-right' and @data-toggle = 'dropdown']")
	WebElement currency_change;
	
	@FindBy(xpath = "//a[@onclick = 'change_currency(this)' and @data-code = '18']")
	WebElement changeToINR;
	
	//Initializing the Page Objects:
	public HomePage() {
		
		PageFactory.initElements(driver, this);
	}
	
	public String verifyHomePageTitle() {
		return driver.getTitle();
	}
	
	public boolean verifyCorrectUserName() {
		
		return userNameLable.isDisplayed();
	}
	
	public void clickOnHotelsLink() {
		
		 HOTELS_link.click();
	}
	public void clickOnFlightsLink() {
		
		 FLIGHTS_link.click();
	}
	public void changeCurrency() {
		
		Actions action = new Actions(driver);
		action.moveToElement(currency_change).build().perform();
		changeToINR.click();
		
		
	}
}
