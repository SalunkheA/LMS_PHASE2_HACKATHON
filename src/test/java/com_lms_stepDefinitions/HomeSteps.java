package com_lms_stepDefinitions;

import static org.testng.Assert.assertEquals;

import com_lms_pageObjects.HomePage;
import com_lms_pageObjects.LoginPage;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomeSteps extends LmsBase {

	LoginPage loginPage;
	HomePage homePage;

	@Before
	public void setUp() {
	//	homePage = new HomePage();
	}

	@Given("User is on the browser")
	public void user_is_on_the_browser() throws InterruptedException {
		System.out.println("User is on the browser");
		initialization();
		homePage = new HomePage();
		loginPage = new LoginPage();
		openUrl("https://lms-frontend-phase2.herokuapp.com");
	}

	@When("User landed on the Home page after logging into the LMS website")
	public void user_landed_on_the_home_page_after_logging_into_the_lms_website() throws InterruptedException {
		System.out.println("User is on the browser");
		loginPage.enter_UserName("LMS");
		loginPage.enter_Password("LMS");
		Thread.sleep(2000);
		this.loginPage.clickLoginButton();
		Thread.sleep(2000);
	}

	@Then("verify that title of the page is {string}")
	public void verify_that_title_of_the_page_is(String string) {
		assertEquals(this.homePage.getPageTitle(), string);
	}

	@Then("User should see a heading with text {string} on the Home page")
	public void user_should_see_a_heading_with_text_on_the_home_page(String string) {
		System.out.println(" --- " + this.homePage.getMenuBarTitle() + " -- ");
		assertEquals(this.homePage.getMenuBarTitle(), string);
	}

	// Home Page Buttons
	@Then("User should see a button with text {string} on the menu bar")
	public void user_should_see_a_button_with_text_on_the_menu_bar(String string) throws InterruptedException {
		boolean containsText = string.equalsIgnoreCase(this.homePage.getProramButtonTitle())
				|| string.equalsIgnoreCase(this.homePage.getBatchButtonText())
				|| string.equalsIgnoreCase(this.homePage.getUserButtonText())
				|| string.equalsIgnoreCase(this.homePage.getAttendaceButtonButtonText())
				|| string.equalsIgnoreCase(this.homePage.getAssignmentButtonText())
				|| string.equalsIgnoreCase(this.homePage.getLogOutButtonButtonText());
		System.out.println(" --  string -- " + string + " : " + containsText);
		assertEquals(containsText, true);
		Thread.sleep(2000);
	}

}
