package com.fleet.base;

import org.openqa.selenium.WebDriver;

public class DriverManager {
    public static WebDriver driver;

    public static WebDriver getInstance() {
        if (driver == null) {
            driver = BrowserFactory.startBrowser("Chrome","http://v2.surefleet.com/Common/Index");
        }
        return driver;
    }
}
