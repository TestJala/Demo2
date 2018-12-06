package com.fleet.pages;

import com.fleet.base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


public class HomePage extends BasePage {
    public HomePage() {
        super();
    }
    @FindBy(how = How.XPATH, using = "//a[text()='Sign In']")
    public WebElement signInButton;


    public LoginPage goToLoginPage (){
        signInButton.click();
        return new PageFactory().initElements(driver,LoginPage.class);
    }
}
