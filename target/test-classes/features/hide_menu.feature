@google_keep_hide_menu
Feature: As a user of Google Keep I can successfully hide the side menu

  Scenario: Hide the side menu by clicking on the menu button
    Given I launch Google Keep
    And I sign in with my Google Account
    And the side menu is visible
    When I click on the main menu button
    Then I expect the side menu tabs to be hidden


