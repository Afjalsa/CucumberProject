@sprint1
Feature: validate the login functionality



  @US0002
  Scenario Outline: validate the nagative login functionality
   Given Navigate to utest url
    When click on sign in link
    And Enetr email <Email>
    And click on sign in button
    Then validate the error message <Expected>
    
    Examples:
    |Email||Expected|
    |school@gmail.com||Invalid username or password.|
    |college@gmail.com||Invalid username or password.|
    |class@gmail.com||Invalid username or password.|
