package com.fleet.stepDefinitions;

import com.fleet.pages.HomePage;
import cucumber.api.java.en.Given;

public class HomePageSteps {
    HomePage page = new HomePage();

    @Given("^User goes to login page$")
    public void GoToLoginPage(){
        page.goToLoginPage();
    }
}
