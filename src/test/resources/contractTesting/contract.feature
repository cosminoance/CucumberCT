@tag
Feature: Contract
  This template is used for contract testing

  @tag1
  Scenario Outline: Contract test <service>
    Given I set environment with <context>
    When I request <service> with helper <request_helper>
    Then I verify the reponse with helper <request_helper>

    Examples: 
      | context | service | request_helper |
      | env1    | getUser | getUserHelper  |

  @tag1
  Scenario Outline: Contract test <service>
    Given I set custom environment
    When I request <service> with helper <request_helper>
    Then I verify the reponse with helper <request_helper>

    Examples: 
      | context | service | request_helper |
      | env1    | getUser | getUserHelper  |
