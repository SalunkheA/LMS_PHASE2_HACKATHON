package com_lms_pageObjects;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com_lms_stepDefinitions.LmsBase;

public class UserPage extends LmsBase {
By user = By.xpath("//span[contains(text(), 'User')]");
By title = By.xpath("//div[contains(text(), 'Manage User')]");
By pagination = By.xpath("//div[@class ='p-paginator-bottom p-paginator p-component ng-star-inserted')]");	
By locatePaginator = By.xpath("//div[@class ='p-paginator-bottom p-paginator p-component ng-star-inserted']");	
By addNewuserBtn = By.xpath("//span[contains(text(), 'Add New User')]");	
By afterLogin = By.xpath("//div[contains(text(), 'Manage Program')]");
By fName = By.xpath("//input[@data-placeholder = 'First name']");	
By lName = By.xpath("//input[@data-placeholder = 'Last name']");	
By email = By.xpath("//input[@data-placeholder='Email address']");	
By phone = By.xpath("//input[@data-placeholder='Phone no']");	
By batch = By.xpath("//input[@data-placeholder='Batch']");
By skill = By.xpath("//input[@data-placeholder='Skill']");	
By address = By.xpath("//div//textarea[@ng-reflect-placeholder ='Address']");
By city = By.xpath("//input[@data-placeholder ='City']");
By state = By.xpath("//span[contains(text(), 'State')]");
By stateDropdwn = By.xpath("//span[contains(text(), 'Alabama')]");
By zipCode = By.xpath("//input[@ng-reflect-placeholder = 'Postal Code']");
By program = By.xpath("//input[@data-placeholder = 'Program']");
By UGprogram = By.xpath("//input[@ng-reflect-placeholder = 'UG Program']");
By PGprogram = By.xpath("//input[@ng-reflect-placeholder = 'PG Program']");
By experience = By.xpath("//input[@ng-reflect-placeholder ='Experience']");
By userRole = By.xpath("//div[@class ='mat-form-field-infix ng-tns-c78-25']");
By userRoleDRopDwn = By.xpath("//span[contains(text(), 'Admin')]");
By visaStatus = By.xpath("//input[@ng-reflect-placeholder = 'Visa status']");
By comments = By.xpath("//input[@ng-reflect-placeholder = 'Comments']");
By userDetailUname = By.xpath("//input[@ng-reflect-placeholder = 'User name']");
By userDetailPwd = By.xpath("//input[@ng-reflect-placeholder = 'Password']");
By fileType = By.xpath("//input[@ng-reflect-placeholder = 'File type']");
By submitBtn = By.xpath("//span[contains(text(),'Submit')]");
By nextPagebtn = By.xpath("//span[@class = 'p-paginator-icon pi pi-angle-double-right']");
By previuosPagebtn = By.xpath("//span[@class = 'p-paginator-icon pi pi-angle-double-left']");
By nextPagelink = By.xpath("//button[@class='p-paginator-page p-paginator-element p-link p-ripple ng-star-inserted']");
By nextpage = By.xpath("//span//button[2]");	
By userName = By.id("username");
By userPassword = By.id("password");
By loginAlert = By.id("errormessage");
By loginBtn = By.xpath("//span[contains(text(),'Login')]");
By loginDisplay =By.xpath("//span[contains(text(), 'LMS - Learning Management System')]");
By paginatorcount = By.xpath("//span[@class = 'p-paginator-pages ng-star-inserted']//button");
By tableFootertext = By.xpath("//div[contains(text(),'In total there are 4 users.')]");
By userDetailstext = By.xpath("//span[contains(text(),'User Details')]");
By userWdowcancel = By.xpath("//span[contains(text(),'Cancel')]");
By sortIcon = By.xpath("//thead//p-sorticon");
By checkBox = By.xpath("//div[@role='checkbox']");
By deleteIcon = By.xpath("//button[@ng-reflect-icon ='pi pi-trash']");
By confirmBox = By.xpath("//span[contains(text(), 'Confirm')]");
By clickNo = By.xpath("//span[contains(text(), 'No')]");
By clickYes = By.xpath("//span[contains(text(), 'Yes')]");
By alertMsg = By.xpath("//div[contains(text(), 'Users Deleted')]");
By deleteIconnearEdit = By.xpath("//span[@class = 'p-button-icon pi pi-trash']");
By editIcon = By.xpath("//span[@class = 'p-button-icon pi pi-pencil']");
By searchBox = By.xpath("//input[@class = 'p-inputtext p-component']");
By rowCount = By.xpath("//tbody//tr[@class='ng-star-inserted']");
By searchText = By.xpath("//input[@type ='text']");
By userId_1 = By.xpath("//span[contains(text(), 'U001')]");
By closeBtn = By.xpath("//span[@ng-reflect-ng-class ='pi pi-times']");
By userSubmitBtn = By.xpath("//span[contains(text(), 'Submit')]");
By addCareofInfo = By.xpath("//button//span[contains(text(), '+Add C/O, Apt, Suite, Unit')]");
By address2 = By.xpath("//textarea[@data-placeholder = 'Address 2' ]");
 public void login() {
	driver.findElement(userName).click();
	driver.findElement(userName).sendKeys("LMS");
	driver.findElement(userPassword).click();
	driver.findElement(userPassword).sendKeys("LMS");
	driver.findElement(loginBtn).click();
}

	public String Locate_userPagetitle() {
		return driver.findElement(title).getText();
		
	}
	public void clickUsertab() {
		driver.findElement(user).click();
	}
	
	public void locatePaginationControl() throws InterruptedException {
		driver.findElement(nextPagebtn).isDisplayed();
	}

	public void pagination_control_disabled() throws InterruptedException {

		driver.findElement(locatePaginator).isDisplayed();
		System.out.println("Element displayed is :" + locatePaginator);
	}
	public String afterLogin() {
		return driver.findElement(afterLogin).getText();
		
	}

	public void add_New_user_1() {
		driver.findElement(addNewuserBtn).click();
		driver.findElement(fName).click();
		driver.findElement(fName).sendKeys("Mighty");
		driver.findElement(lName).click();
		driver.findElement(lName).sendKeys("Ninja");
		driver.findElement(email).click();
		driver.findElement(email).sendKeys("Ninja123@gmail.com");
		driver.findElement(phone).click();
		driver.findElement(phone).sendKeys("123456789");
		driver.findElement(skill).click();
		driver.findElement(skill).sendKeys("JAVA");
		driver.findElement(batch).click();
		driver.findElement(batch).sendKeys("SDET76");
		driver.findElement(submitBtn).click();
	}
	public void clear_add_New_user_1()  {
		
		driver.findElement(fName).clear();
		driver.findElement(lName).clear();
		driver.findElement(email).clear();
		driver.findElement(phone).clear();
		driver.findElement(skill).clear();
		driver.findElement(batch).clear();
		driver.findElement(submitBtn).clear();
	}
	public void add_New_user_2() {
		
		driver.findElement(addNewuserBtn).click();
		driver.findElement(fName).clear();
		driver.findElement(fName).click();
		driver.findElement(fName).sendKeys("Daring");
		driver.findElement(lName).clear();
		driver.findElement(lName).click();
		driver.findElement(lName).sendKeys("Warrior");
		driver.findElement(email).clear();
		driver.findElement(email).click();
		driver.findElement(email).sendKeys("Warrior@gmail.com");
		driver.findElement(phone).clear();
		driver.findElement(phone).click();
		driver.findElement(phone).sendKeys("345621189");
		driver.findElement(skill).clear();
		driver.findElement(skill).click();
		driver.findElement(skill).sendKeys("JAVA");
		driver.findElement(batch).clear();
		driver.findElement(batch).click();
		driver.findElement(batch).sendKeys("SDET76");
		driver.findElement(submitBtn).click();
	}
	
	public void click_next_page_link() throws InterruptedException {
		List<WebElement> buttons = driver.findElements(paginatorcount);
		System.out.println("=========>" + buttons.size());
		
		for(int i=0;i<buttons.size();i++)
		{
			System.out.println("=========" + buttons.get(i).getText());
			if("2".equals(buttons.get(i).getText()))
			{
				buttons.get(i).click();
				Thread.sleep(2000);
				break;
			}
		}
	
		
		
	}
		public void click_next_page_is_displayed()  {
			

			driver.findElement(nextPagebtn).isDisplayed();
			System.out.println("Element displayed is :" + nextPagebtn);
		}
		
public void click_next_page_is_disabled()  {
			

			 driver.findElement(nextPagebtn).isEnabled();
			
		}

public void click_previous_page_link() throws InterruptedException {
	List<WebElement> buttons = driver.findElements(paginatorcount);
	System.out.println("=========>" + buttons.size());
	
	for(int i=0;i<buttons.size();i++)
	{
		System.out.println("=========>" + buttons.get(i).getText());
		if("1".equals(buttons.get(i).getText()))
		{
			buttons.get(i).click();
			Thread.sleep(2000);
			break;
		}
	}
}

public void click_previous_page_link_is_displayed()  {
	
	driver.findElement(previuosPagebtn).isDisplayed();
}
public void click_previous_page_link_is_disabled()  {
	
	driver.findElement(previuosPagebtn).isEnabled();
}
public void tableFooter()  {
	
	String text = driver.findElement(tableFootertext).getText();
	System.out.println( "Table FooterText======>" + text);
}
public void click_add_new_user()  {
	Actions actions = new Actions(driver);
	WebElement clickable = driver.findElement(addNewuserBtn);
	actions.moveToElement(clickable);
	actions.click().build().perform();
	//driver.findElement(addNewuserBtn).click();
	
}
public void display_user_details()  {
	
		String title = driver.findElement(userDetailstext).getText();
		Assert.assertEquals(title,"User Details");
}
public void cancel_user_window()  {
	
	driver.findElement(userWdowcancel).click();
}
public void click_sort_icon()  {
	
	driver.findElement(sortIcon).click();
}
public void click_checkbox()  {
	
	driver.findElement(checkBox).click();
}
public void clear_checkbox()  {
	
	driver.findElement(checkBox).clear();
	
}
public void click_deleteIcon()  {
	
	driver.findElement(deleteIcon).click();
}
public void verify__deleteIcon_is_enabled()  {
	
	driver.findElement(deleteIcon).isEnabled();
}
public void display_confirm_window()  {
	
	driver.findElement(confirmBox).isDisplayed();
}

public void click_No_in_confirm_window()  {
	Actions actions = new Actions(driver);
	WebElement clickable = driver.findElement(clickNo);
	actions.moveToElement(clickable);
	actions.click().build().perform();
}

public void click_Yes_in_confirm_window()  {
	Actions actions = new Actions(driver);
	WebElement clickable = driver.findElement(clickYes);
	actions.moveToElement(clickable);
	actions.click().build().perform();
}
public void display_success_message()  {
	String alert = driver.findElement(alertMsg).getText();
	System.out.println("Alert msg is : "+ alert);
}
public void click_deleteIcon_near_editIcon() throws InterruptedException  {
	
	List<WebElement> delBtn = driver.findElements(deleteIconnearEdit);
	System.out.println("=========>" + delBtn.size());
	
	for(int i=0;i<delBtn.size();i++)
	{
		System.out.println("Total Delete Icons=========>" + delBtn.get(i).getText());
		if("1".equals(delBtn.get(i).getText()))
		{
			delBtn.get(i).click();
			Thread.sleep(2000);
			break;
		}
	}
}
public void click_editIcon() throws InterruptedException  {
	
	driver.findElement(editIcon).click();
	List<WebElement> editBtn = driver.findElements(editIcon);
	System.out.println("Address2edit=========>" + editBtn.size());
	
	for(int i=0;i<editBtn.size();i++)
	{
		System.out.println("Total Edit Icons=========>" + editBtn.get(i).getText());
		if("1".equals(editBtn.get(i).getText()))
		{
			editBtn.get(i).click();
			Thread.sleep(2000);
			break;
		}
	}
}
public void verify_searchfield_display()  {
	
	driver.findElement(searchBox).isDisplayed();
}
public void searchfield()  {
	
	driver.findElement(searchBox).click();
	driver.findElement(searchBox).sendKeys("John");
	
}
public void check_random_user_in_searchfield()  {
	
	driver.findElement(searchText).clear();
	driver.findElement(searchBox).sendKeys("Nancy");
	
}
public void verify_dispalyed_row_count() throws Exception {
	//int rowCount=driver.findElements(rowCount).size();
	List<WebElement> rows = driver.findElements(rowCount);
	System.out.println("Total rows=========>" + rows.size());
}	
public void clear_search() {
	driver.findElement(searchText).clear();
	
}
public void click_ID()  {
	
	driver.findElement(userId_1).click();
}	
public void verify_add_new_user_button_is_displayed()  {
	
	String title = driver.findElement(addNewuserBtn).getText();
	Assert.assertEquals(title,"Add New User");
}	
public void verify_cancel_btn_display()  {
	
	driver.findElement(userWdowcancel).isDisplayed();
}
public void click_close_icon()  {
	Actions actions = new Actions(driver);
	WebElement clickable = driver.findElement(closeBtn);
	actions.moveToElement(clickable);
	actions.click().build().perform();
}
public void click_submit_in_userDetails_window()  {
	driver.findElement(userSubmitBtn).click();

}
public void display_submit_btn_in_user_details_window()  {
	
	driver.findElement(userSubmitBtn).isDisplayed();
}
public void select_State() throws InterruptedException  {
	driver.findElement(state).click();
	driver.findElement(state).click();
	Thread.sleep(3000);
	driver.findElement(stateDropdwn).click();
	driver.findElement(stateDropdwn).click();
}
public void select_userRole() throws InterruptedException  {
	driver.findElement(userRole).click();
	Thread.sleep(3000);
	driver.findElement(userRoleDRopDwn).click();
	}
	
public void add_New_user_3() throws InterruptedException {
	driver.findElement(fName).click();
	driver.findElement(fName).sendKeys("Numpy");
	driver.findElement(lName).click();
	driver.findElement(lName).sendKeys("Ninja");
	driver.findElement(email).click();
	driver.findElement(email).sendKeys("Ninja134@gmail.com");
	driver.findElement(phone).click();
	driver.findElement(phone).sendKeys("1236456789");
	driver.findElement(address).click();
	driver.findElement(address).sendKeys("123 Numpy Lane");
	driver.findElement(city).click();
	driver.findElement(city).sendKeys("Chicago");
	driver.findElement(zipCode).click();
	driver.findElement(zipCode).sendKeys("60502");
	driver.findElement(program).click();
	driver.findElement(program).sendKeys("SDET");
	driver.findElement(UGprogram).click();
	driver.findElement(UGprogram).sendKeys("Junior SDET");
	driver.findElement(PGprogram).click();
	driver.findElement(PGprogram).sendKeys("Senior SDET");
	driver.findElement(experience).click();
	driver.findElement(experience).sendKeys("5 years");
	driver.findElement(visaStatus).click();
	driver.findElement(visaStatus).sendKeys("H4");
	driver.findElement(comments).click();
	driver.findElement(comments).sendKeys("Learning to code");
	driver.findElement(skill).click();
	driver.findElement(skill).sendKeys("JAVA");
	driver.findElement(batch).click();
	driver.findElement(batch).sendKeys("SDET76");
	driver.findElement(userDetailUname).click();
	driver.findElement(userDetailUname).sendKeys("User1");
	driver.findElement(userDetailPwd).click();
	driver.findElement(userDetailPwd).sendKeys("password1");
	driver.findElement(fileType).click();
	driver.findElement(fileType).sendKeys("AGF001");
	Thread.sleep(2000);
	driver.findElement(submitBtn).click();
}
public void click_editIcon_page2() throws InterruptedException  {
	
	List<WebElement> editBtn = driver.findElements(editIcon);
	System.out.println("=========>" + editBtn.size());
	
	for(int i=0;i<editBtn.size();i++)
	{
		System.out.println("Total Edit Icons in page 2=========>" + editBtn.get(i).getText());
		if("1".equals(editBtn.get(i).getText()))
		{
			editBtn.get(i).click();
			Thread.sleep(2000);
			break;
		}
	}
	}

public void enter_address2()   {
	driver.findElement(addCareofInfo).click();
	driver.findElement(address2).click();
	driver.findElement(address2).sendKeys("123 Ninja Ct");
	System.out.println("123 Ninja ct");
}
public void enter_postalCode()   {
	driver.findElement(zipCode).click();
	driver.findElement(zipCode).sendKeys("60502");
}

}