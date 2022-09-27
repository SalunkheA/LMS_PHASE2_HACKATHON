package com_lms_stepDefinitions;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import com_lms_pageObjects.ProgramPage;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProgramSteps extends LmsBase {
	/*
	 * ProgramPage pp;
	 * 
	 * @Before public void setUp() { pp = new ProgramPage(); } //Program Page
	 * 
	 * @Given("User is on Program page") public void user_is_on_program_page()
	 * throws InterruptedException { //pp=new ProgramPage(); Thread.sleep(1000);
	 * System.out.println("User is on Program page");
	 * 
	 * }
	 * 
	 * @When("User clicks A New Program button") public void
	 * user_clicks_a_new_program_button() throws InterruptedException {
	 * Thread.sleep(1000); pp.ClickOnNewProgram();
	 * 
	 * }
	 * 
	 * @Then("User lands on {string} form") public void user_lands_on_form(String
	 * Title) throws Exception {
	 * if(driver.getPageSource().contains("Program Details")){
	 * System.out.println("Program Details");
	 * 
	 * 
	 * 
	 * Assert.assertTrue(true); }else{ Assert.assertEquals(Title,
	 * driver.getTitle());
	 * 
	 * } Thread.sleep(3000); }
	 * 
	 * 
	 * @When("User enters name as {string} in text box") public void
	 * user_enters_name_as_in_text_box(String proname) throws InterruptedException {
	 * Thread.sleep(1000); pp.EnternewProgram(proname);
	 * 
	 * }
	 * 
	 * @Then("User can see Name entered") public void user_can_see_name_entered()
	 * throws InterruptedException { Thread.sleep(1000);
	 * System.out.println("Name Enterted");
	 * 
	 * }
	 * 
	 * @When("User enters desc as {string} in text box") public void
	 * user_enters_desc_as_in_text_box(String desc) throws InterruptedException {
	 * Thread.sleep(1000); pp.enterProdescription(desc); }
	 * 
	 * @Then("User can see Description entered") public void
	 * user_can_see_description_entered() throws InterruptedException {
	 * Thread.sleep(1000); System.out.println("Description Enterted");
	 * 
	 * }
	 * 
	 * @When("User clicks Save button") public void user_clicks_save_button() throws
	 * InterruptedException { Thread.sleep(1000); pp.ClickonSaveButton();
	 * 
	 * }
	 * 
	 * @Then("User gets message {string}") public void user_gets_message(String msg)
	 * throws Exception { Assert.assertTrue(driver.findElement(By.
	 * xpath("//div[@class='p-toast-message-text ng-tns-c90-10 ng-star-inserted']"))
	 * .getText().contains("Program Created")); Thread.sleep(1000);
	 * System.out.println("Successful Program created");
	 * 
	 * }
	 * 
	 * //Edit Program
	 * 
	 * @When("User clicks on Edit button") public void user_clicks_on_edit_button()
	 * throws InterruptedException { Thread.sleep(1000); pp.EditButton(); }
	 * 
	 * @Then("User lands on Program Details form.") public void
	 * user_lands_on_program_details_form() throws InterruptedException {
	 * Thread.sleep(1000);
	 * System.out.println("User lands on Program Details form."); }
	 * 
	 * @When("User editss {string} and selects the Save button") public void
	 * user_editss_and_selects_the_save_button(String name) throws
	 * InterruptedException { pp.ClearProgramName(); pp.EnternewProgram(name);
	 * pp.ClickonSaveButton(); }
	 * 
	 * @Then("User can see {string} message") public void
	 * user_can_see_message(String string) throws InterruptedException {
	 * Thread.sleep(1000); System.out.println("Program Updated");
	 * 
	 * }
	 * 
	 * //Search Program
	 * 
	 * @When("User enters  {string} into search box.") public void
	 * user_enters_into_search_box(String name) {
	 * 
	 * pp.searchButton();
	 * 
	 * 
	 * }
	 * 
	 * @Then("Entries for name phrase are shown")
	 * 
	 * public void entries_for_name_phrase_are_shown() throws InterruptedException {
	 * LmsBase.driver.findElement(By.xpath("//input[@type='text']")).sendKeys(
	 * "inactive"); Thread.sleep(1000); pp.ClearProgram();
	 * LmsBase.driver.findElement(By.xpath("//input[@type='text']")).sendKeys(
	 * "Program"); pp.ClearProgram();
	 * LmsBase.driver.findElement(By.xpath("//input[@type='text']")).sendKeys(
	 * "active"); Thread.sleep(1000); pp.ClearProgram();
	 * LmsBase.driver.findElement(By.xpath("//input[@type='text']")).sendKeys(
	 * "TestProgram1"); Thread.sleep(1000); pp.ClearProgram();
	 * 
	 * 
	 * }
	 * 
	 * //Delete Program
	 * 
	 * @When("User clicks on Delete button") public void
	 * user_clicks_on_delete_button() throws InterruptedException {
	 * Thread.sleep(1000);
	 * 
	 * pp.DeleteselectedProgram(); }
	 * 
	 * @Then("User lands on Confirm Deletion form") public void
	 * user_lands_on_confirm_deletion_form() {
	 * Assert.assertTrue(driver.findElement(By.
	 * xpath("//span[@class='p-dialog-title ng-tns-c133-4 ng-star-inserted']")).
	 * getText().contains("Confirm"));
	 * 
	 * System.out.println("User lands on Confirm Deletion form"); }
	 * 
	 * @When("User clicks <Yes> button") public void user_clicks_yes_button() throws
	 * Exception { Thread.sleep(3000); pp.ClickYesButton(); }
	 * 
	 * @When("User clicks <No> button") public void user_clicks_no_button() {
	 * pp.DeleteselectedProgram(); pp.ClickNoButton(); }
	 * 
	 * 
	 * @Then("User can see Confirm Deletion form disappears") public void
	 * user_can_see_confirm_deletion_form_disappears() throws InterruptedException {
	 * Thread.sleep(1000);
	 * System.out.println("User can see Confirm Deletion form disappears"); }
	 * 
	 * 
	 * @When("User clicks on <Delete> button on top left corner") public void
	 * user_clicks_on_delete_button_on_top_left_corner() throws InterruptedException
	 * { Thread.sleep(1000); pp.ClickCheckbox(); pp.DeleteselectedProgram();
	 * pp.ClickYesButton(); pp.ClickCheckbox(); pp.DeleteselectedProgram();
	 * pp.ClickNoButton(); }
	 * 
	 * @Given("User is logged on to LMS website") public void
	 * user_is_logged_on_to_lms_website() {
	 * System.out.println("User logged on to lms page"); }
	 * 
	 * @When("User is on first page of Manage Program") public void
	 * user_is_on_first_page_of_manage_program() throws InterruptedException {
	 * Thread.sleep(1000); pp.FirstEnterieButton(); }
	 * 
	 * @Then("Verify that previous link is disabled") public void
	 * verify_that_previous_link_is_disabled() throws InterruptedException {
	 * Thread.sleep(1000); List<WebElement> elements =
	 * driver.findElements(By.tagName("button")); for (int i = 0; i <
	 * elements.size(); i++) { String title = elements.get(i).getAttribute("title");
	 * if (title.equals("Next Page")) { elements.get(i).click(); break; } }
	 * 
	 * }
	 * 
	 * @When("User clicks left navigate > button") public void
	 * user_clicks_left_navigate_button() throws InterruptedException {
	 * Thread.sleep(1000); pp.leftNavigationArrow();
	 * 
	 * }
	 * 
	 * @Then("User navigated to page number {string}")
	 * 
	 * public void user_navigated_to_page_number(String string) throws
	 * InterruptedException { Thread.sleep(1000); pp.SecondtEnterieButton(); }
	 * 
	 * @When("User clicks right navigate < button") public void
	 * user_clicks_right_navigate_button() { pp.rightNavigationArrow();
	 * 
	 * }
	 * 
	 * //ascending and descending order
	 * 
	 * @Given("User is on the Program  page") public void
	 * user_is_on_the_program_page() {
	 * System.out.println("User is on the Program  page"); }
	 * 
	 * @When("User clicks onthe Ascending arrow \\(down ) near to the Program name")
	 * public void user_clicks_onthe_ascending_arrow_down_near_to_the_program_name()
	 * throws InterruptedException { Thread.sleep(1000); pp.Programascend(); }
	 * 
	 * @Then("User can see the results in Ascending order of Program name") public
	 * void user_can_see_the_results_in_ascending_order_of_program_name() {
	 * System.out.
	 * println("User can see the results in Ascending order of Program name"); }
	 * 
	 * @When("User clicks onthe Descending arrow \\(down ) near to the Program Description"
	 * ) public void
	 * user_clicks_onthe_descending_arrow_down_near_to_the_program_description()
	 * throws InterruptedException { Thread.sleep(1000);
	 * pp.ProgramDescriptionAscend(); }
	 * 
	 * @Then("User can see the results in Descending order of Program name") public
	 * void user_can_see_the_results_in_descending_order_of_program_name() throws
	 * InterruptedException { pp.ProgramStatusAcend();
	 * 
	 * }
	 */
}
