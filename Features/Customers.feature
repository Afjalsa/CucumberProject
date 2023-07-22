Feature: Customer

  Scenario: Add new Customer
    Given User launch browser
    When User opens URL
    And User enters Email and Password
    And User click on Login
    Then User can view Dashboad
    When User click on customer menu
    And click on Add new customer Item
    And click on Add new button
    Then User can view Add new customer page
    When User enter customer info
    And click on save button
    Then User can view confirmation message "The new customer has been added successfully."
    And close browser
