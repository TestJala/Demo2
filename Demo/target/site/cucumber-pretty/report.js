$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/com/fleet/Features/Login.feature");
formatter.feature({
  "name": "Login",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Login"
    }
  ]
});
formatter.scenario({
  "name": "[Fleet]SignIn: Verify user can’t sign in with invalid credentials",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Login"
    },
    {
      "name": "@Negative"
    }
  ]
});
formatter.step({
  "name": "User goes to login page",
  "keyword": "Given "
});
formatter.match({
  "location": "HomePageSteps.GoToLoginPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter username as \"Gabriel200\"",
  "keyword": "When "
});
formatter.match({
  "location": "LoginPageSteps.i_enter_username_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter password as \"AnyText\"",
  "keyword": "And "
});
formatter.match({
  "location": "LoginPageSteps.i_enter_password_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click \u0027Sign In\u0027",
  "keyword": "And "
});
formatter.match({
  "location": "LoginPageSteps.i_enter_password_as()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Login should fail",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPageSteps.login_should_fail()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "[Fleet]SignIn: Verify user can sign in with valid credentials",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Login"
    },
    {
      "name": "@Functional"
    }
  ]
});
formatter.step({
  "name": "User goes to login page",
  "keyword": "Given "
});
formatter.match({
  "location": "HomePageSteps.GoToLoginPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter username as \"Gabriel200\"",
  "keyword": "When "
});
formatter.match({
  "location": "LoginPageSteps.i_enter_username_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter password as \"Gabriel200\"",
  "keyword": "And "
});
formatter.match({
  "location": "LoginPageSteps.i_enter_password_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click \u0027Sign In\u0027",
  "keyword": "And "
});
formatter.match({
  "location": "LoginPageSteps.i_enter_password_as()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should be signed in",
  "keyword": "Then "
});
formatter.match({
  "location": "DashboardPageSteps.userShouldBeSignedIn()"
});
formatter.result({
  "status": "passed"
});
});