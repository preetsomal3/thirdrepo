Feature: Home Page

Background:
Given a registered user exists
Given user is on Amazon login page
When user enters Username
And user enters password
And user clicks on login button
Then user navigates to order page

Scenario: Check previous order details
Then user checks the previous order details


Scenario: Check open order details
Then user checks the open order details

Scenario: Check cancelled order details
Then user checks the cancelled order details

