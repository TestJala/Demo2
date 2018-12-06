package com.fleet.pages;

import com.fleet.base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class DashboardPage extends BasePage {
    public DashboardPage() {
        super();
    }

    @FindBy(how = How.XPATH, using = "//div[@id='gettingStardtedPopup']//h4")
    public WebElement startedPopupMessage;

    @FindBy(how = How.XPATH, using = "//input[@value='Get Started!']")
    public WebElement getStartedButton;

    @FindBy(how = How.XPATH, using = "//div[@ng-app='Dashboard']//strong[@class='ng-scope']")
    public WebElement dashboardTitle;


    public void ValidateUserIsSignedIn(){
        Assert.assertEquals(startedPopupMessage.getText(),"Thank you for choosing Fleet!");
        getStartedButton.click();
        Assert.assertEquals(dashboardTitle.getText(),"DASHBOARD");
    }
}

