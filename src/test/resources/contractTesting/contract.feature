@tag
Feature: Contract
  This template is used for contract testing

  @tag1
  Scenario Outline: Contract test <service>
    Given I set environment with <context>
    When I request <service> with helper <request>
    Then I verify the reponse with helper <request>

    Examples: 
      | context | service | request        |
      | env1    | /login   | loginRequest   |


