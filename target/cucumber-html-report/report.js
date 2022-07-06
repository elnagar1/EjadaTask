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
  "duration": 3019069200,
  "error_message": "org.openqa.selenium.SessionNotCreatedException: Unable to create a new remote session. Please check the server log for more details. Original error: An unknown server-side error occurred while processing the command. Original error: Error getting device API level. Original error: Error executing adbExec. Original error: \u0027Command \u0027C:\\\\Sdk\\\\platform-tools\\\\adb.exe -P 5037 -s RZ8T30HHBVY shell getprop ro.build.version.sdk\u0027 exited with code 1\u0027; Stderr: \u0027adb.exe: device unauthorized.\r\nThis adb server\u0027s $ADB_VENDOR_KEYS is not set\r\nTry \u0027adb kill-server\u0027 if that seems wrong.\r\nOtherwise check for a confirmation dialog on your device.\u0027; Code: \u00271\u0027\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-9V79JR0\u0027, ip: \u0027192.168.1.3\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_332\u0027\nDriver info: driver.version: AndroidDriver\nremote stacktrace: UnknownError: An unknown server-side error occurred while processing the command. Original error: Error getting device API level. Original error: Error executing adbExec. Original error: \u0027Command \u0027C:\\\\Sdk\\\\platform-tools\\\\adb.exe -P 5037 -s RZ8T30HHBVY shell getprop ro.build.version.sdk\u0027 exited with code 1\u0027; Stderr: \u0027adb.exe: device unauthorized.\r\nThis adb server\u0027s $ADB_VENDOR_KEYS is not set\r\nTry \u0027adb kill-server\u0027 if that seems wrong.\r\nOtherwise check for a confirmation dialog on your device.\u0027; Code: \u00271\u0027\n    at getResponseForW3CError (C:\\Program Files\\Appium\\resources\\app\\node_modules\\appium\\node_modules\\appium-base-driver\\lib\\protocol\\errors.js:804:9)\n    at asyncHandler (C:\\Program Files\\Appium\\resources\\app\\node_modules\\appium\\node_modules\\appium-base-driver\\lib\\protocol\\protocol.js:380:37)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-9V79JR0\u0027, ip: \u0027192.168.1.3\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_332\u0027\nDriver info: driver.version: AndroidDriver\r\n\tat io.appium.java_client.remote.AppiumCommandExecutor$1.createSession(AppiumCommandExecutor.java:216)\r\n\tat io.appium.java_client.remote.AppiumCommandExecutor.createSession(AppiumCommandExecutor.java:225)\r\n\tat io.appium.java_client.remote.AppiumCommandExecutor.execute(AppiumCommandExecutor.java:247)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat io.appium.java_client.DefaultGenericMobileDriver.execute(DefaultGenericMobileDriver.java:41)\r\n\tat io.appium.java_client.AppiumDriver.execute(AppiumDriver.java:1)\r\n\tat io.appium.java_client.android.AndroidDriver.execute(AndroidDriver.java:1)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.startSession(RemoteWebDriver.java:213)\r\n\tat io.appium.java_client.AppiumDriver.startSession(AppiumDriver.java:338)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.\u003cinit\u003e(RemoteWebDriver.java:131)\r\n\tat io.appium.java_client.DefaultGenericMobileDriver.\u003cinit\u003e(DefaultGenericMobileDriver.java:37)\r\n\tat io.appium.java_client.AppiumDriver.\u003cinit\u003e(AppiumDriver.java:89)\r\n\tat io.appium.java_client.AppiumDriver.\u003cinit\u003e(AppiumDriver.java:99)\r\n\tat io.appium.java_client.android.AndroidDriver.\u003cinit\u003e(AndroidDriver.java:96)\r\n\tat Utilities.Base.TestBase.getNewUserDriver(TestBase.java:66)\r\n\tat Steps.NormalOrder2.openUserAppLoginScreen(NormalOrder2.java:32)\r\n\tat ✽.Given Open user app login screen(NormalOrder.feature:4)\r\nCaused by: java.lang.reflect.InvocationTargetException\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:498)\r\n\tat io.appium.java_client.remote.AppiumCommandExecutor$1.createSession(AppiumCommandExecutor.java:193)\r\n\tat io.appium.java_client.remote.AppiumCommandExecutor.createSession(AppiumCommandExecutor.java:225)\r\n\tat io.appium.java_client.remote.AppiumCommandExecutor.execute(AppiumCommandExecutor.java:247)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat io.appium.java_client.DefaultGenericMobileDriver.execute(DefaultGenericMobileDriver.java:41)\r\n\tat io.appium.java_client.AppiumDriver.execute(AppiumDriver.java:1)\r\n\tat io.appium.java_client.android.AndroidDriver.execute(AndroidDriver.java:1)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.startSession(RemoteWebDriver.java:213)\r\n\tat io.appium.java_client.AppiumDriver.startSession(AppiumDriver.java:338)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.\u003cinit\u003e(RemoteWebDriver.java:131)\r\n\tat io.appium.java_client.DefaultGenericMobileDriver.\u003cinit\u003e(DefaultGenericMobileDriver.java:37)\r\n\tat io.appium.java_client.AppiumDriver.\u003cinit\u003e(AppiumDriver.java:89)\r\n\tat io.appium.java_client.AppiumDriver.\u003cinit\u003e(AppiumDriver.java:99)\r\n\tat io.appium.java_client.android.AndroidDriver.\u003cinit\u003e(AndroidDriver.java:96)\r\n\tat Utilities.Base.TestBase.getNewUserDriver(TestBase.java:66)\r\n\tat Steps.NormalOrder2.openUserAppLoginScreen(NormalOrder2.java:32)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:498)\r\n\tat cucumber.runtime.Utils$1.call(Utils.java:40)\r\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:16)\r\n\tat cucumber.runtime.Utils.invoke(Utils.java:34)\r\n\tat cucumber.runtime.java.JavaStepDefinition.execute(JavaStepDefinition.java:38)\r\n\tat cucumber.runtime.StepDefinitionMatch.runStep(StepDefinitionMatch.java:37)\r\n\tat cucumber.runtime.Runtime.runStep(Runtime.java:300)\r\n\tat cucumber.runtime.model.StepContainer.runStep(StepContainer.java:44)\r\n\tat cucumber.runtime.model.StepContainer.runSteps(StepContainer.java:39)\r\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:44)\r\n\tat cucumber.runtime.model.CucumberScenarioOutline.run(CucumberScenarioOutline.java:46)\r\n\tat cucumber.runtime.model.CucumberFeature.run(CucumberFeature.java:165)\r\n\tat cucumber.api.testng.TestNGCucumberRunner.runCucumber(TestNGCucumberRunner.java:63)\r\n\tat cucumber.api.testng.AbstractTestNGCucumberTests.feature(AbstractTestNGCucumberTests.java:21)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:498)\r\n\tat org.testng.internal.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:124)\r\n\tat org.testng.internal.Invoker.invokeMethod(Invoker.java:583)\r\n\tat org.testng.internal.Invoker.invokeTestMethod(Invoker.java:719)\r\n\tat org.testng.internal.Invoker.invokeTestMethods(Invoker.java:989)\r\n\tat org.testng.internal.TestMethodWorker.invokeTestMethods(TestMethodWorker.java:125)\r\n\tat org.testng.internal.TestMethodWorker.run(TestMethodWorker.java:109)\r\n\tat org.testng.TestRunner.privateRun(TestRunner.java:648)\r\n\tat org.testng.TestRunner.run(TestRunner.java:505)\r\n\tat org.testng.SuiteRunner.runTest(SuiteRunner.java:455)\r\n\tat org.testng.SuiteRunner.runSequentially(SuiteRunner.java:450)\r\n\tat org.testng.SuiteRunner.privateRun(SuiteRunner.java:415)\r\n\tat org.testng.SuiteRunner.run(SuiteRunner.java:364)\r\n\tat org.testng.SuiteRunnerWorker.runSuite(SuiteRunnerWorker.java:52)\r\n\tat org.testng.SuiteRunnerWorker.run(SuiteRunnerWorker.java:84)\r\n\tat org.testng.TestNG.runSuitesSequentially(TestNG.java:1208)\r\n\tat org.testng.TestNG.runSuitesLocally(TestNG.java:1137)\r\n\tat org.testng.TestNG.runSuites(TestNG.java:1049)\r\n\tat org.testng.TestNG.run(TestNG.java:1017)\r\n\tat com.intellij.rt.testng.IDEARemoteTestNG.run(IDEARemoteTestNG.java:66)\r\n\tat com.intellij.rt.testng.RemoteTestNGStarter.main(RemoteTestNGStarter.java:109)\r\nCaused by: org.openqa.selenium.WebDriverException: An unknown server-side error occurred while processing the command. Original error: Error getting device API level. Original error: Error executing adbExec. Original error: \u0027Command \u0027C:\\\\Sdk\\\\platform-tools\\\\adb.exe -P 5037 -s RZ8T30HHBVY shell getprop ro.build.version.sdk\u0027 exited with code 1\u0027; Stderr: \u0027adb.exe: device unauthorized.\r\nThis adb server\u0027s $ADB_VENDOR_KEYS is not set\r\nTry \u0027adb kill-server\u0027 if that seems wrong.\r\nOtherwise check for a confirmation dialog on your device.\u0027; Code: \u00271\u0027\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-9V79JR0\u0027, ip: \u0027192.168.1.3\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_332\u0027\nDriver info: driver.version: AndroidDriver\nremote stacktrace: UnknownError: An unknown server-side error occurred while processing the command. Original error: Error getting device API level. Original error: Error executing adbExec. Original error: \u0027Command \u0027C:\\\\Sdk\\\\platform-tools\\\\adb.exe -P 5037 -s RZ8T30HHBVY shell getprop ro.build.version.sdk\u0027 exited with code 1\u0027; Stderr: \u0027adb.exe: device unauthorized.\r\nThis adb server\u0027s $ADB_VENDOR_KEYS is not set\r\nTry \u0027adb kill-server\u0027 if that seems wrong.\r\nOtherwise check for a confirmation dialog on your device.\u0027; Code: \u00271\u0027\n    at getResponseForW3CError (C:\\Program Files\\Appium\\resources\\app\\node_modules\\appium\\node_modules\\appium-base-driver\\lib\\protocol\\errors.js:804:9)\n    at asyncHandler (C:\\Program Files\\Appium\\resources\\app\\node_modules\\appium\\node_modules\\appium-base-driver\\lib\\protocol\\protocol.js:380:37)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.W3CHandshakeResponse.lambda$errorHandler$0(W3CHandshakeResponse.java:62)\r\n\tat org.openqa.selenium.remote.HandshakeResponse.lambda$getResponseFunction$0(HandshakeResponse.java:30)\r\n\tat org.openqa.selenium.remote.ProtocolHandshake.lambda$createSession$0(ProtocolHandshake.java:126)\r\n\tat java.util.stream.ReferencePipeline$3$1.accept(ReferencePipeline.java:193)\r\n\tat java.util.Spliterators$ArraySpliterator.tryAdvance(Spliterators.java:958)\r\n\tat java.util.stream.ReferencePipeline.forEachWithCancel(ReferencePipeline.java:126)\r\n\tat java.util.stream.AbstractPipeline.copyIntoWithCancel(AbstractPipeline.java:499)\r\n\tat java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:486)\r\n\tat java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)\r\n\tat java.util.stream.FindOps$FindOp.evaluateSequential(FindOps.java:152)\r\n\tat java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)\r\n\tat java.util.stream.ReferencePipeline.findFirst(ReferencePipeline.java:531)\r\n\tat org.openqa.selenium.remote.ProtocolHandshake.createSession(ProtocolHandshake.java:128)\r\n\t... 61 more\r\n",
  "status": "failed"
});
formatter.match({
  "location": "NormalOrder2.clickSkipButtonAndChooseEnv()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "NormalOrder2.chooseCountryCode()"
});
formatter.result({
  "status": "skipped"
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
  "status": "skipped"
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
  "status": "skipped"
});
formatter.match({
  "location": "NormalOrder2.clickSearchBoxFromHomeAndChooseAnything()"
});
formatter.result({
  "status": "skipped"
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
  "status": "skipped"
});
formatter.match({
  "location": "NormalOrder2.chooseOneResultAndClickNextButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "NormalOrder2.enterYourProductsAndClickCheckout()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "NormalOrder2.chooseOrderPriceAndClickSubmit()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "NormalOrder2.choosePaymentTypeCashAndThenClickPlaceOrder()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "NormalOrder2.orderMustDone()"
});
formatter.result({
  "status": "skipped"
});
});