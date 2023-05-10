Feature: User
  As admin
  I want to see a list of all available data
  So that I can process the data

  #  ============================Product============================
  @TC-001
  Scenario: GET - As admin I can get all product data
    Given I set GET api endpoints
    When I send GET HTTP request
    Then I receive valid HTTP response code 200
    And I receive valid data for all products

  @TC-002
  Scenario: GET - As admin I cannot get all product data
    Given I set unmatched GET api endpoints
    When I send GET HTTP request
    Then I receive valid HTTP response code 404

  @TC-005
  Scenario: GET - As admin I can get one detail product data
    Given I set GET api endpoints by Id
    When I send GET HTTP request
    Then I receive valid HTTP response code 200
    And I receive valid data for one detail product

  @TC-006
  Scenario: GET - As admin I cannot get one detail product data
    Given I set unmatched GET api endpoints by Id
    When I send GET HTTP request
    Then I receive valid HTTP response code 404

  @TC-0011
  Scenario: GET - As admin I can get product ratings
    Given I set GET api endpoints product ratings
    When I send GET HTTP request
    Then I receive valid HTTP response code 200
    And I receive valid data for product ratings

  @TC-0012
  Scenario: GET - As admin I cannot get product ratings
    Given I set unmatched GET api endpoints product ratings
    When I send GET HTTP request
    Then I receive valid HTTP response code 404

  @TC-0015
  Scenario: GET - As admin I can get product comments
    Given I set GET api endpoints product comments
    When I send GET HTTP request
    Then I receive valid HTTP response code 200
    And I receive valid data for product comments

  @TC-0016
  Scenario: GET - As admin I cannot get product comments
    Given I set unmatched GET api endpoints product comments
    When I send GET HTTP request
    Then I receive valid HTTP response code 200

  @TC-007
  Scenario: DELETE - As admin I have be able to delete product
    Given I set DELETE api endpoints product
    When I send DELETE HTTP request
    Then I receive valid HTTP response code 200

  @TC-008
  Scenario: DELETE - As admin I cannot delete product
    Given I set unmatched DELETE api endpoints product
    When I send DELETE HTTP request
    Then I receive valid HTTP response code 500

  @TC-003
  Scenario: POST - As admin I have be able to create new product
    Given I set POST api endpoints login
    When I send POST HTTP request login
    And I set POST api endpoints product
    And I send POST HTTP request post product
    Then I receive valid login and product HTTP response code 200
    And I receive valid data for new product

  @TC-004
  Scenario: POST - As admin I cannot create new product
    Given I set POST api endpoints login
    When I send POST HTTP request login
    And I set unmatched POST api endpoints product
    And I send POST HTTP request post product
    Then I receive valid login and product HTTP response code 404

  @TC-009
  Scenario: POST - As admin I have be able to assign product rating
    Given I set POST api endpoints login
    When I send POST HTTP request login
    And I set POST api endpoints rating
    And I send POST HTTP request post rating
    Then I receive valid login and product HTTP response code 200
    And I receive valid data for rating

  @TC-0010
  Scenario: POST - As admin I cannot assign product rating
    Given I set POST api endpoints login
    When I send POST HTTP request login
    And I set unmatched POST api endpoints rating
    And I send POST HTTP request post rating
    Then I receive valid login and product HTTP response code 404

  @TC-0013
  Scenario: POST - As admin I have be able to create comment for product
    Given I set POST api endpoints login
    When I send POST HTTP request login
    And I set POST api endpoints comment
    And I send POST HTTP request post comment
    Then I receive valid login and product HTTP response code 200
    And I receive valid data for comment

  @TC-0014
  Scenario: POST - As admin I cannot comment for product
    Given I set POST api endpoints login
    When I send POST HTTP request login
    And I set unmatched POST api endpoints comment
    And I send POST HTTP request post comment
    Then I receive valid login and product HTTP response code 404
    And I receive valid data for comment

  #  ============================Product Categories============================
  @TC-0019
  Scenario: GET - As admin I can get category by ID
    Given I set GET api endpoints category Id
    When I send GET HTTP request
    Then I receive valid HTTP response code 200
    And I receive valid data for category by ID

  @TC-0020
  Scenario: GET - As admin I cannot get category by ID
    Given I set unmatched GET api endpoints category Id
    When I send GET HTTP request
    Then I receive valid HTTP response code 404

  @TC_0021
  Scenario: GET - As admin I can get all categories
    Given I set GET api endpoints all categories
    When I send GET HTTP request
    Then I receive valid HTTP response code 200
    And I receive valid data for all categories

  @TC-0022
  Scenario: GET - As admin I cannot get all categories
    Given I set unmatched GET api endpoints all categories
    When I send GET HTTP request
    Then I receive valid HTTP response code 404

  @TC-0023
  Scenario: DELETE - As admin I have be able to delete product categories
    Given I set DELETE api endpoints product categories
    When I send DELETE HTTP request
    Then I receive valid HTTP response code 200

  @TC-0024
  Scenario: DELETE - As admin cannot delete product categories
    Given I set unmatched DELETE api endpoints product categories
    When I send DELETE HTTP request
    Then I receive valid HTTP response code 404

  @TC-0017
  Scenario: POST - As admin I have be able to create new product categories
    Given I set POST api endpoints login
    When I send POST HTTP request login
    And I set POST api endpoints product category
    And I send POST HTTP request post categories
    Then I receive valid HTTP response code 200
    And I receive valid data for new product category

  @TC-0018
  Scenario: POST - As admin I cannot create new product categories
    Given I set POST api endpoints login
    When I send POST HTTP request login
    And I set unmatched POST api endpoints product category
    And I send POST HTTP request post categories
    Then I receive valid login and product HTTP response code 404

  #  ============================Authentication============================
  @TC-0029
  Scenario: GET - As admin I can get user information
    Given I set GET api endpoints user information
    When I send GET HTTP request
    Then I receive valid HTTP response code 200
    And I receive valid data for user information

  @TC-0030
  Scenario: GET - As admin I cannot get user information
    Given I set unmatched GET api endpoints user information
    When I send GET HTTP request
    Then I receive valid HTTP response code 404

 @TC-0025
  Scenario: POST - As admin I have be able to create register
    Given I set POST api endpoints login
    When I send POST HTTP request login
    And I set POST api endpoints register
    And I send POST HTTP request post register
    Then I receive valid login and product HTTP response code 200

  @TC-0026
  Scenario: POST - As admin I cannot create register
    Given I set POST api endpoints login
    When I send POST HTTP request login
    And I set POST api endpoints register
    And I send POST HTTP request post register
    Then I receive valid login and product HTTP response code 405

  @TC-0027
  Scenario: POST - As admin I have be able to create login
    Given I set POST api endpoints login
    When I send POST HTTP request login
    Then I receive valid HTTP response code 200
    And I receive valid data for login

  @TC-0028
  Scenario: POST - As admin I cannot login
    Given I set POST api endpoints login
    When I send POST HTTP request login
    Then I receive valid HTTP response code 400

  #  ============================Hello============================
  @TC-0031
  Scenario: GET - As admin I can get index
    Given I set GET api endpoints index
    When I send GET HTTP request
    Then I receive valid HTTP response code 200
    And I receive valid data for index

  @TC-0032
  Scenario: GET - As admin I cannot get index
    Given I set unmatched GET api endpoints index
    When I send GET HTTP request
    Then I receive valid HTTP response code 404

  #  ============================Orders============================
  @TC-0035
  Scenario: GET - As admin I can get all orders
    Given I set GET api endpoints all orders
    When I send GET HTTP request
    Then I receive valid HTTP response code 200
    And I receive valid data for all orders

  @TC-0036
  Scenario: GET - As admin I cannot get all orders
    Given I set unmatched GET api endpoints all orders
    When I send GET HTTP request
    Then I receive valid HTTP response code 404

  @TC-0037
  Scenario: GET - As admin I can get order by ID
    Given I set GET api endpoints order Id
    When I send GET HTTP request
    Then I receive valid HTTP response code 200
    And I receive valid data for order by ID

  @TC-0038
  Scenario: GET - As admin I cannot get order by ID
    Given I set unmatched GET api endpoints order Id
    When I send GET HTTP request
    Then I receive valid HTTP response code 404

  @TC-0033
  Scenario: POST - As admin I have be able to create new order
    Given I set POST api endpoints login
    When I send POST HTTP request login
    And I set POST api endpoints order
    And I send POST HTTP request post order
    Then I receive valid login and product HTTP response code 200
    And I receive valid data for new order

  @TC-0034
  Scenario: POST - As admin I cannot create new order
    Given I set POST api endpoints login
    When I send POST HTTP request login
    And I set unmatched POST api endpoints order
    And I send POST HTTP request post order
    Then I receive valid login and product HTTP response code 404