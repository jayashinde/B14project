Feature: Home
  @HomePage
    Background:
    Given Open url in the browser

  Scenario: Home page data

  @SC01

    When I click on register page
    Then I Nivegate to the Registration form page

    @SC02
    When I click on login page
    Then I Nivegate to the login page
