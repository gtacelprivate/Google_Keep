@valtech_website_test
Feature: Valtech website test

  Scenario: Valtech website test
    Given I navigate to the Valtech homepage
    Then I expect the Latest News section to be displayed

    Given I navigate to a menu tab "about"
    Then I expect the page to have the correct title "About"

    Given I navigate to a menu tab "services"
    Then I expect the page to have the correct title "Services"

    Given I navigate to a menu tab "cases"
    Then I expect the page to have the correct title "Work"
    
    Given I navigate to a menu tab "about"
    And I click Get Valtech Offices
    Then I expect to get amount of Valtech offices

