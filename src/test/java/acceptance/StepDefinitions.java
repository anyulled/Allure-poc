package acceptance;

import io.cucumber.java.en.*;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class StepDefinitions {
    @Given("^an example scenario$")
    public void anExampleScenario() {
        log.info("Given an example scenario");
    }

    @When("^all step definitions are implemented$")
    public void allStepDefinitionsAreImplemented() {
        log.info("when all definitions are implemented");
    }

    @Then("^the scenario passes$")
    public void theScenarioPasses() {
        log.info("The scenario passes");
    }
}
