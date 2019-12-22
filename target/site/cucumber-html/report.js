$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:/D:/workspace/FirstCucumberProject/src/test/resource/com/cucumber/rediff/Login.feature");
formatter.feature({
  "name": "Logging into Rediff money",
  "description": "  I want to use this template for my feature file",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Login"
    }
  ]
});
formatter.scenario({
  "name": "Logging into Rediff money",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Login"
    },
    {
      "name": "@Login"
    }
  ]
});
formatter.step({
  "name": "I open chrome",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginTestcase.openBrowser(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I navigate to loginURL",
  "keyword": "And "
});
formatter.match({
  "location": "LoginTestcase.navigate(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "validate login pagetext",
  "keyword": "And "
});
formatter.match({
  "location": "LoginTestcase.validatepagetext()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "validate login pagetitle",
  "keyword": "And "
});
formatter.match({
  "location": "LoginTestcase.validatepagetitle()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I entered emailid and password",
  "keyword": "And "
});
formatter.match({
  "location": "LoginTestcase.login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Homepage is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginTestcase.homepage_is_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "validate home page title",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginTestcase.validate_home_page_title()"
});
formatter.result({
  "status": "passed"
});
});