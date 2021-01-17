Feature: Billing feature

Scenario Outline: Billing scenario

When User enter billing amount "<billingamount>"
And User enter tax amount  "<taxamount>"
Then The final amount is "<finalamount>"

Examples:

| billingamount | taxamount | finalamount |
| 1000 | 10 | 1010 |
| 500  | 50 | 550  |
| 50   |5.5 | 55.5 |