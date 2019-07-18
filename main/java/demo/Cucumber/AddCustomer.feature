#AddCustomer
@regression @addcust @sprint1
Feature: To test add customer functionality

  @us1
  Scenario: To test the generate customer ID functionality1
    Given the user is in add customer pag
    When the user fill in invalid customer details
      | firstName   | test       |
      | lastName    | one        |
      | emailAdress | test@gmail |
      | adress      | chennai    |
      | phoneNum    |    7464849 |
    And the user clicks the submit button
    Then the user should see error alert message

  @us2 @smoke
  Scenario: To test the generate customer ID functionality2
    Given the user is in add customer pag
    When the user fill in invalid customer details
      | firstName   | test    |
      | lastName    | two     |
      | emailAdress | test    |
      | adress      | chennai |
      | phoneNum    | 7464849 |
    And the user clicks the reset button
    Then the user should see empty fields

  @us3
  Scenario: To test the generate customer ID functionality3
    Given the user is in add customer pag
    When the user fill in invalid customer details
      | firstName   | test           |
      | lastName    | three          |
      | emailAdress | test@gmail.com |
      | adress      | chennai        |
      | phoneNum    |        7464849 |
    And the user clicks the submit button
    Then the error should see error popup message
