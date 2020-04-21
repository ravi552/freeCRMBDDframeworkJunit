$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
formatter.feature({
  "line": 1,
  "name": "Free CRM Login Feature",
  "description": "",
  "id": "free-crm-login-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "free CRM Login test scenario",
  "description": "",
  "id": "free-crm-login-feature;free-crm-login-test-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "user is already on Login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "title of Login page is Free CRM",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user enters username and password",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user clicks on Login button",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user is on home page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinition.user_is_already_on_Login_page()"
});
formatter.result({
  "duration": 26449071000,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.when_title_of_page_is_free_crm()"
});
formatter.result({
  "duration": 123886700,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_enters_username_and_password()"
});
formatter.result({
  "duration": 6177434800,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_enters_login_button()"
});
formatter.result({
  "duration": 364331900,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_is_on_home_page()"
});
formatter.result({
  "duration": 36412000,
  "error_message": "junit.framework.ComparisonFailure: expected:\u003cCogmento CRM[O]\u003e but was:\u003cCogmento CRM[]\u003e\r\n\tat junit.framework.Assert.assertEquals(Assert.java:100)\r\n\tat junit.framework.Assert.assertEquals(Assert.java:107)\r\n\tat stepDefinition.LoginStepDefinition.user_is_on_home_page(LoginStepDefinition.java:53)\r\n\tat ✽.Then user is on home page(Login.feature:9)\r\n",
  "status": "failed"
});
});