Feature: User Registration

Scenario: User Registration with data
Given User is on registration page
When User enters following details
 | naveen | automation | nav@gmail.com | 9999 | Bangalore |
 | tom    | peter      | tom@gmail.com | 8999 | USA       |
 Then User registration should be successful
 
 Scenario: User Registration with data columns
Given User is on registration page
When User enters following details with columns
 | firstname | lastname | email | id | location | 
 | naveen | automation | nav@gmail.com | 9999 | Bangalore |
 | tom    | peter      | tom@gmail.com | 8999 | USA       |
 Then User registration should be successful