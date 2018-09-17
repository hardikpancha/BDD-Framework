package com.qa.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "/Users/SUMUKH/eclipse_workspace/cucumberPOM/src/main/java/com/qa/feature/phpTravels.feature", 
					glue = {"com/qa/stepDefinition" }, 
					format = { "pretty", "html:test-outout", "json:json_output/cucumber.json","junit:junit_xml/cucumber.xml" },
					
//					tags = { "~@ignore" }
					strict = true,
					dryRun = false
					
					)
					
public class TestRunner {

}
