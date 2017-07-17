@google_keep_create_note
Feature: As a user of Google Keep I can successfully create a new note

  Scenario: Create a new note using Google Keep
    Given I launch Google Keep
    And I sign in with my Google Account
    And I get count of notes
    When I add a new note
    Then I expect a new note is created


