package com.step_definition;

import com.Pages.LoginPage;
import com.utilities.ConfigurationReader;
import com.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.WebDriverWait;


public class LoginStepDefinitions {
    LoginPage loginPage = new LoginPage();

    @Given("User is on the login page")
    public void user_is_on_the_login_page() {

    }


    @When("enter right {string} and {string}")
    public void enterRightAnd(String username, String password) {
        loginPage.login(username,password);
    }

    @Then("User should be able to see {string} on the page")
    public void userShouldBeAbleToSeeOnThePage(String users) {


        String  actual= Driver.getDriver().getTitle();
        String expected= ConfigurationReader.getProperty("Text");
        Assert.assertTrue(actual.contains(expected));

    }


}
