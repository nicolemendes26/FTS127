package Runners;

import cucumber.api.CucumberOptions;

@CucumberOptions(
        features = {".src/test/resources/features"},
        glue =  { "Steps" }
        plugin= { "pretty" }

)

public class Runner {

}
