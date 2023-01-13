package org.example.testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/Feature"}
        ,glue = {"org.example.pageDefinition"}
        ,tags = "@SC02"
        ,dryRun = true


)
public class TestRunner {

}
