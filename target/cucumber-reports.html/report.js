$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/E2E_Test.feature");
formatter.feature({
  "name": "End to End Simulation Test",
  "description": "Description: This feature file is to test the end to end simulation of the API",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "As a user I can add new products to the store",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "A list of products",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinitions.StepDefinitions.a_list_of_products()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I add a new product to the store",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.StepDefinitions.i_add_a_new_product_to_the_store()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should see the product added to the store",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.StepDefinitions.i_should_see_the_product_added_to_the_store()"
});
formatter.result({
  "status": "passed"
});
});