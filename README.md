# google_keep
This automation framework uses Selenium Webdriver, Cucumber and Junit within a page object model to test features within Google Keep.

Feature files: 
create_label.feature,
create_note.feature,
hide_menu.feature,
search_notes.feature

Step Definitions:
StepDefs.class

Page Objects: 
Homepage.class, Login_Page.class

The feature files contain the test steps in a BDD Cucumber format. Each step matches a step definition which holds the functions 
implemented for the test.
To read more information about Cucumber, please visit https://cucumber.io/

To run a specific test/tag using command line/terminal:
1) Go to your terminal/command line interface
2) Change directory location to the automation project
3) Run the below command (replace "your-tag" with the tag/test you want to run):
mvn test -Dcucumber.options="--tags @your-tag"

To run all tests using command line/terminal:
1) Go to your terminal/command line interface
2) Change directory location to the automation project
3) Run the below command:
mvn test
