Feature: Automated End2End Normal Order
@stop
  Scenario Outline: Normal Order Cycle Login
    Given user is on Login screen
    When  Click skip button
    And Change country and choose egypt
    And    insert "<phone>"  click continue and insert "<Password>" and click sign in
    Then  you can view  Home



    Examples:
      | phone       | Password |
      | 01150300594 | 123456   |

  Scenario Outline: Normal Order Cycle
    Given user is on Home screen
    When  Click search button
    And Click menu button and choose anything then click done
    And    click search button and insert "<address>"
    And choose one result and click next button
    And enter your products Click Checkout
    And Choose Order price and click submit
    And Choose payment type cash and then click place order
    Then  assert output

    Examples:
      | address     |
      | 01150300594 |


