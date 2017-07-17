@google_keep_create_label
Feature: As a user of Google Keep I can successfully create a new label

  Scenario: Create a new label using Google Keep
    Given I launch Google Keep
    And I sign in with my Google Account
    And I get count of labels
    When I add a new label
    Then I expect a new label is created

