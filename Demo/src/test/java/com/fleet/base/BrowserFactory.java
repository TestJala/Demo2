package com.fleet.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.concurrent.TimeUnit;

public class BrowserFactory {
    static WebDriver driver;

    public static WebDriver startBrowser(String browser, String url){
        if(browser.equals("Chrome")){
            System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver.exe");
            driver=new ChromeDriver();
        }
        else if(browser.equals("Firefox")){
            driver=new FirefoxDriver();
        }
        else if(browser.equals("IE")){
            driver=new InternetExplorerDriver();
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.navigate().to(url);

        return driver;
    }
}
