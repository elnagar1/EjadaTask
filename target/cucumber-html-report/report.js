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
  "line": 5,
  "name": "Open User app",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Open Courier app",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "Open Dashboard",
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 8,
      "value": "#Login to User"
    }
  ],
  "line": 9,
  "name": "Click to skip button u",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Choose EN language u",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "Choose Dev Environment u",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "Change Flag to Egypt u",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "Enter \"\u003cUPhone\u003e\" number u",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "Click continue u",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "Enter \"\u003cUPassword\u003e\" password u",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "Click to Sign in u",
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 17,
      "value": "#Login to courier"
    }
  ],
  "line": 18,
  "name": "Choose EN language c",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "Choose Dev Environment c",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "Change Flag to Egypt c",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "Enter \"\u003cCPhone\u003e\" number c",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "Click continue c",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "Enter \"\u003cCPassword\u003e\" password c",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "Click to Sign in c",
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 25,
      "value": "#Login to Dashboard"
    }
  ],
  "line": 26,
  "name": "Enter admin Email \"\u003cDEmail\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "Enter admin Password \"\u003cDPassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "Click admin Sign In",
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 30,
      "value": "#in userApp"
    }
  ],
  "line": 31,
  "name": "Choose Package order type",
  "keyword": "When "
});
formatter.step({
  "line": 32,
  "name": "Click in changeLocation then choose currentLocation",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "Click in EnterLocation",
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "Click chooseInMap button",
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "Choose location",
  "keyword": "And "
});
formatter.step({
  "line": 36,
  "name": "Click Done button",
  "keyword": "And "
});
formatter.step({
  "line": 37,
  "name": "Write deliver product",
  "keyword": "And "
});
formatter.step({
  "line": 38,
  "name": "Enter your order then choose it\u0027s image",
  "keyword": "And "
});
formatter.step({
  "line": 39,
  "name": "Click next",
  "keyword": "And "
});
formatter.step({
  "line": 40,
  "name": "Choose Cash payment type",
  "keyword": "And "
});
formatter.step({
  "line": 41,
  "name": "Click Place order button",
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 43,
      "value": "#in courier App"
    }
  ],
  "line": 44,
  "name": "Click Order panel",
  "keyword": "And "
});
formatter.step({
  "line": 45,
  "name": "Click to order",
  "keyword": "And "
});
formatter.step({
  "line": 46,
  "name": "Click to accept button",
  "keyword": "And "
});
formatter.step({
  "line": 47,
  "name": "Change order statue",
  "keyword": "And "
});
formatter.step({
  "line": 48,
  "name": "Change order statue",
  "keyword": "And "
});
formatter.step({
  "line": 49,
  "name": "Change order statue",
  "keyword": "And "
});
formatter.step({
  "line": 50,
  "name": "click to submit button in review",
  "keyword": "And "
});
formatter.step({
  "line": 51,
  "name": "Click to Image in home screen",
  "keyword": "And "
});
formatter.step({
  "line": 52,
  "name": "Click to My order history",
  "keyword": "And "
});
formatter.step({
  "line": 53,
  "name": "Assert to order",
  "keyword": "And "
});
formatter.step({
  "line": 54,
  "name": "Click to back button",
  "keyword": "And "
});
formatter.step({
  "line": 55,
  "name": "Click to Financial transactions",
  "keyword": "And "
});
formatter.step({
  "line": 56,
  "name": "Click Wallet",
  "keyword": "And "
});
formatter.step({
  "line": 57,
  "name": "Click Transaction",
  "keyword": "And "
});
formatter.step({
  "line": 58,
  "name": "Assert Transaction order",
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 60,
      "value": "#userApp"
    }
  ],
  "line": 61,
  "name": "Click to Submit",
  "keyword": "And "
});
formatter.step({
  "line": 62,
  "name": "Click My Order button",
  "keyword": "And "
});
formatter.step({
  "line": 63,
  "name": "Click History",
  "keyword": "And "
});
formatter.step({
  "line": 64,
  "name": "Assert to order",
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 66,
      "value": "#in dashboard"
    }
  ],
  "line": 67,
  "name": "Click Orders",
  "keyword": "And "
});
formatter.step({
  "line": 68,
  "name": "Click Order list",
  "keyword": "And "
});
formatter.step({
  "line": 69,
  "name": "Click Advanced search",
  "keyword": "And "
});
formatter.step({
  "line": 70,
  "name": "Enter order number",
  "keyword": "And "
});
formatter.step({
  "line": 71,
  "name": "Click order status",
  "keyword": "And "
});
formatter.step({
  "line": 72,
  "name": "Select delivered",
  "keyword": "And "
});
formatter.step({
  "line": 73,
  "name": "Double Click to search button",
  "keyword": "And "
});
formatter.step({
  "line": 74,
  "name": "Click to View button",
  "keyword": "And "
});
formatter.step({
  "line": 75,
  "name": "scroll to order payment transactions",
  "keyword": "And "
});
formatter.step({
  "line": 77,
  "name": "Check Delivery Fee",
  "keyword": "Then "
});
formatter.examples({
  "line": 79,
  "name": "",
  "description": "",
  "id": "automated-end2end-sendpackage-order;sendpackage-cash-english-lightmode;",
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
      "line": 80,
      "id": "automated-end2end-sendpackage-order;sendpackage-cash-english-lightmode;;1"
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
      "line": 81,
      "id": "automated-end2end-sendpackage-order;sendpackage-cash-english-lightmode;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 81,
  "name": "SendPackage-Cash-English-LightMode",
  "description": "",
  "id": "automated-end2end-sendpackage-order;sendpackage-cash-english-lightmode;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "Open User app",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Open Courier app",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "Open Dashboard",
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 8,
      "value": "#Login to User"
    }
  ],
  "line": 9,
  "name": "Click to skip button u",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Choose EN language u",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "Choose Dev Environment u",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "Change Flag to Egypt u",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "Enter \"01150300594\" number u",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "Click continue u",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "Enter \"123456\" password u",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "Click to Sign in u",
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 17,
      "value": "#Login to courier"
    }
  ],
  "line": 18,
  "name": "Choose EN language c",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "Choose Dev Environment c",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "Change Flag to Egypt c",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "Enter \"01012661525\" number c",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "Click continue c",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "Enter \"a12345678\" password c",
  "matchedColumns": [
    3
  ],
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "Click to Sign in c",
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 25,
      "value": "#Login to Dashboard"
    }
  ],
  "line": 26,
  "name": "Enter admin Email \"mohamed.abdelhy@shgardi.app\"",
  "matchedColumns": [
    4
  ],
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "Enter admin Password \"123456\"",
  "matchedColumns": [
    5
  ],
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "Click admin Sign In",
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 30,
      "value": "#in userApp"
    }
  ],
  "line": 31,
  "name": "Choose Package order type",
  "keyword": "When "
});
formatter.step({
  "line": 32,
  "name": "Click in changeLocation then choose currentLocation",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "Click in EnterLocation",
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "Click chooseInMap button",
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "Choose location",
  "keyword": "And "
});
formatter.step({
  "line": 36,
  "name": "Click Done button",
  "keyword": "And "
});
formatter.step({
  "line": 37,
  "name": "Write deliver product",
  "keyword": "And "
});
formatter.step({
  "line": 38,
  "name": "Enter your order then choose it\u0027s image",
  "keyword": "And "
});
formatter.step({
  "line": 39,
  "name": "Click next",
  "keyword": "And "
});
formatter.step({
  "line": 40,
  "name": "Choose Cash payment type",
  "keyword": "And "
});
formatter.step({
  "line": 41,
  "name": "Click Place order button",
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 43,
      "value": "#in courier App"
    }
  ],
  "line": 44,
  "name": "Click Order panel",
  "keyword": "And "
});
formatter.step({
  "line": 45,
  "name": "Click to order",
  "keyword": "And "
});
formatter.step({
  "line": 46,
  "name": "Click to accept button",
  "keyword": "And "
});
formatter.step({
  "line": 47,
  "name": "Change order statue",
  "keyword": "And "
});
formatter.step({
  "line": 48,
  "name": "Change order statue",
  "keyword": "And "
});
formatter.step({
  "line": 49,
  "name": "Change order statue",
  "keyword": "And "
});
formatter.step({
  "line": 50,
  "name": "click to submit button in review",
  "keyword": "And "
});
formatter.step({
  "line": 51,
  "name": "Click to Image in home screen",
  "keyword": "And "
});
formatter.step({
  "line": 52,
  "name": "Click to My order history",
  "keyword": "And "
});
formatter.step({
  "line": 53,
  "name": "Assert to order",
  "keyword": "And "
});
formatter.step({
  "line": 54,
  "name": "Click to back button",
  "keyword": "And "
});
formatter.step({
  "line": 55,
  "name": "Click to Financial transactions",
  "keyword": "And "
});
formatter.step({
  "line": 56,
  "name": "Click Wallet",
  "keyword": "And "
});
formatter.step({
  "line": 57,
  "name": "Click Transaction",
  "keyword": "And "
});
formatter.step({
  "line": 58,
  "name": "Assert Transaction order",
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 60,
      "value": "#userApp"
    }
  ],
  "line": 61,
  "name": "Click to Submit",
  "keyword": "And "
});
formatter.step({
  "line": 62,
  "name": "Click My Order button",
  "keyword": "And "
});
formatter.step({
  "line": 63,
  "name": "Click History",
  "keyword": "And "
});
formatter.step({
  "line": 64,
  "name": "Assert to order",
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 66,
      "value": "#in dashboard"
    }
  ],
  "line": 67,
  "name": "Click Orders",
  "keyword": "And "
});
formatter.step({
  "line": 68,
  "name": "Click Order list",
  "keyword": "And "
});
formatter.step({
  "line": 69,
  "name": "Click Advanced search",
  "keyword": "And "
});
formatter.step({
  "line": 70,
  "name": "Enter order number",
  "keyword": "And "
});
formatter.step({
  "line": 71,
  "name": "Click order status",
  "keyword": "And "
});
formatter.step({
  "line": 72,
  "name": "Select delivered",
  "keyword": "And "
});
formatter.step({
  "line": 73,
  "name": "Double Click to search button",
  "keyword": "And "
});
formatter.step({
  "line": 74,
  "name": "Click to View button",
  "keyword": "And "
});
formatter.step({
  "line": 75,
  "name": "scroll to order payment transactions",
  "keyword": "And "
});
formatter.step({
  "line": 77,
  "name": "Check Delivery Fee",
  "keyword": "Then "
});
formatter.match({
  "location": "PackageOrder.openUserApp()"
});
formatter.result({
  "duration": 25099720900,
  "status": "passed"
});
formatter.match({
  "location": "PackageOrder.openCourierApp()"
});
formatter.result({
  "duration": 21946581800,
  "status": "passed"
});
formatter.match({
  "location": "PackageOrder.openDashboard()"
});
formatter.result({
  "duration": 2605378000,
  "status": "passed"
});
formatter.match({
  "location": "PackageOrder.clickToSkipButtonU()"
});
formatter.result({
  "duration": 478470600,
  "status": "passed"
});
formatter.match({
  "location": "PackageOrder.chooseENLanguageU()"
});
formatter.result({
  "duration": 2141504700,
  "status": "passed"
});
formatter.match({
  "location": "PackageOrder.chooseDevEnvironmentU()"
});
formatter.result({
  "duration": 3708724700,
  "status": "passed"
});
formatter.match({
  "location": "PackageOrder.changeFlagToEgyptU()"
});
formatter.result({
  "duration": 6025160900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "01150300594",
      "offset": 7
    }
  ],
  "location": "PackageOrder.enterNumberU(String)"
});
formatter.result({
  "duration": 1576496100,
  "status": "passed"
});
formatter.match({
  "location": "PackageOrder.clickContinueU()"
});
formatter.result({
  "duration": 851703800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "123456",
      "offset": 7
    }
  ],
  "location": "PackageOrder.enterPasswordU(String)"
});
formatter.result({
  "duration": 3485797200,
  "status": "passed"
});
formatter.match({
  "location": "PackageOrder.clickToSignInU()"
});
formatter.result({
  "duration": 925482700,
  "status": "passed"
});
formatter.match({
  "location": "PackageOrder.chooseENLanguageC()"
});
formatter.result({
  "duration": 427324200,
  "status": "passed"
});
formatter.match({
  "location": "PackageOrder.chooseDevEnvironmentC()"
});
formatter.result({
  "duration": 2448412800,
  "status": "passed"
});
formatter.match({
  "location": "PackageOrder.changeFlagToEgyptC()"
});
formatter.result({
  "duration": 7846692100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "01012661525",
      "offset": 7
    }
  ],
  "location": "PackageOrder.enterNumberC(String)"
});
formatter.result({
  "duration": 1395725100,
  "status": "passed"
});
formatter.match({
  "location": "PackageOrder.clickContinueC()"
});
formatter.result({
  "duration": 735326600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "a12345678",
      "offset": 7
    }
  ],
  "location": "PackageOrder.enterPasswordC(String)"
});
formatter.result({
  "duration": 3736365200,
  "status": "passed"
});
formatter.match({
  "location": "PackageOrder.clickToSignInC()"
});
formatter.result({
  "duration": 692076400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "mohamed.abdelhy@shgardi.app",
      "offset": 19
    }
  ],
  "location": "PackageOrder.enterAdminEmail(String)"
});
formatter.result({
  "duration": 5231703400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "123456",
      "offset": 22
    }
  ],
  "location": "PackageOrder.enterAdminPassword(String)"
});
formatter.result({
  "duration": 1204490400,
  "status": "passed"
});
formatter.match({
  "location": "PackageOrder.clickAdminSignIn()"
});
formatter.result({
  "duration": 108717900,
  "status": "passed"
});
formatter.match({
  "location": "PackageOrder.choosePackageOrderType()"
});
formatter.result({
  "duration": 9975577200,
  "status": "passed"
});
formatter.match({
  "location": "PackageOrder.clickInChangeLocationThenChooseCurrentLocation()"
});
formatter.result({
  "duration": 4318857600,
  "status": "passed"
});
formatter.match({
  "location": "PackageOrder.clickInEnterLocation()"
});
formatter.result({
  "duration": 4250315100,
  "status": "passed"
});
formatter.match({
  "location": "PackageOrder.clickChooseInMapButton()"
});
formatter.result({
  "duration": 559953600,
  "status": "passed"
});
formatter.match({
  "location": "PackageOrder.chooseLocation()"
});
formatter.result({
  "duration": 5765549700,
  "status": "passed"
});
formatter.match({
  "location": "PackageOrder.clickDoneButton()"
});
formatter.result({
  "duration": 4136342900,
  "status": "passed"
});
formatter.match({
  "location": "PackageOrder.writeDeliverProduct()"
});
formatter.result({
  "duration": 3105096800,
  "status": "passed"
});
formatter.match({
  "location": "PackageOrder.enterYourOrderThenChooseItSImage()"
});
formatter.result({
  "duration": 13600,
  "status": "passed"
});
formatter.match({
  "location": "PackageOrder.clickNext()"
});
formatter.result({
  "duration": 1336013300,
  "status": "passed"
});
formatter.match({
  "location": "PackageOrder.chooseCashPaymentType()"
});
formatter.result({
  "duration": 3809634500,
  "status": "passed"
});
formatter.match({
  "location": "PackageOrder.clickPlaceOrderButton()"
});
formatter.result({
  "duration": 27858395100,
  "error_message": "org.openqa.selenium.TimeoutException: Expected condition failed: waiting for visibility of Located by By.chained({By.xpath: /hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout/androidx.appcompat.widget.LinearLayoutCompat[2]/android.view.ViewGroup[2]/android.widget.TextView[2]}) (tried for 25 second(s) with 500 milliseconds interval)\r\n\tat org.openqa.selenium.support.ui.WebDriverWait.timeoutException(WebDriverWait.java:95)\r\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:272)\r\n\tat Utilities.Base.PageBase.waitUntilElementLocated(PageBase.java:60)\r\n\tat Utilities.Base.PageBase.getText(PageBase.java:30)\r\n\tat Steps.PackageOrder.clickPlaceOrderButton(PackageOrder.java:214)\r\n\tat ✽.And Click Place order button(src/main/resources/Features/PackageOrder.feature:41)\r\nCaused by: org.openqa.selenium.NoSuchElementException: Can\u0027t locate an element by this strategy: By.chained({By.xpath: /hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout/androidx.appcompat.widget.LinearLayoutCompat[2]/android.view.ViewGroup[2]/android.widget.TextView[2]})\r\n\tat io.appium.java_client.pagefactory.AppiumElementLocator.findElement(AppiumElementLocator.java:126)\r\n\tat io.appium.java_client.pagefactory.interceptors.InterceptorOfASingleElement.intercept(InterceptorOfASingleElement.java:59)\r\n\tat io.appium.java_client.android.AndroidElement$$EnhancerByCGLIB$$b598166c.isDisplayed(\u003cgenerated\u003e)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions.elementIfVisible(ExpectedConditions.java:314)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions.access$000(ExpectedConditions.java:43)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions$10.apply(ExpectedConditions.java:300)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions$10.apply(ExpectedConditions.java:297)\r\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:249)\r\n\tat Utilities.Base.PageBase.waitUntilElementLocated(PageBase.java:60)\r\n\tat Utilities.Base.PageBase.getText(PageBase.java:30)\r\n\tat Steps.PackageOrder.clickPlaceOrderButton(PackageOrder.java:214)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:498)\r\n\tat cucumber.runtime.Utils$1.call(Utils.java:40)\r\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:16)\r\n\tat cucumber.runtime.Utils.invoke(Utils.java:34)\r\n\tat cucumber.runtime.java.JavaStepDefinition.execute(JavaStepDefinition.java:38)\r\n\tat cucumber.runtime.StepDefinitionMatch.runStep(StepDefinitionMatch.java:37)\r\n\tat cucumber.runtime.Runtime.runStep(Runtime.java:300)\r\n\tat cucumber.runtime.model.StepContainer.runStep(StepContainer.java:44)\r\n\tat cucumber.runtime.model.StepContainer.runSteps(StepContainer.java:39)\r\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:44)\r\n\tat cucumber.runtime.model.CucumberScenarioOutline.run(CucumberScenarioOutline.java:46)\r\n\tat cucumber.runtime.model.CucumberFeature.run(CucumberFeature.java:165)\r\n\tat cucumber.api.testng.TestNGCucumberRunner.runCucumber(TestNGCucumberRunner.java:63)\r\n\tat cucumber.api.testng.AbstractTestNGCucumberTests.feature(AbstractTestNGCucumberTests.java:21)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:498)\r\n\tat org.testng.internal.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:124)\r\n\tat org.testng.internal.Invoker.invokeMethod(Invoker.java:583)\r\n\tat org.testng.internal.Invoker.invokeTestMethod(Invoker.java:719)\r\n\tat org.testng.internal.Invoker.invokeTestMethods(Invoker.java:989)\r\n\tat org.testng.internal.TestMethodWorker.invokeTestMethods(TestMethodWorker.java:125)\r\n\tat org.testng.internal.TestMethodWorker.run(TestMethodWorker.java:109)\r\n\tat org.testng.TestRunner.privateRun(TestRunner.java:648)\r\n\tat org.testng.TestRunner.run(TestRunner.java:505)\r\n\tat org.testng.SuiteRunner.runTest(SuiteRunner.java:455)\r\n\tat org.testng.SuiteRunner.runSequentially(SuiteRunner.java:450)\r\n\tat org.testng.SuiteRunner.privateRun(SuiteRunner.java:415)\r\n\tat org.testng.SuiteRunner.run(SuiteRunner.java:364)\r\n\tat org.testng.SuiteRunnerWorker.runSuite(SuiteRunnerWorker.java:52)\r\n\tat org.testng.SuiteRunnerWorker.run(SuiteRunnerWorker.java:84)\r\n\tat org.testng.TestNG.runSuitesSequentially(TestNG.java:1208)\r\n\tat org.testng.TestNG.runSuitesLocally(TestNG.java:1137)\r\n\tat org.testng.TestNG.runSuites(TestNG.java:1049)\r\n\tat org.testng.TestNG.run(TestNG.java:1017)\r\n\tat com.intellij.rt.testng.IDEARemoteTestNG.run(IDEARemoteTestNG.java:66)\r\n\tat com.intellij.rt.testng.RemoteTestNGStarter.main(RemoteTestNGStarter.java:109)\r\nCaused by: org.openqa.selenium.TimeoutException: Expected condition failed: waiting for io.appium.java_client.pagefactory.AppiumElementLocator$WaitingFunction@704641e3 (tried for 1 second(s) with 500 milliseconds interval)\r\n\tat org.openqa.selenium.support.ui.FluentWait.timeoutException(FluentWait.java:304)\r\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:272)\r\n\tat io.appium.java_client.pagefactory.AppiumElementLocator.waitFor(AppiumElementLocator.java:99)\r\n\tat io.appium.java_client.pagefactory.AppiumElementLocator.findElement(AppiumElementLocator.java:119)\r\n\t... 51 more\r\nCaused by: org.openqa.selenium.NoSuchElementException: Cannot locate an element using By.chained({By.xpath: /hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout/androidx.appcompat.widget.LinearLayoutCompat[2]/android.view.ViewGroup[2]/android.widget.TextView[2]})\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-9V79JR0\u0027, ip: \u0027192.168.1.5\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_332\u0027\nDriver info: driver.version: AndroidDriver\r\n\tat io.appium.java_client.pagefactory.bys.builder.ByChained.findElement(ByChained.java:74)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat io.appium.java_client.DefaultGenericMobileDriver.findElement(DefaultGenericMobileDriver.java:57)\r\n\tat io.appium.java_client.AppiumDriver.findElement(AppiumDriver.java:1)\r\n\tat io.appium.java_client.android.AndroidDriver.findElement(AndroidDriver.java:1)\r\n\tat io.appium.java_client.pagefactory.bys.ContentMappedBy.findElement(ContentMappedBy.java:50)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat io.appium.java_client.DefaultGenericMobileDriver.findElement(DefaultGenericMobileDriver.java:57)\r\n\tat io.appium.java_client.AppiumDriver.findElement(AppiumDriver.java:1)\r\n\tat io.appium.java_client.android.AndroidDriver.findElement(AndroidDriver.java:1)\r\n\tat io.appium.java_client.pagefactory.AppiumElementLocator.lambda$0(AppiumElementLocator.java:120)\r\n\tat io.appium.java_client.pagefactory.AppiumElementLocator$WaitingFunction.apply(AppiumElementLocator.java:172)\r\n\tat io.appium.java_client.pagefactory.AppiumElementLocator$WaitingFunction.apply(AppiumElementLocator.java:1)\r\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:249)\r\n\t... 53 more\r\n",
  "status": "failed"
});
formatter.match({
  "location": "PackageOrder.clickOrderPanel()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "PackageOrder.clickToOrder()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "PackageOrder.clickToAcceptButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "PackageOrder.changeOrderStatue()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "PackageOrder.changeOrderStatue()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "PackageOrder.changeOrderStatue()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({
  "location": "PackageOrder.clickOrders()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "PackageOrder.clickOrderList()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "PackageOrder.clickAdvancedSearch()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "PackageOrder.enterOrderNumber()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "PackageOrder.clickOrderStatus()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "PackageOrder.selectDelivered()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "PackageOrder.doubleClickToSearchButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "PackageOrder.clickToViewButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "duration": 277165200,
  "error_message": "org.openqa.selenium.NoSuchSessionException: A session is either terminated or not started\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-9V79JR0\u0027, ip: \u0027192.168.1.5\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_332\u0027\nDriver info: io.appium.java_client.android.AndroidDriver\nCapabilities {appActivity: com.mnasat.nashmi.courier.p..., appPackage: com.mnasat.nashmi.courier, autoGrantPermissions: true, automationName: UiAutomator2, databaseEnabled: false, desired: {appActivity: com.mnasat.nashmi.courier.p..., appPackage: com.mnasat.nashmi.courier, autoGrantPermissions: true, automationName: UiAutomator2, deviceName: Emulator, platformName: android, platformVersion: 9, reportDirectory: reports, reportFormat: html}, deviceApiLevel: 28, deviceManufacturer: Google, deviceModel: AOSP on IA Emulator, deviceName: emulator-5554, deviceScreenDensity: 440, deviceScreenSize: 1080x2280, deviceUDID: emulator-5554, javascriptEnabled: true, locationContextEnabled: false, networkConnectionEnabled: true, pixelRatio: 2.75, platform: LINUX, platformName: android, platformVersion: 9, reportDirectory: reports, reportFormat: html, statBarHeight: 135, takesScreenshot: true, viewportRect: {height: 1842, left: 0, top: 135, width: 1080}, warnings: {}, webStorageEnabled: false}\nSession ID: 73e4ba3e-5b96-46f2-be51-dcc2865f63e9\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat io.appium.java_client.remote.AppiumCommandExecutor.execute(AppiumCommandExecutor.java:247)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat io.appium.java_client.DefaultGenericMobileDriver.execute(DefaultGenericMobileDriver.java:45)\r\n\tat io.appium.java_client.AppiumDriver.execute(AppiumDriver.java:1)\r\n\tat io.appium.java_client.android.AndroidDriver.execute(AndroidDriver.java:1)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.getScreenshotAs(RemoteWebDriver.java:295)\r\n\tat Steps.Hooks.closeBrowser(Hooks.java:32)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:498)\r\n\tat cucumber.runtime.Utils$1.call(Utils.java:40)\r\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:16)\r\n\tat cucumber.runtime.Utils.invoke(Utils.java:34)\r\n\tat cucumber.runtime.java.JavaHookDefinition.execute(JavaHookDefinition.java:60)\r\n\tat cucumber.runtime.Runtime.runHookIfTagsMatch(Runtime.java:224)\r\n\tat cucumber.runtime.Runtime.runHooks(Runtime.java:212)\r\n\tat cucumber.runtime.Runtime.runAfterHooks(Runtime.java:206)\r\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:46)\r\n\tat cucumber.runtime.model.CucumberScenarioOutline.run(CucumberScenarioOutline.java:46)\r\n\tat cucumber.runtime.model.CucumberFeature.run(CucumberFeature.java:165)\r\n\tat cucumber.api.testng.TestNGCucumberRunner.runCucumber(TestNGCucumberRunner.java:63)\r\n\tat cucumber.api.testng.AbstractTestNGCucumberTests.feature(AbstractTestNGCucumberTests.java:21)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:498)\r\n\tat org.testng.internal.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:124)\r\n\tat org.testng.internal.Invoker.invokeMethod(Invoker.java:583)\r\n\tat org.testng.internal.Invoker.invokeTestMethod(Invoker.java:719)\r\n\tat org.testng.internal.Invoker.invokeTestMethods(Invoker.java:989)\r\n\tat org.testng.internal.TestMethodWorker.invokeTestMethods(TestMethodWorker.java:125)\r\n\tat org.testng.internal.TestMethodWorker.run(TestMethodWorker.java:109)\r\n\tat org.testng.TestRunner.privateRun(TestRunner.java:648)\r\n\tat org.testng.TestRunner.run(TestRunner.java:505)\r\n\tat org.testng.SuiteRunner.runTest(SuiteRunner.java:455)\r\n\tat org.testng.SuiteRunner.runSequentially(SuiteRunner.java:450)\r\n\tat org.testng.SuiteRunner.privateRun(SuiteRunner.java:415)\r\n\tat org.testng.SuiteRunner.run(SuiteRunner.java:364)\r\n\tat org.testng.SuiteRunnerWorker.runSuite(SuiteRunnerWorker.java:52)\r\n\tat org.testng.SuiteRunnerWorker.run(SuiteRunnerWorker.java:84)\r\n\tat org.testng.TestNG.runSuitesSequentially(TestNG.java:1208)\r\n\tat org.testng.TestNG.runSuitesLocally(TestNG.java:1137)\r\n\tat org.testng.TestNG.runSuites(TestNG.java:1049)\r\n\tat org.testng.TestNG.run(TestNG.java:1017)\r\n\tat com.intellij.rt.testng.IDEARemoteTestNG.run(IDEARemoteTestNG.java:66)\r\n\tat com.intellij.rt.testng.RemoteTestNGStarter.main(RemoteTestNGStarter.java:109)\r\n",
  "status": "failed"
});
});