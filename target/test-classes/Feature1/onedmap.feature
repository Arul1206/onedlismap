@tag
Feature: Title of your feature
  I want to use this template for my feature file

  @tag1
  Scenario: Title of your scenario
    Given user should launch browser
    And user click add customer link
    When user will provide valid details
      | fname   | Arul           |
      | lname   | kumar          |
      | email   | arul@gmail.com |
      | address | Velacherry     |
      | Phno    |     9790043289 |
    Then to verified the customer id is displayed
