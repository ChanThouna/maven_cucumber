
@LoginFeature
Feature: Login Feature
  Description: This feature will be used to login to SimpliLearn Application

  Background: 
    Given User has opened the SimpliLearn application

  @PositiveLogin @Sanity
  Scenario Outline: Verify that when user enter useraname and password the user should be able to login successfully
    When user clicks on login link
    And User enters correct UserName "<Username>"
    And User enters correct password "<Password>"
    And User clicks on Login button
    Then User should be landed to the Homepage
    And User should be able to see the welcome message

    Examples: 
      | Username    | Password |
      | abc@xyz.com | abc@123  |

  # | pqr@xyz.com | abc@123  |
  @NegativeLogin @Sanity
  Scenario Outline: Verify that when user enter useraname and password the user should be able to login successfully
    When user clicks on login link
    And User enters correct UserName "<Username>"
    And User enters correct password "<Password>"
    And User clicks on Login button
    Then User should be landed to the Homepage
    And User should be able to see the welcome message

    Examples: 
      | Username         | Password |
      | Chanchan@xyz.com | abc@123  |
     # | pqr@xyz.com | abc@123  |
