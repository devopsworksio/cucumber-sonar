package com.czeczotka.bdd.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        format = {"pretty", "html:target/cucumber", "json:target/Destination/cucumber.json","junit:target/cucumber/cucumber.xml"},
        glue = "com.czeczotka.bdd.steps",
        features = "classpath:cucumber/calculator.feature"

)
public class RunCalculatorIT {
}

