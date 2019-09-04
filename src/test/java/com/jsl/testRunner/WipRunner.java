package com.jsl.testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;


@CucumberOptions(
        features = {"src/test/java/com/jsl/feature"},
        glue = "com.jsl.steps",
        plugin = {
                "pretty",
//                "com.epam.reportportal.cucumber.StepReporter",
                "com.epam.reportportal.cucumber.ScenarioReporter",
                "html:target/site/cucumber-report",
                "json:target/cucumber.json",
        },
        monochrome = true,
        tags = {"@WIP", "not @Ignore"})
public class WipRunner extends AbstractTestNGCucumberTests {
    @BeforeSuite
    public static void setup() {
        System.out.println("Start .... ");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("End .... ");
    }

}
