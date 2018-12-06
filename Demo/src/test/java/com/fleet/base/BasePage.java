package com.fleet.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage{

    public WebDriver driver;

    /**
     * Initializes and instance of {@link BasePage}.
     */
    public BasePage() {
        driver = DriverManager.getInstance();
        PageFactory.initElements(driver, this);
    }
}