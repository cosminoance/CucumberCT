@tag
Feature: Contract fail scenarios

  Background: 
  Given I set context <context>
  And I parse <oa3_file>
  And I build <option_file>

  @tag1
  Scenario Outline: Contract test fail <service>
    Given I want to test <service> 
    When I send <request_body> with <options>
    Then I fail on <response_code> 

    Examples: 
      | context | oa3_file   | option_file     | service | request_body    | options        | resposne_code |
      | env1    | /login.oa3 | login.json      | login   | login_fail.json | login_fail.json| 503           |
