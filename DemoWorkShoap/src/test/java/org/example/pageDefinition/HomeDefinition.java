package org.example.pageDefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pageAction.HomeAction;
import org.example.pageAction.RegistrationAction;
import org.openqa.selenium.WebDriver;

public class HomeDefinition {
    WebDriver driver;
    HomeAction homeAction;

    public HomeDefinition(CommonSteps commonSteps, HomeAction homeAction) {
        this.driver = commonSteps.getDriver();
        this.homeAction = homeAction;
    }
    @When("I click on register page")
    public void i_click_on_register_page() {
       homeAction.register();

    }
    @Then("I Nivegate to the Registration form page")
    public void i_nivegate_to_the_registration_form_page() {
        System.out.println("I Nivegate to the Registration form page");

    }

}
