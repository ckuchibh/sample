@JobPortalActivity2
Feature: Create a new user

@JobSearch
Scenario: Searching for jobs and applying to them using XPath
    Given User navigated to Jobs page
    When  User search for jobs and change the Job type
    Then  User selected Job type as Full Time
    Given Find a job listing using XPath and it to see job details
    When  Find the title of the job listing using XPath and print it to the console.
    Then  Find and Click on the “Apply for job” button
    And   Close the Browser
  