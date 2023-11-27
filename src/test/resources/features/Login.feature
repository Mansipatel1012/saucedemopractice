@MMP
Feature: Login feature
  As a user
  I have to enter correct username and password
@smoke
  Scenario: User should navigate to login page successfully
    Given I am on homepage
    When  Enter Username "standard_user"
    When  Enter password "secret_sauce"
    And   click on login button
    And   verify Products


