Feature: Login

  Scenario: Login Successful with valid Credentail
    Given launch chrome browser
    When opens url
    And enter email as "admin@yourstore.com" and Password as "admin"
    And click on login
    Then click on logout link

  Scenario Outline: Login Successful with valid Credentail DOT
    Given launch chrome browser
    When opens url
    And enter email as "<email>" and Password as "<password>"
    And click on login
    Then click on logout link

    Examples: 
      | email               | password |
      | admin@yourstore.com | admin    |
      | test@yourstore.com  | admin    |
