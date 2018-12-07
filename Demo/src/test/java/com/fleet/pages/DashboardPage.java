package com.fleet.pages;

import com.fleet.base.BasePage;
import org.openqa.selenium.By;
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

    @FindBy(how = How.XPATH, using = "//h2[contains(.,'REPORTED ISSUES')]//span[text()='Add']")
    public WebElement reportedIssuesAddButton;

    @FindBy(how = How.XPATH, using = "//form[@name='frm_quick_entry']//span[text()='Save']")
    public WebElement quickEntrySaveButton;

    @FindBy(how = How.XPATH, using = "//form[@name='frm_quick_entry']//select[@name='slt_vehicle']")
    public WebElement quickEntryNameDropdown;

    @FindBy(how = How.XPATH, using = "//form[@name='frm_quick_entry']//input[@name='txtDate']")
    public WebElement quickEntryDateInput;

    @FindBy(how = How.XPATH, using = "//form[@name='frm_quick_entry']//input[@name='txtDate']")
    public WebElement quickEntryTypeDropdown;

    @FindBy(how = How.XPATH, using = "//form[@name='frm_quick_entry']//input[@name='txtOdometer']")
    public WebElement quickEntryOdometerInput;

    @FindBy(how = How.XPATH, using = "//form[@name='frm_quick_entry']//select[@id='slt_fuel_tnk_type']")
    public WebElement quickEntryTankDropdown;

    @FindBy(how = How.XPATH, using = "//form[@name='frm_quick_entry']//input[@name='txtGallons']")
    public WebElement quickEntryGallonsInput;

    @FindBy(how = How.XPATH, using = "//form[@name='frm_quick_entry']//input[@id='i_start_reading']")
    public WebElement quickEntryStartMeterInput;

    @FindBy(how = How.XPATH, using = "//form[@name='frm_quick_entry']//input[@id='i_end_reading']")
    public WebElement quickEntryEndMeterInput;

    @FindBy(how = How.XPATH, using = "//form[@name='frm_quick_entry']//input[@id='txt_hours']")
    public WebElement quickEntryEngineHoursInput;

    @FindBy(how = How.XPATH, using = "//form[@name='frm_quick_entry']//input[@name='txtAmount']")
    public WebElement quickEntryAmountInput;

    @FindBy(how = How.XPATH, using = "//form[@name='frm_quick_entry']//select[@id='slt_oil_amount_type']")
    public WebElement quickEntryAmountTypeDropdown;

    @FindBy(how = How.XPATH, using = "//form[@name='frm_quick_entry']//input[@id='txt_hours']")
    public WebElement quickEntryPtoInput;

    @FindBy(how = How.XPATH, using = "//form[@name='frm_quick_entry']//input[@name='txtPrice']")
    public WebElement quickEntryTotalCostInput;

    @FindBy(how = How.XPATH, using = "//form[@name='frm_quick_entry']//select[@name='slt_state']")
    public WebElement quickEntryStateDropdown;

    @FindBy(how = How.XPATH, using = "//form[@name='frm_quick_entry']//label[@name='lblOdometer']")
    public WebElement quickEntryPrevValue;

    @FindBy(how = How.XPATH, using = "//div[@id='today']//table[@id='t2']/following-sibling::div//td")
    public WebElement todayFuelFields; //vehicle /a[text()='<name>'] , Add dictionary?




    public void ValidateUserIsSignedIn(){
        Assert.assertEquals(startedPopupMessage.getText(),"Thank you for choosing Fleet!");
        getStartedButton.click();
        Assert.assertEquals(dashboardTitle.getText(),"DASHBOARD");
    }

    public void ClickAddReportedIssue(){
        reportedIssuesAddButton.click();
    }

    public void ClickEditIconForReportedIssue(String reportedIssueDescription){
        String xpath = String.format("//td[contains(.,'%s')]/following-sibling::td//img[@title='Edit']", reportedIssueDescription);
        driver.findElement(By.xpath(xpath)).click();
    }
}

