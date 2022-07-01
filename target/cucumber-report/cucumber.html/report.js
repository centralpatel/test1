$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("aboutUs.feature");
formatter.feature({
  "line": 1,
  "name": "User Checking Functionality",
  "description": "",
  "id": "user-checking-functionality",
  "keyword": "Feature"
});
formatter.before({
  "duration": 19092243700,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "User should navigate to contact us link successfully",
  "description": "",
  "id": "user-checking-functionality;user-should-navigate-to-contact-us-link-successfully",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "I am on the Homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I mouseHover on contact us link",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I click on our story link",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I should see \u0027story link\u0027 text",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepdefs.iAmOnTheHomepage()"
});
formatter.result({
  "duration": 483205000,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iMouseHoverOnContactUsLink()"
});
formatter.result({
  "duration": 159972700,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iClickOnOurStoryLink()"
});
formatter.result({
  "duration": 1941981400,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iShouldSeeStoryLinkText()"
});
formatter.result({
  "duration": 74626300,
  "status": "passed"
});
formatter.after({
  "duration": 822004000,
  "status": "passed"
});
});