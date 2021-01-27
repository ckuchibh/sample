@hrmactivity1
Feature: Creating a job vacancy

  @hrmscenario1
  Scenario Outline: To create a job vacancy for DevOps Engineer
    Given User is on OrangeHRM page logged in with credentials "<user>" and "<pass>"
    When Navigate to the Recruitment page and click on the Vacancies menu
    And Click on the Add button and Fill out the necessary details and click save
    Then Verify the vacancy was created correctly

    Examples: 
      |name|user|pass|
      |user1|orange|orangepassword123|
