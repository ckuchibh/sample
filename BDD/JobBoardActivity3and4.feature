@JobPortalActivity3

Feature: Posting a job using parameterization

@JobPost
Scenario Outline: Post a job using details passed from the Feature file

    Given User navigated to post Jobs page
    When  User fill in the details "<JobTitle>" and "<Email>" click submit
    Then  User Go to the Jobs page and confirm job listing is shown on page
    And   Close the Browser
    
Examples:
| JobTitle     | Email                  |
| IBMJOB12331    | EmailIBMADD244@gmail.com |




