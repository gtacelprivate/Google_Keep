package com.google_keep.test_runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.After;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features",
        plugin = {"pretty", "html:target/cucumber-reports/html", "json:target/cucumber.json"},
        glue = "com/google_keep/step_definitions",
		tags = {}
		)
public class test_runner {
}

