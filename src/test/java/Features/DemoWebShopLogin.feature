
Feature: Login to DmoWebShop
  I want to use this template for my feature file
  
@login
  Scenario Outline: Succesful Login to DemoWebShop
  
    Given user is on the demo Web Shop Homepage
    And chooses to Click Login
    When user enters "<Email>"and "<Password>"
    And He Clicks Login
    Then He Sees His Home Page
Examples:
 |gender| FirstName | LastName | Email                  | Password   |
      |M| Anil      | D        | anild98765@gmail.com   | anil987654 |
      |F| Anupama   | Sharma   | anupama98765@gmail.com | anu987654  |