package com_lms_pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com_lms_stepDefinitions.LmsBase;

public class HeadingPage extends LmsBase {

	@FindBy(xpath = "//span[contains(text(), 'Assignment')]")
	WebElement clickOnAssignmentTab;

	public void Clickon_Assignment_Tab() {
		PageFactory.initElements(driver, this);
	}

	public static String manageAssignmentPage() {
		return driver.getTitle();

	}

}
