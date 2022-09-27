package com_lms_pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com_lms_stepDefinitions.LmsBase;

public class SearchPage extends LmsBase {

	public SearchPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@type = 'text']")
	WebElement searchTextBox;

	public void ClickOnSearchTextBox() {
		searchTextBox.click();
	}

	public void ClearProgram() {
		searchTextBox.clear();
	}

}
