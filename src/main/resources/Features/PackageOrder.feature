Feature: Automated End2End SendPackage Order

  Scenario Outline: SendPackage-Cash-English-LightMode

  Given Open user appAnd Click to skip button
  	And Choose Dev Environment
  	And Choose EN language
  	And Change Flag to Egypt
  	And Enter user name
  	And Click continue
  	And Enter password
  	And Click to Sign in
	# And   Click in EnterLocation then Click chooseInMap button
	# And   Choose location and click Done button
    # And   Write the thing that you want to deliver then choose it's image then Click next
    # And   Choose payment type cash and then click place order
  	And Click sendPackage order type
  	And Click in changeLocation  then choose currentLocation
  	And Click in EnterLocation
  	And Click chooseInMap button
  	And Choose location
  	And Click Done button
	And Write the thing that you want to deliver
	And Enter your order then choose it's image
  	And Click next
  	And Choose Cash payment type
  	And Click Place order button
  	And Open courier app
  	And Choose Dev Environment
  	And Choose EN language -----According your task
  	And Change Flag to Egypt
  	And Enter user name
  	And Click continue
  	And Enter password
  	And Click to Confirm button
  	And Click to order
  	And click to accept button
  	And Change order status
  	And Click to Issue Invoice
  	And Click to camera button
  	And Click to Gallery button
  	And Choose photo
  	And Enter price
  	And Click to submit button
  	And Click to Reissue invoice button
  	And Return to open user app
  	And Click to skip button
  	And Choose Dev Environment
  	And Change Flag to Egypt
  	And Enter user name and click continue
  	And Enter password and click to Sign in
  	And Click my order button
  	And Click to open order
  	And Click to View Invoice details button
  	And Click to View scanned invoice button
  	And Open Courier app
  	And Choose Dev Environment
  	And Choose EN language -----According your task
  	And Change Flag to Egypt
  	And Enter user name
  	And Click continue
  	And Enter password
  	And Click to Confirm button
  	And Change order status
  	And Change order status
  	And click to submit button in review
  	And Click to Image in home screen
  	And Click to My order history
  	And Assert to order
  	And Click to back button
  	And Click to Financial transactions
  	And Click Wallet
  	And Click Transaction
  	And Assert Transaction order
  	And Open user app
  	And Click to skip button
  	And Choose Dev Environment
  	And Choose EN language -----According your task
  	And Change Flag to Egypt
  	And Enter user name
  	And Click continue
  	And Enter password
  	And Click to Sign in
  	And Click to Submit
  	And Click My Order button
  	And Click History
  	And Assert to order

  When Open Dashboard
  	And Enter Email
  	And Enter Password
  	And Click Sign In
  	And Click Orders
  	And Click Order list
  	And Click Advanced search
  	And Enter order number
  	And Click order status
  	And Select delivered
  	And Double Click to search button
  	And Scroll to order
  	And Click to View button
  	And scroll to order payment transactions

  Then Check Delivery Fee
  And	Check VAT on order delivery fee


    Given Start user app
    When  Click skip button and choose env
    And Choose country code for user
    And   Enter "<UPhone>"  click continue
    And   Enter "<UPassword>" and click sign in
    And   Click sendPackage order type
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