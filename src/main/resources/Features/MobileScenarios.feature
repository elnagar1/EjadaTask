Feature: Automated End2End


  Scenario Outline: Scenario1
    Given Open app
    When  Login with credentials "<Username>" and "<Password>"
    Then  Verify status "<status>"
    Examples:
      |    Username      |  Password         |    status    |
      | standard_user    |   secret_sauce    |    valid     |
      | standard_user    |   Test2           |     no       |
      | Test1            |   secret_sauce    |     no       |
      |                  |   secret_sauce    |     no       |
      | standard_user    |                   |     no       |

