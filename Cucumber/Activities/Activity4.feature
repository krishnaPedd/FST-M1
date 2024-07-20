@activity4
Feature: Data driven test without Example

  Scenario: Testing with Data from Scenario
    Given User is on the Login page
    When User enters the "admin" and "password"
    Then Read the page title and confirmation message after login
    And Close the web Browser