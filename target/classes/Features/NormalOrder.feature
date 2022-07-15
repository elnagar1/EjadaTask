Feature: Automated End2End Normal Order

  Scenario Outline: Normal Order Cycle
    Given Start user app
    When  Click skip button and choose env
    And Choose country code for user
    And   Enter "<UPhone>"  click continue
    And   Enter "<UPassword>" and click sign in
    And   Click search box from home and choose anything
    And   Go back to search screen and search with "<address>"
    And   Choose one result and click next button
    And   Enter your products and Click checkout
    And   Choose order price and click submit
    And   Choose payment type cash and then click place order
    And   Start courier app
    And   Choose country code for c
    And   Enter "<CPhone>"  click continue c
    And   Enter "<CPassword>" and click signIn  courier
    And   Open orders panel and accept order
    And   Change order status
    And   Add price and upload invoice  then click send button
    And   Change order status
    And   Change order status
    And   Start Dashboard
    And   Enter login credential "<DEmail>" W "<DPassword>" and click login
    And   Open orders list
    And   Search about order number and open its details
    Then  Assert results

    Examples:
      |    UPhone      |  UPassword  |    CPhone     |     CPassword    |      address       |     DEmail                    |     DPassword    |
      | 01150300594    |   123456    |   01012661525 |     a12345678    |  كشري هند المعادي  |  mohamed.abdelhy@shgardi.app   |     123456       |