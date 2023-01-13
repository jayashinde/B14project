package org.example.pageAction;

import org.example.PageElement.RegistrationElement;
import org.example.pageDefinition.CommonSteps;
import org.openqa.selenium.WebDriver;

public class RegistrationAction {

    private WebDriver driver;

    RegistrationElement loginElements;

    public RegistrationAction(CommonSteps commonSteps) {
        this.driver = commonSteps.getDriver();
        this.loginElements = new RegistrationElement(driver);
    }


}
