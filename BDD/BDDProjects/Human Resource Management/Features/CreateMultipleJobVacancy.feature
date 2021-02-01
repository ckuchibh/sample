@hrmactivity4
Feature: Creating multiple job vacancy

  @hrmscenario4
  Scenario Outline: To create multiple job vacancy for DevOps Engineer 
    Given s4:User is on OrangeHRM page logged in with credentials "<user>" and "<pass>"
    When s4:Navigate to the Recruitment page and click on the Vacancies menu
    And s4:Click on the Add button and Fill out the necessary details and click save. "<hiringManager>","<role>"
    Then s4:Verify the vacancy was created correctly

    Examples: 
      |name|user|pass|hiringManager|role|
      |user1|orange|orangepassword123|Sharmistha Sinha|SDET|
      |user1|orange|orangepassword123|Har App|Full Stack Dev|
