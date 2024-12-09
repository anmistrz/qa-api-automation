$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/E2E_Test.feature");
formatter.feature({
  "name": "End to End Simulation Test",
  "description": "Description: This feature file is to test the end to end simulation of the API",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "As a user I can add new products to the store",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "A list of products",
  "keyword": "Given "
});
formatter.step({
  "name": "I add a new product to the store \"\u003cproduct\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "I should see the product added to the store",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "product"
      ]
    },
    {
      "cells": [
        "addItem"
      ]
    },
    {
      "cells": [
        "addItem2"
      ]
    }
  ]
});
formatter.scenario({
  "name": "As a user I can add new products to the store",
  "description": "",
  "keyword": "Scenario Outline"
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
  "name": "I add a new product to the store \"addItem\"",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.StepDefinitions.i_add_a_new_product_to_the_store(java.lang.String)"
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
formatter.scenario({
  "name": "As a user I can add new products to the store",
  "description": "",
  "keyword": "Scenario Outline"
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
  "name": "I add a new product to the store \"addItem2\"",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.StepDefinitions.i_add_a_new_product_to_the_store(java.lang.String)"
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
formatter.scenarioOutline({
  "name": "As a user I can update the product details",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "A list of products",
  "keyword": "Given "
});
formatter.step({
  "name": "I add a new product to the store \"\u003cproduct\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "I should see the product added to the store",
  "keyword": "And "
});
formatter.step({
  "name": "I can update the product details \"\u003cupdatedProduct\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "product",
        "updatedProduct"
      ]
    },
    {
      "cells": [
        "addItem",
        "updateItem"
      ]
    },
    {
      "cells": [
        "addItem2",
        "updateItem2"
      ]
    }
  ]
});
formatter.scenario({
  "name": "As a user I can update the product details",
  "description": "",
  "keyword": "Scenario Outline"
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
  "name": "I add a new product to the store \"addItem\"",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.StepDefinitions.i_add_a_new_product_to_the_store(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should see the product added to the store",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.StepDefinitions.i_should_see_the_product_added_to_the_store()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I can update the product details \"updateItem\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.StepDefinitions.i_can_update_the_product_details(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "As a user I can update the product details",
  "description": "",
  "keyword": "Scenario Outline"
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
  "name": "I add a new product to the store \"addItem2\"",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.StepDefinitions.i_add_a_new_product_to_the_store(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should see the product added to the store",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.StepDefinitions.i_should_see_the_product_added_to_the_store()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I can update the product details \"updateItem2\"",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.StepDefinitions.i_can_update_the_product_details(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "A a user I can delete the product",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "A list of products",
  "keyword": "Given "
});
formatter.step({
  "name": "I add a new product to the store \"\u003cproduct\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "I should see the product added to the store",
  "keyword": "And "
});
formatter.step({
  "name": "I can delete the product",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "product"
      ]
    },
    {
      "cells": [
        "addItem"
      ]
    }
  ]
});
formatter.scenario({
  "name": "A a user I can delete the product",
  "description": "",
  "keyword": "Scenario Outline"
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
  "name": "I add a new product to the store \"addItem\"",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.StepDefinitions.i_add_a_new_product_to_the_store(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should see the product added to the store",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.StepDefinitions.i_should_see_the_product_added_to_the_store()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I can delete the product",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.StepDefinitions.i_can_delete_the_product()"
});
formatter.result({
  "status": "passed"
});
});