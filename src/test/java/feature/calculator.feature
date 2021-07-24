Feature: This feature will help do the feature functionality

  Background: 
    Given The calculator application is open

  Scenario: Add two numbers
    When I add two numbers 2 and "5"
    Then I should get the result as "7"

  Scenario: Multiply two numbers
    When I multiply 3 and "5"
    Then I should get the result as "15"
