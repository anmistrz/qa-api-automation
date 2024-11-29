Feature: End to End Simulation Test 
Description: This feature file is to test the end to end simulation of the API

Scenario: As a user I can add new products to the store
    # Given I have access to the store
    Given A list of products
    When I add a new product to the store
    Then I should see the product added to the store
