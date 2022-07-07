$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/resources/Features/PackageOrder.feature");
formatter.feature({
  "line": 1,
  "name": "Automated End2End SendPackage Order",
  "description": "",
  "id": "automated-end2end-sendpackage-order",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "SendPackage-Cash-English-LightMode",
  "description": "",
  "id": "automated-end2end-sendpackage-order;sendpackage-cash-english-lightmode",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "Start user app",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Click skip button and choose env",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "Choose country code for user",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "Enter \"\u003cUPhone\u003e\"  click continue",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "Enter \"\u003cUPassword\u003e\" and click sign in",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Click sendPackage order type",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "Click in changeLocation  then choose currentLocation",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "Click in EnterLocation then Click chooseInMap button",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "Choose location and click Done button",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "Write the thing that you want to deliver then choose it\u0027s image then Click next",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "Choose payment type cash and then click place order",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "Open courier app",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "Choose country code for c",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "Enter \"\u003cCPhone\u003e\"  click continue c",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "Enter \"\u003cCPassword\u003e\" and click signIn  courier",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "Open orders panel and accept order",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "Change order status",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "Change order status",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "Change order status",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "Order must done",
  "keyword": "Then "
});
formatter.examples({
  "line": 26,
  "name": "",
  "description": "",
  "id": "automated-end2end-sendpackage-order;sendpackage-cash-english-lightmode;",
  "rows": [
    {
      "cells": [
        "UPhone",
        "UPassword",
        "CPhone",
        "CPassword"
      ],
      "line": 27,
      "id": "automated-end2end-sendpackage-order;sendpackage-cash-english-lightmode;;1"
    },
    {
      "cells": [
        "01150300594",
        "123456",
        "01012661525",
        "a12345678"
      ],
      "line": 28,
      "id": "automated-end2end-sendpackage-order;sendpackage-cash-english-lightmode;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 28,
  "name": "SendPackage-Cash-English-LightMode",
  "description": "",
  "id": "automated-end2end-sendpackage-order;sendpackage-cash-english-lightmode;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "Start user app",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Click skip button and choose env",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "Choose country code for user",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "Enter \"01150300594\"  click continue",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "Enter \"123456\" and click sign in",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Click sendPackage order type",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "Click in changeLocation  then choose currentLocation",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "Click in EnterLocation then Click chooseInMap button",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "Choose location and click Done button",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "Write the thing that you want to deliver then choose it\u0027s image then Click next",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "Choose payment type cash and then click place order",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "Open courier app",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "Choose country code for c",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "Enter \"01012661525\"  click continue c",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "Enter \"a12345678\" and click signIn  courier",
  "matchedColumns": [
    3
  ],
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "Open orders panel and accept order",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "Change order status",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "Change order status",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "Change order status",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "Order must done",
  "keyword": "Then "
});
formatter.match({
  "location": "Orders.startUserApp()"
});
formatter.result({
  "duration": 22405971700,
  "status": "passed"
});
formatter.match({
  "location": "Orders.clickSkipButtonAndChooseEnv()"
});
formatter.result({
  "duration": 5191303101,
  "status": "passed"
});
formatter.match({
  "location": "Orders.chooseCountryCodeForUser()"
});
formatter.result({
  "duration": 9322392001,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "01150300594",
      "offset": 7
    }
  ],
  "location": "Orders.enter_click_continue(String)"
});
formatter.result({
  "duration": 2124783400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "123456",
      "offset": 7
    }
  ],
  "location": "Orders.enter_and_click_sign_in(String)"
});
formatter.result({
  "duration": 3772656000,
  "status": "passed"
});
formatter.match({
  "location": "Orders.clickSendPackageOrderType()"
});
formatter.result({
  "duration": 15516919200,
  "status": "passed"
});
formatter.match({
  "location": "Orders.clickInChangeLocationThenChooseCurrentLocation()"
});
formatter.result({
  "duration": 3653070200,
  "status": "passed"
});
formatter.match({
  "location": "Orders.clickInEnterLocationThenClickChooseInMapButton()"
});
formatter.result({
  "duration": 4803305601,
  "status": "passed"
});
formatter.match({
  "location": "Orders.chooseLocationAndClickDoneButton()"
});
formatter.result({
  "duration": 4075046400,
  "status": "passed"
});
formatter.match({
  "location": "Orders.writeTheThingThatYouWantToDeliverThenChooseItSImageThenClickNext()"
});
formatter.result({
  "duration": 6625527401,
  "status": "passed"
});
formatter.match({
  "location": "Orders.choosePaymentTypeCashAndThenClickPlaceOrder()"
});
formatter.result({
  "duration": 9699682400,
  "status": "passed"
});
formatter.match({
  "location": "Orders.openCourierApp()"
});
formatter.result({
  "duration": 20292125000,
  "status": "passed"
});
formatter.match({
  "location": "Orders.chooseCountryCodeForC()"
});
formatter.result({
  "duration": 6862236500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "01012661525",
      "offset": 7
    }
  ],
  "location": "Orders.enterClickContinueC(String)"
});
formatter.result({
  "duration": 2120876599,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "a12345678",
      "offset": 7
    }
  ],
  "location": "Orders.enterAndClickSignInC(String)"
});
formatter.result({
  "duration": 3662405300,
  "status": "passed"
});
formatter.match({
  "location": "Orders.openOrdersPanelAndAcceptOrder()"
});
formatter.result({
  "duration": 11417222601,
  "status": "passed"
});
formatter.match({
  "location": "Orders.changeOrderStatus()"
});
formatter.result({
  "duration": 6599605500,
  "status": "passed"
});
formatter.match({
  "location": "Orders.changeOrderStatus()"
});
formatter.result({
  "duration": 4047881200,
  "status": "passed"
});
formatter.match({
  "location": "Orders.changeOrderStatus()"
});
formatter.result({
  "duration": 3027197800,
  "status": "passed"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenarioOutline({
  "line": 30,
  "name": "SendPackage-Wallet-English-LightMode",
  "description": "",
  "id": "automated-end2end-sendpackage-order;sendpackage-wallet-english-lightmode",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 31,
  "name": "Start user app",
  "keyword": "Given "
});
formatter.step({
  "line": 33,
  "name": "Click skip button and choose env",
  "keyword": "When "
});
formatter.step({
  "line": 34,
  "name": "Choose country code for user",
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "Enter \"\u003cUPhone\u003e\"  click continue",
  "keyword": "And "
});
formatter.step({
  "line": 36,
  "name": "Enter \"\u003cUPassword\u003e\" and click sign in",
  "keyword": "And "
});
formatter.step({
  "line": 37,
  "name": "Click sendPackage order type",
  "keyword": "And "
});
formatter.step({
  "line": 38,
  "name": "Click in changeLocation  then choose currentLocation",
  "keyword": "And "
});
formatter.step({
  "line": 39,
  "name": "Click in EnterLocation then Click chooseInMap button",
  "keyword": "And "
});
formatter.step({
  "line": 40,
  "name": "Choose location and click Done button",
  "keyword": "And "
});
formatter.step({
  "line": 41,
  "name": "Write the thing that you want to deliver then choose it\u0027s image then Click next",
  "keyword": "And "
});
formatter.step({
  "line": 42,
  "name": "Choose payment type cash and then click place order",
  "keyword": "And "
});
formatter.step({
  "line": 43,
  "name": "Open courier app",
  "keyword": "And "
});
formatter.step({
  "line": 44,
  "name": "Choose country code for c",
  "keyword": "And "
});
formatter.step({
  "line": 45,
  "name": "Enter \"\u003cCPhone\u003e\"  click continue c",
  "keyword": "And "
});
formatter.step({
  "line": 46,
  "name": "Enter \"\u003cCPassword\u003e\" and click signIn  courier",
  "keyword": "And "
});
formatter.step({
  "line": 47,
  "name": "Open orders panel and accept order",
  "keyword": "And "
});
formatter.step({
  "line": 48,
  "name": "Change order status",
  "keyword": "And "
});
formatter.step({
  "line": 49,
  "name": "Change order status",
  "keyword": "And "
});
formatter.step({
  "line": 50,
  "name": "Change order status",
  "keyword": "And "
});
formatter.step({
  "line": 51,
  "name": "Start Dashboard",
  "keyword": "And "
});
formatter.step({
  "line": 52,
  "name": "Enter login credential \"\u003cDEmail\u003e\" W \"\u003cDPassword\u003e\" and click login",
  "keyword": "And "
});
formatter.step({
  "line": 53,
  "name": "Open orders list",
  "keyword": "And "
});
formatter.step({
  "line": 54,
  "name": "Search about order number and open its details",
  "keyword": "And "
});
formatter.step({
  "line": 56,
  "name": "Assert results",
  "keyword": "Then "
});
formatter.examples({
  "line": 58,
  "name": "",
  "description": "",
  "id": "automated-end2end-sendpackage-order;sendpackage-wallet-english-lightmode;",
  "rows": [
    {
      "cells": [
        "UPhone",
        "UPassword",
        "CPhone",
        "CPassword",
        "DEmail",
        "DPassword"
      ],
      "line": 59,
      "id": "automated-end2end-sendpackage-order;sendpackage-wallet-english-lightmode;;1"
    },
    {
      "cells": [
        "01150300594",
        "123456",
        "01012661525",
        "a12345678",
        "mohamed.abdelhy@shgardi.app",
        "123456"
      ],
      "line": 60,
      "id": "automated-end2end-sendpackage-order;sendpackage-wallet-english-lightmode;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 60,
  "name": "SendPackage-Wallet-English-LightMode",
  "description": "",
  "id": "automated-end2end-sendpackage-order;sendpackage-wallet-english-lightmode;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 31,
  "name": "Start user app",
  "keyword": "Given "
});
formatter.step({
  "line": 33,
  "name": "Click skip button and choose env",
  "keyword": "When "
});
formatter.step({
  "line": 34,
  "name": "Choose country code for user",
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "Enter \"01150300594\"  click continue",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 36,
  "name": "Enter \"123456\" and click sign in",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 37,
  "name": "Click sendPackage order type",
  "keyword": "And "
});
formatter.step({
  "line": 38,
  "name": "Click in changeLocation  then choose currentLocation",
  "keyword": "And "
});
formatter.step({
  "line": 39,
  "name": "Click in EnterLocation then Click chooseInMap button",
  "keyword": "And "
});
formatter.step({
  "line": 40,
  "name": "Choose location and click Done button",
  "keyword": "And "
});
formatter.step({
  "line": 41,
  "name": "Write the thing that you want to deliver then choose it\u0027s image then Click next",
  "keyword": "And "
});
formatter.step({
  "line": 42,
  "name": "Choose payment type cash and then click place order",
  "keyword": "And "
});
formatter.step({
  "line": 43,
  "name": "Open courier app",
  "keyword": "And "
});
formatter.step({
  "line": 44,
  "name": "Choose country code for c",
  "keyword": "And "
});
formatter.step({
  "line": 45,
  "name": "Enter \"01012661525\"  click continue c",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 46,
  "name": "Enter \"a12345678\" and click signIn  courier",
  "matchedColumns": [
    3
  ],
  "keyword": "And "
});
formatter.step({
  "line": 47,
  "name": "Open orders panel and accept order",
  "keyword": "And "
});
formatter.step({
  "line": 48,
  "name": "Change order status",
  "keyword": "And "
});
formatter.step({
  "line": 49,
  "name": "Change order status",
  "keyword": "And "
});
formatter.step({
  "line": 50,
  "name": "Change order status",
  "keyword": "And "
});
formatter.step({
  "line": 51,
  "name": "Start Dashboard",
  "keyword": "And "
});
formatter.step({
  "line": 52,
  "name": "Enter login credential \"mohamed.abdelhy@shgardi.app\" W \"123456\" and click login",
  "matchedColumns": [
    4,
    5
  ],
  "keyword": "And "
});
formatter.step({
  "line": 53,
  "name": "Open orders list",
  "keyword": "And "
});
formatter.step({
  "line": 54,
  "name": "Search about order number and open its details",
  "keyword": "And "
});
formatter.step({
  "line": 56,
  "name": "Assert results",
  "keyword": "Then "
});
formatter.match({
  "location": "Orders.startUserApp()"
});
formatter.result({
  "duration": 23017201100,
  "status": "passed"
});
formatter.match({
  "location": "Orders.clickSkipButtonAndChooseEnv()"
});
formatter.result({
  "duration": 5943756200,
  "status": "passed"
});
formatter.match({
  "location": "Orders.chooseCountryCodeForUser()"
});
formatter.result({
  "duration": 32431132400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "01150300594",
      "offset": 7
    }
  ],
  "location": "Orders.enter_click_continue(String)"
});
formatter.result({
  "duration": 2106474400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "123456",
      "offset": 7
    }
  ],
  "location": "Orders.enter_and_click_sign_in(String)"
});
formatter.result({
  "duration": 3911301100,
  "status": "passed"
});
formatter.match({
  "location": "Orders.clickSendPackageOrderType()"
});
