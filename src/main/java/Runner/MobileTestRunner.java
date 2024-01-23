package Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@CucumberOptions(
        features = "src/main/resources/Features/MobileScenarios.feature",
        glue = {"Steps"},
        plugin = {"pretty", "html:target/cucumber-html-report"}
)
public class MobileTestRunner extends AbstractTestNGCucumberTests {


}