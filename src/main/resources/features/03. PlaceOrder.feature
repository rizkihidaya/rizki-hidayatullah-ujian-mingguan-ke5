Feature: PlaceOrder User

  Scenario: Orders user function
    When User click ProceedToCheckout
    And  User on Menu PlaceOrder
    And  User fill Firstname
    And  User fill Lastname