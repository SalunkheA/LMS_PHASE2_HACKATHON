package com_lms_stepDefinitions;

import org.junit.After;
import org.junit.Assert;

import com_lms_pageObjects.HomePage;
import com_lms_pageObjects.LoginPage;
import com_lms_pageObjects.UserPage;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UserSteps extends LmsBase {

	UserPage manageUserPage;
	
	HomePage homePage;
	LoginPage loginPage;
	
	@Before
	public void init() throws InterruptedException {
		/*
		 * System.out.println("User is on the browser"); initialization(); homePage =
		 * new HomePage(); loginPage = new LoginPage();
		 * openUrl("https://lms-frontend-phase2.herokuapp.com"); manageUserPage = new
		 * UserPage(); System.out.println("User is on the browser");
		 * loginPage.enter_UserName("LMS"); loginPage.enter_Password("LMS");
		 * Thread.sleep(2000); this.loginPage.clickLoginButton(); Thread.sleep(2000);
		 */
	}

	@Given("User is on any page after Login LMS")
	public void user_is_on_any_page_after_Login_LMS() throws InterruptedException {
		
	}

	@When("User clicks the Tab User")
	public void user_clicks_the_tab_user() {
		manageUserPage.clickUsertab();
	}

	@Then("User should see the Manage user page")
	public void user_should_see_the_manage_user_page() {

		String title = manageUserPage.Locate_userPagetitle();
		Assert.assertEquals(title, "Manage User");
	}

	@When("User is on the Manage user page after clicking User Tab")
	public void user_is_on_the_manage_user_page_after_clicking_user_tab() throws InterruptedException {
		String title = manageUserPage.Locate_userPagetitle();
		Assert.assertEquals(title, "Manage User");
	}

	@Then("User should see the pagination controls below data table")
	public void user_should_see_the_pagination_controls_below_data_table() throws InterruptedException {
		manageUserPage.locatePaginationControl();

	}

	@Given("User is on Manage user page")
	public void user_is_on_manage_user_page() {
		manageUserPage = new UserPage();
		manageUserPage.Locate_userPagetitle();
	}

	@When("Manage user table has less less than or equal to {int} rows")
	public void manage_user_table_has_less_less_than_or_equal_to_rows(int int5) throws Exception {
		manageUserPage.verify_dispalyed_row_count();
	}

	@Then("Pagination control should be disabled")
	public void pagination_control_should_be_disabled() throws InterruptedException {
		manageUserPage.click_next_page_is_disabled();
	}

	@When("Manage user table has more than {int} rows")
	public void manage_user_table_has_more_than_rows(int rows) throws InterruptedException {
		manageUserPage = new UserPage();
		manageUserPage.add_New_user_1();
		manageUserPage.add_New_user_2();
	}

	@Then("Pagination control should be enabled")
	public void pagination_control_should_be_enabled() throws Exception {
		manageUserPage.verify_dispalyed_row_count();
	}

	@When("User cliks next link of pagination")
	public void user_cliks_next_link_of_pagination() throws InterruptedException {
		manageUserPage = new UserPage();
		manageUserPage.click_next_page_link();

	}

	@Then("Next page should be displayed")
	public void next_page_should_be_displayed() {
		manageUserPage.click_next_page_is_displayed();

	}

	@Given("last page of User records are displayed")
	public void last_page_of_user_records_are_displayed() throws Exception {
		manageUserPage = new UserPage();
		manageUserPage.verify_dispalyed_row_count();
	}

	@Then("Next link of pagination should be disabled")
	public void next_link_of_pagination_should_be_disabled() throws InterruptedException {
		manageUserPage.click_next_page_link();

	}

	@Given("User table is displayed in Manage User page")
	public void User_table_is_displayed_in_Manage_User_page() {
		String title = manageUserPage.Locate_userPagetitle();
		Assert.assertEquals(title, "Manage User");

	}

	@When("User cliks previous link of pagination")
	public void user_cliks_previous_link_of_pagination() throws InterruptedException {
		manageUserPage = new UserPage();
		manageUserPage.click_previous_page_link();

	}

	@Then("previous page should be displayed")
	public void previous_page_should_be_displayed() {

		manageUserPage.click_previous_page_link_is_displayed();
	}

	@Given("First page of user table is displayed")
	public void first_page_of_user_table_is_displayed() throws InterruptedException {
		manageUserPage = new UserPage();
		manageUserPage.click_previous_page_link();

	}

	@When("User Cliks previous link of pagination")
	public void user_Cliks_previous_link_of_pagination() throws InterruptedException {
		manageUserPage = new UserPage();
		manageUserPage.click_previous_page_link();

	}

	@Then("Previous link of Pagination should be Disabled")
	public void Previous_link_of_Pagination_should_be_Disabled() throws InterruptedException {
		manageUserPage.click_previous_page_link();
	}

	@Given("User Table is displayed in manage User page")
	public void User_Table_is_displayed_in_manage_User_page() throws InterruptedException {
		manageUserPage = new UserPage();
		manageUserPage.click_previous_page_link();
	}

	@When("User clicks << icon in pagination")
	public void user_clicks_previouspage_icon_in_pagination() throws InterruptedException {
		manageUserPage.click_previous_page_link();
	}

	@Then("User should see the First page of the table")
	public void user_should_see_the_first_page_of_the_table() throws Exception {
		manageUserPage.verify_dispalyed_row_count();
	}

	@When("User clicks >> icon in pagination")
	public void user_clicks_nextpage_icon_in_pagination() throws InterruptedException {
		manageUserPage = new UserPage();
		manageUserPage.click_next_page_link();
	}

	@Then("User should see the last page of the table")
	public void user_should_see_the_last_page_of_the_table() {
		manageUserPage.click_next_page_is_displayed();
	}

	@Given("User is logged on to the LMS website")
	public void user_is_logged_on_to_the_lms_website() throws InterruptedException {
		manageUserPage = new UserPage();
		String title = manageUserPage.Locate_userPagetitle();
		Assert.assertEquals(title, "Manage User");

	}

	@When("User lands on Manage User page")
	public void user_lands_on_manage_user_page() throws InterruptedException {
		manageUserPage = new UserPage();
		manageUserPage.click_previous_page_link();
		driver.navigate().back();
		manageUserPage = new UserPage();
		manageUserPage.clickUsertab();
	}

	@Then("User should see the text  {string} beow the user table")
	public void user_should_see_the_text_beow_the_user_table(String string) {
		manageUserPage.tableFooter();

	}
	////////// Table

	@Given("User is logged on to the LMS website using valid credentials")
	public void User_is_logged_on_to_the_LMS_website_using_valid_credentials() {
		manageUserPage = new UserPage();
		manageUserPage.Locate_userPagetitle();
	}

	@When("User is in the Manage user page")
	public void user_is_i_the_manage_user_page() {
		String title = manageUserPage.Locate_userPagetitle();
		Assert.assertEquals(title, "Manage User");
	}

	@Then("User should see the table footer as {string}.")
	public void user_should_see_the_table_footer_as(String string) {
		manageUserPage.tableFooter();
	}

	@Then("User should see the button with text {string}")
	public void user_should_see_the_button_with_text(String string) {
		manageUserPage = new UserPage();
		manageUserPage.verify_add_new_user_button_is_displayed();
	}

	@When("User clicks Add New User button")
	public void user_clicks_Add_New_User_button() throws InterruptedException {
		manageUserPage = new UserPage();
		manageUserPage.click_add_new_user();

	}

	@Then("User should see the {string} dialog box")
	public void user_should_see_the_dialog_box(String string) {
		manageUserPage.display_user_details();
	}

	@When("User clicks sort icon in table header")
	public void user_clicks_sort_icon_in_table_header() {
		manageUserPage.cancel_user_window();
		manageUserPage.click_sort_icon();

	}

	@Then("Table rows should be sorted")
	public void table_rows_should_be_sorted() {
		manageUserPage.click_sort_icon();
	}

	@When("User checks empty checkbox in header")
	public void user_checks_empty_checkbox_in_header() throws InterruptedException {
		manageUserPage.click_checkbox();
		Thread.sleep(2000);
	}

	@Then("Check box in all the rows of user table should be checked")
	public void check_box_in_all_the_rows_of_user_table_should_be_checked() {

	}

	@When("User unchecks checkbox in header")
	public void user_unchecks_checkbox_in_header() {
		manageUserPage.click_checkbox();
	}

	@Then("Check box in all the rows of user table should be unchecked")
	public void check_box_in_all_the_rows_of_user_table_should_be_unchecked() {

	}

	//// Delete Icon

	@Given("User is on any page after Login with valid credentials")
	public void User_is_on_any_page_after_Login_with_valid_credentials() {
		manageUserPage = new UserPage();
		manageUserPage.Locate_userPagetitle();
	}

	@Then("User should see the delete icon at the top left corner of the user table")
	public void user_should_see_the_delete_icon_at_the_top_left_corner_of_the_user_table() {

	}

	@When("no rows is checked")
	public void no_rows_is_checked() {

	}

	@Then("Delete icon at the top left corner of the user table disabled")
	public void delete_icon_at_the_top_left_corner_of_the_user_table_disabled() {

	}

	@When("User checks the rows in user table")
	public void user_checks_the_rows_in_user_table() {
		manageUserPage = new UserPage();
		manageUserPage.click_checkbox();
	}

	@Then("Delete icon at the top left corner of the user table enabled")
	public void delete_icon_at_the_top_left_corner_of_the_user_table_enabled() {
		manageUserPage.verify__deleteIcon_is_enabled();
	}

	@When("User clicks the delete icon at the top left corner of user table")
	public void user_clicks_the_delete_icon_at_the_top_left_corner_of_user_table() {
		manageUserPage.click_deleteIcon();
	}

	@Then("Confirm dialog box should be displayed with Text {string} , button with text {string} , the button with text {string} and close\\(X) icon")
	public void confirm_dialog_box_should_be_displayed_with_text_button_with_text_the_button_with_text_and_close_x_icon(
			String string, String string2, String string3) {
		manageUserPage = new UserPage();
	}

	@When("User clicks button with text {string}")
	public void user_clicks_button_with_text(String No) {
		manageUserPage = new UserPage();
		manageUserPage.click_No_in_confirm_window();

	}

	@Then("Selected rows should not be deleted and dialog box should be closed")
	public void selected_rows_should_not_be_deleted_and_dialog_box_should_be_closed() {
		manageUserPage.display_confirm_window();
	}

	@Then("Selected rows should be deleted and popup should be shown with success message {string}")
	public void selected_rows_should_be_deleted_and_popup_should_be_shown_with_success_message(String Yes) {
		manageUserPage.click_deleteIcon();
		manageUserPage.click_Yes_in_confirm_window();
		driver.navigate().back();
		manageUserPage = new UserPage();
		manageUserPage.clickUsertab();

	}

	@When("User clicks the close\\(x) icon")
	public void user_clicks_the_close_x_icon() {

	}

	@Then("Confirm dialog box should be closed")
	public void confirm_dialog_box_should_be_closed() {

	}

	//// Edit////

	@Given("User is on user page after Login")
	public void user_is_on_user_page_after_Login() {
		manageUserPage = new UserPage();
		manageUserPage.Locate_userPagetitle();
	}

	@When("User is on the user page after clicking User Tab")
	public void user_is_on_the_user_page_after_clicking_user_tab() throws InterruptedException {
		manageUserPage = new UserPage();
		manageUserPage.clickUsertab();
	}

	@Then("User should see the buttons with edit\\/delete icon in each row of Edit\\/Delete coulmn")
	public void user_should_see_the_buttons_with_edit_delete_icon_in_each_row_of_edit_delete_coulmn() {

	}

	@When("User clicks delete button")
	public void user_clicks_delete_button() throws InterruptedException {
		manageUserPage = new UserPage();
		manageUserPage.click_deleteIcon_near_editIcon();
	}

	@When("User clicks Edit button")
	public void user_clicks_edit_button() throws InterruptedException {
		manageUserPage.click_editIcon();

	}

	@Then("{string} dialog box should be displayed for editing")
	public void dialog_box_should_be_displayed_for_editing(String string) {
		manageUserPage.display_user_details();
		manageUserPage.cancel_user_window();
	}

	@Given("User is on any page after Login")
	public void user_is_on_any_page_after_Login() {
		manageUserPage = new UserPage();
		manageUserPage.Locate_userPagetitle();
	}

	@When("User is on the Manage user page")
	public void user_is_on_the_manage_user_page() {
		manageUserPage.Locate_userPagetitle();
	}

	@Then("User should see the Search input field after the delete icon")
	public void user_should_see_the_search_input_field_after_the_delete_icon() {
		manageUserPage.verify_searchfield_display();
	}

	@When("User types Name to search")
	public void user_types_name_to_search() {
		manageUserPage.searchfield();
	}

	@Then("Rows with the name should be displayed")
	public void rows_with_the_name_should_be_displayed() throws Exception {
		manageUserPage.verify_dispalyed_row_count();

	}

	@When("User types random text in search field which has no matching entry")
	public void user_types_random_text_in_search_field_which_has_no_matching_entry() {
		manageUserPage.check_random_user_in_searchfield();
	}

	@Then("rows are not displayed")
	public void rows_are_not_displayed() throws Throwable {
		manageUserPage.verify_dispalyed_row_count();
	}

	@Given("User table is displayed in manage user page")
	public void user_table_is_displayed_in_manage_user_page() {
		driver.navigate().back();
		manageUserPage = new UserPage();
		manageUserPage.clickUsertab();
	}

	@When("User clicks ID in any row")
	public void user_clicks_id_in_any_row() {

		manageUserPage = new UserPage();
		manageUserPage.click_ID();

	}

	@Then("User details dialog box displayed with user information")
	public void user_details_dialog_box_displayed_with_user_information() throws InterruptedException {
		manageUserPage = new UserPage();
		manageUserPage.cancel_user_window();
		Thread.sleep(2000);

	}

	/// User Details Window
	@Given("User is on User details page window")
	public void user_is_on_user_details_page_window() {
		manageUserPage = new UserPage();
		String title = manageUserPage.Locate_userPagetitle();
		Assert.assertEquals(title, "Manage User");

	}

	@When("User clicks Add new user button")
	public void User_clicks_add_new_User_button() {
		manageUserPage = new UserPage();

		manageUserPage.click_add_new_user();
	}

	@Then("User should see User details window with heading {string}")
	public void user_should_see_user_details_window_with_heading(String string) {
		manageUserPage.display_user_details();
		manageUserPage.cancel_user_window();
	}

	@Given("User is on Manage User Page")
	public void User_is_on_Manage_User_Page() {
		manageUserPage.Locate_userPagetitle();

	}

	@When("User clicks A Add new user button")
	public void user_clicks_a_Add_new_user_button() {
		manageUserPage = new UserPage();

		manageUserPage.click_add_new_user();
	}

	@Then("User should see a button with text Cancel in user details window")
	public void user_should_see_a_button_with_text_cancel_in_user_details_window() {
		manageUserPage.verify_cancel_btn_display();
	}

	@When("User clicks A cancel button")
	public void user_clicks_a_cancel_button() {
		manageUserPage.cancel_user_window();
	}

	@Then("User details window should be closed")
	public void user_details_window_should_be_closed() {
		manageUserPage.Locate_userPagetitle();

	}

	@Given("User is on manage user Page")
	public void User_is_on_Manage_user_Page() {
		manageUserPage.Locate_userPagetitle();

	}

	@When("User clicks A add New user button")
	public void user_clicks_a_add_New_user_button() {
		manageUserPage = new UserPage();

		manageUserPage.click_add_new_user();
	}

	@Then("User should see a cancel\\(x) in user details window")
	public void user_should_see_a_cancel_x_in_user_details_window() {
		manageUserPage.verify_cancel_btn_display();
	}

	@When("User clicks A cancel\\(X) icon")
	public void u_user_clicks_a_cancel_x_icon() {
		manageUserPage.cancel_user_window();

	}

	@Then("User Details Window should be closed")
	public void User_Details_Window_should_be_closed() {
		manageUserPage = new UserPage();
		manageUserPage.Locate_userPagetitle();

	}

	@Given("User is on manage user")
	public void User_is_on_Manage_user() {
		manageUserPage.Locate_userPagetitle();

	}

	@When("User clicks a add new user button")
	public void user_clicks_a_add_new_user_button() {
		manageUserPage = new UserPage();

		manageUserPage.click_add_new_user();
	}

	@Then("User should see a button with text Submit in user details window")
	public void user_should_see_a_button_with_text_submit_in_user_details_window() {
		manageUserPage.display_submit_btn_in_user_details_window();
	}

	@Then("User should see the placeholders with Text As {string},{string}, Last name\",\"Email adress\",\"Phone no\", \"Address\",\"City\", \"State\",\"Postal Code\".\"Program\",\"UG Program\",\"PG Program\",\"Skill\",\"Experience\",\"User Role\",Visa status\",{string},{string}")
	public void u_user_should_see_the_placeholders_with_text_as_last_name_email_adress_phone_no_address_city_state_postal_code_program_ug_program_pg_program_skill_experience_user_role_visa_status(
			String string, String string2, String string3, String string4) {
		manageUserPage = new UserPage();
		manageUserPage.display_user_details();
	}

	@Then("User should see the input fields for {string},{string}, Last name\",\"Email adress\",\"Phone no\", \"Address\",\"City\", \"State\",\"Postal Code\".\"Program\",\"UG Program\",\"PG Program\",\"Skill\",\"Experience\",\"User Role\",Visa status\",{string},{string} corresponding to their labels")
	public void user_should_see_the_input_fields_for_last_name_email_adress_phone_no_address_city_state_postal_code_program_ug_program_pg_program_skill_experience_user_role_visa_status_corresponding_to_their_labels(
			String string, String string2, String string3, String string4) {
		manageUserPage.display_user_details();
	}

	@Given("User is on {string} window")
	public void user_is_on_window_(String string) {
		manageUserPage = new UserPage();
		manageUserPage.display_user_details();
		manageUserPage.cancel_user_window();
		driver.navigate().back();
		driver.navigate().back();
	}

	@When("User clicks the drop down icon for state")
	public void user_clicks_the_drop_down_icon_for_state() throws InterruptedException {
		manageUserPage.select_State();
	}

	@Then("User should select from the drop down menu")
	public void user_should_select_from_the_drop_down_menu() throws InterruptedException {
		manageUserPage.select_State();

	}

	@When("User clicks the drop down icon for User Role")
	public void user_clicks_the_drop_down_icon_for_user_role() throws InterruptedException {
		manageUserPage.select_userRole();
	}
	////
	@Given("User is on User details page Window")
	public void user_is_on_user_details_page_Window() {
		manageUserPage = new UserPage();
		manageUserPage.click_submit_in_userDetails_window();
	    
	}

	@When("User clicks save button with all details empty")
	public void user_clicks_save_button_with_all_details_empty() {
	    
	}

	@Then("User should see a message \"Mandatory Fields cannot be empty")
	public void user_should_see_a_message_mandatory_fields_cannot_be_empty() {
	    
	}
	@Given("User is now in User details window")
	public void user_is_now_in_user_details_window() {
		manageUserPage = new UserPage();
		
	}

	@When("User clicks Save button by entering all valid values in required fields")
	public void user_clicks_save_button_by_entering_all_valid_values_in_required_fields() throws InterruptedException {
		manageUserPage.add_New_user_3();
		Thread.sleep(2000);
	}

	@Then("New User Should be Saved")
	public void new_user_should_be_saved() throws InterruptedException {
		manageUserPage.click_next_page_link();
		
	}

	@When("User clicks the Add new User button {string}")
	public void user_clicks_the_Add_new_User_button(String string) throws InterruptedException {
		
		manageUserPage = new UserPage();
		manageUserPage.click_add_new_user();
	}
	

	@Then("User should see the input field with Label {string}")
	public void user_should_see_the_input_field_with_label(String string) {
		manageUserPage = new UserPage();
		manageUserPage.enter_address2();
	}

	@Given("User is on \"User details\"window")
	public void user_is_on_user_details_window() {
		manageUserPage.display_user_details();
	}

	@When("User clicks postal code input field")
	public void user_clicks_postal_code_input_field() {
	    manageUserPage.enter_postalCode();
	}

	@Then("User should see the input Number arrows in the postal code input field")
	public void user_should_see_the_input_number_arrows_in_the_postal_code_input_field() {
		 manageUserPage.enter_postalCode();
	}	
	
@After
	public void tearDown() throws InterruptedException{
		driver.quit();
	}
}


	
