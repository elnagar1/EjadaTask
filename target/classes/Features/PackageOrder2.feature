Feature: Automated End2End SendPackage Order

  Scenario Outline: SendPackage-Cash-English-LightMode
    Given Start user app

    When  Click skip button and choose env
    And Choose country code for user
    And   Enter "<UPhone>"  click continue
    And   Enter "<UPassword>" and click sign in
    And   Click SendPackage order type
    And   Click in changeLocation  then choose currentLocation
    And   Click in EnterLocation then Click chooseInMap button
    And   Choose location and click Done button
    And   Write the thing that you want to deliver then choose it's image then Click next
    And   Choose payment type cash and then click place order
    And   Open courier app
    And   Choose country code for c
    And   Enter "<CPhone>"  click continue c
    And   Enter "<CPassword>" and click signIn  courier
    And   Open orders panel and accept order
    And   Change order status
    And   Change order status
    And   Change order status
    And   Start Dashboard
    And   Enter login credential "<DEmail>" W "<DPassword>" and click login
    And   Open orders list
    And   Search about order number and open its details

    Then  Assert results


    Examples:
      |    UPhone    |  UPassword  |      CPhone        |     CPassword    |     DEmail                    |     DPassword    |
      | 01150300594  |   123456    |    01012661525     |     a12345678    | mohamed.abdelhy@shgardi.app   |     123456       |