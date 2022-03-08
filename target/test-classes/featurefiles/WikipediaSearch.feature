@WikipediaSearch
Feature: E2E Wikipedia Search Happy Path

  @SearchWithoutFilter
  Scenario Outline: Search keyword without filter
    Given User is on the wikipedia search page
    When User searched for "<keyword>" on search page
    And User clicks on search button
    Then User should see search results 
    
    Examples:
    	| keyword |
    	| Germany |
 
  @SearchWithFilter
  Scenario Outline: Search keyword with filter
    Given User is on the wikipedia search page
    When User select and deselect the search options
    And User searched for "<keyword>" on search page
    And User clicks on search button
    Then User should see search results 

    Examples: 
      | keyword |
      | Germany |