@GTPLBank
Feature: Validate user is able to login to GTPL Bank Application

  Background:
  #Scenario: User login to Demo QA application
    Given Launch the Chrome Browser
    Given load url "https://demo.guru99.com/V1/index.php"
    When User enters username "mngr476769" and password "hubyvas"
    When User clicks on login button
    Then User validates login is successfull
    
    @AddCustomer
    Scenario: Validation of adding a new customer
    When User clicks on new customer button
    And User enters "Praveena" customer name
    And User clicks on gender button
    And User enters "15-09-1996" customer DOB
    And User enters "Ashok Nagar" customer address
    And User enters "Chennai" customer city
    And User enters "TamilNadu" customer state
    And User enters "600083" customer pincode
    And User enters "0000000000" customer phone no
    And User enters "ap@gmail.com" customer gmail
    And User clicks on submit button
    Then User validates successful message
    
      @EditCustomer
      Scenario: Editing the existing customer
      When the user clicks Edit customer button
      And the user enters "789456"
      And clicks submit button
      Then User validates successful message
      
      @DeleteCustomer
      Scenario: Deleting the existing customer
		When the user clicks Delete customer button
      And the user enters "789456"
      And clicks submit button
      Then User validates successful message