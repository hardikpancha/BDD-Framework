package com.qa.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.TestBase;
import com.qa.util.TestUtil;

public class LoginPage extends TestBase {

	// Page Factory - OR(Object Reposatory):

	@FindBy(linkText = "MY ACCOUNT")
	WebElement MyAccount;

	@FindBy(linkText = "Login")
	WebElement Login;

	@FindBy(name = "username")
	WebElement username;

	@FindBy(name = "password")
	WebElement password;

	@FindBy(xpath = "//button[@type='submit']")
	WebElement LoginBtn;

	@FindBy(xpath = "/html/body/nav/div/div[1]/a/img")
	WebElement phptravelsLogo;

	// Initializing the Page Objects:
	public LoginPage() {

		PageFactory.initElements(driver, this);
	}

	// Actions:
	public String validateLoginPageTitle() {
		return driver.getTitle();

	}

	public boolean validatephptravelsImage() {

		return phptravelsLogo.isDisplayed();
	}

	public HomePage login(String un, String pwd) {

		MyAccount.click();
		Login.click();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		username.sendKeys(un);
		password.sendKeys(pwd);
		// LoginBtn.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", LoginBtn);

		return new HomePage();
	}

}
