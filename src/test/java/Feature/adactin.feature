Feature: Hotel Adactin POC
  Scenario: Select a hotel
    Given Launch "chrome" and url "https://adactinhotelapp.com/index.php"
    When User login website by enters username as "Vigneshraj07" and password as "7094862477"
    Then User lands on search hotel page and verifies the URL contains "SearchHotel" text
    When User selects location as New York
    And User selects hotel as Hotel Cornice
    And User selects room type Super Deluxe
    And User selects two number of rooms
    And User adds check in date "07/10/2024"
    And User adds check out date "09/10/2024"
    And User selects two adults
    And User selects two children
    And User clicks on search button
    Then User lands on select hotel page and verifies the URL contains "SelectHotel" text
    When User selects radio button
    When User clicks on continue button
    Then User lands on book hotel page and verifies the URL contains "BookHotel" text
    And User enters first name as "Vigneshraj"
    And User enters last name as "Nagaraj"
    And User enters billing address as "789,House,Brooklyn,New York"
    And User enters credit card number "7094862477071089"
    And User selects American Express card
    And User selects month and year in expiry date
    And User enters CVV number "786"
    And User click on book now button
    Given User takes screenshot of the booking confrimation page
    Then User quits the browser
