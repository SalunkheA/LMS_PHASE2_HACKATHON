package com_lms_pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com_lms_stepDefinitions.LmsBase;

public class EditAssignmentPage extends LmsBase {

	public EditAssignmentPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "p-checkbox-icon pi pi-check")
	WebElement sqlCheckBox;
	@FindBy(xpath = "//span[contains(text(),'A New Assignment')]")
	WebElement newAssignment;

	@FindBy(xpath = "//span[@class='p-button-icon pi pi-pencil']")
	WebElement EditButton;

	@FindBy(xpath = "//input[@id ='assignment' ]")
	WebElement assignmentName;
	@FindBy(xpath = "//input[@id ='assignmentDescription' ]")
	WebElement assignmentDesc;
	@FindBy(xpath = "//input[@id ='assignmentGraderId' ]")
	WebElement assignmentGrade;
	@FindBy(xpath = "//button[@class = 'p-datepicker-trigger ng-tns-c105-183 p-ripple p-button p-component p-button-icon-only ng-star-inserted']")
	WebElement assignmentDueDate;

	@FindBy(xpath = "//span[contains(text(),'Save')]")
	WebElement save;
	@FindBy(xpath = "//span[contains(text(),'Cancel')]")
	WebElement cancel;
	// @FindBy(xpath = "//span[@class = 'p-dialog-header-close-icon ng-tns-c132-180
	// pi pi-times']")WebElement back;

	public void ClickOnCheckBox() {
		sqlCheckBox.click();
	}

	public void ClickOnNewAssignment() {
		newAssignment.click();
	}

	public void EnternewAssignment(String Python) {
		assignmentName.sendKeys(Python);
	}

	public void ClearAssignment() {
		assignmentName.clear();
	}

	public void EnternewDesc(String PythonPractic) {
		assignmentDesc.sendKeys(PythonPractic);
	}

//	public void EnternewDueDate(Date 5-5-2022) {
//		assignmentDesc.sendKeys(A);
//	}
	public void EnternewGrade(String A) {
		assignmentDesc.sendKeys(A);
	}

	public void ClickonSaveButton() {
		save.click();
	}

	public void ClickonCancelButton() {
		cancel.click();
	}

	public void ClickOnEditButton() {
		EditButton.click();
	}

	public void ClickOnEditBtn() {
		EditButton.click();
	}

	public void ClickOnAssignmentName() {
		assignmentName.click();
	}

	public void ClickOnAssignmentDesc() {
		assignmentDesc.click();

	}

	public void ClickOnAssignmentGrade() {
		assignmentGrade.click();
	}

	public void ClickOnSaveButton() {
		save.click();
	}

	public void ClickOnCancelButton() {
		cancel.click();
	}

}
