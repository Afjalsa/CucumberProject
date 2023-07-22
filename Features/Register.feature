Feature: Test to Register Page

  @register
  Scenario: Check Register functionality
    Given Opens the browser
    And Enters the url
    And Clicks on choose file
    Then I can uploaded file
