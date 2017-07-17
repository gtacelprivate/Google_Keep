$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("create_label.feature");
formatter.feature({
  "line": 2,
  "name": "As a user of Google Keep I can successfully create a new label",
  "description": "",
  "id": "as-a-user-of-google-keep-i-can-successfully-create-a-new-label",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@google_keep_create_label"
    }
  ]
});
formatter.scenario({
  "line": 4,
  "name": "Create a new label using Google Keep",
  "description": "",
  "id": "as-a-user-of-google-keep-i-can-successfully-create-a-new-label;create-a-new-label-using-google-keep",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "I launch Google Keep",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I sign in with my Google Account",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I get count of labels",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I add a new label",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I expect a new label is created",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definitions.iLaunchGoogleKeep()"
});
formatter.result({
  "duration": 3906077485,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definitions.iSignInWithMyGoogleAccount()"
});
