package com.fleet.stepDefinitions;

import com.fleet.pages.LoginPage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;

public class LoginPageSteps{
    LoginPage page = new LoginPage();

    @When("^I enter username as \"([^\"]*)\"$")
    public void i_enter_username_as(String username){
        page.SetUsername(username);
    }

    @When("^I enter password as \"([^\"]*)\"$")
    public void i_enter_password_as(String password){
        page.SetPassword(password);
    }

    @When("^I click 'Sign In'$")
    public void i_enter_password_as(){
        //LoginPage page = new LoginPage(base.driver);
//        LoginPage page=PageFactory.initElements(driver,LoginPage.class);
        page.ClickSignIn();
        //base.page.GetInstance(LoginPage.class).ClickSignIn();
    }

    @Then("^Login should fail$")
    public void login_should_fail(){
        page.ValidateErrorMessage("Invalid login credentials.");
    }
}