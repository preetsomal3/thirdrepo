Feature: Uber Booking Feature

@Prod
Scenario: Booking Cab sedan
Given User wants to select a car type "sedan" from uber app
When User select car "sedan" and pick up point "Banglore" and drop point "Pune"
Then Driver starts the journey
And Driver ends the journey
Then User pays 1000 USD

@Reg
Scenario: Booking Cab mini
Given User wants to select a car type "mini" from uber app
When User select car "mini" and pick up point "hyderabad" and drop point "Pune"
Then Driver starts the journey
And Driver ends the journey
Then User pays 1000 USD

@Smoke
Scenario: Booking Cab Hatchback
Given User wants to select a car type "Hatchback" from uber app
When User select car "hatchback" and pick up point "Mumbai" and drop point "Pune"
Then Driver starts the journey
And Driver ends the journey
Then User pays 1000 USD