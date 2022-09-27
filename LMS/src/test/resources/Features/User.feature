Feature: Manage User Page 

Scenario: Verify landing in Manage user page 
	Given User is on any page after Login LMS 
	When User clicks the Tab User 
	Then User should see the Manage user page 
	
@Pagination 
Scenario: Verify the presence of pagination 
	Given User is on any page after Login 
	When 	User is on the Manage user page after clicking User Tab 
	Then 	User should see the pagination controls below data table 
	
Scenario: Verify the Pagination control with less rows 
	Given User is on Manage user page 
	When 	Manage user table has less less than or equal to 5 rows 
	Then 	Pagination control should be disabled 
	
Scenario: Verify the Pagination control with more than 5 rows 
	Given 	User is on Manage user page 
	When 		Manage user table has more than 5 rows 
	Then 		Pagination control should be enabled 
	
Scenario: Verify pagination next link 
	Given 	User is on Manage user page 
	When 		User cliks next link of pagination 
	Then 		Next page should be displayed 
	
Scenario: Verify pagination next link after last record of user table 
	Given 	last page of User records are displayed 
	When 		User cliks next link of pagination 
	Then 		Next link of pagination should be disabled 
	
Scenario: Verify pagination Previous link 
	Given 	User table is displayed in manage user page 
	When 		User cliks previous link of pagination 
	Then 		previous page should be displayed 
	
Scenario: Verify pagination previous link in first page of user table 
	Given 	First page of user table is displayed 
	When 		User cliks previous link of pagination 
	Then 		Previous link of Pagination should be Disabled 
	
Scenario: Verify button with << icon 
	Given 	User Table is displayed in manage User page 
	When 		User clicks << icon in pagination 
	Then 		User should see the First page of the table 
	
Scenario: Verify button with >> icon 
	Given 	User table is displayed in manage user page 
	When 		User clicks >> icon in pagination 
	Then 		User should see the last page of the table 
	
Scenario: Verifiy the entry details below data table 
	Given 	User is logged on to the LMS website 
	When 		User lands on Manage User page 
	Then 		User should see the text  "Showing 1 to 4 of 4 entries" beow the user table 
	
Scenario: Table 
	Given User is logged on to the LMS website using valid credentials 
	When  User is on the Manage user page 
	Then User should see the table footer as "In total there are 4 users". 
	Then User should see the button with text "+ icon and Add New User" 
	When User clicks Add New User button 
	Then User should see the "User details" dialog box 
	When User is on the Manage user page after clicking User Tab 
	When User clicks sort icon in table header 
	Then Table rows should be sorted 
	When User checks empty checkbox in header 
	Then Check box in all the rows of user table should be checked 
	When User unchecks checkbox in header 
	Then Check box in all the rows of user table should be unchecked 
	
	
Scenario: Verify and validate Delete Icon 
	Given User is on any page after Login with valid credentials 
	When User is on the Manage user page after clicking User Tab 
	Then User should see the delete icon at the top left corner of the user table 
	When no rows is checked 
	Then Delete icon at the top left corner of the user table disabled 
	When User checks the rows in user table 
	Then Delete icon at the top left corner of the user table enabled 
	When User clicks the delete icon at the top left corner of user table 
	Then Confirm dialog box should be displayed with Text "Are you sure you want to delete the selected Users?" , button with text "No" , the button with text "yes" and close(X) icon 
	When User clicks button with text "No" 
	Then Selected rows should not be deleted and dialog box should be closed 
	When User clicks button with text "Yes" 
	Then Selected rows should be deleted and popup should be shown with success message "Users deleted" 
	When User clicks the close(x) icon 
	Then Confirm dialog box should be closed 
	
Scenario: Verify and validate 'Edit/Delete' icon 
	Given User is on user page after Login 
	When User is on the user page after clicking User Tab 
	Then User should see the buttons with edit/delete icon in each row of Edit/Delete coulmn 
	When User clicks delete button 
	Then Confirm dialog box should be displayed with Text "Are you sure you want to delete (selected user name) ?" , button with text "No" , the button with text "yes" and close(X) icon 
	When User clicks Edit button 
	Then "User Details" dialog box should be displayed for editing 
	
Scenario: Verify 'Search' functionality 
	Given User is on any page after Login 
	When User is on the Manage user page 
	Then User should see the Search input field after the delete icon 
	When User types Name to search 
	Then Rows with the name should be displayed 
	When User types random text in search field which has no matching entry 
	Then rows are not displayed 
	
Scenario: Verify 'User Id' functionality 
	Given User table is displayed in manage user page 
	When User clicks ID in any row 
	Then User details dialog box displayed with user information 
	
Scenario: Verify the heading of 'User Details Window' 
	Given User is on Manage user page 
	When User clicks Add new user button 
	Then User should see User details window with heading "User Details" 
	
Scenario: Verify the presence of Cancel button in user detais window 
	Given User is on Manage user page 
	When User clicks A Add new user button 
	Then User should see a button with text Cancel in user details window 
	Given User is on User details page window 
	When User clicks A cancel button 
	Then User details window should be closed 
	Given User is on Manage user page 
	When User clicks A Add new user button 
	Then User should see a cancel(x) in user details window 
	Given User is on User details page window 
	When User clicks A cancel(X) icon 
	Then User details window should be closed 
	
Scenario: Verify the presence of Submit button in user detais window 
	Given User is on Manage user page 
	When User clicks a add new user button 
	Then User should see a button with text Submit in user details window 
	
Scenario: Verify the presence of Label Texts and Input fields 
	Given User is on Manage user page 
	When User clicks A Add new user button 
	Then User should see the placeholders with Text As "First name","Middle name", Last name","Email adress","Phone no", "Address","City", "State","Postal Code"."Program","UG Program","PG Program","Skill","Experience","User Role",Visa status","Batch","Comments" 
	When User clicks A Add new user button 
	Then User should see the input fields for "First name","Middle name", Last name","Email adress","Phone no", "Address","City", "State","Postal Code"."Program","UG Program","PG Program","Skill","Experience","User Role",Visa status","Batch","Comments" corresponding to their labels 
	
Scenario: Dropdown 
	Given User is on "User details" window 
	When User clicks the drop down icon for state 
	Then User should select from the drop down menu 
	When User clicks the drop down icon for User Role 
	Then User should select from the drop down menu 
	
	
	
Scenario: Validating the User details window with all fields empty 
	Given User is on User details page Window 
	When User clicks save button with all details empty 
	Then User should see a message "Mandatory Fields cannot be empty"

Scenario: Adding new Users 
	Given User is now in User details window 
	When User clicks Save button by entering all valid values in required fields 
	Then New User Should be Saved 
	
Scenario: Validating the presence of Address2 button 
	Given User is on Manage user page 
	When User clicks A Add new user button 
	Then User should see the button with text "+ Add C/O, Apt, Suite, Unit" 
	Then User should see the input field with Label "Address2" 
	
Scenario: 
	Validating the presence of input number arrows in postal code input field 
	Given User is on "User details"window 
	When User clicks postal code input field 
	Then User should see the input Number arrows in the postal code input field 
	
	
	
	
	
     