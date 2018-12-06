package com.fleet.pages;

import com.fleet.base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class LoginPage extends BasePage {
    public LoginPage() {
        super();
    }

    @FindBy(how = How.ID, using = "txtLoginId")
    public WebElement usernameField;

    @FindBy(how = How.ID, using = "txtPassword")
    public WebElement passwordField;

    @FindBy(how = How.XPATH, using = "//input[contains(@value,'Sign In')]")
    public WebElement signInButton;

    @FindBy(how = How.ID, using = "error-msg")
    public WebElement errorMessage;


    public void SetUsername(String username){
        usernameField.clear();
        usernameField.sendKeys(username);
    }
    public void SetPassword(String password){
        passwordField.clear();
        passwordField.sendKeys(password);
    }
    public void ClickSignIn(){
        signInButton.click();
    }
    public void ValidateErrorMessage(String expectedResult){
        String actualValue = errorMessage.getText();
        Assert.assertEquals(actualValue,expectedResult);
    }
}
