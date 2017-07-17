package com.google_keep.step_definitions;

import com.google_keep.page_objects.Homepage;
import com.google_keep.page_objects.Login_Page;
import com.google_keep.utils.main_functions;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class Step_Definitions {
    private Homepage homepage = new Homepage();
    private Login_Page loginPage = new Login_Page();

    @Given("^I launch Google Keep$")
    public void iLaunchGoogleKeep() throws Throwable {
        main_functions.launchUrl();
    }

    @When("^I add a new note$")
    public void iAddANewNote() throws Throwable {
        homepage.addNewNote();
    }

    @Then("^I expect a new note is created$")
    public void iExpectANewNoteIsCreated() throws Throwable {
        homepage.verifyNewNoteCreated();
    }

    @Given("^I search for the note title in the search box$")
    public void iSearchForTheNoteTitleInTheSearchBox() throws Throwable {
       homepage.searchNoteTitle();
    }

    @Then("^I expect my note to appear as a search result$")
    public void iExpectMyNoteToAppearAsASearchResult() throws Throwable {
        homepage.verifyNoteSearchResult();
    }

    @When("^I search for a note that does not exist$")
    public void iSearchForANoteThatDoesNotExist() throws Throwable {
        homepage.searchNonExistentNote();
    }

    @Then("^I expect no search results to be available$")
    public void iExpectNoSearchResultsToBeAvailable() throws Throwable {
       homepage.verifyNoSearchResult();
    }

    @When("^I add a new label$")
    public void iAddANewLabel() throws Throwable {
        homepage.addNewLabel();
    }

    @Then("^I expect a new label is created$")
    public void iExpectANewLabelIsCreated() throws Throwable {
        homepage.verifyLabelCreated();
    }

    @And("^the side menu is visible$")
    public void theSideMenuIsVisible() throws Throwable {
       homepage.verifySideMenuVisible();
    }

    @When("^I click on the main menu button$")
    public void iClickOnTheMainMenuButton() throws Throwable {
        homepage.clickMainMenuButton();
    }

    @Then("^I expect the side menu tabs to be hidden$")
    public void iExpectTheSideMenuTabsToBeHidden() throws Throwable {
        homepage.verifySideTabsHidden();
    }

    @And("^I sign in with my Google Account$")
    public void iSignInWithMyGoogleAccount() throws Throwable {
       loginPage.loginGoogleAccount();
    }

    @And("^I get count of notes$")
    public void iGetCountOfNotes() throws Throwable {
        homepage.getCountOfNotes();
    }

    @And("^I get count of labels$")
    public void iGetCountOfLabels() throws Throwable {
        homepage.getCountOfLabels();
    }
}
