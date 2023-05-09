@AltaShop
Feature: AltaShop

  @Register
  Scenario: User can register with given credentials
    Given user is on altashop home page
    When user click on the altashop sign in button
    And user click on register button
    And user input "randomFullname" into register fullname field
    And user input "randomEmail" into register email field
    And user input "randomPassword" into register password field
    And user click on the altashop submit register button
    Then user got redirected to sign in page and see "Login" text

  @Login
  Scenario: User can login with given credentials
    Given user is on altashop home page
    When user click on the altashop sign in button
    And user input "email@example.com" into email field
    And user input "password" into password field
    And user click on the altashop submit login button
    Then user see "AltaShop" text on catalog page

  @InvalidLogin
  Scenario: User cannot login with given credentials
    Given user is on altashop home page
    When user click on the altashop sign in button
    And user input "invalid" into email field
    And user input "invalid" into password field
    And user click on the altashop submit login button
    Then user see "record not found" text on login page

  @ProductDetailAndRatings
  Scenario: User can see product details and give ratings
    Given user is logged in on altashop with email "email@example.com" and password "password"
    When user see "AltaShop" text on catalog page
    And user click on detail button on one of the products
    Then user can click on rating products button

  @Checkout
  Scenario: User can checkout products
    Given user is logged in on altashop with email "email@example.com" and password "password"
    When user click on beli button on the products
    And user click on cart button
    And user click on plus button on some products to add the quantity
    And user check the total payment of the products by seeing this "Total Bayar" text
    And user click on bayar button on cart page
    Then user see "Transactions" text on transactions page

  @CheckoutWithoutLogin
  Scenario: User cannot checkout products because have not login yet
    Given user is on altashop home page
    When user click on beli button on the products
    And user click on cart button
    And user click on plus button on some products to add the quantity
    And user check the total payment of the products by seeing this "Total Bayar" text
    And user click on bayar button on cart page
    Then user got redirected to sign in page and see "Login" text

  @EmptyCart
  Scenario: User cannot checkout because the cart is empty
    Given user is logged in on altashop with email "email@example.com" and password "password"
    When user click on cart button
    Then user see "Order is empty!" text on cart page

  @Transactions
  Scenario: User can see transactions history
    Given user is logged in on altashop with email "email@example.com" and password "password"
    When user see "AltaShop" text on catalog page
    And user click on profile button
    And user can see "Transaksi" text on transactions button
    And user click on transactions button
    Then user see "Transactions" text on transactions page

  @ListOfCategory
  Scenario: User can see the product category list
    Given user is logged in on altashop with email "email@example.com" and password "password"
    When user see "AltaShop" text on catalog page
    Then user can click on category bar

  @Logout
  Scenario: User can logout after login
    Given user is logged in on altashop with email "email@example.com" and password "password"
    When user see "AltaShop" text on catalog page
    And user click on profile button
    And user click on logout button
    Then user got redirected to sign in page and see "Login" text