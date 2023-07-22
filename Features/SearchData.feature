Feature: Search Customer

  Background: Steps common for all scenarios
    Given browser open
    When enter URL
    And enter Mail and Password
    And click on Login
    Then We Can view Dashboad Page

  @Test1
  Scenario: Search Customer by Email
    When click on customer menu
    And click on customer Item
    And enter customer Email
    When click on search button
    Then we should found Email in the search Table

  @Test2
  Scenario: Search Customer by Name
    When click on customer menu
    And click on customer Item
    And enter customer FirstName
    And enter customer LastName
    When click on search button
    Then we should found Name in the search Table

  @Test3
  Scenario: Validate Administration
    When click on customer menu
    And click on customer roles

  @Test4
  Scenario: Search Vendors By Name and Email
    And click on venders
    Then enter name and email
    And click on button search

  @Test5
  Scenario: Search Activity Log
    Given browser open
    When enter URL
    And enter Mail and Password
    And click on Login
    Then We Can view Dashboad Page
    When click on customer menu
    And click on Activity Log
    And enter createdfrom date
    And enter createdto time
    And enter IpAddress
    Then click on activity search

  @Test6
  Scenario: Check Activity Types Box
    Given browser open
    When enter URL
    And enter Mail and Password
    And click on Login
    Then We Can view Dashboad Page
    When click on customer menu
    And click on Activity Types
    And click on check box
    Then click Save button

  @Test7
  Scenario: Search Product on Catalog
    Given browser open
    When enter URL
    And enter Mail and Password
    And click on Login
    Then We Can view Dashboad Page
    When click on Catalog
    And click on products
    And enter product name
    Then click  on product serach button
