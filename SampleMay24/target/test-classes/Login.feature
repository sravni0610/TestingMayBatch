Feature: Feature for Testing the Login functionality of the application

#  Scenario: Validating user able to login with positive testdata
#    Given  User navigates to the application
#    When   User enters login details
#    And   User clicks on POM option
#    And    User clicks on EMployee List
#    Then   User is able to see Employee information


  Scenario Outline: Validating user able to login with multi positive testdata
    Given  User navigates to the application
    When   User enters "<UserID>" and "<Password>"
    And   User clicks on POM option
    And    User clicks on EMployee List
    Then   User is able to see Employee information

    Examples:

    |UserID     |Password           |
    | Admin     | Qedge123!@       |
    |  Admin    | Admin             |