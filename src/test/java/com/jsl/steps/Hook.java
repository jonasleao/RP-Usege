package com.jsl.steps;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hook {

    public Hook() {
    }

    @Before
    public void setUp(Scenario scenario) {
        System.out.println(scenario.getName() + " Scenario Start ");
    }

    @After
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            System.out.println(scenario.getName() + " Failed ");

        } else {
            System.out.println(scenario.getName() + " Success ");
        }
    }
}
