Feature: Registration
  @Register
  Scenario: Registration with valid data
    Given Open url in the browser
    When Fill the registration form

    | Firstname |  Lastname | password  | confirmpassword |
    Then registration success ful message should be display

