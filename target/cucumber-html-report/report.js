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
  "name": "Normal Order Cycle Login",
  "description": "",
  "id": "automated-end2end-normal-order;normal-order-cycle-login",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 2,
      "name": "@stop"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "user is on Login screen",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Click skip button",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "Change country and choose egypt",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "insert \"\u003cphone\u003e\"  click continue and insert \"\u003cPassword\u003e\" and click sign in",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "you can view  Home",
  "keyword": "Then "
});
formatter.examples({
  "line": 12,
  "name": "",
  "description": "",
  "id": "automated-end2end-normal-order;normal-order-cycle-login;",
  "rows": [
    {
      "cells": [
        "phone",
        "Password"
      ],
      "line": 13,
      "id": "automated-end2end-normal-order;normal-order-cycle-login;;1"
    },
    {
      "cells": [
        "01150300594",
        "123456"
      ],
      "line": 14,
      "id": "automated-end2end-normal-order;normal-order-cycle-login;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 14,
  "name": "Normal Order Cycle Login",
  "description": "",
  "id": "automated-end2end-normal-order;normal-order-cycle-login;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 2,
      "name": "@stop"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "user is on Login screen",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Click skip button",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "Change country and choose egypt",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "insert \"01150300594\"  click continue and insert \"123456\" and click sign in",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "you can view  Home",
  "keyword": "Then "
});
formatter.match({
  "location": "NormalOrder.userIsOnLoginScreen()"
});
formatter.result({
  "duration": 106722648800,
  "status": "passed"
});
formatter.match({
  "location": "NormalOrder.clickSkipButton()"
});
formatter.result({
  "duration": 77005607500,
  "status": "passed"
});
formatter.match({
  "location": "NormalOrder.changeCountryAndChooseEgypt()"
});
formatter.result({
  "duration": 45186598200,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//*[@id\u003d\"cdk-drop-list-0\"]/tbody/tr/td[9]/button/span/mat-icon\"}\n  (Session info: chrome\u003d102.0.5005.115)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-9V79JR0\u0027, ip: \u0027172.20.10.7\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_332\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 102.0.5005.115, chrome: {chromedriverVersion: 102.0.5005.61 (0e59bcc00cc4..., userDataDir: C:\\Users\\HPZBOO~1\\AppData\\L...}, goog:chromeOptions: {debuggerAddress: localhost:52825}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: 30619a257977b22adc14679d45fccfd3\n*** Element info: {Using\u003dxpath, value\u003d//*[@id\u003d\"cdk-drop-list-0\"]/tbody/tr/td[9]/button/span/mat-icon}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat Pages.Web.LoginPage.LunchWeb(LoginPage.java:55)\r\n\tat Steps.NormalOrder.changeCountryAndChooseEgypt(NormalOrder.java:47)\r\n\tat ✽.And Change country and choose egypt(NormalOrder.feature:6)\r\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "01150300594",
      "offset": 8
    },
    {
      "val": "123456",
      "offset": 49
    }
  ],
  "location": "NormalOrder.insertClickContinueAndInsertAndClickSignIn(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "NormalOrder.youCanViewHome()"
});
formatter.result({
  "status": "skipped"
});
});