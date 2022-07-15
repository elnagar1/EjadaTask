Feature: Automated End2End SendPackage Order

  Scenario Outline: SendPackage-Cash-English-LightMode

  Given Open User app
  And   Open Courier app
  And   Open Dashboard
	  #Login to User
	  And Click to skip button u
	  And Choose EN language u
	  And Choose Dev Environment u
  	  And Change Flag to Egypt u
  	  And Enter "<UPhone>" number u
  	  And Click continue u
  	  And Enter "<UPassword>" password u
  	  And Click to Sign in u
	  #Login to courier
	  And Choose EN language c
	  And Choose Dev Environment c
	  And Change Flag to Egypt c
	  And Enter "<CPhone>" number c
	  And Click continue c
	  And Enter "<CPassword>" password c
	  And Click to Sign in c
      #Login to Dashboard
	  And Enter admin Email "<DEmail>"
	  And Enter admin Password "<DPassword>"
	  And Click admin Sign In

	  #in userApp
  When Choose Package order type
  	  And Click in changeLocation then choose currentLocation
  	  And Click in EnterLocation
  	  And Click chooseInMap button
  	  And Choose location
  	  And Click Done button
	  And Write deliver product
	  And Enter your order then choose it's image
  	  And Click next
	  And Choose Cash payment type
  	  And Click Place order button

      #in courier App
	  And Click Order panel
  	  And Click to order
  	  And Click to accept button
	  And Change order statue
	  And Change order statue
	  And Change order statue
  	  And click to submit button in review
  	  And Click to Image in home screen
  	  And Click to My order history
  	  And Assert to order
  	  And Click to back button
  	  And Click to Financial transactions
  	  And Click Wallet
  	  And Click Transaction
  	  And Assert Transaction order

	  #userApp
  	  And Click to Submit
  	  And Click My Order button
  	  And Click History
  	  And Assert to order

     #in dashboard
  	  And Click Orders
  	  And Click Order list
  	  And Click Advanced search
  	  And Enter order number
  	  And Click order status
  	  And Select delivered
  	  And Double Click to search button
  	  And Click to View button
  	  And scroll to order payment transactions

  Then Check Delivery Fee

  Examples:
      |    UPhone    |  UPassword  |      CPhone        |     CPassword    |     DEmail                    |     DPassword    |
      | 01150300594  |   123456    |    01012661525     |     a12345678    | mohamed.abdelhy@shgardi.app   |     123456       |