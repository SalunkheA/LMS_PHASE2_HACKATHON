package com_lms_pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com_lms_stepDefinitions.LmsBase;

public class DeletePage extends LmsBase{
	
	public DeletePage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//button[@class='p-button-rounded p-button-danger p-button p-component p-button-icon-only']")WebElement DeleteAssignmentBtn;
	@FindBy(xpath = "p-button-danger p-button p-component p-button-icon-only")WebElement multipleDeleteBtn;
	@FindBy(xpath = "//span[contains(text(), 'Yes')]")WebElement yesButton;
	@FindBy(xpath = "//span[contains(text(), 'No')]")WebElement noButton;
	@FindBy(xpath = "//span[@class ='p-checkbox-icon pi pi-check' ]")WebElement chkBox;
	
	public void ClickOnDeleteAssignmentBtn() {
		DeleteAssignmentBtn.click();
	}
	public void ClickOnMultipleDeleteBtn() {
		multipleDeleteBtn.click();
	}
	public void ClickOnYesBtn() {
		yesButton.click();
	}
	public void ClickOnNoButton() {
		noButton.click();
		}
	public void ClickOnChkBox() {
		chkBox.click();
	}
	
}
