package steps;

import io.cucumber.java.en.*;
import pages.TestSandbox;

public class TestSandboxSteps {

    TestSandbox sandboxPage = new TestSandbox();

    @Given("^I navigate to the sandbox page$")
    public void navigateToTheSandboxSite(){
        sandboxPage.navigateToSandbox();
    }

    @And("^select value from the dropdown$")
    public void selectState() {
        sandboxPage.selectCategory("python");
    }

}
