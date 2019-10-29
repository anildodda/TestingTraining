Feature: Title of your feature
  I want to use this template for my feature file

  @tag1
  Scenario Outline: Succesful Registration
    Given User is on the Home Page
    And User Choose to Register
    When User Selects "<gender>"
    And user enters "<FirstName>","<LastName>","<Email>","<Password>"
    And user clicks on Register
    Then User Registration Shall be Succesful

    Examples: 
      |gender| FirstName | LastName | Email                  | Password   |
      |M| Anil      | D        | anild98765@gmail.com   | anil987654 |
      |F| Anupama   | Sharma   | anupama98765@gmail.com | anu987654  |
