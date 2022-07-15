package Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.AfterMethod;


@CucumberOptions(
    features="src/main/resources/Features/PackageOrder.feature",
    glue= {"Steps"},
    plugin= {"pretty","html:target/cucumber-html-report"}
)
public class TestRunner extends AbstractTestNGCucumberTests  {



}
