Feature: Test to autofill functionality

  @auto
  Scenario: check autofill functionality
    Given open browser
    And enter url
    And enter firstname and lastname
    And enter address and email address
    And enter phone number
    And click on male and cricket
    Then select language,skills and country
    And select country and date of brith
    When enter pass and confirm pass
    Then upload file
