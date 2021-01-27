
@hrmactivity3
Feature: Adding multiple candidate for recruitment

  @hrmscenario3
  Scenario Outline: Add information about a candidate for recruitment
    Given s3:User is on OrangeHRM page logged in with credentials "<user>" and "<pass>"
    When s3:Navigate to the Recruitment page and click on the Add button and on the next page, fill in the details "<fname>","<lname>","<email>" of the candidate
    And s3:Upload a resume "<path>" to the form and save
    Then s3:Navigate back to the Recruitments page to confirm candidate entry and Verify "<fname>","<lname>"

    Examples: 
      |name|user|pass|fname|lname|email|path|
      |user1|orange|orangepassword123|Abishek|Mohan|abimoihan@gmail.com|C:\\Users\\ABISHEKMOHAN\\Desktop\\Ecllipse Java Project\\hrmProject\\src\\test\\java\\Resume.docx|
      |user1|orange|orangepassword123|Sum|Tab|sumsumne@gmail.com|C:\\Users\\ABISHEKMOHAN\\Desktop\\Ecllipse Java Project\\hrmProject\\src\\test\\java\\Resume.docx|
