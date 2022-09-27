package com_lms_pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com_lms_stepDefinitions.LmsBase;

public class RegistartionPage extends LmsBase {

	public RegistartionPage(WebDriver rdriver) {
		PageFactory.initElements(driver, this);
	}

}
