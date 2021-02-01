
@hrmactivity2
Feature: Adding candidate for recruitment

  @hrmscenario2
  Scenario Outline: s2:Add information about a candidate for recruitment
    Given s2:User is on OrangeHRM page logged in with credentials "<user>" and "<pass>"
    When s2:Navigate to the Recruitment page and click on the Add button and on the next page, fill in the details of the candidate
    And s2:Upload a resume to the form and save
    Then s2:Navigate back to the Recruitments page to confirm candidate entry and Verify

    Examples: 
      |name|user|pass|
      |user1|orange|orangepassword123|
