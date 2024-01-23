Feature: Automated End2End


  Scenario Outline: Scenario1
    Given Visit url
    When  Login with invalid credentials "<Username>" and "<Password>"
    Then  Verify each error message
    Examples:
      |    Username      |  Password  |
      | Test1            |   secret_sauce    |
      | standard_user    |   Test2    |
      | Test1            |   Test2    |



  Scenario Outline: Scenario2
    Given Visit url
    When Login with a valid "<Username>" and "<Password>"
    And Verify that you’ve been logged in successfully and navigated to the products page
    And Add the most expensive two products to your cart
    And Click on the cart button
    And Verify that you’ve been navigated to “Cart” page and the previously selected products are displayed at the page
    And Click on the “Checkout” button
    And Verify that you’ve been navigated to the “Checkout” page
    And Fill all the displayed form
    And Click on the “Continue” button
    Then Verify that you’ve been navigated to the “Overview” page
    Then Verify the Items total amount before taxes
    Then Verify that the URL matches with this url
    Then Click on the “Finish” button
    Then Verify both, the_ThankYou_and the _order has been dispatched_ messages
    Examples:
      |    Username      |  Password  |
      | standard_user      |   secret_sauce    |