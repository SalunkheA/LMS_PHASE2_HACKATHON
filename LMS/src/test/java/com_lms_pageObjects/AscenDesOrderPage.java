package com_lms_pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com_lms_stepDefinitions.LmsBase;


public class AscenDesOrderPage extends LmsBase{
	
	
	public AscenDesOrderPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//th[@psortablecolumn='assignmentName']")WebElement accendingArrowBtn;
	@FindBy(xpath = "//th[@psortablecolumn='assignmentDescription']")WebElement descArrowBtn;
	
	public void ClickOnAccendingArrowBtn() {
		accendingArrowBtn.click();
		
}
	public void ClickOnDescArrowBtn() {
		descArrowBtn.click();
	}
}
