@CreateUser
Feature: Create a new user and Job search

  @scenario1
  Scenario Outline: Visit the site’s backend and create a new user
    Given user is on the job board website
    And logged in with credential "<user>" and "<password>"
    When i click on user menu and add new user using add new button
    And fill in nessesary details and click add new user button
    Then i validate that the new user is created
    And close the browser and generate html report

    Examples: 
      | name  | user | password |
      | user1 | root | pa$$w0rd |
