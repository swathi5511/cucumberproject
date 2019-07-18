#Author: your.email@your.domain.com
@sprint2 @smoke @regression
Feature: To test add tariff plan functionality

  @us6
  Scenario Outline: To verify the success message
    Given The user is in add tariff plan page
    When the user fill in invalid tariff plan details "<MonthRent>", "<FreeLocal>","<FreeInt>","<FreeSMS>","<LocalCharges>","<>","<SMSCharges>"
    And the user clicks submit button in add tariff plan page
    Then the user should see the error popup message

    Examples: 
      | MonthRent | FreeLocal | FreeInt | FreeSMS | LocalCharges | SMSCharges |
      |        50 |       100 |      26 |      10 |          250 |        120 |
      |        99 |        10 |      55 |      10 |          100 |        160 |
