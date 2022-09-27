package com_lms_pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com_lms_stepDefinitions.LmsBase;

public class ProgramPage extends LmsBase {
	// asc/dec
	@FindBy(xpath = "//th[@psortablecolumn='ProgramName']")
	WebElement Programascend;
	@FindBy(xpath = "//th[@psortablecolumn='programDescription']")
	WebElement ProgramDescriptionAscend;
	@FindBy(xpath = "//th[@psortablecolumn='programStatus']")
	WebElement ProgramStatusAcend;

	// Delete
	@FindBy(xpath = "//button[@class='p-button-rounded p-button-danger p-button p-component p-button-icon-only']")
	WebElement DeleteProgram;
	@FindBy(xpath = "//button[@class='ng-tns-c133-4 p-confirm-dialog-accept p-ripple p-button p-component ng-star-inserted']")
	WebElement YesButton;
	@FindBy(xpath = "//button[@class='ng-tns-c133-4 p-confirm-dialog-reject p-ripple p-button p-component ng-star-inserted']")
	WebElement NoButton;
	@FindBy(xpath = "//div[@class='p-checkbox-box']")
	WebElement Checkbox;

	// paginator
	@FindBy(how = How.XPATH, using = "(//button[contains(@class,'p-paginator-page p-paginator-element')])[1]")
	WebElement firstEntrieButton;
	@FindBy(how = How.XPATH, using = "(//button[contains(@class,'p-paginator-page p-paginator-element')])[2]")
	WebElement secondEntrieButton;
	@FindBy(xpath = "//span[@class='p-paginator-icon pi pi-angle-left']")
	WebElement leftNavigationArrow;
	@FindBy(xpath = "//span[@class=' p-paginator-icon pi pi-angle-right']")
	WebElement rightNavigationArrow;

	// Program
	@FindBy(id = "new")
	WebElement AnewProgram;
	@FindBy(xpath = "//input[@class='p-inputtext p-component ng-pristine ng-invalid ng-touched")
	WebElement ProgramName;
	@FindBy(id = "programDescription")
	WebElement programDescrip;
	@FindBy(linkText = "Active")
	WebElement Active;
	@FindBy(linkText = " Inactive ")
	WebElement Inactive;
	@FindBy(xpath = "//button[@label='Save']")
	WebElement SaveButton;
	@FindBy(xpath = "//button[@label='Cancel']")
	WebElement Cancel;
	@FindBy(xpath = "//span[@class='p-button-icon pi pi-pencil']")
	WebElement EditButton;

	// Search
	@FindBy(xpath = "//input[@type='text']")
	WebElement searchbox;

//Ass/DEC
	public ProgramPage() {
		PageFactory.initElements(driver, this);
	}
	public void Programascend() {
		Programascend.click();
	}

	public void ProgramDescriptionAscend() throws InterruptedException {
		Thread.sleep(2000);
		ProgramDescriptionAscend.click();
	}

	public void ProgramStatusAcend() {
		ProgramStatusAcend.click();
	}


	public void DeleteselectedProgram() {
		PageFactory.initElements(driver, this);
		DeleteProgram.click();
	}

	public void ClickYesButton() throws InterruptedException {
		Thread.sleep(2000);
		YesButton.click();
	}

	public void ClickNoButton() {
		NoButton.click();
	}

	public void ClickCheckbox() {
		Checkbox.click();
	}

	// paginator

	public void FirstEnterieButton() {
		PageFactory.initElements(driver, this);
		firstEntrieButton.click();
	}

	public void SecondtEnterieButton() throws InterruptedException {
		Thread.sleep(2000);
		secondEntrieButton.click();
	}

	public void leftNavigationArrow() {
		leftNavigationArrow.click();
	}

	public void rightNavigationArrow() {
		rightNavigationArrow.click();
	}

	// program

	public void ClickOnNewProgram() throws InterruptedException {
		PageFactory.initElements(driver, this);
		Thread.sleep(3000);
		AnewProgram.click();
	}

	public void EnternewProgram(String newpro) throws InterruptedException {
		Thread.sleep(2000);
		ProgramName.sendKeys(newpro);
	}

	public void ClearProgramName() throws InterruptedException {
		Thread.sleep(2000);
		ProgramName.clear();
	}

	public void enterProdescription(String desc) {
		programDescrip.sendKeys(desc);
	}

	public void ClickActiveStatus() {
		Active.click();
	}

	public void ClickinActiveStatus() {
		Inactive.click();
	}

	public void ClickonSaveButton() throws InterruptedException {
		Thread.sleep(2000);
		SaveButton.click();
	}

	public void ClickonCancelButton() {
		Cancel.click();
	}

	public void EditButton() {
		EditButton.click();
	}

	// Search
	public void searchButton() {
		PageFactory.initElements(driver, this);
		searchbox.click();
	}

	public void ClearProgram() throws InterruptedException {
		Thread.sleep(2000);
		searchbox.clear();
	}

}
