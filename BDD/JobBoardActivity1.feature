@JobPortalActivity1
Feature: Create a new user

@CreateUser
Scenario: Opening a brower using Selenium
    Given User is on alchemy login Page
    When  User logged in
    Then User clicked the menu item that says Users
    Given User click Add New button
    When User fill in the necessary details
    Then Verify that the user was created
    And Close the Browser
  