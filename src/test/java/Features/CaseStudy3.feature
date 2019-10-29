Feature: Search Engine
  @tag1
  Scenario: Check for the Speed of the Search Engine
    Given Alex login into the TestMeApp
    And Click on the Search Bar
    When Alex types only four characters of Product
    Then He gets all theappropriate results
    And He gets product details within a minute


