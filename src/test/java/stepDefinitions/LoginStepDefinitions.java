package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.LoginPage;
import setup.Setup;

public class LoginStepDefinitions extends Setup {

    LoginPage loginPage;
    @Given("User visited the portal")
    public void user_visited_the_portal() {
        driver.get("https://opensource-demo.orangehrmlive.com");

    }

    @When("User inputs invalid {string} and {string}")
    public void user_inputs_invalid_and(String username, String password) {
        loginPage = new LoginPage(driver);
        loginPage.doLogin(username, password);
    }

    @Then("User can see error message")
    public void user_can_see_error_message() {
        Assert.assertTrue(loginPage.lblValidationError.getText().contains("Invalid credentials"));
        driver.close();
    }
}
