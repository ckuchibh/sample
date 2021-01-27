@activity2_5
Feature: Login Test

  @SmokeTest
  Scenario Outline: Testing Login with Examples
    Given User is on Login page
    When User enters "<Username>" and "<Password>"
    Then Read the page title and confirmation message
    And Close the browser1

    
    Examples:
    	|Name |Username|Password|
    	|User1|admin   |password|
    	|User2|adminUser|Password|
    