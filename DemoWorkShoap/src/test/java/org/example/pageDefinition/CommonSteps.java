package org.example.pageDefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CommonSteps {
    private WebDriver driver;

    public WebDriver getDriver() {
        return driver;
    }
    @Before
    public void setup(){
        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();

        driver.manage().window().maximize();
    }
    @Given("Open url in the browser")
    public void open_url_in_the_browser() {

        driver.get("https://demowebshop.tricentis.com/");
    }




    @After
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();

    }
}
