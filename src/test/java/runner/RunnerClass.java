package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/featureFiles", glue = "stepDefinition",tags="@AddCustomer")
public class RunnerClass extends AbstractTestNGCucumberTests {

}
