$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("com/prevox/app/sharing/login/login_sharing.feature");
formatter.feature({
  "id": "logging-in-to-the-application-and-sharing-your-information-to-stakeholders",
  "description": "\nIn order to share\nAs a Admin of app\nI want to Login and Share my message",
  "name": "Logging in to the application and Sharing your information to stakeholders",
  "keyword": "Feature",
  "line": 1
});
formatter.scenario({
  "id": "logging-in-to-the-application-and-sharing-your-information-to-stakeholders;logining-web",
  "description": "",
  "name": "Logining Web",
  "keyword": "Scenario",
  "line": 7,
  "type": "scenario"
});
formatter.step({
  "name": "I go to \"loginL\" on \"Mozilla\"",
  "keyword": "Given ",
  "line": 9
});
formatter.step({
  "name": "I enter \"userName\" as \"usernameText\"",
  "keyword": "And ",
  "line": 10
});
formatter.step({
  "name": "I enter \"passWord\" as \"passwordText\"",
  "keyword": "And ",
  "line": 11
});
formatter.step({
  "name": "Click on \"loginButton\"",
  "keyword": "And ",
  "line": 12
});
formatter.step({
  "name": "I logged in \"Successfully\"",
  "keyword": "Then ",
  "line": 13
});
formatter.match({
  "arguments": [
    {
      "val": "loginL",
      "offset": 9
    },
    {
      "val": "Mozilla",
      "offset": 21
    }
  ],
  "location": "login_sharing.I_go_to_prevox(String,String)"
});
formatter.result({
  "duration": 33123763000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "userName",
      "offset": 9
    },
    {
      "val": "usernameText",
      "offset": 23
    }
  ],
  "location": "login_sharing.I_enter(String,String)"
});
formatter.result({
  "duration": 1600563000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "passWord",
      "offset": 9
    },
    {
      "val": "passwordText",
      "offset": 23
    }
  ],
  "location": "login_sharing.I_enter(String,String)"
});
formatter.result({
  "duration": 526470000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "loginButton",
      "offset": 10
    }
  ],
  "location": "login_sharing.Click_on(String)"
});
formatter.result({
  "duration": 7112250000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Successfully",
      "offset": 13
    }
  ],
  "location": "login_sharing.I_logged(String)"
});
formatter.result({
  "duration": 188000,
  "status": "passed"
});
});