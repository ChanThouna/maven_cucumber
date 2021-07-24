Feature: Home Screen Feature

  Background: 
    Given User has opened Simplilearn Application
    When User enters correct Username "<Username>"
    And User enters correct password "<Password>"
    And User clicks on Login Button

  Scenario: Verify that the user is able to see the product details
    Given User has landed on HomeScreen
    When User do something
    Then user should be able to see something

  Scenario: Verify that the user is able to see the product details
    Given User has landed on HomeScreen
    When User do something
    Then user should be able to see something
