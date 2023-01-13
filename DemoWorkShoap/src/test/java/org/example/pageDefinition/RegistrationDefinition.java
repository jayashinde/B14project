package org.example.pageDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pageAction.RegistrationAction;
import org.openqa.selenium.WebDriver;

public class RegistrationDefinition {

    WebDriver driver;
   RegistrationAction registrationAction;

    public RegistrationDefinition(CommonSteps commonSteps, RegistrationAction registrationAction) {
        this.driver = commonSteps.getDriver();
        this.registrationAction = registrationAction;
    }


    @When("Fill the registration form")
    public void fill_the_registration_form(io.cucumber.datatable.DataTable dataTable) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.
        throw new io.cucumber.java.PendingException();
    }
    @Then("registration success ful message should be display")
    public void registration_success_ful_message_should_be_display() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}
