
Feature: Invalid Cart
@invalid
  Scenario: Invalid Add to cart
    Given Alex is on the Home Page of the App
    And Searched for the Product
    When Clicks on cart
    Then he sees no items in the cart
@valid
 Scenario: valid add to cart
 	Given Alex is on the Home Page
 	And Alex Searched for the Product
 	When Alex Click on Add to cart
 	And Alex Click on Cart link
 	Then Cart should contain the Product