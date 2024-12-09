Feature: End to End Simulation Test 
Description: This feature file is to test the end to end simulation of the API

Scenario Outline: As a user I can add new products to the store
    # Given I have access to the store
    Given A list of products
    When I add a new product to the store "<product>"
    Then I should see the product added to the store

    Examples:
    | product |
    |addItem  |
    |addItem2 |

Scenario Outline: As a user I can update the product details
    # Given I have access to the store
    Given A list of products
    When I add a new product to the store "<product>"
    And I should see the product added to the store
    Then I can update the product details "<updatedProduct>"

    Examples:
    | product | updatedProduct |
    |addItem  | updateItem    |
    |addItem2 | updateItem2   |

Scenario Outline: A a user I can delete the product
    # Given I have access to the store
    Given A list of products
    When I add a new product to the store "<product>"
    And I should see the product added to the store
    Then I can delete the product

    Examples:
    | product |
    |addItem  |

