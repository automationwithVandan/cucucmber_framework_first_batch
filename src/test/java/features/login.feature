Feature: Testing login functionlity

Scenario: login with correct username and correct password

Given user redirects to the saucedemo "https://www.saucedemo.com/"
When user enter the correct username 
And user enters the correct password
And user click on Login button
Then user redirects to Inventory page
