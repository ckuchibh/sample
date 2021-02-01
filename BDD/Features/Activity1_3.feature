@activity1_3
Feature: Testing with Tags

  @SimpleAlert @SmokeTest
  Scenario: Testing with Simple Alert
    Given User is on the page
		When User clicks the Simple Alert button
		Then Alert opens
		And Read the text from it and print it
		And Close the alert
		And Read the result text
		And Close Browser
    
  @ConfirmAlert
  Scenario: Testing with Confirm Alert
    Given User is on the page ca
		When User clicks the Confirm Alert button ca
		Then Alert opens ca
		And Read the text from it and print it ca
		And Close the alert with Cancel ca
		And Read the result text ca
		And Close Browser ca

  @PromptAlert
  Scenario Outline: Testing with Prompt Alert
    Given User is on the page pa
		When User clicks the Prompt Alert button pa
		Then Alert opens pa
		And Read the text from it and print it pa
		And Write a custom message in it pa
		And Close the alert pa
		And Read the result text pa
		And Close Browser pa
		

    Examples: 
      | name  | value | status  |
      | name1 |     5 | success |
      | name2 |     7 | Fail    |
