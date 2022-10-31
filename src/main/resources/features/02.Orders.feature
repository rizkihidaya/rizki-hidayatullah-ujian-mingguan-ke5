Feature: Orders User

  Scenario: Orders user function
    When User click menu Orders
    And User on menu Orders
    And User click browse product
    And User on menu Product
    And User click product
    And User on product page
    And User pilih warna
    And User pilih ukuran
    And User click add orders
    And Use click cart orders
    And User click ProceedToCheckout
    Then User on Menu PlaceOrder