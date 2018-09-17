package com.qa.stepDefinition;

import org.junit.Assert;

import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;
import com.qa.util.TestBase;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class HomePageSteps extends TestBase {

	LoginPage loginPage;
	HomePage homePage;

	@Given("^user opens a browser$")
	public void user_opens_browser() {
		TestBase.initialization();
	}

	@Then("^user is on login page$")
	public void user_is_on_login_page() {
		loginPage = new LoginPage();
		String title = loginPage.validateLoginPageTitle();
		Assert.assertEquals("PHPTRAVELS | Travel Technology Partner", title);

	}

	@Then("^user logs into app$")
	public void user_logs_into_app() {

		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));

	}

	@Then("^validate home page title$")
	public void validate_home_page_title() {
		String homeTitle = homePage.verifyHomePageTitle();
		Assert.assertEquals("Login", homeTitle);

	}

	@And("^validate logged in username$")
	public void validate_logged_in_username() {
		
		boolean flag = homePage.verifyCorrectUserName();
		Assert.assertTrue(flag);

	}
	
	@Then("^check Hotels link$")
	public void check_Hotels_link() {
		
		homePage.clickOnHotelsLink();
	    
	}

	@Then("^check Flights link$")
	public void check_Flights_link() {
	   
		homePage.clickOnFlightsLink();
	}

//	@And("^change currency to INR$")
//	public void change_currency_to_INR() {
//	   
//		homePage.changeCurrency();
//	}
	@And("^close the browser$")
	public void close_the_browser() {
		
		driver.quit();
		
	}


}
