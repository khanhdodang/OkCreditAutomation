#Author: Sivasankaramalan

Feature: Test on Add Transaction Flow in  OkCredit App
  
  In Order to Verify the Transaction frlow between the Customer and the Seller, there are few scenarios needs to be executed

  Background: Login to the OkCredit App
    Given Launch the App
    And Verify the "Landing" Page
    Then Verify the list of "Languages" 
    And Select Language as "English" 
    Then Verify the "Welcome" Page 
    Then Verify all the slides in Welcome Page
    And User clicks on "GET STARTED"
    Then Verify the "Mobile Number" Page
    And User enters the "Mobile Number"
    Then Verify the "OK" button  
    And User clicks on "OK"
    Then Verify the "Password" Page
    And User enters the "Password" 
   	And User clicks on "OK" 
  	Then Verify the "Home" Page
  	
   	@Login 
  Scenario: Add Customer to the User
  #	When User is in "Home" Page
  #	And User clicks on "Add Customer" 
  #	And User enters the "Customer Name" 
  #	And User enters the "Customer Number" 
  #	Then Verify the "Customer" Page
  #	
  #Scenario: Add Transaction to the Customer
  #	When User is in "Home" Page
  #	And Navigate to "Cutomer" Page
  #	And User clicks on "Give Credit" 
  #	And User enters the "Credit Amount" 
  #	And User adds "Attachments"
  #	And Navigate to "Home" Page
  #	Then Verify Credit Details in "HomePage" 
  #	And Navigate to "Cutomer" Page
  #	And User clicks on "Accept Payment" 
  #	And User enters the "Payment" 
  #	And User adds "Attachments" 
  #	Then Verify Credit Details in "Transaction Page"
  #	And Navigate to "Home" Page
  #	Then Verify Credit Details in "HomePage" 
  #	
  #	
 	Scenario: Verify the Transaction details in Account Page
  	When User is in "Home" Page
  	And User clicks on "HamBurger Menu" 
  	And User clicks on "Account"
  	Then Verify the "Account" Page
  	And User clicks on "Account Statement"
  	Then Verify Credit Details in "Account Page" 
  	
  	############# This Scenario Has to be Executed only once ##########
  	
  	@SignUp
  Scenario: Verify OTP send to Mobile and Enter it in Login
   	Then Verify "OTP" Page
   	And User clicks on "Send OTP"
   	And Verify the "Verify MObile" Page
   	And User enters the "OTP"
   	Then Verify the "Shop Name" Page
   	And User enters the "Shop Name"
  	
  	
  	############# Keywords Summary ####################################SSS
  	
				#Feature: List of scenarios.
				#Scenario: Business rule through list of steps with arguments.
				#Given: Some precondition step
				#When: Some key actions
				#Then: To observe outcomes or validation
				#And,But: To enumerate more Given,When,Then steps
				#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
				#Examples: Container for s table
				#Background: List of steps run before each of the scenarios
				#""" (Doc Strings)
				#@ (Tags/Labels):To group Scenarios
 