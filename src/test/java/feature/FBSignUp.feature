Feature: Facebook Sign up Feature

  @DataTable
  Scenario: Verify creation of facebook user
    Given User has launched the application on browser
    When User clicks on Create New Account button
    And user creates the new account
      | Field        | Value        |
      | FirstName    | Daisy        |
      | LastName     | Lamar        |
      | MobileNumber |   9898786545 |
      | Password     | Lamar@Daisy1 |
    And User clicks on SignUp button
    Then User should be able to see success message
