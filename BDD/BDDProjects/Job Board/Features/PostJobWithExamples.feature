@createuser
Feature: Posting a job using parameterization

  @scenario4
  Scenario Outline: Post a job using details passed from the Feature file
    Given S3, user open browser with Alchemy Jobs site
    When S3, i go to Post a Job page and fill in detaile like "<JobTitle>","<Description>","<Email>","<Company>" and Click submit.
    Then S3, the job should get posted and should be present in the Jobs page.
    And S3, confirm job listing is shown on page is same as posted"<JobTitle>"
    And S3, close Browser and Generate HTML report.

    Examples:
    
    |Name|JobTitle|Description|Email|Company|
    |user1|SDET JOB 11676112|SDET JOB 11112 - Description|sdetemail65345@gmail.com|Microsoft|