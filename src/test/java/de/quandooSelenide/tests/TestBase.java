package de.quandooSelenide.tests;

import de.quandooSelenide.pages.RestBerlinPage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class TestBase {
    private ChromeDriver driver;
    RestBerlinPage restBerlinPage;

    @BeforeEach
    public void initPageObjects() {
        // brew install chromedriver
         System.setProperty("webdriver.chrome.driver", "C:\\Tools\\chromedriver.exe");

       // driver = new ChromeDriver();
       // driver.manage().window().maximize();
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

        restBerlinPage = new RestBerlinPage(driver);
    }


    @AfterEach
    public void tearDown() {
        // driver.close();
        // driver.quit();
    }
}
