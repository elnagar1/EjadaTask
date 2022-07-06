Feature: Automated End2End Normal Order

  Scenario Outline: Normal Order Cycle
    Given Open user app login screen
    When  Click skip button and choose env
    And   Choose country code
    And   Enter "<UPhone>"  click continue
    And   Enter "<UPassword>" and click sign in
    And   Click search box from home and choose anything
    And   Go back to search screen and search with "<address>"
    And   Choose one result and click next button
    And   Enter your products and Click checkout
    And   Choose order price and click submit
    And   Choose payment type cash and then click place order
    Then  Order must done

    Examples:
      |    UPhone    |  UPassword  |   address        |
      | 01150300594  |   123456    | كشرى هند المعادي |