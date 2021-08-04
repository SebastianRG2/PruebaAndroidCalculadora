Feature: i as a user i want to operation calculator to the mobile app

  Scenario Outline: Operations
    Given the user is in the mobile app
    When the user enter his data <operation>
    Then  the user will see the <resultOperation> on the screen
    Examples:
      | operation | resultOperation |
      | +         | 10              |
      | −         | 5               |
      | ×         | 10              |
      | ÷         | 2               |


