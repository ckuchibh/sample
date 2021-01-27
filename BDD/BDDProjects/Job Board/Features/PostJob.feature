@createuser
Feature: Posting a job using parameterization

  @scenario3
  Scenario Outline: Post a job using details passed from the Feature file
    Given S3, user open browser with Alchemy Jobs site
    When S3, i go to Post a Job page and fill in detaile like "SDET JOB 13245412 WO EX","SDET JOB 11112 - Description","sdetekkjhfmail123@gmail.com","Microsoft" and Click submit.
    Then S3, the job should get posted and should be present in the Jobs page.
    And S3, confirm job listing is shown on page is same as posted"SDET JOB 11112 WO EX"
    And S3, close Browser and Generate HTML report.

    