package com.fleet.runner;

import com.fleet.base.BrowserFactory;
import com.fleet.base.DriverManager;
import cucumber.api.CucumberOptions;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.openqa.selenium.WebDriver;

@CucumberOptions(
        format = {"pretty","html:target/site/cucumber-pretty"}
        ,glue={"com.fleet"} //the path of the step definition files
        ,features = "src/test/resources/com/fleet/Features/"//the path of the feature files
        //,format= {"pretty","html:test-outout", "json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml"} //to generate different types of reporting
        // ,monochrome = true //display the console output in a proper readable format
        //,strict = true //it will check if any step is not defined in step definition file
        //,dryRun = false //to check the mapping is proper between feature file and step def file
        //,tags = {"~@Login" , "~@NegativeTest"}
)

public class CucumberRunner extends AbstractTestNGCucumberTests {

}