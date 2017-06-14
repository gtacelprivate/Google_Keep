$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("valtech_website_test.feature");
formatter.feature({
  "line": 2,
  "name": "Valtech website test",
  "description": "",
  "id": "valtech-website-test",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@valtech_website_test"
    }
  ]
});
formatter.scenario({
  "line": 4,
  "name": "Valtech website test",
  "description": "",
  "id": "valtech-website-test;valtech-website-test",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "I navigate to the Valtech homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I expect the Latest News section to be displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "I navigate to a menu tab \"about\"",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "I expect the page to have the correct title \"About\"",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "I navigate to a menu tab \"services\"",
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "I expect the page to have the correct title \"Services\"",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "I navigate to a menu tab \"cases\"",
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "I expect the page to have the correct title \"Work\"",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "I navigate to a menu tab \"about\"",
  "keyword": "Given "
});
formatter.step({
  "line": 18,
  "name": "I click Get Valtech Offices",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "I expect to get amount of Valtech offices",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definitions.iNavigateToTheValtechHomepage()"
});
formatter.result({
  "duration": 5382629831,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definitions.iExpectTheLatestNewsSectionToBeDisplayed()"
});
formatter.result({
  "duration": 73367620,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "about",
      "offset": 26
    }
  ],
  "location": "Step_Definitions.iNavigateToAMenuTab(String)"
});
formatter.result({
  "duration": 1933267127,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "About",
      "offset": 45
    }
  ],
  "location": "Step_Definitions.iExpectThePageToHaveTheCorrectTitle(String)"
});
formatter.result({
  "duration": 71908891,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "services",
      "offset": 26
    }
  ],
  "location": "Step_Definitions.iNavigateToAMenuTab(String)"
});
formatter.result({
  "duration": 422838840,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Services",
      "offset": 45
    }
  ],
  "location": "Step_Definitions.iExpectThePageToHaveTheCorrectTitle(String)"
});
formatter.result({
  "duration": 2377533133,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "cases",
      "offset": 26
    }
  ],
  "location": "Step_Definitions.iNavigateToAMenuTab(String)"
});
formatter.result({
  "duration": 7574319634,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Work",
      "offset": 45
    }
  ],
  "location": "Step_Definitions.iExpectThePageToHaveTheCorrectTitle(String)"
});
formatter.result({
  "duration": 50676825,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "about",
      "offset": 26
    }
  ],
  "location": "Step_Definitions.iNavigateToAMenuTab(String)"
});
formatter.result({
  "duration": 1691815283,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definitions.iClickGetValtechOffices()"
});
formatter.result({
  "duration": 6993191137,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definitions.iExpectToGetAmountOfValtechOffices()"
});
formatter.result({
  "duration": 62200486,
  "status": "passed"
});
});