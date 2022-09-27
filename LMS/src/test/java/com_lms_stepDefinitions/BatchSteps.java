package com_lms_stepDefinitions;

import org.testng.Assert;

import com_lms_pageObjects.BatchPages;
import com_lms_pageObjects.HomePage;
import com_lms_pageObjects.LoginPage;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BatchSteps extends LmsBase {

	BatchPages batchPage;
	LoginPage loginPage;
	HomePage homePage;

	@Before(order = 1)
	public void setUp() throws InterruptedException {
		System.out.println("****** User is on the browser*************");
		initialization();
		homePage = new HomePage();
		loginPage = new LoginPage();
		openUrl("https://lms-frontend-phase2.herokuapp.com");
		batchPage = new BatchPages();
		loginPage.enter_UserName("LMS");
		loginPage.enter_Password("LMS");
		Thread.sleep(2000);
		this.loginPage.clickLoginButton();
		Thread.sleep(2000);
	}

	@Given("User clicks on Batch")
	public void user_clicks_on_batch() {
		homePage.batchButtonClick();
	}

	@When("User should see a heading with text {string}")
	public void user_should_see_a_heading_with_text(String string) {
		String HeadingManageBatch = batchPage.validateName();
		Assert.assertEquals(HeadingManageBatch, "Manage Batch");

	}

	@When("Delete button is disabled")
	public void delete_button_is_disabled() {
		System.out.println("Is Disabled");
	}

	@When("User searches by batchname")
	public void user_searches_by_batchname() {
		batchPage.clicksearch();

	}

	@Then("User clicks edit button")
	public void user_clicks_edit_button() {
		batchPage.ClickEdit();
	}

	@Then("User validate batch details with text {string}")
	public void user_validate_batch_details_with_text(String string) {
		String batchDetails = batchPage.validateBatchDetails();
		Assert.assertEquals(batchDetails, "Batch Details");
	}

	@When("User edit batch name")
	public void user_edit_batch_name() {
		batchPage.bName();
	}

	@Then("User edit batch description")
	public void user_edit_batch_description() {
		batchPage.EDescription();
	}

	@Then("User edit program name")
	public void user_edit_program_name() throws InterruptedException {
		batchPage.EProgramName();
	}

	@Then("User edit status")
	public void user_edit_status() throws InterruptedException {
		batchPage.Estatus();
	}

	@Then("User edit Classes")
	public void user_edit_classes() {
		batchPage.NumberofClasses();
	}

	@Then("User click save button")
	public void user_click_cancel_button() throws InterruptedException {
		batchPage.clickSave();
		String save = batchPage.clickSave();
		Assert.assertEquals(save, "Save");

		System.out.println(save);
	}

	@Then("User clicks cancel button")
	public void user_clicks_cancel_button() {
		batchPage.ClickCancel();
	}

	@Then("User verifies that the details are correctly updated.")
	public void user_verifies_that_the_details_are_correctly_updated() {
		String batchname = batchPage.CorrectlyUpdated();
		Assert.assertEquals(batchname, "SDET951");
	}

//	@Given("user clicks delete button for any batch")
//	public void user_clicks_delete_button_for_any_batch() {
//	    hp.Select();
//	}
//
//	@Then("user will get confirm deletion popup")
//	public void user_will_get_confirm_deletion_popup() {
//	    hp.Deletebutton();
//	}
//
//	@Then("User clicks Yes button")
//	public void user_clicks_yes_button() {
//	    hp.conformedDelete();
//	}

	// add new batch

	@Given("User clicks A New Batch button")
	public void user_clicks_a_new_batch_button() throws InterruptedException {
		Thread.sleep(1000);
		batchPage.ClickNewBatch();
	}

	@When("user can see Batch details form")
	public void user_can_see_batch_details_form() {
		String Details = batchPage.BatchDetails();
		Assert.assertEquals(Details, "Batch Details");
	}

	@Then("User clicks Save button without entering data")
	public void user_clicks_save_button_without_entering_data() {
		batchPage.ClickSave();
	}

	@Then("User gets message Name is required")
	public void user_gets_message_name_is_required() {
		String name = batchPage.Requiredfield();
		Assert.assertEquals(name, "Name is required.");
		System.out.println("Please fill the field" + name);
	}

	@Then("User clicks batch details Cancel button")
	public void user_clicks_batch_details_cancel_button() {
		batchPage.ClickbatchDetails();

	}

	@Then("User  entering program name")
	public void user_entering_program_name() {
		batchPage.ProgramDetails();
	}

	// Pagenation

	@When("User is clicks first page of Manage batch")
	public void user_is_clicks_first_page_of_manage_batch() {
		batchPage.ClickFirstPagenation();
	}

	@Then("User clicks navigate right arrow button")
	public void user_clicks_navigate_right_arrow_button() throws InterruptedException {
		batchPage.Clickrightarrow();
	}

	@Then("User clicks navigate left arrow button")
	public void user_clicks_navigate_left_arrow_button() {
		batchPage.Clickleftarrow();
	}

	@Then("User is clicks Second page of Manage batch")
	public void user_is_clicks_second_page_of_manage_batch() {
		batchPage.ClickSecondPagenation();
	}

	// Ascending order and Descending order

	@When("User clicks on the Ascending arrow down  near to the Batch name")
	public void user_clicks_on_the_ascending_arrow_down_near_to_the_batch_name() throws InterruptedException {
		batchPage.AbatchName();
	}

	@Then("User clicks on the Ascending arrow \\(down ) near to the Batch Description")
	public void user_clicks_on_the_ascending_arrow_down_near_to_the_batch_description() {
		batchPage.AbatchDescription();
	}

	@Then("User clicks on the Ascending arrow \\(down ) near to the Batch Status")
	public void user_clicks_on_the_ascending_arrow_down_near_to_the_batch_status() throws InterruptedException {
		batchPage.AbatchStatus();
	}

	@Then("User clicks on the Ascending arrow \\(down ) near to the No Of Classes")
	public void user_clicks_on_the_ascending_arrow_down_near_to_the_no_of_classes() {
		batchPage.ANoOfClasses();
	}

	@Then("User clicks on the Ascending arrow \\(down ) near to the Program Name")
	public void user_clicks_on_the_ascending_arrow_down_near_to_the_program_name() throws InterruptedException {
		batchPage.AprogramName();
	}

	@Then("User clicks onthe Descending arrow \\(down ) near to the Batch name")
	public void user_clicks_onthe_descending_arrow_down_near_to_the_batch_name() throws InterruptedException {
		batchPage.AbatchName();
	}

	@Then("User clicks onthe Descending arrow \\(down ) near to the Batch Description")
	public void user_clicks_onthe_descending_arrow_down_near_to_the_batch_description() {
		batchPage.AbatchDescription();
	}

	@Then("User clicks onthe Descending arrow \\(down ) near to the Batch Status")
	public void user_clicks_onthe_descending_arrow_down_near_to_the_batch_status() throws InterruptedException {
		batchPage.AbatchStatus();
	}

	@Then("User clicks on the Descending arrow \\(down ) near to the No Of Classes")
	public void user_clicks_on_the_descending_arrow_down_near_to_the_no_of_classes() {
		batchPage.ANoOfClasses();
	}

	@Then("User clicks on the Descending arrow \\(down ) near to the Program Name")
	public void user_clicks_on_the_descending_arrow_down_near_to_the_program_name() throws InterruptedException {
		batchPage.AprogramName();
	}

	// Delete Batch

	@Given("user clicks delete button for any batch")
	public void user_clicks_delete_button_for_any_batch() throws InterruptedException {
		batchPage.DeleteOneBatch();

	}

	@Then("User clicks Yes button")
	public void user_clicks_yes_button() throws InterruptedException {
		batchPage.clickYesButton();
	}

	@Then("User clicks No button")
	public void user_clicks_no_button() {
		batchPage.clickNoButton();
	}

	// Multiple Batches

	@Given("User selects more than one Batch using checkbox")
	public void user_selects_more_than_one_batch_using_checkbox() throws InterruptedException {
		batchPage.DeleteMultipleBatches();
	}

}
