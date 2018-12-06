@Login
Feature: Login

  @Negative
  Scenario: [Fleet]SignIn: Verify user can’t sign in with invalid credentials
    Given User goes to login page
    When I enter username as "Gabriel200"
      And I enter password as "AnyText"
      And I click 'Sign In'
    Then Login should fail

  @Functional
  Scenario: [Fleet]SignIn: Verify user can sign in with valid credentials
    Given User goes to login page
    When I enter username as "Gabriel200"
      And I enter password as "Gabriel200"
      And I click 'Sign In'
    Then User should be signed in