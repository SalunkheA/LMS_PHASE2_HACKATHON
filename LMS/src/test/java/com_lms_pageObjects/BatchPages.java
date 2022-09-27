package com_lms_pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com_lms_stepDefinitions.LmsBase;

public class BatchPages extends LmsBase {

	@FindBy(xpath = "//span[text()='Batch']")
	WebElement Batch;

	@FindBy(xpath = "//div[text()=' Manage Batch']")
	WebElement ManageBatch;

	@FindBy(xpath = "//mat-card-title/div[2]/div[1]/button/span[2]")
	WebElement Delete;

	@FindBy(xpath = "//mat-card-title//span/input")
	WebElement Search;

	@FindBy(xpath = "//span[@class ='p-button-icon pi pi-pencil']")
	WebElement edit;

	@FindBy(xpath = " //span[text()='Batch Details']")
	WebElement BatchDetails;

	@FindBy(xpath = " //input[@id='batchName'] ")
	WebElement name;

	@FindBy(xpath = "//input[@id='batchDescription'] ")
	WebElement Description;

	@FindBy(xpath = "//input[@class='p-dropdown-label p-inputtext ng-tns-c101-8 ng-star-inserted'] ")
	WebElement ProgramName;

	@FindBy(xpath = "//div[@class='p-radiobutton-box']")
	WebElement status;

	@FindBy(xpath = "//input[@id='batchNoOfClasses']")
	WebElement classes;

	@FindBy(xpath = " //span[text()='Cancel']")
	WebElement Cancel;

	@FindBy(xpath = "//span[text()='Save']")
	WebElement save;

	@FindBy(xpath = "//tbody/tr//td[text()='SDET951']")
	WebElement correctlyUpdated;

	// Delete one batch

	//@FindBy(xpath = "/html/body/app-root/app-batch/div/mat-card/mat-card-content/p-table/div/div[1]/table/tbody/tr[1]/td[7]/div/span[2]/button")
	@FindBy(xpath = "/html/body/app-root/app-home/app-program/div/mat-card/mat-card-content/p-table/div/div/table/tbody/tr/td[5]/div/span[2]/button")
	WebElement DeleteOneBatch;

	@FindBy(xpath = "//span[text() ='Yes']")
	WebElement clickYes;

	@FindBy(xpath = "//span[text() ='No']")
	WebElement clickNo;

	// add new batch

	@FindBy(xpath = "//span[text()='A New Batch']")
	WebElement newBatch;

	@FindBy(xpath = "//span[text()='Batch Details']")
	WebElement validationBatchDetails;

	@FindBy(xpath = "//span[text()='Save']")
	WebElement Save;

	@FindBy(xpath = "//small[text()='Name is required.']")
	WebElement NameisRequired;

	@FindBy(xpath = "//span[text()='Cancel']")
	WebElement batchDetailclickCancel;

	@FindBy(xpath = "//span[@class='p-dropdown-trigger-icon ng-tns-c101-12 pi pi-chevron-down']")
	WebElement batchNewProgram;

	@FindBy(xpath = "//div//p-dropdown//div/ul/p-dropdownitem[1]/li")
	WebElement oracle;

	// Pagenation

	@FindBy(xpath = "//span//button[text()='1']")
	WebElement FirstPagenation;

	@FindBy(xpath = "//span//button[text()='2']")
	WebElement SecondPagenation;

	@FindBy(xpath = "//span[@class='p-paginator-icon pi pi-angle-right']")
	WebElement rightarrow;

	@FindBy(xpath = "//span[@class='p-paginator-icon pi pi-angle-left']")
	WebElement leftarrow;

	@FindBy(xpath = "//span[text()='Program']")
	WebElement Program;

	// Assignment
	@FindBy(xpath = "//span[text()='Assignment']")
	WebElement Assignment;

	// Ascending order and Descending order

	@FindBy(xpath = "//th[@psortablecolumn='batchName']")
	WebElement AscebatchName;
	@FindBy(xpath = "//th[@psortablecolumn='batchDescription']")
	WebElement AscebatchDescription;
	@FindBy(xpath = "//th[@psortablecolumn='batchStatus']")
	WebElement AscebatchStatus;
	@FindBy(xpath = "//th[@psortablecolumn='batchNoOfClasses']")
	WebElement AsceNoOfClasses;
	@FindBy(xpath = "//th[@psortablecolumn='programName']")
	WebElement AsceprogramName;

//Multiple Batches Delete
	@FindBy(xpath = "//th[1]/p-tableheadercheckbox/div/div[2]/span")
	WebElement DeleteMultipleBatches;

	
	public BatchPages() {
		PageFactory.initElements(driver, this);
	}
	// validate Heading,Delete button,search batch,edit batch
	public void clickBatch() {
		PageFactory.initElements(driver, this);
		Batch.click();
	}

	public String validateName() {
		// PageFactory.initElements(driver,this);
		return ManageBatch.getText();
	}

	public void disabledDelete() {
		Delete.isEnabled();
	}

	public void clicksearch() {
		Search.click();
		Search.sendKeys("SDET951");
	}

	// edit
	public void ClickEdit() {
		edit.click();
	}

	public String validateBatchDetails() {
		return BatchDetails.getText();
	}

	public void bName() {
		name.click();
		name.clear();
		name.sendKeys("SDET951");
	}

	public void EDescription() {
		Description.click();
		Description.clear();
		Description.sendKeys("SDET");
	}

	public void EProgramName() throws InterruptedException {
		ProgramName.click();
		ProgramName.click();
		ProgramName.clear();
		Thread.sleep(50);
		ProgramName.sendKeys("TestsProgram");
//		WebElement dropdown = ProgramName;
//		Select programName = new Select(dropdown);
//		programName.selectByVisibleText("TestsProgram");
//		
	}

	public void Estatus() throws InterruptedException {
		Thread.sleep(1000);
		status.click();
	}

	public void NumberofClasses() {
		classes.click();
		classes.clear();
		classes.sendKeys("37");
	}

	public void ClickCancel() {
		Cancel.click();
	}

	public String clickSave() throws InterruptedException {

		save.click();

		return save.getText();

	}

	public String CorrectlyUpdated() {
		return correctlyUpdated.getText();
	}

	// delete batch

	public void DeleteOneBatch() throws InterruptedException {
		PageFactory.initElements(driver, this);
		Thread.sleep(500);
		DeleteOneBatch.click();
	}

	public void clickYesButton() throws InterruptedException {
		clickYes.click();
		DeleteOneBatch.click();
		Thread.sleep(500);
	}

	public void clickNoButton() {
		clickNo.click();
	}

///create new batch
	public void ClickNewBatch() {
		newBatch.click();
	}

	public String BatchDetails() {
		return validationBatchDetails.getText();

	}

	public void ClickSave() {
		Save.click();
	}

	public String Requiredfield() {

		return NameisRequired.getText();
	}

	public void ClickbatchDetails() {
		batchDetailclickCancel.click();
	}

	public void ProgramDetails() {
		batchNewProgram.click();
		oracle.click();

	}

	// Pagenation

	public void ClickFirstPagenation() {
		FirstPagenation.click();
	}

	public void Clickrightarrow() throws InterruptedException {
		Search.clear();
		Thread.sleep(1000);
		// click program module
		Program.click();
		// Back to Batch Page is Reloaded
		Batch.click();
		Thread.sleep(1000);
		rightarrow.click();
	}

	public void Clickleftarrow() {
		leftarrow.click();
	}

	public void ClickSecondPagenation() {
		SecondPagenation.click();
	}

	// Ascending order and Descending order

	public void AbatchName() throws InterruptedException {

		Thread.sleep(1000);
		AscebatchName.click();

	}

	public void AbatchDescription() {

		AscebatchDescription.click();
	}

	public void AbatchStatus() throws InterruptedException {
		Thread.sleep(1000);
		AscebatchStatus.click();
	}

	public void ANoOfClasses() {

		AsceNoOfClasses.click();
	}

	public void AprogramName() throws InterruptedException {
		Thread.sleep(500);
		AsceprogramName.click();
	}

	//// Multiple Batches

	public void DeleteMultipleBatches() throws InterruptedException {
		PageFactory.initElements(driver, this);
		// DeleteMultipleBatches.click();
		DeleteOneBatch.click();
		clickYes.click();
		Thread.sleep(500);
		DeleteOneBatch.click();
		clickNo.click();
	}

}
