package org.runner;



import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources",strict=false, glue = "org.stepdefinition", dryRun = false, tags = "@Registration")
public class Runner {

}
