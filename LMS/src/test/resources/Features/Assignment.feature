Feature: Assignment 

Background: Successfull login with valid username and password 
	Given User launch the chrome browser 
	When User opens URL "https://lms-frontend-phase2.herokuapp.com/login" 
	And  User enter Email as "LMS" and Password as "lms" 
	And  User click on login 
	
@ValidatingHeader 
Scenario: Validate the heading 
	Given User is logged on to LMS website 
	When  User click on manage assignment page 
	Then  User should see a heading with text "Manage Assignment" on the page 
	
	
@SearchAssignment 
Scenario: Search Assignment By Name 
	Given      User loged in and User is on Assignment page 
	When       User clicks on search with  name phrase  into search box 
	Then 				Enteries for name phrase are show 
	
	
	
@EditAssignmentDetails 
Scenario: Edit Assignment Details 
	Given User is on Assignment page 
	When User clicks on Edit button 
	Then User lands on Assignment Details form 
	When User editss "Assignment Name" and selects the Save button 
	Then User can see 'Successful Assignment Updated' message 
	
@DeleteAssignment 
Scenario: Delete Feature 
	Given User is on Assignment page 
	When User clicks on Delete button after selecting an assignment 
	Then User lands on Confirm Deletion form. 
	When User click Yes 
	Then User can see 'Successful Assignment Deleted' message 
	When User click No 
	Then User can see Confirm Deletion form disappears 
	When User clicks on Delete button on top left corner 
	Then User lands on Confirm Deletion form. 
	When User clicks Yes button 
	Then User can see 'Successful Assignment Deleted' message 
	
	
@AccendingDecendingOrder 
Scenario:
Verify that the results are displayed in Ascending order of Assignment name 
	Given User is on Assignment Page 
	When User clicks onthe Ascending arrow (down ) near to the Assignment name 
	Then User can see the results in Ascending order of Assignment name 
	When User clicks onthe Descending arrow (down ) near to the Assignment name 
	Then User can see the results in Descending order of Assignment name 
	
	
 								