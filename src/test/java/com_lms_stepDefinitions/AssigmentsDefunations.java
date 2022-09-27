package com_lms_stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import com_lms_pageObjects.AscenDesOrderPage;
import com_lms_pageObjects.DeletePage;
import com_lms_pageObjects.EditAssignmentPage;
import com_lms_pageObjects.HeadingPage;
import com_lms_pageObjects.HomePage;
import com_lms_pageObjects.LoginPage;
import com_lms_pageObjects.SearchPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AssigmentsDefunations extends LmsBase {

	public HeadingPage hp;
	public SearchPage sp;
	public EditAssignmentPage eap;
	public DeletePage dp;
	public AscenDesOrderPage adp;
	public HomePage homepage;
	public LoginPage loginPage;

	
	@When("User click on manage assignment page")
	public void user_click_on_manage_assignment_page() throws Exception {
		Thread.sleep(3000);
		homepage.clickAssignmentrtab();

	}

	@Then("User should see a heading with text {string} on the page")
	public void user_should_see_a_heading_with_text_on_the_page(String actualTitle) {
		System.out.println("User is on Manage Assignment Page");
		driver.getTitle();
	}

	@Given("User launch the chrome browser")
	public void user_launch_the_chrome_browser() {
		System.out.println("User is on the browser");
		initialization();
		homepage = new HomePage();
		loginPage = new LoginPage();
		openUrl("https://lms-frontend-phase2.herokuapp.com");
	}

	@When("User opens URL {string}")
	public void user_opens_url(String url) throws InterruptedException {
		driver.get(url);
		System.out.println("LMS Application Launched Successfully");
		// Thread.sleep(3000);
	}

	@When("User enter Email as {string} and Password as {string}")
	public void user_enter_email_as_and_password_as(String email, String pwd) throws InterruptedException {
		loginPage.enter_UserName(pwd);
		loginPage.enter_Password(pwd);
		loginPage.clickLoginButton();
		Thread.sleep(3000);

	}

//
	@When("User click on login")
	public void user_click_on_login() {
		loginPage.clickLoginButton();
	}

	@Then("User can see the LMS homepage")
	public void user_can_see_the_lms_homepage() throws Exception {
		Assert.assertEquals("LMS[]", loginPage.getLoginAlert());
		Thread.sleep(3000);
	}

	

	@Then("Close browser")
	public void close_browser() {
		driver.close();
	}

//	

	// Search Assignment page
	// ************************

	@Given("User loged in and User is on Assignment page")
	public void user_loged_in_and_user_is_on_assignment_page() {
		sp = new SearchPage();
		System.out.println("User is on Assignment Page");

	}

	@When("User clicks on search with  name phrase  into search box")
	public void user_clicks_on_search_with_name_phrase_into_search_box() {

		sp.ClickOnSearchTextBox();
	}

	@Then("Enteries for name phrase are show")
	public void enteries_for_name_phrase_are_show() throws InterruptedException {

		driver.findElement(By.xpath("//input[@type = 'text']")).sendKeys("Sql Assignment");
		Thread.sleep(3000);
		sp.ClearProgram();
		driver.findElement(By.xpath("//input[@type = 'text']")).sendKeys("Selenium Assignment");
		sp.ClickOnSearchTextBox();
		Thread.sleep(3000);
		sp.ClearProgram();
		driver.findElement(By.xpath("//input[@type = 'text']")).sendKeys("Dev Assignment");
		sp.ClickOnSearchTextBox();
		Thread.sleep(3000);
		sp.ClearProgram();
	}

//Edit Assignment Page
//*****************************************

	@When("User clicks on Edit button")
	public void user_clicks_on_edit_button() {
		eap.ClickOnEditButton();
	}

	@Then("User lands on Assignment Details form")
	public void user_lands_on_assignment_details_form() {
		System.out.println("User lands on Program Details form.");
	}

	@When("User edits {string} and selects the Save button")
	public void user_edits_and_selects_the_save_button(String name) {

		eap.ClearAssignment();
		eap.EnternewAssignment(name);
		eap.ClickOnSaveButton();
	}

	@Then("User can see {string} message")
	public void user_can_see_message(String string) {
		System.out.println("Assignment Updated");
	}

	// DeletePage
	// *************************************

	@Given("User is on Assignment page")
	public void user_is_on_assignment_page() {
		hp.Clickon_Assignment_Tab();
	}

	@When("User clicks on Delete button after selecting an assignment")
	public void user_clicks_on_delete_button_after_selecting_an_assignment() {
		dp = new DeletePage();
		dp.ClickOnDeleteAssignmentBtn();
	}

	@Then("User lands on Confirm Deletion form.")
	public void user_lands_on_confirm_deletion_form() {
		Assert.assertTrue(
				driver.findElement(By.xpath("//div[@class='p-dialog-header ng-tns-c133-192 ng-star-inserted']"))
						.getText().contains("Confirm"));
	}

	@When("User click Yes")
	public void user_click_yes() throws InterruptedException {
		dp.ClickOnYesBtn();
		Thread.sleep(2000);
	}

	@When("User click No")
	public void user_click_no() {
		dp.ClickOnNoButton();
		dp.ClickOnDeleteAssignmentBtn();
	}


	@When("User clicks on Delete button on top left corner")
	public void user_clicks_on_delete_button_on_top_left_corner() {
		dp.ClickOnChkBox();
		dp.ClickOnDeleteAssignmentBtn();
		dp.ClickOnYesBtn();

		dp.ClickOnChkBox();
		dp.ClickOnDeleteAssignmentBtn();
		dp.ClickOnNoButton();

	}

	@When("User clicks <Yes> button")
	public void user_clicks_yes_button() {
		dp.ClickOnYesBtn();
	}

	// AccendingDecendingOrder
	// *****************************************

	@Given("User is on Assignment Page")
	public void user_is_on_assignment_page1() {
		System.out.println("User is on Assignment Page");
		adp = new AscenDesOrderPage();
	}

	@When("User clicks onthe Ascending arrow \\(down ) near to the Assignment name")
	public void user_clicks_onthe_ascending_arrow_down_near_to_the_assignment_name() {
		adp.ClickOnAccendingArrowBtn();
	}

	@Then("User can see the results in Ascending order of Assignment name")
	public void user_can_see_the_results_in_ascending_order_of_assignment_name() {
		System.out.println("User can see the Assignment Name in Ascending order");
	}

	@When("User clicks onthe Descending arrow \\(down ) near to the Assignment name")
	public void user_clicks_onthe_descending_arrow_down_near_to_the_assignment_name() {
		adp.ClickOnDescArrowBtn();
	}

	@Then("User can see the results in Descending order of Assignment name")
	public void user_can_see_the_results_in_descending_order_of_assignment_name() {
		System.out.println("User can see the Assignment Name in Descending order");
	}

}
