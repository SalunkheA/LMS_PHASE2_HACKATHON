package com_lms_pageObjects;

import org.openqa.selenium.By;

import com_lms_stepDefinitions.LmsBase;

public class UserLandsOnUserPage extends LmsBase {
	By user = By.xpath("//span[contains(text(), 'User')]");

	public void clickUsertab() {
		driver.findElement(user).click();
	}

}
