package com.fleet.stepDefinitions;

import com.fleet.pages.DashboardPage;
import cucumber.api.java.en.Then;

public class DashboardPageSteps{
    DashboardPage page = new DashboardPage();

    @Then("^User should be signed in$")
    public void userShouldBeSignedIn(){
        page.ValidateUserIsSignedIn();
    }
}