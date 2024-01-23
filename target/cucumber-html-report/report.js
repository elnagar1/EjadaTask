$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/resources/Features/MobileScenarios.feature");
formatter.feature({
  "line": 1,
  "name": "Automated End2End",
  "description": "",
  "id": "automated-end2end",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "Scenario1",
  "description": "",
  "id": "automated-end2end;scenario1",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "Open app",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Login with credentials \"\u003cUsername\u003e\" and \"\u003cPassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "Verify status \"\u003cstatus\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "line": 8,
  "name": "",
  "description": "",
  "id": "automated-end2end;scenario1;",
  "rows": [
    {
      "cells": [
        "Username",
        "Password",
        "status"
      ],
      "line": 9,
      "id": "automated-end2end;scenario1;;1"
    },
    {
      "cells": [
        "standard_user",
        "secret_sauce",
        "valid"
      ],
      "line": 10,
      "id": "automated-end2end;scenario1;;2"
    },
    {
      "cells": [
        "standard_user",
        "Test2",
        "no"
      ],
      "line": 11,
      "id": "automated-end2end;scenario1;;3"
    },
    {
      "cells": [
        "Test1",
        "secret_sauce",
        "no"
      ],
      "line": 12,
      "id": "automated-end2end;scenario1;;4"
    },
    {
      "cells": [
        "",
        "secret_sauce",
        "no"
      ],
      "line": 13,
      "id": "automated-end2end;scenario1;;5"
    },
    {
      "cells": [
        "standard_user",
        "",
        "no"
      ],
      "line": 14,
      "id": "automated-end2end;scenario1;;6"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 18238545799,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "Scenario1",
  "description": "",
  "id": "automated-end2end;scenario1;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "Open app",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Login with credentials \"standard_user\" and \"secret_sauce\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "Verify status \"valid\"",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "MobileCycleSteps.openApp()"
});
formatter.result({
  "duration": 54199199,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "standard_user",
      "offset": 24
    },
    {
      "val": "secret_sauce",
      "offset": 44
    }
  ],
  "location": "MobileCycleSteps.login_with_credentials_and(String,String)"
});
