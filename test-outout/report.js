$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("/Users/SUMUKH/eclipse_workspace/cucumberPOM/src/main/java/com/qa/feature/phpTravels.feature");
formatter.feature({
  "line": 1,
  "name": "PHPTravels Application Test",
  "description": "",
  "id": "phptravels-application-test",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Validate PHPTravels Home Page Test",
  "description": "",
  "id": "phptravels-application-test;validate-phptravels-home-page-test",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "user opens a browser",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user is on login page",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "user logs into app",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "validate home page title",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "validate logged in username",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "check Hotels link",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "check Flights link",
  "keyword": "Then "
});
formatter.step({
  "comments": [
    {
      "line": 12,
      "value": "#\tThen change currency to INR"
    }
  ],
  "line": 13,
  "name": "close the browser",
  "keyword": "And "
});
formatter.match({
  "location": "HomePageSteps.user_opens_browser()"
});
formatter.result({
  "duration": 7772138459,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.user_is_on_login_page()"
});
formatter.result({
  "duration": 71551245,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.user_logs_into_app()"
});
formatter.result({
  "duration": 1257760346,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.validate_home_page_title()"
});
formatter.result({
  "duration": 11912365,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.validate_logged_in_username()"
});
formatter.result({
  "duration": 2801000532,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.check_Hotels_link()"
});
formatter.result({
  "duration": 1334451317,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.check_Flights_link()"
});
formatter.result({
  "duration": 1472407981,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.close_the_browser()"
});
formatter.result({
  "duration": 146857719,
  "status": "passed"
});
});