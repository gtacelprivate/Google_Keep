package com.hackerrank.step_definitions;

import com.hackerrank.page_objects.Homepage;
import com.hackerrank.page_objects.SitePage;
import com.hackerrank.utils.main_functions;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

/**
 * Created by tacelg on 09/06/2017.
 */
public class Step_Definitions {
    private Homepage homepage = new Homepage();
    private SitePage sitePage = new SitePage();
    @Given("^I navigate to the Valtech homepage$")
    public void iNavigateToTheValtechHomepage() throws Throwable {
        main_functions.launchUrl();
    }

    @Then("^I expect the Latest News section to be displayed$")
    public void iExpectTheLatestNewsSectionToBeDisplayed() throws Throwable {
        homepage.verifyLatestNewsDisplayed();
    }

    @Given("^I navigate to a menu tab \"([^\"]*)\"$")
    public void iNavigateToAMenuTab(String arg0) throws Throwable {
        homepage.navigateToTab(arg0);
    }


    @Then("^I expect the page to have the correct title \"([^\"]*)\"$")
    public void iExpectThePageToHaveTheCorrectTitle(String arg0) throws Throwable {
       sitePage.assertTitleIsCorrect(arg0);
    }

    @Then("^I expect to get amount of Valtech offices$")
    public void iExpectToGetAmountOfValtechOffices() throws Throwable {
       sitePage.getAmountValtechOffices();
    }

    @And("^I click Get Valtech Offices$")
    public void iClickGetValtechOffices() throws Throwable {
        sitePage.clickGetValtechOffices();
    }
}
