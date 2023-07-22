@dropdown
Feature: Test to Filldetails functionality

 # @fill1
  #Scenario: Check Filldetails functionality
    #Given i open browser
   # And i enter url
   # And i enter fiestname & lastname and address
   # And i enter email adress
   # When i give phone number
   # And i select male in gender
   # And i select cricket in hobbies
    #Then i fill Hindi in language

  @fill2
  Scenario: Check DropDown functionality
   Given i open browser
    And i enter url
    And I select Java in skills
    And I select India in contry
    When I select date of brith
    And I enter the password
    Then I enter confirm password
