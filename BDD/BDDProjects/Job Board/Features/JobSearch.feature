@JobSearch
Feature:  Job search

  @scenario2
  Scenario: Search job and apply
    Given S2:User is on Alchemy Jobs site
    And S2:navigate to Jobs page and Find the Keywords search input field
    When S2:i type in keywords to search for jobs and change the Job type to show only FullTime jobs and click search
    Then S2:I should see list of job listing and job details and print the title of the job listing to the console
    And S2:choose a job and click on the Apply for job button
    And S2:Close the browser