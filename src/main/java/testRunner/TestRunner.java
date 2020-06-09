package testRunner;		

import org.junit.runner.RunWith;		
import cucumber.api.CucumberOptions;		
import cucumber.api.junit.Cucumber;		

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty"}, strict = true,
        monochrome = true,features = "C:/Abhijay/AutomationTesting/Cucumber_Project/src/main/java/features"
        ,glue={"stepDefinition"}
)

public class TestRunner {

}