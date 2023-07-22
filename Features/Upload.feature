Feature: Upload a file

@upload
  Scenario: Test to uploading a file
    Given I open the browser
    And I enter the url
    And I click on uplaod link
    Then I  can upload a file
