$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("AmazonLogin.feature");
formatter.feature({
  "line": 1,
  "name": "Amazon Login",
  "description": "",
  "id": "amazon-login",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Verify multiple login",
  "description": "",
  "id": "amazon-login;verify-multiple-login",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@Login"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I am in home page of amazon",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user wait for 10 seconds",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "user verify enter \"sagar@gmail.com\" username",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user verify enter \"123456\" password",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user wait for 10 seconds",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "user clicks on submit",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "user enter user credentils",
  "rows": [
    {
      "cells": [
        "userName",
        "passWord",
        "Error"
      ],
      "line": 12
    },
    {
      "cells": [
        "",
        "",
        "Enter your email or mobile phone number"
      ],
      "line": 13
    },
    {
      "cells": [
        "saurabh@gmail.com",
        "",
        "Enter your password"
      ],
      "line": 14
    },
    {
      "cells": [
        "sandhya@gmail.com",
        "sagar1234",
        "We cannot find an account with that email address"
      ],
      "line": 15
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "StepAmazonHomepage.I_am_in_home_page_of_amazon()"
});
formatter.result({
  "duration": 119438188,
  "error_message": "java.lang.NullPointerException\r\n\tat com.coreFramework.BasePage.launchURL(BasePage.java:12)\r\n\tat com.pom.java.PomAmazon.LaunchSite(PomAmazon.java:27)\r\n\tat com.stepDef.StepAmazonHomepage.I_am_in_home_page_of_amazon(StepAmazonHomepage.java:32)\r\n\tat ✽.Given I am in home page of amazon(AmazonLogin.feature:5)\r\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "10",
      "offset": 14
    }
  ],
  "location": "StepAmazonHomepage.user_waits_for_time(int)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "sagar@gmail.com",
      "offset": 19
    }
  ],
  "location": "StepAmazonHomepage.user_verify_enter_username(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "123456",
      "offset": 19
    }
  ],
  "location": "StepAmazonHomepage.user_verify_enter_password(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "10",
      "offset": 14
    }
  ],
  "location": "StepAmazonHomepage.user_waits_for_time(int)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepAmazonHomepage.user_clicks_on_submit()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepAmazonHomepage.user_enter_user_credentils(DataTable)"
});
formatter.result({
  "status": "skipped"
});
});