package de.quandooSelenide.tests;

import de.quandooSelenide.pages.RestBerlinPage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.chrome.ChromeDriver;


public class TestBase {
    private ChromeDriver driver;
    RestBerlinPage restBerlinPage;

    @BeforeEach
    public void initPageObjects() {
        // brew install chromedriver
         System.setProperty("webdriver.chrome.driver", "C:\\Tools\\chromedriver.exe");

        //initialisation of the page "Restaurants in Berlin"
         restBerlinPage = new RestBerlinPage(driver);
    }

}
