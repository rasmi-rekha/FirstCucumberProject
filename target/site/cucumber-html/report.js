$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:/D:/workspace/FirstCucumberProject/src/test/java/features/Datadriven.feature");
formatter.feature({
  "name": "Testing Datadriven feature in cucumber",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@tag"
    }
  ]
});
formatter.scenario({
  "name": "Login rediff to test datadriven",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tag"
    },
    {
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "name": "User will open \"chrome\" browser",
  "keyword": "Given "
});
formatter.match({
  "location": "Datadrivendefinition.openBrowser(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User open  loginURL",
  "keyword": "And "
});
formatter.match({
  "location": "Datadrivendefinition.navigate(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User validated login page content",
  "keyword": "And "
});
formatter.match({
  "location": "Datadrivendefinition.validatepagetext()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User entered \"bibek346@rediffmail.com\" and \"Rasmi1@3\"",
  "keyword": "And "
});
formatter.match({
  "location": "Datadrivendefinition.login(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User name is displayed on Homepage",
  "keyword": "Then "
});
formatter.match({
  "location": "Datadrivendefinition.homepage_is_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User validated home page title",
  "keyword": "Then "
});
formatter.match({
  "location": "Datadrivendefinition.validate_home_page_title()"
});
formatter.result({
  "status": "passed"
});
});