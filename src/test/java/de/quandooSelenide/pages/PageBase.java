package de.quandooSelenide.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PageBase {
    protected WebDriver driver;

    /* Constructor injecting the WebDriver interface
     * @param webDriver*/
    public PageBase(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // common methods
    public void pause(int millis) {
        try {
            Thread.sleep(millis);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
