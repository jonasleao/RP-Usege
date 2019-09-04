package com.jsl.steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class ExampleTwo {


    public ExampleTwo() {
    }

    @Given("^Eg2: A user go to the page \"([^\"]*)\"$")
    public void aUserGoToThePage(String url) {
        System.out.println("aUserGoToThePage " + url);
    }

    @Given("^Eg2: A user search for \"([^\"]*)\"$")
    public void aUserSearchFor(String searchItem) {
        System.out.println("aUserSearchFor " + searchItem);
    }

    @When("^Eg2: A user see list of result is show$")
    public void aUserSeeListOfResultIsShow() {
        System.out.println("aUserSeeListOfResultIsShow ");
    }

    @And("^Eg2: A user Click on the first item$")
    public void aUserClickOnTheFirstItem() {
        System.out.println("aUserClickOnTheFirstItem ");
    }

    @Then("^Eg2: the Selenium official page is show$")
    public void theSeleniumOfficialPageIsShow() {
        System.out.println("theSeleniumOfficialPageIsShow ");
    }

    @And("^Eg2: A user search for items")
    public void aUserSearchForItems(DataTable table) {
        table.cells().forEach(cell -> {
            for (String value : cell) {
                System.out.println("aUserSearchForItems " + value);
            }
        });
    }

    @And("^Eg2: A user search for ([^\"]*) ([^\"]*) ([^\"]*)$")
    public void aUserSearchForFirstNameSecondNameLestName(
            String firstName, String secondName, String lestName) {
        System.out.println("aUserSearchForFirstNameSecondNameLestName " + firstName + " " + secondName + " " + lestName);
    }

    @Then("^Eg2: the Selenium official page is show ([^\"]*)$")
    public void theSeleniumOfficialPageIsShow(String pageTitle) {
        System.out.println("theSeleniumOfficialPageIsShow " + pageTitle);
    }

    @And("^It will failure$")
    public void itWillFailure() {
        Assert.fail("*******");
    }
}
