package org.example.pageAction;

import org.example.PageElement.HomeElement;
import org.example.PageElement.RegistrationElement;
import org.example.pageDefinition.CommonSteps;
import org.openqa.selenium.WebDriver;

public class HomeAction {
    private WebDriver driver;

   HomeElement homeElements;

    public HomeAction(CommonSteps commonSteps) {
        this.driver = commonSteps.getDriver();
        this.homeElements = new HomeElement(driver);
    }
    public void register(){
        homeElements.register.click();
    }

    public void login(){
        homeElements.login.click();
    }
}
