Feature: Heading 
Scenario: Validate the heading 


	Given User clicks on Batch 
	When User should see a heading with text "Manage Batch" 
	And 	Delete button is disabled 
	When User searches by batchname 
	Then User clicks edit button 
	And User validate batch details with text "Batch Details" 
	When User edit batch name 
	Then User edit batch description 
	Then User edit program name 
	Then User edit status 
	Then User edit Classes 
	And User click save button 
	Then User clicks edit button 
	And  User clicks cancel button 
	Then User verifies that the details are correctly updated. 
	
	
	
	
	
	#Scenario: Add Batch
	
	
	Given  User clicks A New Batch button 
	When user can see Batch details form 
	Then User clicks Save button without entering data 
	And User gets message Name is required 
	Then User clicks batch details Cancel button 
	Then User clicks A New Batch button 
	Then User edit batch name 
	Then User edit batch description 
	Then User  entering program name 
	Then User edit status 
	Then User edit Classes 
	And User click save button 
	And User verifies that the details are correctly updated. 
	
	
	
	#Scenario:Pagenatiom
	
	
	Given  User should see a heading with text "Manage Batch" 
	When  User is clicks first page of Manage batch 
	Then 	User clicks navigate right arrow button 
	Then  User clicks navigate left arrow button 
	Then User is clicks Second page of Manage batch 
	
	
	#Scenario:Ascending order and Descending order
	
	Given User should see a heading with text "Manage Batch" 
	When User clicks on the Ascending arrow down  near to the Batch name 
	Then User clicks on the Ascending arrow (down ) near to the Batch Description 
	Then User clicks on the Ascending arrow (down ) near to the Batch Status 
	Then User clicks on the Ascending arrow (down ) near to the No Of Classes 
	And User clicks on the Ascending arrow (down ) near to the Program Name 
	Then User clicks onthe Descending arrow (down ) near to the Batch name 
	Then User clicks onthe Descending arrow (down ) near to the Batch Description 
	Then User clicks onthe Descending arrow (down ) near to the Batch Status 
	Then User clicks on the Descending arrow (down ) near to the No Of Classes 
	And User clicks on the Descending arrow (down ) near to the Program Name 
	
	
Scenario: Delete Batch 
	Given user clicks delete button for any batch 
	Then User clicks Yes button 
	Then User clicks No button 
	
	
Scenario: Delete multiple batch 


	Given User selects more than one Batch using checkbox 
	When user clicks delete button for any batch 
	Then User clicks Yes button 
	Then User clicks No button 
	
	
	
	
