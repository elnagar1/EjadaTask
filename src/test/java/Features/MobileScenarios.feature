Feature: Automated End2End


  Scenario Outline: Scenario1
    Given Open app
    When  Login with credentials "<Username>" and "<Password>"
    Then  Verify status "<status>"
    Examples:
      |    Username      |  Password         |    status           |
      | standard_user    |   secret_sauce    |    valid            |
      | standard_user    |   Test2           |     invalid         |
      | Test1            |   secret_sauce    |     invalid       |
      |                  |   secret_sauce    |     emptyUsName       |
      | standard_user    |                   |     emptyPass       |

