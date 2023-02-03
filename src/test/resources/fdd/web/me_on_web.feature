Feature: the name can be retrieved
  Scenario: client makes call to GET /me
    When the client calls /me
    Then the client receives status code of 200
    And the client receives server name Daniel