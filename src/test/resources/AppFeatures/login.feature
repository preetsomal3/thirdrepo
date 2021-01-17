Feature: Login feature

Scenario Outline: Login fail-combinations
Given User is on login page
When User enters "<username>"
When User enters the "<password>"
Then login is failed

Examples:
| username | password |
| Tom      | Tom@12   |
| Peter    | Per@123  |
| Sam      | Sam@321  |
