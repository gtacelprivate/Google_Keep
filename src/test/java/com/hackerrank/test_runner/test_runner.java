package com.hackerrank.test_runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/com/hackerrank/features",
        plugin = {"pretty", "html:target/cucumber-reports/html", "json:target/cucumber.json"},
        glue = "com/hackerrank/step_definitions",
		tags = {}
		)
public class test_runner {

}

