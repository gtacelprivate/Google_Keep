@google_keep_search_notes
Feature: As a user of Google Keep I can successfully search notes

  Scenario: Search created note using Google Keep
    Given I launch Google Keep
    And I sign in with my Google Account
    When I search for the note title in the search box
    Then I expect my note to appear as a search result

  Scenario: No notes should be displayed when I search for a note that does not exist
    Given I launch Google Keep
    And I sign in with my Google Account
    When I search for a note that does not exist
    Then I expect no search results to be available