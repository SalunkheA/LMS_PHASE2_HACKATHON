package com_lms_pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com_lms_stepDefinitions.LmsBase;
	
public class HomePage extends LmsBase {
		By user = By.xpath("//span[contains(text(), 'User')]");
		@FindBy(xpath = "//span[contains(text(),' LMS - Learning Management System ')]")
		WebElement menuBar;
		@FindBy(xpath = "//button[@routerlink='/program']")
		WebElement programButton;
		@FindBy(xpath = "//button[@routerlink='/batch']")
		WebElement batchButton;
		@FindBy(xpath = "//button[@routerlink='/user']")
		WebElement userButton;
		@FindBy(xpath = "//button[@routerlink='/assignment']")
		WebElement assignmentButton;
		@FindBy(xpath = "//button[@routerlink='/attendance']")
		WebElement attendaceButton;
		@FindBy(xpath = "//button[@class=\"mat-focus-indicator mat-button mat-button-base ng-star-inserted\"]//span[contains(text(),'Logout')]")
		WebElement logOutButton;
		public HomePage() {
			PageFactory.initElements(driver, this);
		}
		public void clickUsertab() {
			driver.findElement(user).click();
		}
		// To get the current page title
		public String getPageTitle() {
			return LmsBase.driver.getTitle();
		}
		public String getMenuBarTitle() {
			return this.menuBar.getText();
		}
		public String getProramButtonTitle() {
			return this.programButton.getText();
		}
		public String getBatchButtonText() {
			return this.batchButton.getText();
		}
		public String getUserButtonText() {
			return this.userButton.getText();
		}
		public String getAssignmentButtonText() {
			return this.assignmentButton.getText();
		}
		public String getAttendaceButtonButtonText() {
			return this.attendaceButton.getText();
		}
		public String getLogOutButtonButtonText() {
			return this.logOutButton.getText();
		}
		
		public void batchButtonClick() {
			//PageFactory.initElements(driver, this);
			batchButton.click();
		}
		
		public void clickAssignmentrtab() {
			this.assignmentButton.click();
		}

}
