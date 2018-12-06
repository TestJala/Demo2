package com.fleet.base;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Hooks {
    public WebDriver driver;

    @BeforeTest
    public void setup(){
        driver = DriverManager.getInstance();
    }

    @AfterTest
    public void teardown(){
        driver.quit();
    }
}
