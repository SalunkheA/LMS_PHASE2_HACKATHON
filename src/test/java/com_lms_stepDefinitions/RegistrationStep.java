package com_lms_stepDefinitions;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;

import com_lms_pageObjects.RegistartionPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegistrationStep {

	public WebDriver driver;
	public RegistartionPage regPage;

	public RegistrationStep() {

	}

	@Then("User sees the heading on the form as {string}")
	public void user_sees_the_heading_on_the_form_as(String string) {
		assertEquals(false, true);
	}

	@Given("User is on LMS website")
	public void user_is_on_lms_website() throws InterruptedException {
		// driver.get("https://lms-frontend-phase2.herokuapp.com");
		// Thread.sleep(2000);
	}

	@When("User lands on Registration page")
	public void user_lands_on_registration_page() {
		// false : as its not present
		// Page is not prewsent , this page only give false so next steps will be
		// executed for any scenario
		assertEquals(false, true);
	}

	@Then("User sees a button with text {string} on the form")
	public void user_sees_a_button_with_text_on_the_form(String string) {
		// Write code here that turns the phrase above into concrete actions
		assertEquals(false, true);
	}

	@Given("User is on the Registeration Page")
	public void user_is_on_the_registeration_page() {
		// Write code here that turns the phrase above into concrete actions
		assertEquals(false, true);
	}

	@When("User selects the Log in button")
	public void user_selects_the_log_in_button() {
		// Write code here that turns the phrase above into concrete actions
		assertEquals(false, true);
	}

	@Then("User lands on Log in page")
	public void user_lands_on_log_in_page() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		// driver.get("https://lms-frontend-phase2.herokuapp.com");
		// Thread.sleep(2000);
	}

	@When("User fills the First Name in Alphabets only")
	public void user_fills_the_first_name_in_alphabets_only() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Then("The First Name will be displayed")
	public void the_first_name_will_be_displayed() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@When("User fills the Last Name in Alphabets only")
	public void user_fills_the_last_name_in_alphabets_only() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Then("The Last Name will be displayed")
	public void the_last_name_will_be_displayed() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@When("User fills the Address Field using Alpha Numerics and or Symbols")
	public void user_fills_the_address_field_using_alpha_numerics_and_or_symbols() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Then("The Address will be displayed")
	public void the_address_will_be_displayed() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@When("User fills the Street name Field using Alpha Numerics and or Symbols")
	public void user_fills_the_street_name_field_using_alpha_numerics_and_or_symbols() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Then("The Street Name will be displayed")
	public void the_street_name_will_be_displayed() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@When("User fills the House Number field using Alpha Numerics and or Symbols")
	public void user_fills_the_house_number_field_using_alpha_numerics_and_or_symbols() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Then("The House Number will be displayed")
	public void the_house_number_will_be_displayed() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@When("User fills the {int} digit Zip code using Numbers only")
	public void user_fills_the_digit_zip_code_using_numbers_only(Integer int1) {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Then("The Zip code will be displayed")
	public void the_zip_code_will_be_displayed() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@When("User fills the City Name in Alphabets only")
	public void user_fills_the_city_name_in_alphabets_only() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Then("The City Name will be displayed")
	public void the_city_name_will_be_displayed() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@When("User selects the respective State Name from the DropBox")
	public void user_selects_the_respective_state_name_from_the_drop_box() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Then("The State Name will be displayed")
	public void the_state_name_will_be_displayed() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@When("User fills the valid {int} digit Mobile number in Numerics")
	public void user_fills_the_valid_digit_mobile_number_in_numerics(Integer int1) {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Then("The Mobile Number will be displayed")
	public void the_mobile_number_will_be_displayed() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@When("User Selects the Date of Birth from the Calender")
	public void user_selects_the_date_of_birth_from_the_calender() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Then("Birth Date will be Displayed")
	public void birth_date_will_be_displayed() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@When("User fills the valid unique UserName")
	public void user_fills_the_valid_unique_user_name() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Then("UserName will be displayed")
	public void user_name_will_be_displayed() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@When("User fills the valid Password with {int} Upper case, {int} Numeric and {int} special charecter and {int} charecters")
	public void user_fills_the_valid_password_with_upper_case_numeric_and_special_charecter_and_charecters(Integer int1,
			Integer int2, Integer int3, Integer int4) {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Then("User Password will  be displayed")
	public void user_password_will_be_displayed() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@When("User enters submit button with all fields empty")
	public void user_enters_submit_button_with_all_fields_empty() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Then("User should get a message {string}")
	public void user_should_get_a_message(String string) {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@When("User clicks Sign Up button with invalid First Name")
	public void user_clicks_sign_up_button_with_invalid_first_name() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@When("User clicks Sign Up button with invalid Last Name")
	public void user_clicks_sign_up_button_with_invalid_last_name() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@When("User clicks Sign Up button with invalid Address")
	public void user_clicks_sign_up_button_with_invalid_address() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@When("User clicks Sign Up button with invalid Street Name")
	public void user_clicks_sign_up_button_with_invalid_street_name() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@When("User clicks Sign Up button with invalid House Number")
	public void user_clicks_sign_up_button_with_invalid_house_number() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@When("User clicks Sign Up button with invalid Zip")
	public void user_clicks_sign_up_button_with_invalid_zip() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@When("User clicks Sign Up button with invalid  City")
	public void user_clicks_sign_up_button_with_invalid_city() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@When("User clicks Sign Up button without selecting  State")
	public void user_clicks_sign_up_button_without_selecting_state() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@When("User clicks Sign Up button with invalid Phone Number")
	public void user_clicks_sign_up_button_with_invalid_phone_number() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@When("User clicks Sign Up button without selecting BirthDate")
	public void user_clicks_sign_up_button_without_selecting_birth_date() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@When("User clicks Sign Up button with invalid UserName")
	public void user_clicks_sign_up_button_with_invalid_user_name() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@When("User clicks Sign Up button with invalid Password")
	public void user_clicks_sign_up_button_with_invalid_password() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@When("User clicks Sign Up button with existing User name")
	public void user_clicks_sign_up_button_with_existing_user_name() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Then("User should see the message {string}")
	public void user_should_see_the_message(String string) {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@When("User enters all Field value and click {string} button.")
	public void user_enters_all_field_value_and_click_button(String string) {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

}
