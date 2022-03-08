@PetStore
Feature: E2E PetStore Feature

  @PetLifeCycle
  Scenario Outline: Create Pet In Store
    Given Pet with name "<pet_name>" and "<status>" created in pet store
    And Fetch Pet Created successfully
    Then Delete the created pet
    
    Examples:
    	| pet_name   | status    |
    	| Charmendar | available |
  
  
  @OrderLifeCycle
  Scenario Outline: Create Order for Pet
  	Given Pet with name "<pet_name>" and "<status>" created in pet store
    When Create Order for Pet with <quantity> and "<status>"
    Then Fetch order with id "<order_id>"
    
    Examples:
    	| quantity | status    | order_status | pet_name | order_id |
    	| 4        | available | complete     | pikachu  | 9        |