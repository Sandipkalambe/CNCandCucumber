Feature: This feature file contain test case of invoiced orders

Scenario: when user clicks on the action button in intransit status, these four options should display sale details, Email Sale, Download Invoice and Label Printing

Given User logs into the application as manager
When manager selects picking tabs
Then manager clicks on the Invoiced orders options
Then manager Clicks on the Action buttun for Intransit Status
Then manager Click on the Sale Detail a new Window Should open with all details of the sale Details
Then manager Click on the Sale details user can allow the print of sale details

#Scenario: The user clicks on the Sale details then the new window should open with all details of the Sale Details
#Given User logs into the application as manager
#When manager selects picking tabs
#Then manager clicks on the Invoiced orders options
#Then manager Clicks on the Action buttun for Intransit Status
#Then manager clicks on the Email sale a new window should be displayed then the user can send the email

#Scenario: The user clicks on the Sale details then the new window should open with all details of the Sale Details

#Given User logs into the application as manager
#When manager selects picking tabs
#Then manager clicks on the Invoiced orders options
#Then manager Clicks on the Action buttun for Intransit Status
#Then manager clicks on the Download Invoice user is able to download the Invoice

#Scenario: the user clicks on the Sale details then the new window should open with all details of the Sale Details.

#Given User logs into the application as manager
#When manager selects picking tabs
#Then manager clicks on the Invoiced orders options
#Then manager Clicks on the Action buttun for Intransit Status
#Then manager Clicks on the Label Printing user can see the new window of label printing

#Scenario:  the user clicks on the show tab will display only the Invoiced Orders list that we have entered.

#Given User logs into the application as manager
#When manager selects picking tabs
#Then manager clicks on the Invoiced orders options
#Then manager clicks on the show tab 
#Then manager select the number 100 from show tab dropdown list
