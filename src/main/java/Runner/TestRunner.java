package Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.AfterMethod;


@CucumberOptions(
        features = "src/test/java/Features/MobileScenarios.feature",
        glue = {"Steps"},
        plugin = {"pretty", "html:target/cucumber-html-report"}
)
public class TestRunner extends AbstractTestNGCucumberTests {


}
