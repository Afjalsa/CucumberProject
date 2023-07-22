Feature: Test to OrangeHRM Application

  @hrm
  Scenario: Test to functionality of OrangeHRM Application
    Given open new browser
    And hit the url
    And enter username and password
    Then clicl on login button
    And enter employee name
    And enter employee id
    And select employement status
    And select include
    And enter supervisor name
    And select job title
    Then select sub unit
