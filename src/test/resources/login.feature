Feature: User Login

  Scenario Outline: User can login with invalid username and password
    Given User visited the portal
    When User inputs invalid "<username>" and "<password>"
    Then User can see error message

    Examples:
      | username | password |
      | admin    | 123      |
      | abc      | 123      |
