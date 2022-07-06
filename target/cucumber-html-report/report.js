$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("NormalOrder.feature");
formatter.feature({
  "line": 1,
  "name": "Automated End2End Normal Order",
  "description": "",
  "id": "automated-end2end-normal-order",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "Normal Order Cycle",
  "description": "",
  "id": "automated-end2end-normal-order;normal-order-cycle",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "Open user app login screen",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Click skip button and choose env",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "Choose country code",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "Enter \"\u003cUPhone\u003e\"  click continue",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "Enter \"\u003cUPassword\u003e\" and click sign in",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "Click search box from home and choose anything",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Go back to search screen and search with \"\u003caddress\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "Choose one result and click next button",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "Enter your products and Click checkout",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "Choose order price and click submit",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "Choose payment type cash and then click place order",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "Order must done",
  "keyword": "Then "
});
formatter.examples({
  "line": 17,
  "name": "",
  "description": "",
  "id": "automated-end2end-normal-order;normal-order-cycle;",
  "rows": [
    {
      "cells": [
        "UPhone",
        "UPassword",
        "address"
      ],
      "line": 18,
      "id": "automated-end2end-normal-order;normal-order-cycle;;1"
    },
    {
      "cells": [
        "01150300594",
        "123456",
        "كشرى هند المعادي"
      ],
      "line": 19,
      "id": "automated-end2end-normal-order;normal-order-cycle;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 19,
  "name": "Normal Order Cycle",
  "description": "",
  "id": "automated-end2end-normal-order;normal-order-cycle;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "Open user app login screen",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Click skip button and choose env",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "Choose country code",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "Enter \"01150300594\"  click continue",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "Enter \"123456\" and click sign in",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "Click search box from home and choose anything",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Go back to search screen and search with \"كشرى هند المعادي\"",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "Choose one result and click next button",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "Enter your products and Click checkout",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "Choose order price and click submit",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "Choose payment type cash and then click place order",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "Order must done",
  "keyword": "Then "
});
formatter.match({
  "location": "NormalOrder2.openUserAppLoginScreen()"
});
formatter.result({
  "duration": 27525093200,
  "status": "passed"
});
formatter.match({
  "location": "NormalOrder2.clickSkipButtonAndChooseEnv()"
});
formatter.result({
  "duration": 20026603000,
  "status": "passed"
});
formatter.match({
  "location": "NormalOrder2.chooseCountryCode()"
});
formatter.result({
  "duration": 7435566900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "01150300594",
      "offset": 7
    }
  ],
  "location": "NormalOrder2.enter_click_continue(String)"
});
formatter.result({
  "duration": 2736288600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "123456",
      "offset": 7
    }
  ],
  "location": "NormalOrder2.enter_and_click_sign_in(String)"
});
formatter.result({
  "duration": 3852471400,
  "status": "passed"
});
formatter.match({
  "location": "NormalOrder2.clickSearchBoxFromHomeAndChooseAnything()"
});
formatter.result({
  "duration": 24613475100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "كشرى هند المعادي",
      "offset": 42
    }
  ],
  "location": "NormalOrder2.go_back_to_search_screen_and_search_with(String)"
});
formatter.result({
  "duration": 2118902000,
  "status": "passed"
});
formatter.match({
  "location": "NormalOrder2.chooseOneResultAndClickNextButton()"
});
formatter.result({
  "duration": 9249922100,
  "status": "passed"
});
formatter.match({
  "location": "NormalOrder2.enterYourProductsAndClickCheckout()"
});
formatter.result({
  "duration": 5717536900,
  "status": "passed"
});
formatter.match({
  "location": "NormalOrder2.chooseOrderPriceAndClickSubmit()"
});
formatter.result({
  "duration": 1606610500,
  "status": "passed"
});
formatter.match({
  "location": "NormalOrder2.choosePaymentTypeCashAndThenClickPlaceOrder()"
});
formatter.result({
  "duration": 7761398900,
  "status": "passed"
});
formatter.match({
  "location": "NormalOrder2.orderMustDone()"
});
formatter.result({
  "duration": 95607986400,
  "error_message": "java.lang.IllegalArgumentException: Keys to send should be a not null CharSequence\r\n\tat org.openqa.selenium.remote.RemoteWebElement.sendKeys(RemoteWebElement.java:97)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:498)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:51)\r\n\tat com.sun.proxy.$Proxy20.sendKeys(Unknown Source)\r\n\tat Pages.Web.LoginPage.LunchWeb(LoginPage.java:73)\r\n\tat Steps.NormalOrder2.orderMustDone(NormalOrder2.java:169)\r\n\tat ✽.Then Order must done(NormalOrder.feature:15)\r\n",
  "status": "failed"
});
});