package com.saucedemo.steps;

import com.saucedemo.pages.HomePage;
import com.saucedemo.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class LoginSteps {

    @Given("I am on homepage")
    public void iAmOnHomepage() {
    }

    @When("Enter Username {string}")
    public void enterUsername(String username) {
        new LoginPage().enterUsername(username);
    }

    @When("Enter password {string}")
    public void enterPassword(String password) {
        new LoginPage().enterPassword(password);
    }

    @And("click on login button")
    public void clickOnLoginButton() {
        new LoginPage().loginButton();

    }
    @And("verify Products")
    public void verifyProducts() {
        new HomePage().verifyProducts();
    }
}


