Feature: Place Order
User will search an item, add item to cart and place order

Scenario: Search Item
Given User is on home page
When user search an item
Then item must be displayed

Scenario: Add item to cart
Given item must be displayed
When user add item to cart
Then item must be listed in cart
